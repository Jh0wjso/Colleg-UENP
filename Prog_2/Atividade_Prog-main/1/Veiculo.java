public class Veiculo{
    String placa;
    public void setPlaca(String placa){
        this.placa = placa;
    }

    public String getPlaca(){
        return placa;
    }

    public boolean esquals(Object obj){
        if (this.getPlaca() == ((Veiculo)obj).getPlaca()){
            return  true;
        }
        return false;
    }
}

class Caminhao extends Veiculo{
    String placa;

    @Override
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String getPlaca() {
        return placa;
    }
}

class Bitrem extends Caminhao{

    String placa;
    @Override
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String getPlaca() {
        return placa;
    }
}

class Motocicleta extends Veiculo{
    String placa;

    @Override
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String getPlaca() {
        return placa;
    }
}