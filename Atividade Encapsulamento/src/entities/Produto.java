package entities;

public class Produto {
	private String descricao;
	private int quantidade;
	private double preco;
	private double valorTotal;

	
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public double getValorTotal() {
		return valorTotal;
	}


	public void incluir (double qtde) {
		valorTotal += qtde;
	}

	public void retirar (double qtde) {
		valorTotal -= qtde;

	}

	
	
	@Override
	public String toString () {
		return "O valor total do seu estoque é de : " + valorTotal ;
		
	}
	
}
