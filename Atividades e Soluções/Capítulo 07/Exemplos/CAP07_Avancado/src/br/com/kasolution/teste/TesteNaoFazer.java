package br.com.kasolution.teste;

import java.util.ArrayList;
import java.util.List;

import br.com.kasolution.bd.BDProduto;
import br.com.kasolution.dominio.produto.Alimento;
import br.com.kasolution.dominio.produto.Produto;

public class TesteNaoFazer {
	
	public static void main(String[] args) {	

		List<Produto> produtos = BDProduto.getProdutos();
		List<Produto> alimentos = new ArrayList<>();
		
		produtos.parallelStream()
			.filter(p -> p instanceof Alimento)
			.peek(p -> alimentos.add(p)) //nunca fazer
			.map(p -> p.getValor())
			.forEach(System.out::println);
		
		System.out.println("\n\nLista de alimentos:");
		alimentos
			.forEach(System.out::println);
	}
	
}
