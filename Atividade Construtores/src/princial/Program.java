package princial;

import java.util.Scanner;

import entities.Livros;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		
		System.out.print("Nome do livro: ");
		String nLivro = sc.nextLine();
		
		System.out.print("Título do livro: ");
		String tLivro = sc.nextLine();
		
		System.out.print("Valor do livro: ");
		double vLivro = sc.nextDouble();
		
				
		
		Livros livro = new Livros (nLivro, tLivro,vLivro);
		
		livro.valorFinal(vLivro);
		System.out.println(livro);
		
		sc.close();
	
	}

}
