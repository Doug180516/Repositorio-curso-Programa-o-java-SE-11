package br.com.kasolution.dominio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class ArquivoOutput {
	static public void grava(String nomeArquivo, String textoMensagem) throws RuntimeException {
		File arquivo = new File(nomeArquivo);
		try (PrintStream ps = new PrintStream(arquivo)) {
			System.setOut(ps);
			System.out.println(textoMensagem);
		} catch (FileNotFoundException | SecurityException e) {
			throw new RuntimeException("Verifique suas pemissões, o nome e o caminho do arquivo: " +
					e.getMessage());
		}
	}
}
