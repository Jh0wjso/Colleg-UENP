public class Main {
    public static void main(String[] args) {
        Veiculo caminhao = new Caminhao();
        caminhao.setPlaca("Placa00");

        Veiculo bitrem = new Bitrem();
        bitrem.setPlaca("Placa00");

        Veiculo motocicleta = new Motocicleta();
        motocicleta.setPlaca("Placa01");

        //prints apenas para testes
        System.out.println(caminhao.esquals(bitrem));
        System.out.println(caminhao.esquals(motocicleta));
    }
}