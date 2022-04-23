package br.com.kasolution.ferramenta;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Formatador {
	
	private static final Locale DEFAULT_LOCALE = new Locale("pt", "BR");
	
	static {
		Locale.setDefault(DEFAULT_LOCALE);
	}

	static public String data(LocalDate data) {
		DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		return dtf.format(data);
	}

	static public String data(LocalDateTime data) {
		DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		return dtf.format(data);
	}

	static public String data(ZonedDateTime data, String pattern) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
		return dtf.format(data);
	}
	
	static public String data(ZonedDateTime data) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE - dd 'de' MMMM 'de' yyyy (HH:mm)");
		return dtf.format(data);
	}
	
	static public String data(Instant data) {
		DateTimeFormatter dtf = DateTimeFormatter
				.ofPattern("HH:mm:ss:nn")
				.withZone(ZoneId.systemDefault());
		
		return dtf.format(data);
	}
}
