class Main{

    static Contas[] contas = new Contas[3];

    public static void cadastrar(Contas conta){
        for (int i = 0; i < contas.length; i++){
            if (contas[i] == null){
                contas[i] = conta;
                break;
            }
        }
    }

    public static void main(String[] args) {

        Contas pessoa1 = new Contas("Jhonatan", 1, 1, 550.5);
        Contas pessoa2 = new Contas("Joana", 2, 1, 440.6);
        Contas pessoa3 = new Contas("Ana", 3,1, 698.2);

        cadastrar(pessoa1);
        cadastrar(pessoa2);
        cadastrar(pessoa3);
    }

}