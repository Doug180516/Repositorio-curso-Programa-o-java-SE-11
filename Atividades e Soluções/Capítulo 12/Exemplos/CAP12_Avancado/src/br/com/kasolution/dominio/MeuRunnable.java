package br.com.kasolution.dominio;

public class MeuRunnable implements Runnable {
	
	static private int ultimaThread = 0;
	
	private int n;
	
	public MeuRunnable() {
		this.n = ++ultimaThread;
	}
	
	@Override
	public void run() {
        for (int i = 0; i <= 1000; i++) {
        	sleep(10);
            System.out.printf("Thread: %s - i: %d \n", n, i);
        }
	}

	public void sleep(long milis) {
    	try {
			Thread.sleep(milis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
