public abstract class Produto implements IProduto, Comparable{

    int codigo;
    String nome;
    double preco;

    public Produto(int codigo, String nome, double preco){
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    };
    @Override
    public abstract String toString();
    @Override
    public abstract double calcularValorEmEtoque();
    public abstract void adicionarEstoque(int quantidade);
    public abstract int getCodigo();
    public abstract void setCodigo(int codigo);

    @Override
    public int compareTo(Object produto) {
        Produto p = (Produto) produto;
        return codigo - p.getCodigo();
    }
}