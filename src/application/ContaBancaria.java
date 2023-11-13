package application;

public class ContaBancaria {
	
	private int numeroDaConta;
	private String nomeTitular;
	private double saldo;
	
	public ContaBancaria() {
		
	}
	
	public ContaBancaria(int numeroDaConta, String nomeTitular, double saldo) {
		this.numeroDaConta = numeroDaConta;
		this.nomeTitular = nomeTitular;
		this.saldo = saldo;
	}
	
	public int getNumeroDaConta() {
		return numeroDaConta;
	}
	public void setNumeroDaConta(int numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}
	public String getNomeTitular() {
		return nomeTitular;
	}
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	
	public void despositar(double valor) {
		saldo += valor;
		
	}
	
	public void sacar (double valor) {
		saldo -= valor;
		
	}
	
	public double exibirSaldo() {
		return saldo;
		
	}
	
	

}
