package br.com.kasolution.teste;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import br.com.kasolution.bd.BDProduto;
import br.com.kasolution.dominio.constante.UnidadeMedida;
import br.com.kasolution.dominio.produto.Produto;

public class TesteCollect02 {
	public static void main(String[] args) {
		List<Produto> produtos = new ArrayList<>();
		produtos = BDProduto.getProdutos();
		
		Map<UnidadeMedida, List<Produto>> produtosPorTipo = produtos.stream()
				.collect(Collectors.groupingBy(p -> p.getUnidade()));
		
		produtosPorTipo.forEach((tipo, lista) -> {
			System.out.printf("\nTipo: %s \n", tipo);
			lista.stream()
					.forEach(p -> System.out.printf("\t%s\n", p.getDescricao()));
		});
	}
}
