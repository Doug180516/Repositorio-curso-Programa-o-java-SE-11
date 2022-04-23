package br.com.kasolution.teste;

public class TesteForLoop {

	public static void main(String[] args) {
		int i = 0, j = 100;
		for (;i < j;) {
			System.out.printf("i: %d, j: %d \n", i, j);
			i+=2;
			j-=3;
		}		
	}

}
