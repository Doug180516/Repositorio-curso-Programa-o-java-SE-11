package br.com.kasolution.teste;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

import br.com.kasolution.bd.BDProduto;
import br.com.kasolution.dominio.produto.Produto;
import static br.com.kasolution.ferramenta.Formatador.*;

public class TesteOrdenacao02 {
	public static void main(String[] args) {
		List<Produto> produtos = new ArrayList<>();
		produtos = BDProduto.getProdutos();
		
		Function<Produto, Double> comparaValor = p -> p.getValor();
		Function<Produto, String> comparaTipo = p -> p.getTipo();
		Comparator<Produto> comparaValorR = (p1, p2) -> p1.getValor().compareTo(p2.getValor());

		Comparator<Produto> comparaValorTipo = Comparator
													.comparing(comparaTipo)
													//.reversed()
													.thenComparing(comparaValorR)
													.reversed();
		
		produtos.stream()
			.sorted(comparaValorTipo)
			.forEach(p -> tipoDescricaoValor(p));
		
	}
	
	private static void tipoDescricaoValor(Produto p) {
		System.out.printf("Tipo: %s - descrição: %s - valor: %s\n",
				p.getTipo(),
				p.getDescricao(),
				moeda(p.getValor()));
	}
}
