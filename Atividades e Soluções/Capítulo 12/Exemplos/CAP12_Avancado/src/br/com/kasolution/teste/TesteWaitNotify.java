package br.com.kasolution.teste;

import br.com.kasolution.dominio.ThreadSoma;

public class TesteWaitNotify {
	public static void main(String[] args) throws InterruptedException {
		ThreadSoma ts = new ThreadSoma();
		ts.start(); //inicio da soma
		synchronized (ts) {
			System.out.println("Aguardando a soma terminar....");
			ts.wait(); //aguardando o notify() de ts
			System.out.println("O resultado da soma é: " + ts.getTotal());
		};
	}
}
