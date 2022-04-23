package br.com.kasolution.teste;

public class TesteIfElse {
	public static void main(String[] args) {
		var hora = 19;

		if (hora < 12) {
			System.out.println("Bom dia!");
		} else if (hora < 18) {
			System.out.println("Boa tarde!");
		} else {
			System.out.println("Boa noite!");
		}
	}

}
