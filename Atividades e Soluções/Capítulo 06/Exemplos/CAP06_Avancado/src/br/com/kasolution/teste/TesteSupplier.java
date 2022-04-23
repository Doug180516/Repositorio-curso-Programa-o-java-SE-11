package br.com.kasolution.teste;

import java.util.Random;
import java.util.function.Supplier;

public class TesteSupplier {

	public static void main(String[] args) {
		Random r  = new Random();

		Supplier<Double> fabricaDeDouble =
				() -> r.nextDouble() * 1000;
				
		for (int i = 0; i < 10; i++) {
			System.out.printf("%.2f \n", fabricaDeDouble.get());
		}
	}
}
