package br.com.kasolution.dominio;

import br.com.kasolution.ferramenta.Formatador;

public abstract class Produto {

	private static int ultimoCodigo = 0;

	private Integer codigo;
	private String descricao;
	private UnidadeMedida unidade;
	private Double valor;
	
	public Produto(String descricao, UnidadeMedida unidade, Double valor) {
		this.codigo = ++ultimoCodigo;
		setDescricao(descricao);
		setUnidade(unidade);
		setValor(valor);
	}

	public Produto(String descricao, Double valor) {
		this(descricao, UnidadeMedida.UN, valor);
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		if (!descricao.isBlank()) {
			this.descricao = descricao;
		}
	}

	public UnidadeMedida getUnidade() {
		return unidade;
	}

	public void setUnidade(UnidadeMedida unidade) {
		this.unidade = unidade;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		if (valor > 0) {
			this.valor = valor;
		}
	}

	@Override
	public String toString() {
		StringBuilder info = new StringBuilder(getTipo()).append(" {")
				.append("\ncodigo: ").append(codigo)
				.append(",\ndescricao: ").append(descricao)
				.append(",\nunidade: ").append(unidade)
				.append(",\nvalor: ")
				.append(Formatador.moeda(valor)).append("}");
		return info.toString();
	}

	@Override
	public boolean equals(Object obj) {
		if (null != obj && obj instanceof Produto) {
			Produto produto = (Produto) obj; // cast para o tipo Produto
			if (this.descricao.equals(produto.descricao) && this.unidade.equals(produto.unidade)
					&& this.valor.equals(produto.valor)) {
				return true;
			}
		}
		return false;
	}

	public abstract String getTipo();

}
