package br.com.kasolution.dominio.produto;

import java.time.LocalDate;
import java.time.format.FormatStyle;

import br.com.kasolution.ferramenta.Formatador;

public class Alimento extends Produto implements Descartavel {

	private final LocalDate dataValidade;
	private final Boolean perecivel;

	private Alimento(Builder builder) {
		super(builder);
		this.dataValidade = builder.dataValidade;
		this.perecivel = builder.perecivel;
	}
	
	@Override
	public String descarte() {
		return "Ligar para empresa de coleta seletiva 15 dias antes da data de vencimento";
	}

	public LocalDate getDataValidade() {
		return dataValidade;
	}

	public Boolean isPerecivel() {
		return perecivel;
	}

	@Override
	public String getTipo() {
		return "Alimento";
	}
	
	
	@Override
	public String toString() {
		StringBuilder infoSuper = new StringBuilder(super.toString());
		StringBuilder infoSub = new StringBuilder(",\nvalidade: ")
				.append(Formatador.data(dataValidade, FormatStyle.LONG))
				.append(",\nperecivel: ").append(isPerecivel() ? "sim" : "não");
		infoSuper.insert(infoSuper.length()-1, infoSub);

		return infoSuper.toString();
	}

	static public class Builder extends ProdutoBuilder<Builder> {

		private LocalDate dataValidade;
		private Boolean perecivel;
		
		public Builder dataValidade(LocalDate dataValidade) {
			this.dataValidade = dataValidade;
			return this;
		}
		
		public Builder perecivel(Boolean perecivel) {
			this.perecivel = perecivel;
			return this;
		}
		
		@Override
		public Alimento build( ) {
			return new Alimento(this);
		}
		
		
	}
	
}
