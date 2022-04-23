package br.com.kasolution.teste;

import java.util.stream.Stream;

public class TesteStream02 {

	public static void main(String[] args) {

		Stream<Double> randomns = Stream.generate(() -> Math.random());
		randomns
			.limit(10)
			.forEach(n -> System.out.println(n));
		
		Stream<Integer> numeros = Stream.iterate(1,  n -> n + 2);
		numeros
			.limit(200)
			.filter(e -> e <= 100)
			.forEach(e -> System.out.println(e));
	}

}
