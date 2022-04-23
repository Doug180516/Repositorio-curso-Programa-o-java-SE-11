package br.com.kasolution.teste;

public class TesteStringBuilder {

	public static void main(String[] args) {
		String s1 = "Curso";
		String s2 = "Java";
		String s3 = "Avançado";
		String s4 = "Ka";

		StringBuilder frase = new StringBuilder(s1).append(" ")
				.append(s2).append(" ")
				.append(s3).append(" ")
				.append(s4);

		frase.insert(11, "11 ");
		System.out.printf("Frase: %s \n", frase);

	}

}
