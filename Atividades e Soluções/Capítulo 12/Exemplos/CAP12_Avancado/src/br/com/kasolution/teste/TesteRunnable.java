package br.com.kasolution.teste;

public class TesteRunnable {
	public static void main(String[] args) {
		Runnable r = () -> {
	        for (int i = 0; i <= 1000; i++) {
	        	try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
	            System.out.println("i: " + i);
	        }
		};
		
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		t1.start();
		t2.start();
	}
}
