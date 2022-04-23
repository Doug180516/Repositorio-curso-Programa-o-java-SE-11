package br.com.kasolution.teste;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import br.com.kasolution.bd.BDProduto;
import br.com.kasolution.dominio.produto.Produto;

public class TesteAnalise01 {
	public static void main(String[] args) {
		List<Produto> produtos = new ArrayList<>();
		produtos = BDProduto.getProdutos();
		
		Comparator<Produto> comparaValor = (p1, p2) -> p1.getValor().compareTo(p2.getValor());
		
		Optional<Produto> maisCaro = produtos.stream().max(comparaValor);
		Optional<Produto> maisBarato = produtos.stream().min(comparaValor);
		
		long quantidade = produtos.stream().count();
		
		System.out.printf("Produtos:\n\tmais caro: %s\n\tmais barato: %s\nQuantidade: %d",
				maisCaro.get().getDescricao(),
				maisBarato.get().getDescricao(),
				quantidade);
	}
}
