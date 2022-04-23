package br.com.kasolution.teste;

import java.util.List;

import br.com.kasolution.bd.BDProduto;
import br.com.kasolution.dominio.produto.Produto;

public class TesteConsumer01 {
	public static void main(String[] args) {
		List<Produto> produtos = BDProduto.getProdutos();
		produtos.stream()
			.forEach(p -> System.out.printf("%s \n\n", p));
	}
}
