package br.com.kasolution.teste;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import br.com.kasolution.bd.BDProduto;
import br.com.kasolution.dominio.produto.Celular;
import br.com.kasolution.dominio.produto.Produto;

public class TesteBusca01 {

	public static void main(String[] args) {
		List<Produto> produtos = new ArrayList<>();
		produtos = BDProduto.getProdutos();
		
		Optional<Produto> localizado = produtos.stream()
							.filter(p -> p.getValor() > 2_000.00)
							.findFirst();
		
		boolean saoTodosCelulares = produtos.stream()
										//.filter(p -> p instanceof Celular)
										.allMatch(p -> p instanceof Celular);
		
		boolean nenhumEhCelular = produtos.stream()
										//.filter(p -> !(p instanceof Celular))
										.noneMatch(p -> p instanceof Celular);
		
		if (localizado.isPresent()) {
			System.out.printf("Produto encontrado: %s\n\n", localizado.get().getDescricao());
		} else {
			System.out.println("Produto n�o localizado!");
		}

		System.out.printf("Todos s�o celulares: %s \n", saoTodosCelulares ? "sim" : "n�o");
		System.out.printf("Nenhum � celulares: %s \n", nenhumEhCelular ? "sim" : "n�o");
		
	}
}
