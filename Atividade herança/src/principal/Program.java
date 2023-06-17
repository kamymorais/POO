package principal;

import java.util.Scanner;

import entities.Funcionario;
import entities.Gerente;
import entities.Secretario;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
	
		
		
		System.out.print("Qual o nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Qual o departamento: ");
		String departamento = sc.nextLine();
		
		System.out.print("Qual idade: ");
		int idade = sc.nextInt();
		
		System.out.print("Qual o sexo (f/m): ");
		char sexo = sc.next().charAt(0);
		
			
		System.out.print("Qual o salário: ");
		double salario = sc.nextDouble();
		
		sc.nextLine();
		Funcionario funcionario = new Funcionario (nome, idade, sexo, departamento, salario);
		Gerente gerente = new Gerente (nome, idade, sexo, departamento, salario);
		Secretario secretario = new Secretario (nome, idade, sexo, departamento, salario);
		
		
		gerente.bonus(salario);
		secretario.bonus(salario);
		
		if (departamento.equals("gerente")){
		System.out.println(gerente);
		}
		else {
		System.out.println(secretario);	
		}
				
		
		
		sc.close();
		
	}

}
