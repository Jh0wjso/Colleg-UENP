public class Main {
    public static void main(String[] args) {
        Fila f = new Fila();

        Pessoa p1 = new Pessoa("Paulo",40);
        Pessoa p2 = new Pessoa("Giovana",30);
        Pessoa p3 = new Pessoa("Paula",25);
        Pessoa p4 = new Pessoa("Junior",15);
        Pessoa p5 = new Pessoa("Camila",45);
        Pessoa p6 = new Pessoa("Jhonatan",19);


        //testes
        f.insere(p1);
        f.insere(p2);
        f.insere(p3);
        f.insere(p4);
        f.insere(p5);
        f.mostra();
        System.out.println("-0-0-0-0-0-0-0-0-");
        f.remove();
        f.remove();
        f.remove();
        f.mostra();
        System.out.println("-0-0-0-0-0-0-0-0-");
        f.insere(p6);
        f.insere(p6);
        f.insere(p6);
        f.remove();
        f.remove();
        f.remove();
        f.mostra();
    }
}
