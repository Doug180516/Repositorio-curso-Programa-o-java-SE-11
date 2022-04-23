package br.com.kasolution.teste;

import java.util.List;
import java.util.function.ToDoubleFunction;

public class TesteToDoubleFunction01 {
	public static void main(String[] args) {
		
		List<String> valoresString = List.of("123.44", "222.30", "456.00", "694.99");
		ToDoubleFunction<String> convertToDouble = e -> Double.valueOf(e);

		double soma = 0;
		for (String s : valoresString) {
			soma += convertToDouble.applyAsDouble(s);
		}
		System.out.printf("Soma: %.2f \n", soma);
	}
}
