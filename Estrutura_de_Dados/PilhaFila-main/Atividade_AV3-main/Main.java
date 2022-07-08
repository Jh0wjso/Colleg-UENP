import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static ArrayList <Produto> estoque = new ArrayList<>();
    public static void main(String[] args) {
        //adicionando os produtos
        estoque.add(new ProdutoUnitario(3, "Produto", 2));
        estoque.add(new ProdutoUnitario(1, "Produto", 2));
        estoque.add(new ProdutoFracionado(4, "Produto", 10));
        estoque.add(new ProdutoFracionado(2, "Produto", 10));

        Collections.sort(estoque);
        for (Produto produto : estoque) {
            produto.adicionarEstoque(2);
        }
        //mostar os produtos
        for (Produto produto : estoque) {
            System.out.println(produto.toString());
        }
        double total = 0;
        for (Produto produto : estoque) {
            total = total + produto.calcularValorEmEtoque();
        }
        System.out.println("Valor total do estoque -> "+ total);
    }
}