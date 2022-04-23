package br.com.kasolution.teste;

import br.com.kasolution.dominio.Banco;

public class TesteBanco {
	
	public static void main(String[] args) {
		
		Banco banco = Banco.getInstance();
		Banco banco2 = Banco.getInstance();
		Banco banco3 = Banco.getInstance();
		
	}

}
