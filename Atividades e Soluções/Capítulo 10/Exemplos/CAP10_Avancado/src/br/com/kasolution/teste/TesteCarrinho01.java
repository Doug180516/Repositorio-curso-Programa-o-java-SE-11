package br.com.kasolution.teste;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import br.com.kasolution.bd.BDProduto;
import br.com.kasolution.dominio.Carrinho;

public class TesteCarrinho01 {
	public static void main(String[] args) {
		Carrinho carrinho = new Carrinho();
		carrinho.adiciona(BDProduto.getProdutos());
		carrinho.checkout(32, "Sônia Blanco");

		String arquivoCarrinho = "c:/temp/compra_" + carrinho.getCodigo() + ".dat";

		try (FileOutputStream fos = new FileOutputStream(arquivoCarrinho);
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			oos.writeObject(carrinho);
			System.out.println("Aquivo gravado no disco!");
		} catch (IOException ex) {
			System.out.println("Erro ao gravar arquivo! " + "\n" + ex.getMessage());
		}
	}
}
