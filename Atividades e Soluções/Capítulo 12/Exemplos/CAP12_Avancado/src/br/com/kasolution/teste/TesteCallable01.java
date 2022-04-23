package br.com.kasolution.teste;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import br.com.kasolution.dominio.MeuCallable;

public class TesteCallable01 {

	public static void main(String[] args) {

		ExecutorService es = Executors.newFixedThreadPool(5);
		
		List<Future<String>> listaOrdenada = new ArrayList<>(); //vazio
		
		for (int i = 1000; i <= 20_000; i += 1000) {
			listaOrdenada.add(es.submit(new MeuCallable(i-999, i)));
		}
		
		listaOrdenada.forEach(f -> System.out.println(getString(f)));
		
		es.shutdown();
	}
	
	static private String getString(Future<String> f) {
		try {
			return f.get();
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		return "- vazio -";
	}

}
