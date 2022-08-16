public class Passageiro extends Thread{
    private String nome;
    private Onibus o;
    private int poltrona;
  
    public Passageiro(String nome, Onibus o, int poltrona){
      this.nome = nome;
      this.o = o;
      this.poltrona = poltrona - 1;
    }
  
    @Override
    public void run(){
      try{
        o.comprar(this, this.poltrona);
      }
      catch(InterruptedException ex){
        System.out.println(ex.toString());
      }
    }
  
    public String getNome(){
      return this.nome;
    }
    
}