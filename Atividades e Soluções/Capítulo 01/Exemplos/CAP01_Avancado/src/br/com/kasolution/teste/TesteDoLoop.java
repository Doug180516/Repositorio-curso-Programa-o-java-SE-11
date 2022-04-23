package br.com.kasolution.teste;

public class TesteDoLoop {
	public static void main(String[] args) {
		var i = 0;
		do {
			i++;
			System.out.printf("i: %d \n", i);
		} while (i < 100);
	}
}
