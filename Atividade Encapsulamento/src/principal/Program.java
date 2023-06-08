package principal;

import java.util.Scanner;

import entities.Produto;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		Produto produto = new Produto ();
		
		
		System.out.print("Quantidade de produtos: ");
		double qtde = sc.nextDouble();
		produto.incluir(qtde);
		
		
		System.out.print("Preço unitário: ");
		produto.setPreco(sc.nextDouble());
		int preco = sc.nextInt();
		produto.setPreco(preco);
		
		
		
		System.out.print(produto);
		
		sc.close();
		
	}

}
