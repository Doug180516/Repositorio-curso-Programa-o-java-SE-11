package br.com.kasolution.dominio;

public class ContadorSynchronized {
	
	private static int c;
	
	public synchronized void incremento() {
		c++;
	}
	
	public synchronized void decremento() {
		c--;
	}

	public synchronized int getC() {
		return c;
	}
}
