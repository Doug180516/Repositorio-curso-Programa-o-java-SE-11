package br.com.kasolution.teste;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import br.com.kasolution.bd.BDProduto;
import br.com.kasolution.dominio.produto.Produto;
import static br.com.kasolution.dominio.constante.UnidadeMedida.*;

public class TesteBusca02 {

	public static void main(String[] args) {

		List<Produto> produtos = new ArrayList<>();
		produtos = BDProduto.getProdutos();
		
		Optional<Produto> localizado = produtos.stream()
							.filter(p -> p.getDescricao().startsWith("Smartphone"))
							.findAny();
		
		boolean temUnidadeLitro = produtos.stream()
										.anyMatch(p -> p.getUnidade().equals(LT));
		
		if (localizado.isPresent()) {
			System.out.printf("Produto encontrado: %s\n\n", localizado.get().getDescricao());
		}
		System.out.printf("Tem produto vendido por litro? : %s \n",
														temUnidadeLitro ? "sim" : "não");
		
	}

}
