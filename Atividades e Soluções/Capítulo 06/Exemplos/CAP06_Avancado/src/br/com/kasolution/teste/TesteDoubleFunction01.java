package br.com.kasolution.teste;

import static java.text.NumberFormat.getCurrencyInstance;

import java.util.List;
import java.util.function.DoubleFunction;

import br.com.kasolution.bd.BDProduto;
import br.com.kasolution.dominio.produto.Celular;
import br.com.kasolution.dominio.produto.Produto;

public class TesteDoubleFunction01 {	
	public static void main(String[] args) {
		List<Produto> produtos = BDProduto.getProdutos();
		
		DoubleFunction<String> toMoeda = e -> getCurrencyInstance().format(e);		
		produtos.stream()
			.filter(p -> p instanceof Celular)
			.forEach(p -> System.out.printf("%s \n", toMoeda.apply(p.getValor())));
	}
}
