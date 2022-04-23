package br.com.kasolution.dominio;

public class Produto implements Comparable<Produto> {
	
	private final Integer codigo;
	private final String descricao;
	private final Double valor;

	
	public Produto(Integer codigo, String descricao, Double valor) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.valor = valor;
	}

	@Override
	public int compareTo(Produto p) {
		return p.valor.compareTo(this.valor); //<- Dica
	}
	
	public Integer getCodigo() {
		return codigo;
	}


	public String getDescricao() {
		return descricao;
	}


	public Double getValor() {
		return valor;
	}
	
	@Override
	public String toString() {
		return String.format("Produto {codigo: %d, descricao: %s, valor: %.2f}", codigo, descricao, valor);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (null != obj && obj instanceof Produto) {
			Produto p = (Produto) obj;
			if (this.codigo.equals(p.codigo) &&
					this.descricao.equals(descricao) &&
					this.valor.equals(p.valor)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + ((valor == null) ? 0 : valor.hashCode());
		return result;
	}	
	
}
