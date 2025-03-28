package br.com.desconto.service;

import br.com.desconto.model.Produto;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DescontroServiceTest {
	
	@Test
	public void testCalcularDesconto() {
		DescontoService service = new DescontoService();
		
		Produto produto = new Produto("produto", 2000);
		
		Double precoFinal = service.calcularDesconto(produto, 10);
		
		assertEquals(1800, precoFinal, 0.001);
	}
}
