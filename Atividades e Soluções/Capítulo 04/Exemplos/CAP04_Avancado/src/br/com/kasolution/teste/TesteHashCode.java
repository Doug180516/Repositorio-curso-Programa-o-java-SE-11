package br.com.kasolution.teste;

import java.util.HashSet;
import java.util.Set;

import br.com.kasolution.dominio.Produto;

public class TesteHashCode {

	public static void main(String[] args) {
		Set<Produto> produtos = new HashSet<>() {{
			add(new Produto(1, "Mouse", 32.00));	
			add(new Produto(2, "Impressora", 2380.00));	
			add(new Produto(3, "Monitor", 789.00));	
			add(new Produto(1, "Mouse", 32.00));	
			add(new Produto(2, "Impressora", 2380.00));	
		}};	
		
		for (Produto p : produtos) {
			System.out.println(p);
		}
	}

}
