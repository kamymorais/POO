package entities;

public class Funcionario {

	private String nome ;
	private int idade;
	private char sexo;
	private String departamento;
	protected double salario ;
	
	
	
	public Funcionario() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Funcionario(String nome, int idade, char sexo, String departamento, double salario) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.departamento = departamento;
		this.salario = salario;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public int getIdade() {
		return idade;
	}



	public void setIdade(int idade) {
		this.idade = idade;
	}



	public char getSexo() {
		return sexo;
	}



	public void setSexo(char sexo) {
		this.sexo = sexo;
	}



	public String getDepartamento() {
		return departamento;
	}



	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}



	public double getSalario() {
		return salario;
	}
	
	
	

	public void bonus(double sal) {
		sal += salario;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		return "Nome: " + nome + "\nIdade: " + idade + "\nSexo: " + sexo + "\nDepartamento: " + departamento + "\nSalário com bonificação: " +  salario ;
	}

}
