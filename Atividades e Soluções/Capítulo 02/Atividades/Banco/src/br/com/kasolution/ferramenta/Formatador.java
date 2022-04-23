package br.com.kasolution.ferramenta;


import static java.text.NumberFormat.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Formatador {
	
	private static final Locale DEFAULT_LOCALE = new Locale("pt", "BR");
	
	static public String numero(double valor) {
		return getNumberInstance(DEFAULT_LOCALE).format(valor);
	}

	static public String moeda(double valor) {
		return getCurrencyInstance(DEFAULT_LOCALE).format(valor);
	}
	
	static public String data(LocalDate data, FormatStyle formato) {
		Locale.setDefault(DEFAULT_LOCALE);
		return DateTimeFormatter.ofLocalizedDate(formato).format(data);
	}

	static public String data(LocalDate data, String formato) {
		Locale.setDefault(DEFAULT_LOCALE);
		return DateTimeFormatter.ofPattern(formato).format(data);
	}	
	
}