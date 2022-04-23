package br.com.kasolution.teste;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TesteNIO07 {
	public static void main(String[] args) {
		Path dir = Paths.get("C:/temp/relatorios");
		Path arquivo = dir.resolve("arquivo.txt");
		if (Files.exists(dir)) {
			try {
				Files.deleteIfExists(arquivo);
				Files.deleteIfExists(dir);
				System.out.println("Pasta e arquivos apagados com sucesso!");
			} catch (IOException e) {
				System.out.println("Erro ao apagar pasta/arquivo: " + e.getMessage());
			}
		} else {
			System.out.println("A pasta não existe.");
		}
	}
}
