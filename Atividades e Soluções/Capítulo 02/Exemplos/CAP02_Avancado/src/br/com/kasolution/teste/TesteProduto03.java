package br.com.kasolution.teste;

import java.util.List;

import br.com.kasolution.bd.BDProduto;
import br.com.kasolution.dominio.Produto;

public class TesteProduto03 {

	public static void main(String[] args) {

		List<Produto> produtos = BDProduto.getProdutos();
		
		for (Produto p : produtos) {
			System.out.printf("%s \n\n", p);
		}
		
	}

}
