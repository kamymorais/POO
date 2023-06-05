package entities;

public class vfinal {

	public String nome;
	public String cargo;
	public double salario;
	public double salarioFinal = 0 ;
	
	public void resultado () {
		
		

		if (cargo.equals("gerente") && salario <= 5000 ) {
			salarioFinal = (salario*0.015)+salario  ;	
			
		}
		
		else if (salario < 1500 && cargo.equals("vendedor")) {
			salarioFinal = (salario*0.02)+salario ;
		}
		else {
			salarioFinal = salario;
		}
		
		System.out.print ("Olá " + nome+ " seu salário final é de: " + salarioFinal);
	}
	
}
