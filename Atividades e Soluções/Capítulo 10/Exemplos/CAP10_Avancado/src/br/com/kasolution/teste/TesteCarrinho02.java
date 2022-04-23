package br.com.kasolution.teste;

import static br.com.kasolution.ferramenta.Formatador.moeda;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

import br.com.kasolution.dominio.Carrinho;

public class TesteCarrinho02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe o código do carrinho: ");
		int codigo = sc.nextInt();

		String arquivoCarrinho = "c:/temp/compra_" + codigo + ".dat";

		Carrinho carrinho = null;
		try (FileInputStream fis = new FileInputStream(arquivoCarrinho);
				ObjectInputStream in = new ObjectInputStream(fis)) {

			carrinho = (Carrinho) in.readObject();
			System.out.println("\n\nConteúdo arquivo: \n");

			System.out.printf("Total Compra: %s \n", moeda(carrinho.getTotal()));
			System.out.printf("Caixa: %d  - Atendente: %s \n", carrinho.getCheckout().getCaixa(),
					carrinho.getCheckout().getAtendente());
			System.out.println("Lista de produtos: ");
			carrinho.getProdutos().forEach(p -> System.out.printf("\t%s: %s - %s \n",
							p.getTipo(), p.getDescricao(), moeda(p.getValor())));

		} catch (ClassNotFoundException | IOException ex) {
			System.out.println("Erro de leitura do arquivo!\n" + ex.getMessage());
		}
	}
}
