package br.com.kasolution.dominio;

public enum Operadora {
	
	//CONSTANTE(String, int)
	VIVO("Telef�nica Brasil S.A", 8955),
	TIM("Tim Brasil", 144),
	CLARO("Claro S/A", 552),
	OI("Telemar Norte S.A", 1057),
	NEXTEL("Nextel Telecomunica��es S/A", 613);
	
	final private String nomeEmpresa;
	final private int numeroAtivacao;
	
	private Operadora(String nomeEmpresa, int numeroAtivacao) {
		this.nomeEmpresa = nomeEmpresa;
		this.numeroAtivacao = numeroAtivacao;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public int getNumeroAtivacao() {
		return numeroAtivacao;
	}
	
}
