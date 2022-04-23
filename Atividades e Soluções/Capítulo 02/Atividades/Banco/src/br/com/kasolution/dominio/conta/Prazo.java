package br.com.kasolution.dominio.conta;

public enum Prazo {
	
	//Prazo(int)
	SEIS_MESES(6),
	DOZE_MESES(12),
	DEZOITO_MESES(18),
	VINTE_QUATRO_MESES(24),
	TRINTA_MESES(30);
	
	final private int mesesMaturidade;

	private Prazo(int mesesMaturidade) {
		this.mesesMaturidade = mesesMaturidade;
	}
	
	public int getMesesMaturidade() {
		return mesesMaturidade;
	}
}
