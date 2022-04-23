package br.com.kasolution.dominio;

public class MinhaThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 1000; i++) {
        	try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
            System.out.println("i: " + i);
        }
    }
}
