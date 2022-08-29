using System;

namespace vsi
{
    public enum ETokenType 
    {
        SUM, SUB, MULT, DIV, OPEN, CLOSE, NUM, EOF, VAR, ATB, NAM, EOL
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
        static string _input = "";
        static int _position = -1;
        static Token _lookahead;

        static char? peek;

        static Token NextToken()
        {
            
            _position++;
            if (_position < _input.Length)
                peek = _input[_position];
            else
                return new Token(ETokenType.EOF);
            while(peek == ' ' || peek == '\t')
            {
                _position++;
                peek = _input[_position];
            }

            switch (peek){
                case '+': return new Token(ETokenType.SUM);
                case '-': return new Token(ETokenType.SUB);
                case '*': return new Token(ETokenType.MULT);
                case '/': return new Token(ETokenType.DIV);
                case '(': return new Token(ETokenType.OPEN);
                case ')': return new Token(ETokenType.CLOSE);
                case '$': return new Token(ETokenType.VAR);
                case '=': return new Token(ETokenType.ATB);
                case '\n': return new Token(ETokenType.EOL);
            }
            if (Char.IsDigit(peek.Value))
            {   
                string number = "";
                //while(peek.Value != ' ')
                while(peek.Value != ' ')
                {
                    number = number + peek.Value;
                    _position++;
                    peek = _input[_position];
                    //_lookahead = NextToken();
                }
                int x = GetValue(number);
                return new Token(ETokenType.NUM, x);
            }
           
            Error("( -> " + peek + " <- )" +" Erro Léxico use $[a-z]+ para variaveis");
            return new Token(ETokenType.EOF);
        }

        static Token VariableNextToken()
        {
            var nameVar = "";
            
            while(!_lookahead.Equals(" ") || !_lookahead.Equals("")){
                _position++;
                peek = _input[_position];
                nameVar += peek;
                _lookahead = NextToken();
                return new Token(ETokenType.NAM);
            }

            Error("(" + _lookahead.Type + ")" +" Erro Léxico");
            return new Token(ETokenType.EOF);
        }

        static void Error(string message)
        {           
            Console.ForegroundColor = ConsoleColor.Red;
            Console.WriteLine("Erro! "+ message);
            Console.Write(_input);
            Console.WriteLine(" Operacao inválida!");
            Console.ResetColor();            
            Environment.Exit(0);
            
        }

        static void Match(ETokenType type)
        {
            Console.WriteLine("match " + _lookahead.Type);
            if (_lookahead.Type == type)
                _lookahead = NextToken();
            else
                Error("( -> " + peek + " <- )" +" É um Token inválido");
        }

        static int E()
        {
            Console.WriteLine("E " + _lookahead.Type);
            var res1 = T();
            var res2 = R(res1);
            return res2;
        }
        static int R(int t)
        {
            Console.WriteLine("R " + _lookahead.Type);
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
            else if (_lookahead.Type == ETokenType.VAR)
            {
                _lookahead = VariableNextToken();
                var res = E();
                return res;
            }

            else if(_lookahead.Type == ETokenType.NAM)
            {
                _lookahead = NextToken();
                var res = E();
                return res;
            }

            else if(_lookahead.Type == ETokenType.ATB)
            {
                Match(ETokenType.ATB);
                _lookahead = NextToken();
                var res = E();
                return res;
            }

            else if ((_lookahead.Type != ETokenType.EOF) && (_lookahead.Type != ETokenType.CLOSE))
            {
               Error("( -> " + peek + " <- )" + "Símbolo inesperado!");
            }
            return t;
        }        
        static int T()
        {
            Console.WriteLine("T " + _lookahead.Type);
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
            else if (_lookahead.Type == ETokenType.VAR)
            {
                _lookahead = VariableNextToken();
                return 0;
            }

            else if(_lookahead.Type == ETokenType.NAM)
            {
                _lookahead = NextToken();
                return 0;
            }

            else if(_lookahead.Type == ETokenType.ATB)
            {
                Match(ETokenType.ATB);
                _lookahead = NextToken();
                var res = E();
                return res;
            }

            else  
            {
                Error("( -> " + peek + " <- )" +" Símbolo inesperado!");
                
            }
            return 0;
        }

        static int GetValue(string c){
            int i = 0;
            while(i != Int32.Parse(c.ToString()))
            {
                i++;
            }
            return i;
        }

    
        static private bool testSufix(String suffix){
            var res = true;
            suffix.ToCharArray().ToList().ForEach(c => {
                _lookahead = NextToken();
                if (peek != c){
                    res = false;
                    return;
                }
            });
            peek = null;
            return res;
        }

        public static void Main(string[] args)
        {     
            Console.WriteLine("Insira a expressão desejada:");
            _input = Console.ReadLine();
            Console.WriteLine(_input);
            _lookahead = NextToken();
            var res = E();
            Console.WriteLine("Sucesso na execucao!");
            Console.WriteLine("O resultado final foi: "+ res);
        }
    }
}