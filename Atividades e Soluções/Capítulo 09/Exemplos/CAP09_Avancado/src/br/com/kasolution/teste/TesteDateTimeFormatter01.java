package br.com.kasolution.teste;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class TesteDateTimeFormatter01 {
	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter
									.ofLocalizedDate(FormatStyle.FULL)
									.withLocale(Locale.FRENCH);
		String hojeFormatado = dtf.format(LocalDate.now());
		
		System.out.println(hojeFormatado);
	}
}
//Output: mardi 10 octobre 2020
