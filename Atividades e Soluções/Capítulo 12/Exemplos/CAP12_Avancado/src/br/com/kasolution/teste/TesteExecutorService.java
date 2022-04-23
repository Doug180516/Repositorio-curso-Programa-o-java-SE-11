package br.com.kasolution.teste;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import br.com.kasolution.dominio.MeuRunnable;

public class TesteExecutorService {
	public static void main(String[] args) {
		
		ExecutorService es = Executors.newFixedThreadPool(3);
		
		Stream<Runnable> runnablesStream  = Stream
				.generate(() -> new MeuRunnable());
		
		List<Runnable> runnableList = runnablesStream
										.limit(10)
										.collect(Collectors.toList());
		
		runnableList
			.forEach(es::execute);
			
		es.shutdown();

	}
}