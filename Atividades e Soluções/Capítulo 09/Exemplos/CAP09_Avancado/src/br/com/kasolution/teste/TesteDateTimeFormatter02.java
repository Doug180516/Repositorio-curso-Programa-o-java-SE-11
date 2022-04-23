package br.com.kasolution.teste;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TesteDateTimeFormatter02 {
	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter
				.ofPattern("EEEE, dd 'de' MMMM 'de' yyyy (h:mm:ss a) '['VV']'");
		
		String hojeFormatado = dtf.format(ZonedDateTime.now());
		System.out.println(hojeFormatado);
	}

}
//Output: terça-feira, 16 de março de 2021 (12:37:16) [America/Sao_Paulo]