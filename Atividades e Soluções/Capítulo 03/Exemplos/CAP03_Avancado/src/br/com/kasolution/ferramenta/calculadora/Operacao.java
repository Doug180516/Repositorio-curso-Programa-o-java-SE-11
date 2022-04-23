package br.com.kasolution.ferramenta.calculadora;

import java.math.BigDecimal;

@FunctionalInterface
public interface Operacao {
	
	public abstract BigDecimal efetua(BigDecimal num1, BigDecimal num2);

	
	default BigDecimal adicao(BigDecimal n1, BigDecimal n2) {
		return n1.add(n2);
	}
	
	static BigDecimal subtracao(BigDecimal n1, BigDecimal n2) {
		return n1.subtract(n2);
	}
	
	private void metodoPrivado() {
		System.out.println("Método privado na interface!");
	}
	
	private static void metodoStaticPrivate() {
		System.out.println("Método privado e estático na interface!");
	}

}
