package br.com.kasolution.teste;

import java.util.HashMap;
import java.util.Map;

public class TesteHashMap {
	public static void main(String[] args) {
		Map<Integer, String> lista = new HashMap<Integer, String>() {
			{
				put(100, "Marcelo");
				put(101, "Renata");
				put(102, "Fernando");
				put(103, "Cristiano");
				put(104, "Karina");
				put(105, "Wallace");
			}
		};
		
		System.out.println("Antes:");
		for (Integer i : lista.keySet()) { //Set com todas as chaves
			System.out.printf("Chave: %d - Valor: %s \n", i, lista.get(i)); //pega chave i
		}

		lista.put(103, "Gustavo"); //substitui o valor na posição
		
		System.out.println("\n\nDepois:");
		for (Integer i : lista.keySet()) {
			System.out.printf("Chave: %d - Valor: %s \n", i, lista.get(i));
		}
	}
}
/* Output:
	Chave: 100 - Valor: Marcelo 
	Chave: 101 - Valor: Renata 
	Chave: 102 - Valor: Fernando 
	Chave: 103 - Valor: Gustavo 
	Chave: 104 - Valor: Karina 
 */
