public class Hanoi{

	static void hanoi(int numeroDiscos, int Origem, int Destino, int Ponteiro) {

		if (numeroDiscos > 0) {
			hanoi(numeroDiscos - 1, Origem, Ponteiro, Destino);
			System.out.println(Origem + " -> " + Destino);
			hanoi(numeroDiscos - 1, Ponteiro, Destino, Origem);
		}

	}

	public static void main(String[] args) {

		int numeroDiscos = 10;

		hanoi(numeroDiscos, 1, 3, 2);
	}
}