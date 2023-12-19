package src;
import org.junit.Assert.*;
import org.junit.Test;

public class TituloTest {

	@Test
    public void testGetPrazoDefault() {
        Titulo titulo = new Titulo(5);
        assertEquals(6, titulo.getPrazo()); // Saída esperada: 6 (5 + 1)
    }

    @Test
    public void testGetPrazoZero() {
        Titulo titulo = new Titulo(0);
        assertEquals(1, titulo.getPrazo()); // Saída esperada: 1 (0 + 1)
    }

    @Test
    public void testSetPrazoValido() {
        Titulo titulo = new Titulo(5);
        titulo.setPrazo(10);
        assertEquals(10, titulo.getPrazo()); // Saída esperada: 10 (valor definido)
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetPrazoInvalido() {
        Titulo titulo = new Titulo(5);
        titulo.setPrazo(0);
        // Saída esperada: Exceção IllegalArgumentException devido ao prazo inválido (zero)
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetPrazoInvalidoZero1() {
        Titulo titulo = new Titulo(5);
        titulo.setPrazo(-1);
        // Saída esperada: Exceção IllegalArgumentException devido ao prazo inválido (negativo)
    }
    
    @Test
    public void testGetPrazoNegativeCode() {
        Titulo titulo = new Titulo(-5);
        assertEquals(0, titulo.getPrazo()); // Esperado: 0 porque o código é negativo
    }

    @Test
    public void testSetPrazoValidoZero() {
        Titulo titulo = new Titulo(5);
        titulo.setPrazo(0);
        assertEquals(0, titulo.getPrazo()); // Esperado: 0 porque o prazo foi definido para zero
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetPrazoInvalidoZero() {
        Titulo titulo = new Titulo(5);
        titulo.setPrazo(-1);
    }

    @Test
    public void testConstructorNegativeCode() {
        Titulo titulo = new Titulo(-5);
        assertEquals(0, titulo.getPrazo()); // Esperado: 0 porque o código é negativo
    }

    @Test
    public void testConstructorZeroCode() {
        Titulo titulo = new Titulo(0);
        assertEquals(1, titulo.getPrazo()); // Esperado: 1 porque o código é zero
    }

    @Test
    public void testConstructorPositiveCode() {
        Titulo titulo = new Titulo(10);
        assertEquals(11, titulo.getPrazo()); // Esperado: 11 porque o código é positivo
    }
}
