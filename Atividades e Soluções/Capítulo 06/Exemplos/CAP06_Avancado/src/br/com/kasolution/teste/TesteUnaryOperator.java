package br.com.kasolution.teste;

import java.util.List;
import java.util.function.UnaryOperator;

import br.com.kasolution.bd.BDProduto;
import br.com.kasolution.dominio.produto.Produto;

public class TesteUnaryOperator {
	public static void main(String[] args) {
		List<Produto> produtos = BDProduto.getProdutos();
		
		UnaryOperator<String> aoContrario = e -> { //Java -> length() - 1 = 3
			String contra = "";
			for (int i = e.length() -1; i >= 0; i--) {
				contra += e.charAt(i);
			}
			return contra; //avaJ
		};
		
		produtos.stream()
			.filter(p -> p.getClass().getSimpleName().equals("Agenda"))
			.forEach(p -> System.out.println(aoContrario.apply(p.getDescricao())));
	}
}
