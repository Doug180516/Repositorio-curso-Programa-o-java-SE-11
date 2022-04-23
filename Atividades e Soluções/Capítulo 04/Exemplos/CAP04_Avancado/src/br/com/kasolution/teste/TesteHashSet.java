package br.com.kasolution.teste;

import java.util.HashSet;
import java.util.Set;

public class TesteHashSet {

	public static void main(String[] args) {
		Set<Integer> numeros = new HashSet<>();
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		numeros.add(5);
		System.out.println(numeros);
		System.out.printf("Tamanho atual: %d \n", numeros.size());
		System.out.printf("Removendo: %s \n", numeros.remove(3));
		System.out.printf("Tamanho atual: %d \n", numeros.size());
		System.out.println(numeros);
		System.out.println("Adicionando 4 novamente:");
		numeros.add(4);
		System.out.println(numeros);
	}

}
