package br.com.kasolution.teste;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

import br.com.kasolution.ferramenta.calculadora.Calculadora;
import br.com.kasolution.ferramenta.calculadora.Operacao;

public class TesteCalculadora05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe n1: ");
		double n1 = sc.nextDouble();
		System.out.print("Informe n2: ");
		double n2 = sc.nextDouble();
		
		BigDecimal bN1 = new BigDecimal(n1);
		BigDecimal bN2 = new BigDecimal(n2);
		Calculadora.Adicao adicao = new Calculadora.Adicao();
		Calculadora.Subtracao subtracao = new Calculadora.Subtracao();
		Calculadora.Elevado elevado = new Calculadora.Elevado();
		
		//local
		class Multiplicacao implements Operacao {
			@Override
			public BigDecimal efetua(BigDecimal num1, BigDecimal num2) {
				return num1.multiply(num2);
			}
		}
		
		Multiplicacao multiplicacao = new Multiplicacao();
		
		//classe interna anônima
		Operacao divisao = new Operacao() {
			@Override
			public BigDecimal efetua(BigDecimal num1, BigDecimal num2) {
				return num1.divide(num2, 2, RoundingMode.HALF_UP );
			}			
		};
		
		Operacao adicao2 = (BigDecimal num1, BigDecimal num2) -> num1.add(num2);	
		Operacao multiplicacao2 = (num1, num2) -> num1.multiply(num2);	
		
		BigDecimal r = Calculadora.calcula(bN1, bN2, multiplicacao2);
		System.out.println("Resposta: " + r);
	}

}
