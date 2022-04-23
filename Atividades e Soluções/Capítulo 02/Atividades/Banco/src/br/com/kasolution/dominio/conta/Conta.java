package br.com.kasolution.dominio.conta;

import static br.com.kasolution.ferramenta.Formatador.*;

public abstract class Conta {
	
	private static int ultimoCodigo = 0;

	// atributos/campos
	private int codigo;
	private String numero;
	/* sem modificador */ double saldo;
	private Boolean ativa;
	
	public Conta(String numero, double saldo) {
		this.codigo = ++ultimoCodigo;
		this.numero = numero;
		if (saldo > 0) {
			this.saldo = saldo;
		}
		this.ativa = true;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public Boolean isAtiva() {
		if (!ativa) {
			System.out.println("Conta desativada.");
		}
		return ativa;
	}

	public void desativa(Conta conta) { // desativa e transfere saldo
		if (isAtiva()) {
			conta.deposita(this.getSaldo());
			this.saldo = 0.0;
			this.ativa = false;
		}
	}
	
	public abstract void saca(double valor);
	
	public abstract String getTipo();
	
	public void deposita(double valor) {
		if (isAtiva() && valor > 0) {
			this.saldo += valor;
		}
	}

	@Override
	public String toString() {
		StringBuilder info = new StringBuilder(getTipo()).append(" {")
				.append("\n\tcodigo: ").append(codigo)
				.append(",\n\tnumero: ").append(numero)
				.append(",\n\tsaldo: ").append(moeda(saldo))
				.append(",\n\tativa: ")
				.append(ativa ? "sim" : "não").append("}");
		return info.toString();
	}
	
}
