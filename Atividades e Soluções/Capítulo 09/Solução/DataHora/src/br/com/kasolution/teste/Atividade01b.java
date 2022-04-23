package br.com.kasolution.teste;

import java.time.Duration;
import java.time.LocalDateTime;

import static java.time.temporal.ChronoUnit.*;

public class Atividade01b {
	
	public static void main(String[] args) {
		LocalDateTime partida = LocalDateTime.of(2021, 10, 2, 14, 20);
		LocalDateTime chegada = LocalDateTime.of(2021, 10, 4, 16, 00);
		
		Duration almoco = Duration.of(1, HOURS);
		Duration jantar = Duration.of(1, HOURS);
		Duration lanche = Duration.of(20, MINUTES);
		
		Duration tempoViagem = Duration.between(partida, chegada);
		Duration tempoOnibus = tempoViagem
							.minus(lanche)	
							.minus(almoco)
							.minus(lanche)
							.minus(jantar)
							.minus(lanche);
		
		System.out.printf("Tempo total dentro do ônibus: %d horas e %d minutos \n",
				tempoOnibus.toHoursPart(), tempoOnibus.toMinutesPart());

	}
}
