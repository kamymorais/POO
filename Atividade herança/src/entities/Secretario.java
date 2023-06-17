package entities;

public class Secretario extends  Funcionario{

	public Secretario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Secretario(String nome, int idade, char sexo, String departamento, double salario) {
		super(nome, idade, sexo, departamento, salario);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void bonus (double sal) {
		// TODO Auto-generated method stub
		
		
		 salario=sal + 150; 
}
}
