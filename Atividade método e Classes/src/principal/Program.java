package principal;

import java.util.Scanner;

import entities.AreaTerreno;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		AreaTerreno area = new AreaTerreno();

		double largura;
		double comprimento;

		System.out.print("Qual a largura do terreno: ");
		largura = sc.nextDouble();

		System.out.print("Qual o comprimento do terreno: ");
		comprimento = sc.nextDouble();

		area.calculo(largura, comprimento);

		System.out.println("A área é de: " + area.areaTotal);

		sc.close();
	}

}
