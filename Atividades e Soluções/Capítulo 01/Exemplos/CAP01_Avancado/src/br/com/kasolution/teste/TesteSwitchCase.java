package br.com.kasolution.teste;

public class TesteSwitchCase {
	public static void main(String[ ] args) {
		var simbolo = '#';

		switch (simbolo) {
			case '$' : System.out.println("D�lar");
				break;
			case '#' : System.out.println("Cerquilha");
				break;
			case '@' : System.out.println("Arroba");
				break;
			case '%' : System.out.println("Porcentagem");
				break;
			default: System.out.println("S�mbolo n�o encontrado!");
		}
	}

}
