package br.com.kasolution.teste;

import java.time.LocalDate;
import java.time.Period;

import static java.time.Month.*;

public class TestePeriod01 {
	public static void main(String[] args) {
		LocalDate hoje = LocalDate.of(2020, MARCH, 15);
		LocalDate cursoAndroid = LocalDate.of(2022, FEBRUARY, 7);
		
		Period periodo = Period.between(hoje, cursoAndroid);
		
		System.out.printf("Faltam %d anos %d meses  e %d dias para a próxima turma de Android.\n",
					periodo.getYears(), periodo.getMonths(), periodo.getDays());
	}
}
