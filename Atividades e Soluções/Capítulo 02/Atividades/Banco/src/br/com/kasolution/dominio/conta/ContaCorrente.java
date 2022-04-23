package br.com.kasolution.dominio.conta;

import static br.com.kasolution.ferramenta.Formatador.*;

import br.com.kasolution.ferramenta.Formatador;

public class ContaCorrente extends Conta {
	
	private Double limiteEspecial;

	public ContaCorrente(String numero, double saldo, Double limiteEspecial) {
		super(numero, saldo);
		this.limiteEspecial = limiteEspecial;
	}

	public Double getLimiteEspecial() {
		return limiteEspecial;
	}

	public void setLimiteEspecial(Double limiteEspecial) {
		if (limiteEspecial > 0) {
			this.limiteEspecial = limiteEspecial;
		}
	}
	
	@Override
	public String getTipo() {
		return "Conta corrente";
	}
	
	@Override
	public void saca(double valor) {
		if (isAtiva() && this.saldo + this.limiteEspecial >= valor) {
			this.saldo -= valor;
		} else {
			System.out.println("Verifique o saldo disponível na conta.");
		}
	}

	@Override
	public String toString() {
		StringBuilder infoSuper = new StringBuilder(super.toString());
		StringBuilder infoSub = new StringBuilder(",\n\tlimite especial: ")
				.append(moeda(limiteEspecial));

		infoSuper.insert(infoSuper.length() -1, infoSub);
		
		return infoSuper.toString();
	}
	
}





