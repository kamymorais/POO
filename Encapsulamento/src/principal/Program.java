package principal;

import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner (System.in);
		Conta conta = new Conta ();
		
		
		System.out.print("Titular: ");
		conta.setNome( sc.nextLine());
		
		System.out.print("Agência: ");
		conta.setAgencia(sc.nextInt());
		
		System.out.print("Nº da conta: ");
		conta.setnConta(sc.nextInt());
		/*System.out.print("Saldo: ");
		conta.saldo = sc.nextDouble();*/
		
		System.out.print("Entre com o valor a depositar: ");
		double deposito = sc.nextDouble();
		conta.depositar(deposito);
		
		System.out.print("Entre com o valor do saque: ");
		double sacar = sc.nextDouble();
		conta.sacar(sacar);
	
	
		
		System.out.println(conta);
				
				
		sc.close();
	}

}
