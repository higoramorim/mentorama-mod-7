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
			System.out.println("Meu saldo de conta salário é: " + sacado);
		}
	}
	
	@Override
	public void depositar(int quantia) {
		saldo += quantia;
		System.out.println("depositei: " + quantia + " na minha conta salário");
	}
}
