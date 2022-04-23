package br.com.kasolution.teste;

import java.util.*;
import static java.lang.System.out;

import br.com.kasolution.dominio.Funcionario;

public class TesteFuncionario {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = "Igor";
		
		Funcionario douglas = new Funcionario(1, "Douglas Oliveira", "TI",
				12_000.00, true);
		
		douglas.aumentaSalario(500.00);
		out.printf("Sal�rio antes do desconto: %.2f \n", douglas.getSalario());

		douglas.aplicaDesconto(.05);
		out.printf("Sal�rio ap�s o desconto: %.2f \n", douglas.getSalario());
		
	}

	/*
	 output:
		Sal�rio antes do desconto: 12500,00 
		Sal�rio ap�s o desconto: 11875,00
 	 */
}
