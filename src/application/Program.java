package application;

import model.ContaCorrente;
import model.ContaPoupanca;
import model.ContaSalario;

public class Program {

	public static void main(String[] args) {
		ContaPoupanca contaPoupanca = new ContaPoupanca("Zezinho", 999, 3580, 1000, 0.05, 30, 3);
		contaPoupanca.meuSaldo(30, 0.05, 3, 30);
		System.out.println("Cliente Conta Poupança: idCliente: " + contaPoupanca.getId() + ", nomeCliente: " + contaPoupanca.getNomeCliente() + ", numConta: " + contaPoupanca.getNumeroConta() + ", tempoDepositadoMeses: " + contaPoupanca.getTempoDepositadoMeses() + ", txJuros: " + contaPoupanca.getTxJuros());

		ContaSalario contaSalario = new ContaSalario("Huguinho", 888, 3581, 1000, 3500);
		contaSalario.sacar(300);
		
		ContaCorrente contaCorrente = new ContaCorrente("Fulaninho", 777, 3582, 1000, 2000);
		contaCorrente.sacar(300);
	}

}
