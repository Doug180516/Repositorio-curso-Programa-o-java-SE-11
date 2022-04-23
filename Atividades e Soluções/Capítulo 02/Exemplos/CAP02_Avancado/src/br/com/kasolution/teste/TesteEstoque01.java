package br.com.kasolution.teste;

import br.com.kasolution.bd.BDProduto;
import br.com.kasolution.dominio.Estoque;

public class TesteEstoque01 {

	public static void main(String[] args) {

		Estoque estoque01 = Estoque.getInstance();

		Estoque estoque02 = Estoque.getInstance();
		
		estoque01.adiciona(BDProduto.getProdutos());

		System.out.println("Estoque 01: ");
		System.out.println(estoque01);
		System.out.println("\n\nEstoque 02: ");
		System.out.println(estoque02);
		
		if (estoque01 == estoque02) {
			System.out.println("\n\nMesmo objeto!");
		}
		
	}

}
