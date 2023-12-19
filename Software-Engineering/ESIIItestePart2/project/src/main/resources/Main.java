package src;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] codigos = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        System.out.print("Digite o RA do Aluno: ");
        String aluno = entrada.nextLine();
        System.out.print("Digite o número de Livros a ser Emprestado: ");
        int num = entrada.nextInt();
        int aux;
        for (int i = 0; i < num; i++) {
            System.out.print("Digite o código do livro " + (i + 1) + ": ");
            aux = entrada.nextInt();
            codigos[i] = aux;
        }

        Controle c = new Controle();
        c.emprestar(aluno, codigos, num);

        runTests();
    }

    private static void runTests() {
        TituloTest tituloTest = new TituloTest(); // Corrigir a instância da classe TituloTest

        // Teste 1
        try {
            tituloTest.testGetPrazoDefault();
            System.out.println("Teste 1 (GetPrazoDefault) passou.");
        } catch (AssertionError e) {
            System.err.println("Teste 1 (GetPrazoDefault) falhou: " + e.getMessage());
        }

        // Teste 2
        try {
            tituloTest.testGetPrazoZero();
            System.out.println("Teste 2 (GetPrazoZero) passou.");
        } catch (AssertionError e) {
            System.err.println("Teste 2 (GetPrazoZero) falhou: " + e.getMessage());
        }

        // Teste 3
        try {
            tituloTest.testSetPrazoValido();
            System.out.println("Teste 3 (SetPrazoValido) passou.");
        } catch (AssertionError e) {
            System.err.println("Teste 3 (SetPrazoValido) falhou: " + e.getMessage());
        }

        // Teste 4
        try {
            tituloTest.testSetPrazoInvalido();
            System.out.println("Teste 4 (SetPrazoInvalido) passou.");
        } catch (IllegalArgumentException e) {
            System.out.println("Teste 4 (SetPrazoInvalido) passou. Exceção esperada: " + e.getMessage());
        } catch (AssertionError e) {
            System.err.println("Teste 4 (SetPrazoInvalido) falhou: " + e.getMessage());
        }

        // Teste 5
        try {
            tituloTest.testSetPrazoInvalidoZero();
            System.out.println("Teste 5 (SetPrazoInvalidoZero) passou.");
        } catch (IllegalArgumentException e) {
            System.out.println("Teste 5 (SetPrazoInvalidoZero) passou. Exceção esperada: " + e.getMessage());
        } catch (AssertionError e) {
            System.err.println("Teste 5 (SetPrazoInvalidoZero) falhou: " + e.getMessage());
        }
    }
}
