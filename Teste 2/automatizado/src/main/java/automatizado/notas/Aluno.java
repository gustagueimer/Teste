package automatizado.notas;

import java.util.ArrayList;

public class Aluno {
	//attributes
	private String nome;
	private Integer matricula;
	private String curso;
	private ArrayList<Double> notas = new ArrayList<Double>();
	
	//constructor
	public Aluno() {
		
	}
	
	public Aluno(String nome, Integer matricula, String curso) {
		this.nome = nome;
		this.matricula = matricula;
		this.curso = curso;
	}
	
	//getters
	public String getNome() {
		return this.nome;
	}
	
	public Integer getMatricula() {
		return this.matricula;
	}
	
	public String getCurso() {
		return this.curso;
	}
	
	//setters
	public void setNome(String newNome) {
		this.nome = newNome;
	}
	
	public void setMatricula(Integer newMatricula) {
		this.matricula = newMatricula;
	}
	
	public void setCurso(String newCurso) {
		this.curso = newCurso;
	}
	
	//methods
	
	public Integer addNota(Double newNota) {
		try {
		if(newNota < 0) {
			System.out.println("nota invalida >:(");
			return 1;
		}
		notas.add(newNota);
		return 0;
		} catch (Exception error) {
			System.out.println("tipo de input errado >:C");
			return 1;
		}
	}
	
	public Double calcularMedia() {
		Double temp = 0.0;
		for(int i=0; i<notas.size(); i++) {
			temp = temp + notas.get(i);
		}
		Double result = temp / notas.size();
		System.out.println("a média das notas é: " + result + ".");
		return result;
	}
	
	public String apresentarResultado() {
		Double media = calcularMedia();
		if(media >= 7.0) {
			System.out.println("aluno aprovado");
			return "Aprovado";
		}
		if (media >= 4.0) {
			System.out.println("aluno para 2a oportunidade");
			return "2a Oportunidade";
		}
		System.out.println("aluno reprovado");
		return "Reprovado";
		
	}
	
	@Override
	public String toString() {
		return "Aluno:{" +
				"Nome: '" + nome + '\'' +
				", Matricula: '" + matricula + '\'' +
				", Curso: '" + curso + '\'' +
				"}";
				
	}
}