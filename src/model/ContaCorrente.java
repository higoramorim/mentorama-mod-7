package model;

public class ContaCorrente extends Conta {

	private int chequeEspecial;

	public ContaCorrente(String nomeCliente, int id, int numeroConta, int saldo, int chequeEspecial) {
		super(nomeCliente, id, numeroConta, saldo);
		this.chequeEspecial = chequeEspecial;
	}

	public int getChequeEspecial() {
		return chequeEspecial;
	}

	public void setChequeEspecial(int chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}
	
	@Override
	public void sacar(int quantia) {
		int limite = saldo + chequeEspecial;
		if (quantia > limite) {
			System.out.println("não é possível sacar valor superior a soma do cheque especial mais saldo");
		} else {
			saldo = limite - quantia;
			System.out.println("meu saldo de Conta Corrente é: " + saldo);
		}
	}
	
	@Override
	public void depositar(int quantia) {
		saldo += quantia;
		System.out.println("depositei: " + quantia);
	}

}
