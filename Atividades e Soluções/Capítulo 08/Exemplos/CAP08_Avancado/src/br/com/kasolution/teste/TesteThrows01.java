package br.com.kasolution.teste;

import br.com.kasolution.dominio.ArquivoOutput;

public class TesteThrows01 {
	public static void main(String[] args) {
		ArquivoOutput.grava("c:/output/mensagem.txt", "Olá mundo!");
	}
}
