package br.com.kasolution.teste;

import java.time.LocalDate;

import br.com.kasolution.dominio.Cliente;
import br.com.kasolution.dominio.conta.ContaAPrazo;
import br.com.kasolution.dominio.conta.Prazo;

public class TesteCliente01 {

	public static void main(String[] args) {
		ContaAPrazo contaAPrazo01 = new ContaAPrazo("1234-5", 10_000.00,
				LocalDate.of(2020, 1, 1), Prazo.DOZE_MESES);
		ContaAPrazo contaAPrazo02 = new ContaAPrazo("1234-6", 10_000.00, Prazo.SEIS_MESES);
		
		Cliente cliente = new Cliente("Regina Freitas", 12345678900L);
		cliente.adiciona(contaAPrazo01, contaAPrazo02);
		
		System.out.println("Dados do cliente:");
		System.out.println(cliente);

		
		contaAPrazo01.desativa(contaAPrazo02);
		System.out.println("\n\nConta destivada:");
		System.out.println(cliente);
		
		
	}

}
