package model;

public class ContaSalario extends Conta{

	private int salario;

	public ContaSalario(String nomeCliente, int id, int numeroConta, int saldo, int salario) {
		super(nomeCliente, id, numeroConta, saldo);
		this.salario = salario;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}
	
	@Override
	public void sacar(int quantia) {
		if (quantia > salario + saldo) {
			System.out.println("Não é possível fazer saque com valor superior ao saldo total disponível");
		} else {
			saldo += salario;
			int sacado = saldo - quantia;
			System.out.println("Saldo de conta salário pós saque: " + sacado);
		}
	}
	
	@Override
	public void depositar(int quantia) {
		int depositado = quantia + getSaldo();
		System.out.println("Saldo de conta salário pós depósito: " + depositado);
	}
}
