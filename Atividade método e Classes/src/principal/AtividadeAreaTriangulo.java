package principal;

import java.util.Scanner;

import entities.AreaTriangulo;

public class AtividadeAreaTriangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		AreaTriangulo medidas = new AreaTriangulo ();
		
		double primeiraArea ;
		double segundaArea;
		double terceiraArea;
		
		System.out.print("Qual a medida da 1� �rea: ");
		primeiraArea = sc.nextDouble();
		
		System.out.print("Qual a medida da 2� �rea: ");
		segundaArea = sc.nextDouble();
		
		System.out.print("Qual a medida da 3� �rea: ");
		terceiraArea = sc.nextDouble();
		
		
		medidas.calculo(primeiraArea, segundaArea, terceiraArea);
		
		System.out.println("O tipo de tri�ngulo �: " + medidas.tipoTriangulo);
	}

}
