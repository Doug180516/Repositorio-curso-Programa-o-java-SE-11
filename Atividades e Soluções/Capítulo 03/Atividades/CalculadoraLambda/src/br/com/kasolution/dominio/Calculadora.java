package br.com.kasolution.dominio;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public enum Calculadora {

	ADICAO("+", new Operacao() {
		@Override
		public BigDecimal efetua(BigDecimal n1, BigDecimal n2) {
			return n1.add(n2);
		}
	}),
	SUBTRACAO("-", (n1, n2) -> n1.subtract(n2)),
	MULTIPLICACAO("*", (n1, n2) -> n1.multiply(n2)),
	DIVISAO("/", (n1, n2) -> n1.divide(n2, 2, RoundingMode.HALF_UP));
	
	private String simbolo;
	private Operacao operacao;
	
	//construtor
	private Calculadora(String simbolo, Operacao operacao) {
		this.simbolo = simbolo;
		this.operacao = operacao;
	}
	
	public String getSimbolo() { return simbolo; }

	public Operacao getOperacao() { return operacao; }

	static public BigDecimal calcula(BigDecimal n1, BigDecimal n2, Operacao op) {
		return op.efetua(n1, n2);
	}	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculadora calculos[] = {ADICAO, SUBTRACAO, MULTIPLICACAO, DIVISAO};
		
		System.out.print("Informe os 2 operandos separados por espaço: ");
		var n1 = new BigDecimal(sc.nextDouble());
		var n2 = new BigDecimal(sc.nextDouble());
		
		for (int i = 0; i < Calculadora.values().length; i++) {
			System.out.printf("%d - %s\n", i, calculos[i].getSimbolo());
		}
		System.out.print("Escolha a operação: ");
		var calculo = sc.nextInt();

		System.out.printf("\nResultado: %.2f %s %.2f = %.2f \n",
				n1,
				calculos[calculo].getSimbolo(), 
				n2,
				calcula(n1, n2, calculos[calculo].getOperacao()));
	}	
}