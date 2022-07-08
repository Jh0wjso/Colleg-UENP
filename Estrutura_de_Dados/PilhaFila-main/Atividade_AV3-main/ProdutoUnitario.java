public class ProdutoUnitario extends Produto implements IProduto{

    private int codigo;
    private String nome;
    private double preco = 0;
    private int quantidade = 0;

    public ProdutoUnitario(int codigo, String nome, double preco) {
        super(codigo, nome, preco);
        this.setCodigo(codigo);
        this.setNome(nome);
        this.setPreco(preco);
    }

    public void adicionarEstoque(int quantidade){
        setQuantidade(quantidade);
    }
    @Override
    public double calcularValorEmEtoque() {
        return this.getQuantidade()*this.getPreco();
    }

    @Override
    public String toString() {
        return this.codigo+" - "+nome;
    }
    public void vender(int quantidade){
        this.quantidade = getQuantidade()-quantidade;
    }

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public void setQuantidade(int quantidade) {
        this.quantidade += quantidade;
    }
    public int getQuantidade() {
        return quantidade;
    }
}