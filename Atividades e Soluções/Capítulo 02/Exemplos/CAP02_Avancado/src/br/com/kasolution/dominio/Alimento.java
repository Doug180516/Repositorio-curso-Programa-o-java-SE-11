package br.com.kasolution.dominio;

import java.time.LocalDate;
import java.time.format.FormatStyle;

import br.com.kasolution.ferramenta.Formatador;

public class Alimento extends Produto {

	private LocalDate dataValidade;
	private Boolean perecivel;

	public Alimento(String descricao, UnidadeMedida unidade, Double valor, LocalDate dataValidade, Boolean perecivel) {
		super(descricao, unidade, valor);
		this.dataValidade = dataValidade;
		this.perecivel = perecivel;
	}

	public LocalDate getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(LocalDate dataValidade) {
		this.dataValidade = dataValidade;
	}

	public Boolean isPerecivel() {
		return perecivel;
	}

	public void setPerecivel(Boolean perecivel) {
		this.perecivel = perecivel;
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

	
}
