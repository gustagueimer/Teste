package automatizado.notas;

public class TesteAluno {

	public static void main(String[] args) {
		
		Aluno jeej = new Aluno("jeej", 202242, "curso");
		
		System.out.println(jeej.toString());
		
		jeej.addNota(5.3);
		jeej.addNota(6.4);
		jeej.addNota(9.2);

		jeej.apresentarResultado();
	}

}
