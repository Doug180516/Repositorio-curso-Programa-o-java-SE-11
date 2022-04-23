package br.com.kasolution.dominio;

public class Bateria extends Produto implements Descartavel {
	
	private String categoria;
	private Boolean recarregavel;
	
	public Bateria(String descricao, Double valor, String categoria, Boolean recarregavel) {
		super(descricao, valor);
		this.categoria = categoria;
		this.recarregavel = recarregavel;
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

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Boolean getRecarregavel() {
		return recarregavel;
	}

	public void setRecarregavel(Boolean recarregavel) {
		this.recarregavel = recarregavel;
	}

}
