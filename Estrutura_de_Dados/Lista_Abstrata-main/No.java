public class No extends ListaEstatica{

    No[] listacomras = new No[3];
    static int fim = -1;
    String nome;
    int quantidade;
    double valor;
    double valorTotal = 0;

    public No() {

    }

    public String toString(){
        return " Nome: "+nome+" quantidade: "+ quantidade+" valor: "+ valor;
    }

    public No(String nome, int quantidade, double valor){
        this.nome = nome;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    @Override
    public void insere(No n) {
        if (fim == -1 || fim < (listacomras.length-1)){
            fim++;
            listacomras[fim] = n;
        }
    }

    @Override
    public void limpaLista() {
        for (int i = 0; i < listacomras.length; i++) {
            listacomras[i] = null;
        }
    }

    @Override
    public int busca(String s) {
        for (int i = 0; i <= fim ; i++) {
            if (listacomras[i].nome.equals(s)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public No remove(String r) {
        int o = busca(r);
        No aux = listacomras[o];
        for (int i = o; i < fim ; i++) {
            listacomras[i] = listacomras[i+1];
        }
        listacomras[fim] = null;
        fim--;
        return aux;
    }

    @Override
    public void imprimeLista() {
        System.out.println("-----IMPRIME LISTA-------");
        for (int i = 0; i <= fim; i++) {
            System.out.println("Pos: "+i+listacomras[i].toString());
        }
    }
}