package principal;

import java.util.Scanner;

import entities.AreaTriangulo;

public class AtividadeAreaTriangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		AreaTriangulo medidas = new AreaTriangulo();

		System.out.print("Qual a medida da 1� �rea: ");
		medidas.x = sc.nextDouble();

		System.out.print("Qual a medida da 2� �rea: ");
		medidas.y = sc.nextDouble();

		System.out.print("Qual a medida da 3� �rea: ");
		medidas.z = sc.nextDouble();

		System.out.println(medidas.resultado());
	}

}
