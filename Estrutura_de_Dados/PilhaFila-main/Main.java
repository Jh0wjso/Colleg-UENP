public class Main {
    public static void main(String[] args) {
        //TESTES FILA
        Fila fila = new Fila();
        Pessoa p1 = new Pessoa("Fulano", 20);
        Pessoa p2 = new Pessoa("Jefferson", 25);
        fila.insere(new No(p1));
        fila.insere(new No(p2));
        fila.imprime();
        fila.remove();
        fila.imprime();

        //TESTES PILHA
        Pilha pilha = new Pilha();
        pilha.insere(new No(p1));
        pilha.insere(new No(p2));
        pilha.insere(new No(p2));
        pilha.imprime();
        pilha.remove();
        pilha.imprime();
    }
}
