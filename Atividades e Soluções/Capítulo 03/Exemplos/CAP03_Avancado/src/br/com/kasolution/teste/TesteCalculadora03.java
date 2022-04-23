package br.com.kasolution.teste;

import java.math.BigDecimal;

import br.com.kasolution.ferramenta.calculadora.Calculadora;
import br.com.kasolution.ferramenta.calculadora.Operacao;

public class TesteCalculadora03 {

	public static void main(String[] args) {

		Operacao adicao = new Operacao() {
			@Override
			public BigDecimal efetua(BigDecimal num1, BigDecimal num2) {
				return num1.add(num2);
			}
		};
		
		BigDecimal n1 = new BigDecimal(10);
		BigDecimal n2 = new BigDecimal(2);
		System.out.printf("10 + 2 = %.2f\n",
				Calculadora.calcula(n1, n2, adicao));		
		
	}

}
