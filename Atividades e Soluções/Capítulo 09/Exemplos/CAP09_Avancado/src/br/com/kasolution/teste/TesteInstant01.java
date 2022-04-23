package br.com.kasolution.teste;

import java.time.Instant;
import java.util.stream.LongStream;

import br.com.kasolution.ferramenta.Formatador;

public class TesteInstant01 {
	public static void main(String[] args) {
		LongStream numeros = LongStream.generate(() -> (int) (Math.random() * 1000));

		System.out.printf("Antes: %s \n", Formatador.data(Instant.now()));

		numeros.limit(100_000_000)
			.sorted()
			.sum();

		System.out.printf("Depois: %s \n", Formatador.data(Instant.now()));
	}
}
