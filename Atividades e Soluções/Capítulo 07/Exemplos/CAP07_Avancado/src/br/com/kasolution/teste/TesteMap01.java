package br.com.kasolution.teste;

import java.util.ArrayList;
import java.util.List;

import br.com.kasolution.bd.BDProduto;
import br.com.kasolution.dominio.produto.Produto;

public class TesteMap01 {

	public static void main(String[] args) {
		List<? extends Produto> produtos = new ArrayList<Produto>();
		produtos = BDProduto.getProdutos();
		produtos.stream()
			.map(TesteMap01::descricaoValor) //entra Produto sai String
			.forEach(System.out::println);
		
	}
	
	private static String descricaoValor(Produto p) {
		return String.format("Nome: %s - Valor: R$ %.2f", p.getDescricao(), p.getValor());
	}
	
}
