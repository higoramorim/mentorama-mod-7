package model;

public class Conta {

	private String nomeCliente;
	private int id;
	private int numeroConta;
	protected int saldo;

	public Conta() {
	}

	public Conta(String nomeCliente, int id, int numeroConta, int saldo) {
		this.nomeCliente = nomeCliente;
		this.id = id;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

}
