package entities;

public class Gerente extends  Funcionario {

	public Gerente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Gerente(String nome, int idade, char sexo, String departamento, double salario) {
		super(nome, idade, sexo, departamento, salario);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public void bonus (double sal) {
		// TODO Auto-generated method stub
		
		
		 salario = sal + 500; 
	
	}
}
