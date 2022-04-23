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

		ZoneId rio = ZoneId.of("America/Sao_Paulo");
		ZoneId paris = ZoneId.of("Europe/Paris");
		ZoneId berlin = ZoneId.of("Europe/Berlin");
		ZoneId lisboa = ZoneId.of("Europe/Lisbon");

		LocalDateTime dataHoraInicio = LocalDateTime.of(java.getDataInicio(), java.getHoraInicio());
		ZonedDateTime dataHoraBrasilia = ZonedDateTime.of(dataHoraInicio, rio);
		ZonedDateTime dataHoraParis = dataHoraBrasilia.withZoneSameInstant(paris);
		ZonedDateTime dataHoraBerlin = dataHoraBrasilia.withZoneSameInstant(berlin);
		ZonedDateTime dataHoraLisboa = dataHoraBrasilia.withZoneSameInstant(lisboa);
		
		DateTimeFormatter f = DateTimeFormatter
				.ofPattern("EEEE, dd 'de' MMMM 'de' yyyy - hh:mm a [VV]");
		
		System.out.printf("Dia e horário em Rio de Janeiro: %s \n", f.format(dataHoraBrasilia) );
		System.out.printf("Dia e horário em Paris: %s \n", f.format(dataHoraParis));
		System.out.printf("Dia e horário em Berlin: %s \n", f.format(dataHoraBerlin));
		System.out.printf("Dia e horário em Lisboa: %s \n", f.format(dataHoraLisboa));
	}
}
