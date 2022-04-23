package br.com.kasolution.teste;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.com.kasolution.bd.BDProduto;
import br.com.kasolution.dominio.produto.Alimento;
import br.com.kasolution.dominio.produto.Produto;

public class TesteCollect05 {

	public static void main(String[] args) {
		List<Produto> produtos = new ArrayList<>();
		produtos = BDProduto.getProdutos();

		List<Produto> alimentos = produtos.stream()
							.filter(p -> p instanceof Alimento)
							.collect(Collectors.toList());
		alimentos
			.forEach(p -> System.out.println(p.getDescricao()));
	}
}
