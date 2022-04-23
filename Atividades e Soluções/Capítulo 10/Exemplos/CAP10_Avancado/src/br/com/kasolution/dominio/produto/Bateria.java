package br.com.kasolution.dominio.produto;

public class Bateria extends Produto implements Descartavel {
	
	private final String categoria;
	private final Boolean recarregavel;
	
	private Bateria(Builder builder) {
		super(builder);
		this.categoria = builder.categoria;
		this.recarregavel = builder.recarregavel;
	}

	@Override
	public String descarte() {
		return "Pode ser descartado em lojas Kalunga ou drogarias São Paulo.";
	}
	
	@Override
	public String getTipo() {
		return "Bateria";
	}
	
	public String getCategoria() {
		return categoria;
	}

	public Boolean isRecarregavel() {
		return recarregavel;
	}

	@Override
	public String toString() {
		StringBuilder infoSuper = new StringBuilder(super.toString());
		StringBuilder infoSub = new StringBuilder(",\ncategoria: ")
				.append(categoria)
				.append(",\nrecarregável: ").append(isRecarregavel() ? "sim" : "não");
		infoSuper.insert(infoSuper.length()-1, infoSub);

		return infoSuper.toString();
	}

	static public class Builder extends ProdutoBuilder<Builder> {
		
		private String categoria;
		private Boolean recarregavel;
		
		public Builder categoria(String categoria) {
			this.categoria = categoria;
			return this;
		}
		
		public Builder recarregavel(Boolean recarregavel) {
			this.recarregavel = recarregavel;
			return this;
		}
		
		@Override
		public Bateria build() {
			return new Bateria(this);
		}

	}

}
