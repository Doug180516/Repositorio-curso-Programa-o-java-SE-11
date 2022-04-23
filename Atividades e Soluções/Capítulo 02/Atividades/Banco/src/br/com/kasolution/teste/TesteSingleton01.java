package br.com.kasolution.teste;

import java.time.LocalDate;

import br.com.kasolution.dominio.Banco;
import br.com.kasolution.dominio.Cliente;
import br.com.kasolution.dominio.conta.Conta;
import br.com.kasolution.dominio.conta.ContaAPrazo;
import br.com.kasolution.dominio.conta.ContaCorrente;
import br.com.kasolution.dominio.conta.Prazo;

public class TesteSingleton01 {

	public static void main(String[] args) {
		
		
		
		//Contas a Prazo
		Conta cap01 = new ContaAPrazo("1234-5", 1_000.00, LocalDate.of(2020, 10, 1),
				Prazo.SEIS_MESES);
		Conta cap02 = new ContaAPrazo("1234-6", 2_000.00, Prazo.DEZOITO_MESES);

		//Contas Correntes
		Conta cc01 = new ContaCorrente("1234-7", 7_500.00, 10_000.00);
		Conta cc02 = new ContaCorrente("1234-8", 1_800.00, 10_000.00);
		
		Cliente cliente = new Cliente("John Romero", 99988877766L);
		cliente.adiciona(cap01, cap02, cc01, cc02);

		Banco banco = Banco.getInstance();
		banco.adiciona(cliente);
		System.out.println("Singleton: ");
		System.out.println(banco);
		
	}

}
