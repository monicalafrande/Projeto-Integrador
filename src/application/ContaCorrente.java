package application;

public class ContaCorrente extends ContaBancaria{

	public ContaCorrente(int numeroDaConta, String nomeTitular, double saldo) {
		setNumeroDaConta(numeroDaConta);
		setNomeTitular(nomeTitular);
		setSaldo(saldo);
	}
	
	public void taxaManutencao() {
		setSaldo(getSaldo() - 10);
		
	}

	@Override
	public String toString() {
		return "Conta corrente: " + getNumeroDaConta() + "\n Nome titular: " + getNomeTitular()
				+ ", getSaldo()=" + getSaldo() + "]";
	}
	
	

}
