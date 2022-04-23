package br.com.kasolution.teste;

import java.util.Set;
import java.util.TreeSet;

import br.com.kasolution.dominio.Produto;

public class TesteSetProduto {
	
	public static void main(String[] args) {
		Set<Produto> produtos = new TreeSet<>();
		produtos.add(new Produto(1, "Camera Digital", 300.00));
		produtos.add(new Produto(2, "Teclado", 100.00));
		produtos.add(new Produto(3, "Mouse", 45.00));
		produtos.add(new Produto(4, "Monitor 21'", 1600.00));
		produtos.add(new Produto(5, "Impressora HP", 2000.00));
		
		for (Produto p : produtos) {
			System.out.println(p);
		}
	}
}
