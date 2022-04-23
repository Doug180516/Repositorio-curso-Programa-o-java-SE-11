package br.com.kasolution.teste;



import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import static br.com.kasolution.ferramenta.Formatador.data;
import static java.time.Month.*;

public class TesteLocalDateTime01 {
	public static void main(String[] args) {
		LocalDate anoNovo = LocalDate.of(2022, JANUARY, 1);
		LocalTime meiaNoite = LocalTime.of(0, 0);
		LocalDateTime reveillon  = LocalDateTime.of(anoNovo, meiaNoite);
		LocalDateTime fimFerias = reveillon.plusDays(10).plusHours(7);
		System.out.printf("Fim das ferias: %s \n", data(fimFerias));
	}
}
