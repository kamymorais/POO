package entities;

public class Pessoa {

	private String nome;
	private int idade;
	private int telefone;

	public Pessoa(String nome, int idade, int telefone) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.telefone = telefone;
	}

	public Pessoa() {
		super();
		// TODO Auto-generated constructor stub

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

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome: " + nome + "\nIdade: " + idade + "\nTelefone: " + telefone;
	}

}
