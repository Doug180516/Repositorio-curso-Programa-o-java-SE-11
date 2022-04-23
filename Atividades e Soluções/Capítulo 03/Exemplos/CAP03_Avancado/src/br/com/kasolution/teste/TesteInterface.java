package br.com.kasolution.teste;

import java.time.LocalDate;

import br.com.kasolution.dominio.Alimento;
import br.com.kasolution.dominio.Descartavel;
import br.com.kasolution.dominio.Produto;
import br.com.kasolution.dominio.UnidadeMedida;

public class TesteInterface {

	public static void main(String[] args) {
		Descartavel alimento01 = new Alimento("Coca Cola Zero 2L", UnidadeMedida.LT, 8.00, LocalDate.of(2022, 12, 05), false);
		Produto alimento02 = new Alimento("Coca Cola Zero 2L", UnidadeMedida.LT, 8.00, LocalDate.of(2022, 12, 05), false);
		Alimento alimento03 = new Alimento("Coca Cola Zero 2L", UnidadeMedida.LT, 8.00, LocalDate.of(2022, 12, 05), false);

		//alimento01.getValor(); //erro
		//alimento02.getValor();
		//alimento03.getValor();
	}

}
