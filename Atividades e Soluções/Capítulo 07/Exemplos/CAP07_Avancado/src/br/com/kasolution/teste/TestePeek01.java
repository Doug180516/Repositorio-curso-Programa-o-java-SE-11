package br.com.kasolution.teste;

import java.util.ArrayList;
import java.util.List;

import br.com.kasolution.bd.BDProduto;
import br.com.kasolution.dominio.produto.Bicicleta;
import br.com.kasolution.dominio.produto.Produto;

public class TestePeek01 {
	
	public static void main(String[] args) {
		List<? extends Produto> produtos = new ArrayList<>();
		produtos = BDProduto.getProdutos();
		
		produtos.stream()
			.peek(p -> System.out.printf("Submetido ao filtro: %s \n", p.getDescricao()))
			.filter(p -> p instanceof Bicicleta)
			.forEach(p -> System.out.printf("Passou pelo filtro: %s \n", p.getDescricao()));
	}

}
