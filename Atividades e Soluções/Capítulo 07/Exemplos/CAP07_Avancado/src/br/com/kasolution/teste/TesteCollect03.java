package br.com.kasolution.teste;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.com.kasolution.bd.BDProduto;
import br.com.kasolution.dominio.produto.Produto;

public class TesteCollect03 {
	public static void main(String[] args) {
		List<Produto> produtos = new ArrayList<>();
		produtos = BDProduto.getProdutos();
		
		var tipoProduto = produtos.stream()
				.map(p -> p.getTipo())
				.distinct()
				.collect(Collectors.joining(", "));
		
		System.out.printf("Tipos de produto: %s \n", tipoProduto);
	}
}
