package entities;

public class Alunos {

	private String nome;
	private String turma;
	private double nota1; 
	private double nota2;
	private double nota3;
	private double nota4;
	
	
	public Alunos(String nome, String turma, double nota1, double nota2, double nota3, double nota4) {
		super();
		this.nome = nome;
		this.turma = turma;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
		this.nota4 = nota4;
	}

	public Alunos() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public double getNota4() {
		return nota4;
	}

	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}
	
	public double media () {
		
		double media = (nota1 + nota2+ nota3 + nota4)/4 ; 
		return media ;
		
	}
	
		
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  "Aluno: " + nome + "\nTurma: " + turma +  "\nA média final é: " + media ();

		
				
	}
	
	
}
