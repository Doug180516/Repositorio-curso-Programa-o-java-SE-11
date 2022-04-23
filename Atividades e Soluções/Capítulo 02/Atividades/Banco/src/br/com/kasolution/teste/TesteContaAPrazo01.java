package br.com.kasolution.teste;

import java.time.LocalDate;

import br.com.kasolution.dominio.conta.ContaAPrazo;
import br.com.kasolution.dominio.conta.Prazo;

public class TesteContaAPrazo01 {
	
	public static void main(String[] args) {
		ContaAPrazo contaAPrazo = new ContaAPrazo("1234-5", 10_000.00,
				LocalDate.of(2020, 11, 1), Prazo.DOZE_MESES);
		
		System.out.println(contaAPrazo);
		
		System.out.println("\nSaque de 500,0:");
		contaAPrazo.saca(500.00);
		System.out.println(contaAPrazo);
		
		System.out.println("\nDepósito de 20.000,00:");
		contaAPrazo.deposita(20_000.00);
		System.out.println(contaAPrazo);
	}

}
