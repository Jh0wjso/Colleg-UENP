package src;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;
import org.junit.jupiter.api.Test;

class EmprestimoTest {
	@Test
	void testCalculaDataDevolucao() {
		Emprestimo e = new Emprestimo();
        Livro l1 = new Livro(1);
        Livro l2 = new Livro(2);
        Item i1 = new Item(l1);
        Item i2 = new Item(l2);
        e.i.add(i1);
        e.i.add(i2);

        Date now = new Date(System.currentTimeMillis());
        e.setDataEmprestimo(now);
        Date dataDevolucaoCalculada = e.CalculaDataDevolucao();
        assertNotNull(dataDevolucaoCalculada); 
        assertTrue(dataDevolucaoCalculada.after(now));
    }
}