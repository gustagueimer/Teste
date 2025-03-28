package automatizado.notas;

import org.junit.Test;
import junit.framework.TestCase;

public class AlunoTest extends TestCase {
	
	@Test
	public void testAlunoNotas() {
		Aluno jeff = new Aluno("jeff", 202242, "curso");
		
		jeff.addNota(5.3);
		jeff.addNota(6.4);
		jeff.addNota(9.2);
		
		Double mediaNotas = jeff.calcularMedia();
		
		assertEquals(6.96, mediaNotas, 0.01);
	}
	
	@Test
	public void testAlunoAprovassao() {
		Aluno conetta = new Aluno("Conetta", 20241107, "curso 2");
		
		conetta.addNota(10.0);
		conetta.addNota(8.5);
		conetta.addNota(9.5);
		
		String resultado = conetta.apresentarResultado();
		
		assertEquals("?", "Aprovado", resultado);
	}
	
	@Test
	public void testOportunidade() {
		Aluno olivia = new Aluno("Olivia", 20200717, "curso 3");
		
		olivia.addNota(9.0);
		olivia.addNota(4.6);
		olivia.addNota(6.9);
		
		String resultado = olivia.apresentarResultado();
		
		assertEquals("?²", "2a Oportunidade", resultado);
	}
	
	@Test
	public void testReprovacao() {
		Aluno olliver = new Aluno("Olliver", 20200716, "Curso 4");
		
		olliver.addNota(3.5);
		olliver.addNota(6.0);
		olliver.addNota(2.4);
		
		String resultado = olliver.apresentarResultado();
		
		assertEquals("?³", "Reprovado", resultado);
	}
	
	@Test
	public void testNotaNegativa() {
		Aluno shedou = new Aluno("Shadou", 20241025, "Curso 5");

		assertEquals("mensagem", (Integer)1, shedou.addNota(-2.0));	
	}
	
	@Test
	public void testNotaPositiva() {
		Aluno sanic = new Aluno("Sanic", 19910710, "Curso 5");
		
		assertEquals("mensagem²", (Integer)0, sanic.addNota(2.0));
	}
	
	@Test
	public void testNotaInput() {
		Aluno goat = new Aluno("Miles \"Tails\" Prower", 19921121, "Curso 5");

		assertEquals("mensagem³", (Integer)0, goat.addNota(10.0));
	}
	
}
