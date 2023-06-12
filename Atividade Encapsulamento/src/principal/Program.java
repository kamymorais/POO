package principal;

import java.util.Scanner;

import entities.Produto;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		Produto produto = new Produto ();
		
		
		System.out.print("Descrição: ");
		produto.setDescricao(sc.nextLine());
		
		System.out.print("Quantidade: ");
		int qtde = sc.nextInt();
		produto.adicionar(qtde); 
		produto.remover(qtde); 
		
		
		System.out.print("Preço: ");
		double valor = sc.nextDouble();
		produto.setPreco(valor);
		
		System.out.println(produto);
		
		
	}

}
