package br.com.kasolution.teste;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TesteNIO06 {
	public static void main(String[] args) {
		Path dir = Paths.get("C:/temp/relatorios");
		Path arquivo = dir.resolve("arquivo.txt");
		if (Files.notExists(dir)) {
			try {
				Files.createDirectories(dir);
				if (Files.notExists(arquivo)) {
					Files.createFile(arquivo);
				}
				System.out.println("Pasta criada com sucesso!");
			} catch (IOException e) {
				System.out.println("Erro ao criar pasta: " + e.getMessage());
			}
		} else {
			System.out.println("A pasta já existe.");
		}
	}
}
