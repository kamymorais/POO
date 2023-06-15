package principal;

import java.util.Scanner;

import entities.Iddade;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		
		
		System.out.println("Qual seu nome: ");
		String name = sc.nextLine();
		
		System.out.println("Qual sua idade: ");
		int years = sc.nextInt();
		
		Iddade idade = new Iddade (name, years);
		
		idade.idadeFinal(years);
		System.out.println(idade);
	}

}
