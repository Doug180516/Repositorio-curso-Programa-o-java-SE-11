package br.com.kasolution.teste;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import br.com.kasolution.bd.BDProduto;
import br.com.kasolution.dominio.produto.Produto;
import static br.com.kasolution.ferramenta.Formatador.*;

public class TesteCollect04 {
	public static void main(String[] args) {
		List<Produto> produtos = new ArrayList<>();
		produtos = BDProduto.getProdutos();

		Map<Boolean, List<Produto>> acimaDe1000 = produtos.stream()
					.collect(Collectors.partitioningBy(p -> p.getValor() >= 1_000.00));
		
		acimaDe1000.forEach((tipo, lista) -> {
			System.out.println(tipo ? "acima de R$ 1000,00:" : "abaixo de R$ 1000,00:");
			lista.forEach(p -> System.out.printf("\t%s - %s\n",
					p.getDescricao(),
					moeda(p.getValor())));
		});
	}
}
