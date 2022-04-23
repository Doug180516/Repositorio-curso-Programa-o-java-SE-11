package br.com.kasolution.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.kasolution.dominio.Produto;

public class TesteComparatorProduto {
	
	public static void main(String[] args) {
		List<Produto> produtos = new ArrayList<>(); //java.util.List
		produtos.add(new Produto(5, "Impressora HP", 2000.00));
		produtos.add(new Produto(1, "Camera Digital", 300.00));
		produtos.add(new Produto(4, "Monitor 21'", 1600.00));
		produtos.add(new Produto(3, "Mouse", 45.00));
		produtos.add(new Produto(2, "Teclado", 100.00));
		
		Collections.sort(produtos); //ordena pelo compareTo de Produto
		
		for (Produto p : produtos) {
			System.out.println(p);
		}		
		
		Comparator<Produto> codigoAsc = (p1, p2) -> p1.getCodigo().compareTo(p2.getCodigo());
		Comparator<Produto> codigoDesc = (p1, p2) -> p2.getCodigo().compareTo(p1.getCodigo());
		Comparator<Produto> descricaoAsc = (p1, p2) -> p1.getDescricao().compareTo(p2.getDescricao());
		
		System.out.println("\nOrdenado pelo codigo inverso:");

		Collections.sort(produtos, descricaoAsc);
		
		for (Produto p : produtos) {
			System.out.println(p);
		}		
	}

}
