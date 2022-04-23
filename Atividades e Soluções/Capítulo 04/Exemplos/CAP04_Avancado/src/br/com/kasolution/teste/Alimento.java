package br.com.kasolution.teste;

import java.time.LocalDate;

import br.com.kasolution.dominio.Produto;

public class Alimento extends Produto {
	
	LocalDate dataValidade;
	
	public Alimento(Integer codigo, String descricao, Double valor, LocalDate dataValidade) {
		super(codigo, descricao, valor);
		this.dataValidade = dataValidade;
	}

}
