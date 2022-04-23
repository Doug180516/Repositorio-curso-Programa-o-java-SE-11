package br.com.kasolution.teste;

public class TesteArrayForEach {

	static public void main(String...args) {
		
		String meses[] = {"JAN", "FEV", "MAR", "ABR", "MAI", "JUN", "JUL", "AGO",
				"SET", "OUT", "NOV", "DEZ"};
		double valores[] = new double[5];
		valores[0] = 1.5d;
		valores[1] = 2.5;
		valores[2] = 3.5;
		valores[3] = 4.5;
		valores[4] = 5.5;
		
		for (String m : meses) {
			System.out.printf("%s ", m);
		}

		System.out.println("\n");
		
		for (double v : valores) {
			System.out.println(v);
		}
	}
}
