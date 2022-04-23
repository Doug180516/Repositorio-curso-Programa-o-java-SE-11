package br.com.kasolution.dominio;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.stream.IntStream;

public class ProvaNatacao {

	private final CyclicBarrier barreira = new CyclicBarrier(8);
	private volatile long horaInicio;

	private Runnable[] competidores = {
			competidor(100, 1),
			competidor(25, 2),
			competidor(150, 3),
			competidor(75, 4),
			competidor(50, 5),
			competidor(125, 6) };

	private Runnable competidor(long atraso, int numero) {
		return () -> {
			IntStream.rangeClosed(0, 100).forEach(n -> atrasoCompeditor(atraso));
			try {
				long horaFim = System.currentTimeMillis() - horaInicio;
				if (!barreira.isBroken()) {
					System.out.printf("Competidor %d finalizou em %s segundos!\n",
							numero, timeFormat(horaFim));
					barreira.await();
				}
			} catch (BrokenBarrierException | InterruptedException e) {
				System.out.println("Thread interrompida!");
			}
		};
	}

	private void atrasoCompeditor(long mili) {
		try {
			Thread.sleep(mili);
		} catch (InterruptedException ex) {
			// ignorar
		}
	}

	public void iniciarProva() {
		horaInicio = System.currentTimeMillis();
		for (Runnable r : competidores) {
			new Thread(r).start();
		}

		try {
			System.out.println("*** Início de prova... ***\n");
			barreira.await();
		} catch (InterruptedException | BrokenBarrierException e) {
			e.printStackTrace();
		}

		System.out.println("\n*** Fim de prova! ***\n");
	}

	private String timeFormat(long milis) {
		long segundos = milis / 1000;
		long milissegundos = milis % 1000;
		String time = String.format("%02d.%03d", segundos, milissegundos);
		return time;
	}
}
