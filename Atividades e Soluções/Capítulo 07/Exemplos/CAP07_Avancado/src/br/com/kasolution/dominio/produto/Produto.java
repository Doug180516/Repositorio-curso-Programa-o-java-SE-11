package br.com.kasolution.dominio.produto;

import br.com.kasolution.dominio.constante.UnidadeMedida;
import br.com.kasolution.ferramenta.Formatador;

public abstract class Produto implements Comparable<Produto>{

	private static int ultimoCodigo = 0;

	private final Integer codigo;
	private final String descricao;
	private final UnidadeMedida unidade;
	private final Double valor;
	
	Produto(ProdutoBuilder<?> builder) {
		this.codigo = ++ultimoCodigo;
		this.descricao = builder.descricao;
		this.unidade = builder.unidade;
		this.valor = builder.valor;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public UnidadeMedida getUnidade() {
		return unidade;
	}

	public Double getValor() {
		return valor;
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
		return super.equals(obj);
	}

	public abstract String getTipo();
	
	@Override
	public int compareTo(Produto p) {
		return descricao.toLowerCase().compareTo(p.descricao.toLowerCase());
	}

}
