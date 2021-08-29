package application;

import model.ContaCorrente;
import model.ContaPoupanca;
import model.ContaSalario;

public class Program {

	public static void main(String[] args) {
		ContaPoupanca contaPoupanca = new ContaPoupanca("Zezinho", 999, 3580, 1000, 0.05, 30, 3);
		contaPoupanca.meuSaldo(30, 0.05, 3, 30);
		contaPoupanca.sacar(100);
		System.out.println("========================================");

		ContaSalario contaSalario = new ContaSalario("Huguinho", 888, 3581, 1000, 3500);
		int saldoCSAtual = contaSalario.getSalario() + contaSalario.getSaldo();
		System.out.println("saldo atual: " + saldoCSAtual);
		contaSalario.sacar(300);
		contaSalario.depositar(300);
		System.out.println("========================================");

		
		ContaCorrente contaCorrente = new ContaCorrente("Fulaninho", 777, 3582, 1000, 2000);
		int saldoCCAtual = contaCorrente.getChequeEspecial() + contaCorrente.getSaldo();
		System.out.println("saldo atual: " + saldoCCAtual);
		contaCorrente.sacar(300);
		contaCorrente.depositar(300);
		System.out.println("========================================");

	}

}
