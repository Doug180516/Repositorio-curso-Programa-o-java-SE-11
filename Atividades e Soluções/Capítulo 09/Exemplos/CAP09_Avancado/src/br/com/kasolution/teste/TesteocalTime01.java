package br.com.kasolution.teste;

import java.time.LocalTime;
import java.time.Duration;

import static java.time.temporal.ChronoUnit.*;

public class TesteocalTime01 {
	public static void main(String[] args) {
		LocalTime inicioAula = LocalTime.of(18, 30);
		Duration duracao = Duration.ofHours(4).plusMinutes(10);
		LocalTime fimDaAula = inicioAula.plus(duracao);
		System.out.println(fimDaAula);
		
		LocalTime horaAtual = LocalTime.now();
		long minutosParaFim = horaAtual.until(fimDaAula, MINUTES);
		System.out.println(minutosParaFim);
	}
}
