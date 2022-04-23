package br.com.kasolution.teste;

import java.util.Set;
import java.util.TreeSet;

public class TesteTreeSet {

	public static void main(String[] args) {
		Set<Integer> numeros = new TreeSet<>() {{
			add(4);
			add(3);
			add(2);
			add(5);
			add(1);
		}};
		
		System.out.printf("Tamanho atual: %d \n", numeros.size());
		System.out.println(numeros);

		System.out.println("\n\n");
		Set<String> nomes = new TreeSet<>();
		nomes.add("Marcelo");
		nomes.add("Renata");
		nomes.add("Cristiano");
		nomes.add("Karina");
		nomes.add("Fernando");
		System.out.printf("Tamanho atual: %d \n", nomes.size());
		System.out.println(nomes);
	
	}

}
