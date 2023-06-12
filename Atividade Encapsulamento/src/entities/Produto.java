package entities;

public class Produto {
	
	private String descricao ;
	private double preco;
	private int quantidade;
	private double valorTotal ;
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
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
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
