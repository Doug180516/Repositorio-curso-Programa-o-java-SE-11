package br.com.kasolution.teste;

public class TesteAssert02 {
	public static void main(String[] args) {
		check(-5);

	}
	
	static public void check(int num) {
		if (num > 0) {
			System.out.println("O número é positivo!");
		} else if (num == 0) {
			System.out.println("O número é igual a zero!");
		} else {
			assert (num > 0) : "O valor é negativo!";
		}
	}
}
