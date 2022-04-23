package br.com.kasolution.teste;

import java.time.Duration;
import java.time.LocalTime;

import static java.time.temporal.ChronoUnit.*;

public class TesteDuration01 {
	public static void main(String[] args) {
		Duration almoco = Duration.of(1, HOURS);
		Duration coffee = Duration.of(15, MINUTES);
		
		LocalTime inicioAula = LocalTime.of(9, 0);
		LocalTime fimAula = LocalTime.of(18, 0);
		
		Duration duracaoAula = Duration.between(inicioAula, fimAula);
		Duration tempoDeAula = duracaoAula
								.minus(coffee)
								.minus(almoco)
								.minus(coffee);
		
		System.out.printf("Os alunos permanecerão na sala de aula por %d horas e %d minutos",
				tempoDeAula.toHoursPart(), tempoDeAula.toMinutesPart());
	}
}
