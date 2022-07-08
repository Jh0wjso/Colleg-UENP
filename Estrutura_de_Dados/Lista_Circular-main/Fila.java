public class Fila {

    static Pessoa fila[] = new Pessoa[5];
    static int fim = -1;
    static int inicio = -1;

    public int proximo(int ponteiro){
      if(ponteiro+1 == fila.length){
        return 0;
      }
      else{
        return ponteiro+1;
      }
    }

    public void mostra(){
      for(int i = 0; i < fila.length; i++){
        System.out.println(fila[i]);
      }
    }

    public void insere(Pessoa p){
      int final_fila = proximo(fim);
      fila[final_fila] = p;
      fim = proximo(fim);
    }

    public void remove(){
      fila[proximo(inicio)] = null;
      inicio = proximo(inicio);     
    }
}