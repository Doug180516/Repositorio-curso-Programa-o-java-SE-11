package br.com.kasolution.dominio;

public class Eletrica extends Bicicleta {
	
	private Integer potencia;

	public Eletrica(String descricao, Double valor, Integer aro, Integer marchas, Integer potencia) {
		super(descricao, valor, aro, marchas);
		this.potencia = potencia;
	}

	public Integer getPotencia() {
		return potencia;
	}

	public void setPotencia(Integer potencia) {
		this.potencia = potencia;
	}
	
	
	@Override
	public String getTipo() {
		return super.getTipo() + " Eletrica";
	}
	
	@Override
	public String toString() {
		StringBuilder infoSuper = new StringBuilder(super.toString());
		StringBuilder infoSub = new StringBuilder(",\npotência (W): ").append(potencia);

		infoSuper.insert(infoSuper.length()-1, infoSub);

		return infoSuper.toString();
	}

}
