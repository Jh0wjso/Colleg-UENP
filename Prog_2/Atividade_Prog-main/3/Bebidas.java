public class Bebidas{
    private String nome;
    private String marca;
    private String sabor_teor;

    public void setBebidas(String nome, String marca){
        this.nome = nome;
        this.marca = marca;
    }

    public void setBebidas(String nome, String marca, String teor_sabor) {
        this.nome = nome;
        this.marca = marca;
        this.sabor_teor = teor_sabor;
    }

    public String getBebidas(){
        return marca + nome + sabor_teor;
    }
}

class Alccolicas extends Bebidas{

    public void setBebidas(String nome, String marca, String teor_alcoolico) {
        super.setBebidas(nome, marca, teor_alcoolico);
    }

    @Override
    public String getBebidas() {
        return super.getBebidas();
    }
}

class Refrigerantes extends Bebidas{

    @Override
    public void setBebidas(String nome, String marca, String sabor) {
        super.setBebidas(nome, marca, sabor);
    }

    @Override
    public String getBebidas() {
        return super.getBebidas();
    }
}

class Suco extends Bebidas{

    @Override
    public void setBebidas(String nome, String marca, String fruta) {
        super.setBebidas(nome, marca, fruta);
    }

    @Override
    public String getBebidas() {
        return super.getBebidas();
    }
}