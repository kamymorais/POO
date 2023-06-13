package principal;

import java.util.Scanner;

import entities.Produto;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);

		
		
		System.out.print("Descrição: ");
		String desc = sc.nextLine();
		
		//produto.setDescricao(sc.nextLine());
		
		System.out.print("Quantidade: ");
		int qtde = sc.nextInt();
		//produto.adicionar(qtde); 
			
		
		System.out.print("Preço: ");
		double valor = sc.nextDouble();
		//produto.setPreco(valor);
		
		Produto produto = new Produto (desc, valor, qtde);
		System.out.println(produto);
		
		sc.close();
	}

}
