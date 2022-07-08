public class FolhaPagamento {
    public static void main(String[] args) {

        Funcionario[] salarios = new Funcionario[4];

        salarios[0] = new Diarista();
        salarios[0].calcularSalario(10, 50.0);

        salarios[1] = new Diarista();
        salarios[1].calcularSalario(100, 50.0);

        salarios[2] = new Gerente();
        salarios[2].calcularSalario(10, 50.0);

        salarios[3] = new Gerente();
        salarios[3].calcularSalario(100, 50.0);
    }
}