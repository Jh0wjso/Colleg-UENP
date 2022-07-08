public class ProdutoFracionado extends Produto implements IProduto{

    private double preco = 0;
    private String nome;
    private int codigo;
    private double quantidadeEstoque = 0;

    public ProdutoFracionado(int codigo, String nome, double preco) {
        super(codigo, nome, preco);
        this.setCodigo(codigo);
        this.setNome(nome);
        this.setPreco(preco);
    }

    @Override
    public double calcularValorEmEtoque() {
        return getQuantidadeEstoque() * this.getPreco();
    }

    @Override
    public void adicionarEstoque(int quantidade) {
        setQuantidadeEstoque(quantidade);
    }

    @Override
    public String toString() {
        return this.codigo+" - "+nome;
    }
    public void vender(double quantidade){
        this.quantidadeEstoque = getQuantidadeEstoque() - quantidade;
    }
    public double getQuantidadeEstoque() {
        return quantidadeEstoque;
    }
    public void setQuantidadeEstoque(double quantidadeEstoque) {
        this.quantidadeEstoque += quantidadeEstoque;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}