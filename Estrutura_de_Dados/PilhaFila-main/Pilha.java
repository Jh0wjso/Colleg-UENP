public class Pilha {
    No inicio;
    No fim;

    public void insere(No n){
        if (inicio == null){
            inicio = n;
            fim = n;
        }
        else{
            fim.setProximo(n);
            n.setAnterior(fim);
            fim = n;
        }
        System.out.println("Elemento inserido no topo -> "+n.toString());
    }

    public No remove(){
        No rem = fim;

        while (rem!=null){
            if (rem.getAnterior()!=null){

                No anterior = rem.getAnterior();
                anterior.setProximo(rem.getProximo());

                if (rem.getProximo()!=null) {
                    No proximo = rem.getProximo();
                    proximo.setAnterior(rem.getAnterior());
                }
                if (rem == fim){
                    fim = anterior;
                }
                rem.setProximo(null);
                System.out.println("Elemento removido. "+rem.toString());
                return rem;
            }
            else{
                inicio = rem.getProximo();
                inicio.setAnterior(null);
                if (fim == rem){
                    fim = rem.getProximo();
                }
                rem.setProximo(null);
                System.out.println("Elemento removido. "+rem.toString());
                return rem;
            }
        }
        System.out.println("Elemento nao encontrado para remocao ");
        return null;
    }

    public void imprime(){
        No aux = inicio;
        System.out.println("=============================");
        System.out.println("\t\t\t|-> LISTA <-|");
        while (aux!=null){
            System.out.print(aux.hashCode()+ " - ");
            System.out.print(aux.toString());
            if (aux.getAnterior()!=null)
                System.out.print("| ponteiro anterior -> "+aux.getAnterior().hashCode());
            if (aux.getProximo()!=null)
                System.out.print("| proximo ponteiro -> "+ aux.getProximo().hashCode());
            System.out.println();

            aux = aux.getProximo();
        }
        System.out.println("=============================");
    }
}
