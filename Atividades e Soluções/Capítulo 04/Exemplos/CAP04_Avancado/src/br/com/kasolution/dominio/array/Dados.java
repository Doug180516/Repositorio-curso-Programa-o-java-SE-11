package br.com.kasolution.dominio.array;

import java.util.ArrayList;
import java.util.List;

public class Dados {
	
	static private List<Integer> numeros = new ArrayList<>();
	private List<String> nomes = new ArrayList<>();
	
	private List<Double> valores = new ArrayList<>() {{
		add(1_000.00);
		add(2_000.00);
		add(3_000.00);
		add(4_000.00);
	}};
	
	static {
		numeros.add(100);
		numeros.add(200);
		numeros.add(300);
		numeros.add(400);
		numeros.add(500);
		numeros.add(600);
		System.out.println("executou: bloco de inicialização estático!");
	}
	
	{
		nomes.add("Paulo");
		nomes.add("Marcelo");
		nomes.add("Mônica");
		nomes.add("Thiago");
		nomes.add("Fernando");
		nomes.add("Cristina");
		System.out.println("executou: bloco de inicialização!");
	}
	
	public Dados() {
		System.out.println("executou: construtor!");
		System.out.printf("Lista de nomes: %s \n", nomes);
		System.out.printf("Lista de números: %s \n", numeros);
	}

}
/* Output:
	executou: bloco de inicialização estático!
	executou: bloco de inicialização!
	executou: construtor!
	Lista de nomes: [Paulo, Marcelo, Mônica, Thiago, Fernando, Cristina] 
	Lista de números: [100, 200, 300, 400, 500, 600] 
*/