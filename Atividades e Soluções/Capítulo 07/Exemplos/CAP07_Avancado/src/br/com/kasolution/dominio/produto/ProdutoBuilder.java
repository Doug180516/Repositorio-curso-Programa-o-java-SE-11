package br.com.kasolution.dominio.produto;

import br.com.kasolution.dominio.constante.UnidadeMedida;

public abstract class ProdutoBuilder<T extends ProdutoBuilder<?>> {

	String descricao;
	UnidadeMedida unidade = UnidadeMedida.UN;
	Double valor;
	
	public T descricao(String descricao) {
		this.descricao = descricao;
		return (T) this;
	}
	
	public T unidade(UnidadeMedida unidade) {
		this.unidade = unidade;
		return (T) this;
	}
	
	public T valor(Double valor) {
		this.valor = valor;
		return (T) this;
	}
	
	public abstract Produto build();

}
