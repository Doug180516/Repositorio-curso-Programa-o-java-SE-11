package br.com.kasolution.teste;

import br.com.kasolution.dominio.MinhaThread;

public class TesteMinhaThread {

	public static void main(String[] args) {
		MinhaThread t1 = new MinhaThread();			
		MinhaThread t2 = new MinhaThread();
		
		t1.start();
		t2.start();
	}

}
