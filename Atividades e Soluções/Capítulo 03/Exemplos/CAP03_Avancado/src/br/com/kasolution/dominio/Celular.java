package br.com.kasolution.dominio;

public class Celular extends Produto {

	private Integer chips;
	private Operadora operadora;

	public Celular(String descricao, Double valor, Integer chips, Operadora operadora) {
		super(descricao, valor);
		this.chips = chips;
		this.operadora = operadora;
	}

	public Integer getChips() {
		return chips;
	}

	public void setChips(Integer chips) {
		this.chips = chips;
	}

	public Operadora getOperadora() {
		return operadora;
	}

	public void setOperadora(Operadora operadora) {
		this.operadora = operadora;
	}
	
	@Override
	public String toString() {
		StringBuilder infoSuper = new StringBuilder(super.toString());
		StringBuilder infoSub = new StringBuilder(",\nchips: ").append(chips)
				.append(",\noperadora: ").append(operadora)
				.append(",\nempresa: ").append(operadora.getNomeEmpresa())
				.append(",\nativar chip: ").append(operadora.getNumeroAtivacao());
		infoSuper.insert(infoSuper.length()-1, infoSub);

		return infoSuper.toString();
	}
	
	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return "Celular";
	}
	
}
