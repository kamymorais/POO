package principal;

import java.util.Scanner;

import entities.vfinal;

public class Program {

	public static void main(String[] args) {
		vfinal vReceber = new vfinal ();
		
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Qual o seu nome? ");
		vReceber.nome = sc.nextLine();
		
		System.out.print("Voc� � gerente? (S ou N) ");
		vReceber.cargo = sc.next();
				
		System.out.print("Qual o valor do sal�rio: ");
		vReceber.salario = sc.nextDouble();
		
		vReceber.resultado();
		
		
		sc.close();
		
		
	}

}
