package br.com.kasolution.teste;

public class TesteString {
	
	public static void main(String[] args) {
		String s1 = "Curso";
		String s2 = "Java";
		String s3 = "Avançado";
		String s4 = "Ka";
		String s5 = "Curso"; //pega do pool
		
		String frase = s1 + " " + s2 + " " + s3 + " " + s4;
		
		System.out.printf("Frase: %s \n", frase);
		
		String nãoFaçaIsso = new String("Má prática");
	}

}
