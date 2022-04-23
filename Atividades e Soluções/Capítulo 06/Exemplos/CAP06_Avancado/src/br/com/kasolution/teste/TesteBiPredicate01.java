package br.com.kasolution.teste;

import java.util.List;
import java.util.function.BiPredicate;

import br.com.kasolution.bd.BDProduto;
import br.com.kasolution.dominio.produto.Produto;

public class TesteBiPredicate01 {	
	public static void main(String[] args) {
		List<Produto> produtos = BDProduto.getProdutos();
		
		BiPredicate<Produto, Double> valorMaior = (p, d) -> p.getValor() > d;				
		produtos.stream()
			.filter(p -> valorMaior.test(p, 1000.00))
			.forEach(p -> System.out.printf("%s \n", p.getDescricao()));
	}
}
