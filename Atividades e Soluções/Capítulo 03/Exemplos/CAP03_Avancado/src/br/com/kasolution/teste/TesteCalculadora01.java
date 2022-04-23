package br.com.kasolution.teste;

import java.math.BigDecimal;

import br.com.kasolution.ferramenta.calculadora.Calculadora;
import br.com.kasolution.ferramenta.calculadora.Operacao;

public class TesteCalculadora01 {

	public static void main(String[] args) {

		Operacao operacoes[] = {
			new Calculadora.Adicao(),
			new Calculadora.Subtracao(),
			new Calculadora.Multiplicacao(),
			new Calculadora.Divisao()
		};
		
		BigDecimal operador1 = new BigDecimal(10);
		BigDecimal operador2 = new BigDecimal(2);
		
		for (Operacao operacao : operacoes) {
			System.out.printf("Operação (classe): %s - Resposta: %.2f \n",
					operacao.getClass().getSimpleName(),
					Calculadora.calcula(operador1, operador2, operacao));
		}
		
	}

}
