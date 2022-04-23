package br.com.kasolution.teste;

import java.util.List;

import br.com.kasolution.bd.BDProduto;
import br.com.kasolution.dominio.produto.Alimento;
import br.com.kasolution.dominio.produto.Produto;

public class TestePredicate01 {
	public static void main(String[] args) {
		List<Produto> produtos = BDProduto.getProdutos();
		produtos.stream() //iniciou uma pipeline
			.filter(p -> p instanceof Alimento && p.getValor() > 30.00)
			.forEach(p -> System.out.printf("%s \n\n", p));
	}
}
