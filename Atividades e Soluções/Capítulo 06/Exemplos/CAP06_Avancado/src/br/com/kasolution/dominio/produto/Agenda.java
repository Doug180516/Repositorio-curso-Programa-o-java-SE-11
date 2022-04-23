package br.com.kasolution.dominio.produto;

public class Agenda extends Produto implements Descartavel {
	
	private final Integer ano;
	private final Integer folhas;

	private Agenda(Builder builder) {
		super(builder);
		this.ano = builder.ano;
		this.folhas = builder.folhas;
	}
	
	@Override
	public String descarte() {
		return "Deve ser descartado junto a empresa de reciclagem.";
	}
	
	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return "Agenda";
	}

	public Integer getAno() {
		return ano;
	}

	public Integer getFolhas() {
		return folhas;
	}

	@Override
	public String toString() {
		StringBuilder infoSuper = new StringBuilder(super.toString());
		StringBuilder infoSub = new StringBuilder(",\nano: ")
				.append(ano)
				.append(",\nfolhas: ").append(folhas);
		infoSuper.insert(infoSuper.length()-1, infoSub);

		return infoSuper.toString();
	}
	
	static public class Builder extends ProdutoBuilder<Builder>{
		
		private Integer ano;
		private Integer folhas;
		
		public Builder ano(Integer ano) {
			this.ano = ano;
			return this;
		}
		
		public Builder folhas(Integer folhas) {
			this.folhas = folhas;
			return this;
		}
		
		@Override
		public Agenda build() {
			return new Agenda(this);
		}

	}
}
