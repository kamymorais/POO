package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* SEM CONSTRUTOR 
		Scanner sc = new Scanner(System.in);
		Pessoa pessoa;

		List<Pessoa> adicionar = new ArrayList<>();
		char opcao;

		do {
			pessoa = new Pessoa();

			System.out.print("Qual o nome: ");
			pessoa.setNome(sc.nextLine());

			System.out.print("Qual a idade: ");
			pessoa.setIdade(sc.nextInt());

			System.out.print("Qual o telefone: ");
			pessoa.setTelefone(sc.nextInt());

			adicionar.add(pessoa);
			System.out.print("Deseja realizar outro cadastro? (s/n)");
			opcao = sc.next().charAt(0);

			// O comando abaixo é utilizado para limpar a memória do Scanner e evitar bug...
			sc.nextLine();

		}

		while (Character.toLowerCase(opcao) == 's');

		for (Pessoa p : adicionar) {
			System.out.println("\nCadastro:");
			System.out.println(p);
		}

		sc.close(); */
		
		
		Scanner sc = new Scanner(System.in);
		Pessoa pessoa;

		List<Pessoa> adicionar = new ArrayList<>();
		char opcao;

		do {
			

			System.out.print("Qual o nome: ");
			String nome = sc.nextLine();
			
			System.out.print("Qual a idade: ");
			int idade = sc.nextInt();
			
			System.out.print("Qual o telefone: ");
			int telefone = sc.nextInt();
			
			pessoa = new Pessoa(nome, idade, telefone);
			
			adicionar.add(pessoa);
			System.out.print("Deseja realizar outro cadastro? (s/n)");
			opcao = sc.next().charAt(0);

			// O comando abaixo é utilizado para limpar a memória do Scanner e evitar bug...
			sc.nextLine();

		}

		while (Character.toLowerCase(opcao) == 's');

		for (Pessoa p : adicionar) {
			System.out.println("\nCadastro:");
			System.out.println(p);
		}

		sc.close(); 
		
	
	}

}
