package br.com.kasolution.dominio;

import java.util.stream.IntStream;

public class ThreadSoma extends Thread {
	private long total;
	@Override
	public void run() {
		synchronized (this) {
			IntStream.rangeClosed(1, 500).forEach(n -> {
				dormir(10);
				total += n;
			});
			notify(); //fim da soma
		}
	}
	
	public long getTotal() {
		return total;
	}

	static private void dormir(long milis) {
		try {
			sleep(milis);
		} catch (InterruptedException e) { e.printStackTrace(); }
	}
}
