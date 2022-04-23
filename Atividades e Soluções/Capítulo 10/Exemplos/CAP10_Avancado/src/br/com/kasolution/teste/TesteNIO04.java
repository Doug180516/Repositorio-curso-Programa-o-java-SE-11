package br.com.kasolution.teste;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TesteNIO04 {
	public static void main(String[] args) {
		try {
			Path path = Paths.get("C:/temp/arquivo_original_hard.txt");
			Path link = Paths.get("C:/temp/arquivo_link_hard.txt");
			Files.createLink(link, path);
			System.out.println("Hard link criado!");
		} catch (IOException e) {
			System.out.println("Erro durante criação do hard link: " + e.getMessage());
		}
	}
}
