package br.com.kasolution.teste;

public class TesteAssert02 {
	public static void main(String[] args) {
		check(-5);

	}
	
	static public void check(int num) {
		if (num > 0) {
			System.out.println("O n�mero � positivo!");
		} else if (num == 0) {
			System.out.println("O n�mero � igual a zero!");
		} else {
			assert (num > 0) : "O valor � negativo!";
		}
	}
}
