package application;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<ContaBancaria> contasBancarias = new ArrayList();
		
		
		
		ContaCorrente conta1 = new ContaCorrente(123, "Mônica", 1000000.0);
		
		
		System.out.println(conta1.exibirSaldo());
		
		System.out.println(conta1.getNomeTitular());
		
		conta1.taxaManutencao();
		System.out.println(conta1.exibirSaldo());
		
		contasBancarias.add(conta1);
		
		
		
		
		ContaPoupanca conta2 = new ContaPoupanca();
		
		conta2.despositar(10000);
		System.out.println(conta2.exibirSaldo());
		
		conta2.sacar(300);
		System.out.println(conta2.exibirSaldo());
		
		conta2.calcularJuros(0.50);
		System.out.println(conta2.exibirSaldo());
		
		contasBancarias.add(conta2);
		
		System.out.println(contasBancarias);
		
		
	}

}
