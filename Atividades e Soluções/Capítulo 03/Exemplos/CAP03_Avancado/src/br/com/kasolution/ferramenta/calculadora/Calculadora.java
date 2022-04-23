package br.com.kasolution.ferramenta.calculadora;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calculadora {
	
	static public BigDecimal calcula(BigDecimal num1, BigDecimal num2, Operacao operacao) {
		return operacao.efetua(num1, num2);
	}
	
	static public class Adicao implements Operacao {
		@Override
		public BigDecimal efetua(BigDecimal num1, BigDecimal num2) {
			return num1.add(num2);
		}
	}
	
	static public class Subtracao implements Operacao {
		@Override
		public BigDecimal efetua(BigDecimal num1, BigDecimal num2) {
			return num1.subtract(num2);
		}
	}

	static public class Multiplicacao implements Operacao {
		@Override
		public BigDecimal efetua(BigDecimal num1, BigDecimal num2) {
			return num1.multiply(num2);
		}
	}

	static public class Divisao implements Operacao {
		@Override
		public BigDecimal efetua(BigDecimal num1, BigDecimal num2) {
			return num1.divide(num2);
		}
		
		
	}
	
	static public class Elevado implements Operacao {
		@Override
		public BigDecimal efetua(BigDecimal num1, BigDecimal num2) {
			return num1.pow(num2.intValue());
		}
	}
	
}
