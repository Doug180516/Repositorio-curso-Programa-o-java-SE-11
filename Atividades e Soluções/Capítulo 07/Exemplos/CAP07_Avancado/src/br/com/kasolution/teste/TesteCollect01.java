package br.com.kasolution.teste;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.com.kasolution.bd.BDProduto;
import br.com.kasolution.dominio.produto.Bicicleta;
import br.com.kasolution.dominio.produto.Produto;
import static br.com.kasolution.ferramenta.Formatador.*;

public class TesteCollect01 {
	public static void main(String[] args) {
		List<Produto> produtos = new ArrayList<>();
		produtos = BDProduto.getProdutos();
		
		double mediaValorBike = produtos.stream()
								.filter(p -> p instanceof Bicicleta)
								.collect(Collectors.averagingDouble(p -> p.getValor()));
		
		System.out.printf("Média valor bicicleta: %s \n", moeda(mediaValorBike));
	}
}
