package entities;

public class Produto {
	
	private String descricao ;
	private double preco;
	private int quantidade;
	
		
	public Produto() {
		super();
		// Não obrigada a passar nada
	}
		
	
		
	public Produto(String descricao, double preco, int quantidade) {
		super();
		this.descricao = descricao;
		this.preco = preco;
		this.quantidade = quantidade;
		
		//Obrigada a passar algo
	}



	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	
		
	public void adicionar (int qtde) {
		this.quantidade += qtde ;
	}
	
	public void remover (int qtde) {
		this.quantidade -= qtde;
	}
	public double total () {
		return  quantidade*preco;
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Descrição: " + descricao + "\nQuantidade: " + quantidade + "\nPreço: " + preco + "\nValor total: " + total () ;
		
		
		
		
		
		
		
	}

	
}
