package br.com.kasolution.teste;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

import br.com.kasolution.bd.BDProduto;
import br.com.kasolution.dominio.produto.Bicicleta;
import br.com.kasolution.dominio.produto.Produto;
import static br.com.kasolution.ferramenta.Formatador.*;

public class TesteCalculos01 {
	public static void main(String[] args) {
		List<Produto> produtos = new ArrayList<>();
		produtos = BDProduto.getProdutos();

		OptionalDouble mediaValorBike = produtos.stream()
							.filter(p -> p instanceof Bicicleta)
							.mapToDouble(p -> p.getValor())
							.average();
		
		double somaValorBike = produtos.stream()
							.filter(p -> p instanceof Bicicleta)
							.mapToDouble(p -> p.getValor())
							.sum();
		
		System.out.printf("Bicicletas:\n\tMédia valores: %s\n\tSoma valores: %s",
							moeda(mediaValorBike.getAsDouble()),
							moeda(somaValorBike));		
	}
}
