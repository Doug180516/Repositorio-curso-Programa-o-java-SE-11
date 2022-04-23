package br.com.kasolution.teste;

import java.util.Map;
import java.util.TreeMap;

public class TesteTreeMap {
	public static void main(String[] args) {
		Map<Integer, String> lista = new TreeMap<Integer, String>() {
			{
				put(104, "Marcelo");
				put(103, "Renata");
				put(102, "Fernando");
				put(101, "Cristiano");
				put(100, "Karina");
			}
		};
		
		lista.put(103, "Gustavo"); //substitui o valor na posição

		System.out.printf("Valores ordenados: %s \n\n", lista.values()); 
		
		for (Integer i : lista.keySet()) {
			System.out.printf("Chave: %d - Valor: %s \n", i, lista.get(i));
		}
	}
}
/*
Output:
	Valores ordenados: [Karina, Cristiano, Fernando, Gustavo, Marcelo] 
	
	Chave: 100 - Valor: Karina 
	Chave: 101 - Valor: Cristiano 
	Chave: 102 - Valor: Fernando 
	Chave: 103 - Valor: Gustavo 
	Chave: 104 - Valor: Marcelo 
*/