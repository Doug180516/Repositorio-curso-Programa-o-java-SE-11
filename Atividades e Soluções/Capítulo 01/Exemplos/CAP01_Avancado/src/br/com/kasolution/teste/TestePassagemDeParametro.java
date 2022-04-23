package br.com.kasolution.teste;

import br.com.kasolution.dominio.Funcionario;

public class TestePassagemDeParametro {
	
	public static void main(String[] args) {
		int x = 10;
		System.out.printf("Valor anterior de X: %d \n", x);
		alteraValor(x, 30);
		System.out.printf("Valor atual de X: %d \n", x);

		Funcionario douglas = new Funcionario(1, "Douglas Oliveira", "TI",
				12_000.00, true);
		System.out.printf("Salario anterior Douglas: %.2f \n", douglas.getSalario());
		alteraSalario(douglas, 500.00);
		System.out.printf("Salario atual Douglas: %.2f \n", douglas.getSalario());
	}
	
	public static void alteraSalario(Funcionario f, double valor) {
		f.aumentaSalario(valor);
		System.out.printf("Novo salário: %.2f\n", f.getSalario());
	}
	
	public static void alteraValor (int variavel, int valor) {
		variavel = valor; //30
		System.out.printf("Novo valor: %d \n", variavel);
	}
	
	/*
	 Output:
		Valor anterior de X: 10 
		Novo valor: 30 
		Valor atual de X: 10 
		Salario anterior Douglas: 12000,00 
		Novo salário: 12500,00
		Salario atual Douglas: 12500,00 	 
	 */

}
