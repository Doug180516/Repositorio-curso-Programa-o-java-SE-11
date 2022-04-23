package br.com.kasolution.teste;

import static br.com.kasolution.ferramenta.Formatador.moeda;

import br.com.kasolution.bd.BDProduto;
import br.com.kasolution.dominio.Carrinho;

public class TesteCarrinho01 {

	public static void main(String[] args) {
		Carrinho carrinho = new Carrinho();
		carrinho.adiciona(BDProduto.getProdutos());
		carrinho.checkout(32, "Sônia Blanco");
		
		System.out.printf("Total Compra: %s \n", moeda(carrinho.getTotal()));
		System.out.printf("Caixa: %d  - Atendente: %s \n",
											carrinho.getCheckout().getCaixa(),
											carrinho.getCheckout().getAtendente());
		
		System.out.println("\n\nTentando novo checkout: ");
		carrinho.checkout(12, "Amanda Cristina");
	}

}
