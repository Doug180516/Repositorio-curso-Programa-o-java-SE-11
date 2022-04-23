package br.com.kasolution.dominio;

import java.math.BigDecimal;

@FunctionalInterface
public interface Operacao {
	BigDecimal efetua(BigDecimal n1, BigDecimal n2);	
}
