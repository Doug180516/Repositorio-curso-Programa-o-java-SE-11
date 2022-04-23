package br.com.kasolution.dominio.produto;

import br.com.kasolution.dominio.constante.Operadora;

public class Celular extends Produto {

	private final Integer chips;
	private final Operadora operadora;

	private Celular(Builder builder) {
		super(builder);
		this.chips = builder.chips;
		this.operadora = builder.operadora;
	}

	public Integer getChips() {
		return chips;
	}

	public Operadora getOperadora() {
		return operadora;
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
	
	static public class Builder extends ProdutoBuilder<Builder> {

		private Integer chips;
		private Operadora operadora;
		
		public Builder chips(Integer chips) {
			this.chips = chips;
			return this;
		}
		
		public Builder operadora(Operadora operadora) {
			this.operadora = operadora;
			return this;
		}
		
		@Override
		public Celular build() {
			return new Celular(this);
		}
	}
	
}
