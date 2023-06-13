package entities;

public class Livros {
	
	private String nome;
	private String titulo ;
	private double valor ;
	
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getNome() {
		return nome;
	}
	public String getTitulo() {
		return titulo;
	}
	public Livros() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Livros(String nome, String titulo, double valor) {
		super();
		this.nome = nome;
		this.titulo = titulo;
		this.valor = valor;
	}
	
	public void valorFinal (double valor) {
		if (valor > 100) {
			this.valor = (valor*0.3)+valor ;
		}
		
		else {
			this.valor = valor;
		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "O valor para venda do livro �: R$ " + valor ;
	}
	
}
