package entities;

public class Conta {

	
	private String nome;
	private int agencia ;
	private int nConta;
	private double saldo;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getnConta() {
		return nConta;
	}

	public void setnConta(int nConta) {
		this.nConta = nConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void depositar (double valorDepositado) {
		saldo += valorDepositado;
	}

	public void sacar (double valorSacado) {
		saldo -= valorSacado;

	}
	
	@Override
	public String toString() {
		return "Titular: " +  nome + "\nAgência: " + agencia + "\nConta: " + nConta + "\nSaldo: " + saldo;
	}
}
