package prinipal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List <String> nomes = new ArrayList <> ();
		nomes.add("Kamylla");
		nomes.add("Herculles");
		nomes.add("Théozinho lindo");
		nomes.add("Mimi");
		nomes.add("Mamãe");
		nomes.add("Ademir");
		
		
		for (String nome: nomes) {
			System.out.println("Nome: " + nome);
		}

		//Obtem o dado da lista por índice (posição na memória) 
		System.out.println("O nome escolhido é: " + nomes.get(3));
		
		String dado = nomes.stream (). filter ( x -> x == "Kamyllas").findFirst ().orElse (null);
		
		
		//Colocar dados em ordem alfabética 
		
		
		Collections.sort(nomes);
		System.out.println("\nImprimindo em orgem alfabetica");
		for (String nome: nomes) {
			
			System.out.println("Nome: " + nome);
		}
		
		System.out.println(dado);
		
	}

}
