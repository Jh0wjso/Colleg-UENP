public class Onibus{

    private static boolean poltronas[] = new boolean[19];

    private int sugestao(){

      for (int i = 0; i < poltronas.length; i++) {
        if(poltronas[i] == false)
          return i+1;
      }
      return -1;
    }

    public synchronized void comprar(Passageiro p, int poltrona) throws InterruptedException{
      try {
        if(poltronas[poltrona] == false){
          poltrona++;
          System.out.println(p.getNome()+ " comprou a poltrona " + poltrona);
          poltrona--;
          Thread.sleep(1000);
          poltronas[poltrona] = true;
        }
        else{
          poltrona++;
          System.out.println(p.getNome() + " nao comprou a passagem pois a poltrona "+poltrona+" ja esta ocupada! Tente comprar " + sugestao()+"!");
          poltrona--;
          Thread.sleep(1000);
        }
      } catch (IndexOutOfBoundsException IOBE) {
        System.out.println(p.getNome() + " tentou compar uma poltrona que nao existe. Tente comprar " + sugestao()+"!");
      }
      catch (Exception e){
        System.out.println("Erro inesperado!");
      }
    }
  }