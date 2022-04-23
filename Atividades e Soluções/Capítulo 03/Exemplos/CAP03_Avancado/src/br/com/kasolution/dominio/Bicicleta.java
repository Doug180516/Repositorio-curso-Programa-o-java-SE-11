package br.com.kasolution.dominio;

public class Bicicleta extends Produto {

	private Integer aro;
	private Integer marchas;

	public Bicicleta(String descricao, Double valor, Integer aro, Integer marchas) {
		super(descricao, valor);
		this.aro = aro;
		this.marchas = marchas;
	}

	public Integer getAro() {
		return aro;
	}

	public void setAro(Integer aro) {
		this.aro = aro;
	}

	public Integer getMarchas() {
		return marchas;
	}

	public void setMarchas(Integer marchas) {
		this.marchas = marchas;
	}
	
	@Override
	public String getTipo() {
		return "Bicicleta";
	}
	
	@Override
	public String toString() {
		StringBuilder infoSuper = new StringBuilder(super.toString());
		StringBuilder infoSub = new StringBuilder(",\naro: ").append(aro)
				.append(",\nmarchas: ").append(marchas);
		infoSuper.insert(infoSuper.length()-1, infoSub);

		return infoSuper.toString();
	}
	
	
}
