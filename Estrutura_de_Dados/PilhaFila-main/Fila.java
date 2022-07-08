public class Fila {
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
        System.out.println("Elemento inserido -> "+n.toString());
    }

    public No remove(){
        No rem = inicio;

        while (rem!=null){
            inicio = rem.getProximo();
            if (fim == rem){
                fim = rem.getProximo();
            }
            rem.setProximo(null);
            System.out.println("Objeto removido. "+rem.toString());
            return rem;
        }
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
