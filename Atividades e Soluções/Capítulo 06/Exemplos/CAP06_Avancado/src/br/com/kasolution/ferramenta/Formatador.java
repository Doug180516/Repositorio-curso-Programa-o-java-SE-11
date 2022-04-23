package br.com.kasolution.ferramenta;

import static java.text.NumberFormat.getCurrencyInstance;
import static java.text.NumberFormat.getNumberInstance;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Formatador {
	
	private static final Locale DEFAULT_LOCALE = new Locale("pt", "BR");
	
	static public String numero(double valor) {
		return numero(valor, DEFAULT_LOCALE);
	}

	static public String numero(double valor, Locale locale) {
		return getNumberInstance(locale).format(valor);
	}
	
	
	static public String moeda(double valor) {
		return moeda(valor, DEFAULT_LOCALE);
	}

	static public String moeda(double valor, Locale locale) {
		return getCurrencyInstance(locale).format(valor);
	}
	
	static public String data(LocalDate data, FormatStyle formato) {
		return data(data, DEFAULT_LOCALE, formato);
	}
	
	static public String data(LocalDate data, Locale locale, FormatStyle formato) {
		Locale.setDefault(locale);
		return DateTimeFormatter.ofLocalizedDate(formato).format(data);
	}
	
	static public String data(LocalDate data, String padrao) {
		return DateTimeFormatter.ofPattern(padrao).format(data);
	}

}
