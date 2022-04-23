package br.com.kasolution.teste;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.kasolution.bd.BDProduto;
import br.com.kasolution.dominio.produto.Produto;
import static br.com.kasolution.ferramenta.Formatador.*;

public class TesteOrdenacao01 {
	public static void main(String[] args) {
		List<Produto> produtos = new ArrayList<>();
		produtos = BDProduto.getProdutos();
		
		System.out.println("Ordenação padrão: ");

		produtos.stream()
			.sorted() //usa o compareTo da classe Produto
			.map(p -> descricaoValor(p))
			.forEach(System.out::println);
		
		Comparator<Produto> ordemValor = (p1, p2) -> p1.getValor().compareTo(p2.getValor());
		
		System.out.println("\n\nOrdenado pelo valor: ");
		
		produtos.stream()
		.sorted(ordemValor) //usa o Comparator da linha 23
		.map(p -> descricaoValor(p))
		.forEach(System.out::println);

		Comparator<Produto> ordemTipo = (p1, p2) -> p1.getTipo().compareTo(p2.getTipo());
		
//		System.out.println("\n\nOrdenado pelo tipo: ");
		
//		produtos.stream()
//		.sorted(ordemTipo)
//		.sorted(ordemValor)
//		.forEach(p -> System.out.printf("Tipo: %s, Descricao: %s, Valor: %.2f \n",
//				p.getTipo(),
//				p.getDescricao(),
//				p.getValor()));
//	
	
	}
	
	private static String descricaoValor(Produto p) {
		return String.format("Descrição: %s - Valor: %s",
				p.getDescricao(),
				moeda(p.getValor()));
	}
}
