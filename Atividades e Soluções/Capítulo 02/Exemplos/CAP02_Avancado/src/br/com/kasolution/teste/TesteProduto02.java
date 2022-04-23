package br.com.kasolution.teste;

import java.time.LocalDate;

import br.com.kasolution.dominio.Alimento;
import br.com.kasolution.dominio.Celular;
import br.com.kasolution.dominio.Operadora;
import br.com.kasolution.dominio.Produto;
import br.com.kasolution.dominio.UnidadeMedida;

public class TesteProduto02 {

	public static void main(String[] args) {
		Produto celular01 = new Celular("Motorola M16", 1_600.00, 2, Operadora.TIM);
		Produto celular02 = new Celular("Motorola M16", 1_600.00, 2, Operadora.TIM);
		Produto alimento01 = new Alimento("Arroz", UnidadeMedida.KG, 25.00, LocalDate.of(2023, 10, 1), true);
		
		System.out.printf("Produto1: %s \n\nProduto2: %s\n", celular01, celular02);
		
		if (celular01.equals(celular02)) {
			System.out.println("\nIguais");
		} else {
			System.out.println("\nDiferentes");
		}
		/*
		 Output:
			Celular1: br.com.kasolution.dominio.Celular@7ac7a4e4 
			Celular2: br.com.kasolution.dominio.Celular@6d78f375
			
			Diferentes
		 */

	}

}
