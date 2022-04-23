package br.com.kasolution.dominio;

public class Agenda extends Produto implements Descartavel {
	
	private Integer ano;
	private Integer folhas;

	public Agenda(String descricao, Double valor, Integer ano, Integer folhas) {
		super(descricao, valor);
		this.ano = ano;
		this.folhas = folhas;
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

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Integer getFolhas() {
		return folhas;
	}

	public void setFolhas(Integer folhas) {
		this.folhas = folhas;
	}	

}
