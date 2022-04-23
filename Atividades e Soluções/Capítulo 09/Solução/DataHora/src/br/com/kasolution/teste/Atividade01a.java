package br.com.kasolution.teste;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import br.com.kasolution.dominio.Treinamento;

public class Atividade01a {

	public static void main(String[] args) {
		Treinamento java = new Treinamento("Webinar Java", "Igor Ribeiro",
				LocalDate.of(2021, 7, 10), LocalTime.of(9, 30));
		

		LocalDateTime evento = LocalDateTime.of(java.getDataInicio(), java.getHoraInicio());
		ZoneId rio = ZoneId.of("America/Sao_Paulo");
		ZoneId paris = ZoneId.of("Europe/Paris");
		ZoneId berlin = ZoneId.of("Europe/Berlin");
		ZoneId lisboa = ZoneId.of("Europe/Lisbon");
		
		DateTimeFormatter f = DateTimeFormatter.ofPattern("EEEE, dd 'de' MMMM 'de' yyyy (HH:mm) - VV");
		ZonedDateTime horarioBrasilia = ZonedDateTime.of(evento, rio);
		
		var horarioRio = f.format(horarioBrasilia);
		var horarioParis = f.format(horarioBrasilia.withZoneSameInstant(paris));
		var horarioBerlin = f.format(horarioBrasilia.withZoneSameInstant(berlin));
		var horarioLisboa = f.format(horarioBrasilia.withZoneSameInstant(lisboa));
		
		
		System.out.printf("Dia e horário em Rio de Janeiro: %s \n", horarioRio);
		System.out.printf("Dia e horário em Paris: %s \n", horarioParis);
		System.out.printf("Dia e horário em Berlin: %s \n", horarioBerlin);
		System.out.printf("Dia e horário em Lisboa: %s \n", horarioLisboa);
	}
}
