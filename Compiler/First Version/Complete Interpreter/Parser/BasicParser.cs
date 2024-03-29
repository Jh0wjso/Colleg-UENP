using VerySimpleInterpreter.Lexer;

namespace VerySimpleInterpreter.Parser
{
    public class BasicParser
    {
        private SymbolTable _symbolTable;
        private BasicLexer _lexer;
        private Token _lookAhead;
        public BasicParser(BasicLexer lexer, SymbolTable st)
        {
            _lexer = lexer;
            _lookAhead = _lexer.GetNextToken();
            _symbolTable = st;
        }

        public void Match(ETokenType type)
        {
            Console.WriteLine("match " + _lookAhead.Type);
            if (_lookAhead.Type == type)
                _lookAhead = _lexer.GetNextToken();
        }

        public void Error(String msg)
        {
            Console.ForegroundColor = ConsoleColor.Red;
            Console.WriteLine("Erro! "+ msg);
            Console.WriteLine("Operacao inválida!");
            Console.ResetColor();            
            Environment.Exit(0);
        }

        public void Prog() // prog   : lineX
        {
            Line();
            X();
        }

        public void X() //X : EOF | prog
        {
            if (_lookAhead.Type == ETokenType.EOF)
                Match(ETokenType.EOF);
            else
                Prog();
        }

        public void Line() // line   : stmt EOL
        {
            Stmt();
            Match(ETokenType.EOL);
        }

        public void Stmt() //stmt   : in | out | atrib  
        {
            if (_lookAhead.Type == ETokenType.INPUT)
                Input();
            else if (_lookAhead.Type == ETokenType.OUTPUT)
                Output();
            else if (_lookAhead.Type == ETokenType.VAR)
                Atrib();
            else
                Error("ESPERADO INPUT, OUTPUT or VAR");
        }

        public void Input() // in     : INPUT VAR
        {
            Match(ETokenType.INPUT);
            Match(ETokenType.VAR);
        }

        public void Output() // out    : OUTPUT VAR
        {
            Match(ETokenType.OUTPUT);
            Console.WriteLine("OUTPUT : ");
            Console.WriteLine("-----------------------------------------");
            Console.WriteLine("\t|"+_symbolTable.Get(_lookAhead.Value.Value)+"|");
            Console.WriteLine("-----------------------------------------");
        }

        public void Atrib() // atrib  : VAR AT expr
        {
            var refx = _lookAhead.Value;
            Match(ETokenType.VAR);
            Match(ETokenType.AT);
            var e = Expr();
            if (refx != null){
                var entry =_symbolTable.GetEntry(refx.Value);
                if (entry != null)
                    entry.Value = e;
            }       
        }

        public Double Expr() //expr   : termY
        {
            var t = Term();
            return Y(t);
        }
        public Double Y(Double left) //Y      : vazio | + expr | - expr
        {
            if (_lookAhead.Type == ETokenType.SUM)
            {
                Match(ETokenType.SUM);
                var right = Expr();
                return left + right;
            }
            else if (_lookAhead.Type == ETokenType.SUB)
            {
                Match(ETokenType.SUB);
                var right = Expr();
                return left - right;
            }
            else if (!TestFollow(ETokenType.CE, ETokenType.EOL))
            {
                Error("ESPERADO CE OU EOL");
            }
            return left;
        }

        public Double Term() //term   : factZ
        {
            var f = Fact();
            return Z(f);
        }
        public Double Z(Double left) //Z      : vazio | * term | / term
        {
            if (_lookAhead.Type == ETokenType.MULT)
            {
                Match(ETokenType.MULT);
                var right = Term();
                return left * right;
            }
            else if (_lookAhead.Type == ETokenType.DIV)
            {
                Match(ETokenType.DIV);
                var right = Term();
                return left / right;
            }
            
            return left;
        }
        public Double Fact() //fact   : NUM | VAR | OE expr CE
        {
            if (_lookAhead.Type == ETokenType.NUM){
                Double num = Convert.ToDouble(_lookAhead.Value);
                Match(ETokenType.NUM);
                return num;
            }
                
            else if (_lookAhead.Type == ETokenType.VAR){
                int? key = _lookAhead.Value;
                Double val = 0;
                if (key == null)
                {
                    Error("ESPERADO VAR");
                    var s = _symbolTable.Get(key.Value);
                    Match(ETokenType.VAR);
                    val = s.Value;
                }
                return val;
            }
                
            else if (_lookAhead.Type == ETokenType.OE)
            {
                Match(ETokenType.OE);
                var e = Expr();
                Match(ETokenType.CE);
                return e;
            }
            return 0;
        }

        private bool TestFollow(params ETokenType[] list)
        {
            return list.ToList().Exists(t => _lookAhead.Type == t);
        }
    }
}