package br.com.kasolution.teste;

import java.util.List;
import java.util.function.Function;

import br.com.kasolution.bd.BDProduto;
import br.com.kasolution.dominio.produto.Produto;

public class TesteFunction01 {	
	public static void main(String[] args) {
		List<Produto> produtos = BDProduto.getProdutos();
		Function<Produto, String> obterPreco = p ->
			String.format("Produto: %s - Valor: R$%.2f", p.getDescricao(), p.getValor());		

		String preco = obterPreco.apply(produtos.get(10));
		System.out.println(preco);
		
		Function<Produto, String> obterTipo = p -> String.format("Tipo: %s", p.getTipo());
		Produto produto5 = produtos.get(5);
		System.out.println(obterTipo.apply(produto5));
	}
}
