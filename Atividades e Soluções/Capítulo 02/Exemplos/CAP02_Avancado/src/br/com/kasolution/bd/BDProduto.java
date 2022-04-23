package br.com.kasolution.bd;

import java.time.LocalDate;
import java.util.ArrayList;

import br.com.kasolution.dominio.Alimento;
import br.com.kasolution.dominio.Bicicleta;
import br.com.kasolution.dominio.Celular;
import br.com.kasolution.dominio.Eletrica;
import br.com.kasolution.dominio.Operadora;
import br.com.kasolution.dominio.Produto;
import br.com.kasolution.dominio.UnidadeMedida;

public class BDProduto {
	
	private static final ArrayList<Produto> produtos = new ArrayList<>() {{
		add(new Celular("Samsung Galaxy M32 - Preto", 1_379.00, 2, Operadora.TIM));
		add(new Alimento("Coca Cola Zero 2L", UnidadeMedida.LT, 8.00, LocalDate.of(2022, 12, 05), false));
		add(new Bicicleta("Alumínio KRW16", 1_139.05, 29, 24));
		add(new Eletrica("Track TKE 29P MTB", 6_999.00, 29, 21, 350));
	}};


	public static ArrayList<Produto> getProdutos() {
		return produtos;
	}

}
