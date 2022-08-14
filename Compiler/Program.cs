using System;

namespace vsi
{
    public enum ETokenType 
    {
        SUM, SUB, MULT, DIV, OPEN, CLOSE, NUM, EOF, SPC 
    }

    public class Token
    {
        public ETokenType Type {get;set;}
        public Int32 Value {get;set;}

        public Token(ETokenType type, Int32 value = 0)
        {
            Type = type;
            Value = value;
        }
    }

    public class Program
    {
        static string _input;
        static int _position = -1;
        static Token _lookahead;
        static Token NextToken()
        {
            char peek;
            _position++;
            if (_position < _input.Length)
                peek = _input[_position];
            else
                return new Token(ETokenType.EOF);
            switch (peek){
                case '+': return new Token(ETokenType.SUM);
                case '-': return new Token(ETokenType.SUB);
                case '*': return new Token(ETokenType.MULT);
                case '/': return new Token(ETokenType.DIV);
                case '(': return new Token(ETokenType.OPEN);
                case ')': return new Token(ETokenType.CLOSE);
                case ' ': return new Token(ETokenType.SPC);
            }
            if (Char.IsDigit(peek))
                return new Token(ETokenType.NUM, Int32.Parse(peek.ToString()));
           
            Error("(" + _lookahead.Value+ ")" +" Erro Léxico");
            return new Token(ETokenType.EOF);
        }

        static void Error(string message)
        {           
            Console.ForegroundColor = ConsoleColor.Red;
            Console.WriteLine("Erro! "+ message);
            Console.WriteLine(_input);
            Console.ResetColor();            
            Environment.Exit(0);
            
        }

        static void Log(string message)
        {           
            Console.WriteLine(message);
        }

        static void Match(ETokenType type)
        {
            Log("match " + _lookahead.Type);
            if (_lookahead.Type == type)
                _lookahead = NextToken();
            else
                Error("(" + _lookahead+ ")" + " É um Token inválido");
        }

        static int E()
        {
            Log("E " + _lookahead.Type);
            var res1 = T();
            var res2 = R(res1);
            return res2;
        }
        static int R(int t)
        {
            Log("R " + _lookahead.Type);
            if (_lookahead.Type == ETokenType.SUM)  
            {
                Match(ETokenType.SUM);
                var res = E();
                return t + res;
            } 
            else if (_lookahead.Type == ETokenType.SUB)
            {
                Match(ETokenType.SUB);
                var res = E();
                return t - res;
            }
            else if (_lookahead.Type == ETokenType.MULT)
            {
                Match(ETokenType.MULT);
                var res = E();
                return t * res;
            }
            else if (_lookahead.Type == ETokenType.DIV)
            {
                Match(ETokenType.DIV);
                var res = E();
                return t / res;
            } 
            else if ((_lookahead.Type != ETokenType.EOF) && (_lookahead.Type != ETokenType.CLOSE))
            {
               Error("(" + _lookahead.Value+ ")" + "Símbolo inesperado em R");
            }
            return t;
        }        
        static int T()
        {
            Log("T " + _lookahead.Type);
            if (_lookahead.Type == ETokenType.OPEN)
            {       
                Match(ETokenType.OPEN);         
                var res = E();
                Match(ETokenType.CLOSE);
                return res;
            } 
            else if (_lookahead.Type == ETokenType.NUM)
            {
                var res = _lookahead.Value;
                Match(ETokenType.NUM);
                return res;
            } 
            else  
            {
                Error("(" + _lookahead.Value+ ")" + " Símbolo inesperado em T");
                
            }
            return 0;
        }


        public static void Main(string[] args)
        {
            Console.WriteLine("Insira a expressão desejada:");
            _input = Console.ReadLine();
            _lookahead = NextToken();
            var res = E();
            Log("Sucesso no progrma");
            Log("O resultado final foi: "+ res);
        }
    }
}