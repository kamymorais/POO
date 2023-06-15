package entities;

public class Iddade {

	private String nome ;
	private int idade ;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public Iddade(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	public Iddade() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void idadeFinal (int idade) {
		this.idade = idade + 10 ;
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "A idade final é de: " + idade ; 
	}
	
	
	
	
}
