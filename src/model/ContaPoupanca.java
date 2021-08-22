package model;

public class ContaPoupanca extends Conta {

	private double txJuros;
	private int aniversario;
	private int tempoDepositadoMeses;

	public ContaPoupanca(String nomeCliente, int id, int numeroConta, int saldo, double txJuros, int aniversario,
			int tempoDepositadoMeses) {
		super(nomeCliente, id, numeroConta, saldo);
		this.txJuros = txJuros;
		this.aniversario = aniversario;
		this.tempoDepositadoMeses = tempoDepositadoMeses;
	}

	public double getTxJuros() {
		return txJuros;
	}

	public void setTxJuros(double txJuros) {
		this.txJuros = txJuros;
	}

	public int getAniversario() {
		return aniversario;
	}

	public void setAniversario(int aniversario) {
		this.aniversario = aniversario;
	}

	public int getTempoDepositadoMeses() {
		return tempoDepositadoMeses;
	}

	public void setTempoDepositadoMeses(int tempoDepositadoMeses) {
		this.tempoDepositadoMeses = tempoDepositadoMeses;
	}
	
	public void meuSaldo(int aniversario, double txJuros, int tempoDepositadoMeses, int diaConsulta) {
		float base = (float) (1 + txJuros);
		float montante = (float) (saldo * Math.pow(base, tempoDepositadoMeses));
		if (diaConsulta >= aniversario) {
			System.out.println("meu saldo atual da Poupança é: " + montante);
		} else {
			montante = (float) (saldo * Math.pow(base, tempoDepositadoMeses - 1));
			System.out.println("meu saldo atual da Poupança é: " + montante);
		}
	}

}
