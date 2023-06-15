package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Alunos;



public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		Alunos aluno;
		
		List<Alunos> adicionar = new ArrayList<>();
		char opcao;
		
		do {
			System.out.print("Nome do aluno: ");
			String nome = sc.nextLine();
			
			System.out.print("Turma: ");
			String turma = sc.nextLine();
			
			System.out.print("Nota 1º bimestre: ");
			int nota1 = sc.nextInt();
			
			System.out.print("Nota 2º bimestre: ");
			int nota2 = sc.nextInt();
			
			System.out.print("Nota 1º bimestre: ");
			int nota3 = sc.nextInt();
			
			System.out.print("Nota 1º bimestre: ");
			int nota4 = sc.nextInt();
			
			 aluno = new Alunos (nome, turma, nota1, nota2, nota3, nota4);
			 adicionar.add(aluno);
			
			System.out.print("Deseja incluir um novo aluno (s/n) ");
			opcao = sc.next().charAt(0);
			
			sc.nextLine();
			
		}
		
		while (Character.toLowerCase(opcao) == 's');

		for (Alunos a : adicionar) {
			System.out.println();
			System.out.println(a);
		
		}
		
		sc.close();

	}

}
