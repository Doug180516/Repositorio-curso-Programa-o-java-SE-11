package br.com.kasolution.teste;

import java.math.BigDecimal;

import br.com.kasolution.ferramenta.calculadora.Calculadora;
import br.com.kasolution.ferramenta.calculadora.Operacao;

public class TesteCalculadora04 {

	public static void main(String[] args) {
		Operacao adicao = (BigDecimal num1, BigDecimal num2) -> num1.add(num2);
		Operacao subtracao = (num1, num2) -> num1.subtract(num2);
		Operacao multiplicacao = (num1, num2) -> num1.multiply(num2);
		Operacao divisao = (num1, num2) -> num1.divide(num2);

		Operacao operacoes[] = {adicao, subtracao, multiplicacao, divisao};

		BigDecimal operador1 = new BigDecimal(10);
		BigDecimal operador2 = new BigDecimal(2);
		
		for (Operacao operacao : operacoes) {
			System.out.printf("Resposta: %.2f \n",
								Calculadora.calcula(operador1, operador2, operacao));
		}
	}
}
