public class Main {

    public static void main(String[] args) {
        No n = new No();
        No n1 = new No("Amaciante", 2, 5.0);
        No n2 = new No("Feijao", 3, 12.0);
        No n3 = new No("Arroz", 1, 15.0);

        //TESTES
        n.insere(n1);
        n.insere(n2);
        n.insere(n3);
        n.imprimeLista();
        n.remove("Feijao");
        n.imprimeLista();
        No n4 = new No("Chocolate", 2, 5.5);
        n.insere(n4);
        n.imprimeLista();
    }
}
