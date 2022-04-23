package br.com.kasolution.dominio.produto;

public class Bicicleta extends Produto {

	private final Integer aro;
	private final Integer marchas;

	private Bicicleta(Builder builder) {
		super(builder);
		this.aro = builder.aro;
		this.marchas = builder.marchas;
	}

	public Integer getAro() {
		return aro;
	}

	public Integer getMarchas() {
		return marchas;
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
	
	static public class Builder extends ProdutoBuilder<Builder> {

		private Integer aro;
		private Integer marchas;
		
		public Builder aro(Integer aro) {
			this.aro = aro;
			return this;
		}
		
		public Builder marchas(Integer marchas) {
			this.marchas = marchas;
			return this;
		}
		
		@Override
		public Bicicleta build() {
			return new Bicicleta(this);
		}
		
		
	}
	
}
