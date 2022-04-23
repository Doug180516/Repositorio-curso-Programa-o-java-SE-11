package br.com.kasolution.dominio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MeuCallable implements Callable<String>{
	
	List<Integer> numeros;
	
	public MeuCallable(int inicio, int fim) {
		System.out.printf("Callable: inicio %d - fim %d\n", inicio, fim);
		numeros = IntStream.rangeClosed(inicio, fim)
				.collect(() -> new ArrayList<>(), (s, t) -> s.add(t), (s, t ) -> s.addAll(t));
		Collections.shuffle(numeros); //embaralha os números
	}

	@Override
	public String call() throws Exception {
		return numeros.stream()
			.sorted()
			.peek(n -> sleep(10))
			.map(String::valueOf)
			.collect(Collectors.joining(", "));
	}
	
	public void sleep(long milis) {
    	try {
			Thread.sleep(milis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	

}
