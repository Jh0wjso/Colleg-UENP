public class No {

    Object obj;
    No proximo;
    No anterior;

    public No(Object o){
        obj = o;
    }

    public Object getObj(){
        return obj;
    }

    public String toString(){
        return obj.toString();
    }

    public void setProximo(No n){
        proximo = n;
    }
    public No getProximo(){
        return proximo;
    }

    public void setAnterior(No n){
        anterior = n;
    }
    public No getAnterior(){
        return anterior;
    }
}