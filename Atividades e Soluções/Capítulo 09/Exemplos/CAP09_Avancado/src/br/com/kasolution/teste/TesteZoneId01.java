package br.com.kasolution.teste;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import static br.com.kasolution.ferramenta.Formatador.*;
import static java.time.Month.*;

public class TesteZoneId01 {
	public static void main(String[] args) {
		ZoneId saoPaulo = ZoneOffset.of("-3");
		ZoneId vancouver = ZoneId.of("America/Vancouver");
		LocalDateTime data = LocalDateTime.of(2021, OCTOBER, 18, 18, 30);
		ZonedDateTime aulaBrasil = ZonedDateTime.of(data, saoPaulo);
		ZonedDateTime aulaCanada = aulaBrasil.withZoneSameInstant(vancouver);
		
		System.out.println("Aula no Brasil: " + data(aulaBrasil));
		System.out.println("Aula no Canadá: " + data(aulaCanada));
	}
}
