package br.com.kasolution.teste;

import java.util.ArrayList;
import java.util.List;

public class TesteArrayList {
	
	public static void main(String[] args) {
		List<String> nomes = new ArrayList<>() {{ //classe anônima extends ArrayList
			add("Marcelo");
			add("Renata");
			add("Cristiano");
			add("Karina");
			add(2, "Fernando");
		}};
		
		//String nomesArray[] = {"Paulo", "Roberto", "Maria"};
		
		System.out.println(nomes);
		System.out.printf("Tamanho atual: %d \n", nomes.size());
		System.out.printf("Removendo: %s \n", nomes.remove(3));
		System.out.printf("Tamanho atual: %d \n", nomes.size());
		System.out.println(nomes);
	}

}
