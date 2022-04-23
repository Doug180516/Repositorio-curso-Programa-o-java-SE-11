package br.com.kasolution.teste;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

import br.com.kasolution.ferramenta.Formatador;

public class TesteLocalDate01 {
	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		LocalDate futuro = hoje.plusYears(1).plusMonths(5).plusDays(10);
		System.out.println(Formatador.data(futuro));
		
		Period period = Period.of(0, 1, 5);
		futuro = hoje.plus(period);
		System.out.println(Formatador.data(futuro));
	}
}
/*
 Output:
 ter�a-feira, 4 de abril de 2023
 ter�a-feira, 30 de novembro de 2021 
*/
