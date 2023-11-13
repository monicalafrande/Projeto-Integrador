package application;

public class ContaPoupanca extends ContaBancaria{
	
	public void calcularJuros(double taxa) {
		setSaldo(getSaldo() * taxa + getSaldo());
	}
	

}
