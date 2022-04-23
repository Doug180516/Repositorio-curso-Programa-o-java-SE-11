package br.com.kasolution.teste;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TesteNIO05 {
	public static void main(String[] args) {
		try {
			Path path = Paths.get("C:/temp/arquivo_original.txt");
			Path link = Paths.get("C:/temp/arquivo_link.lnk");
			Files.createSymbolicLink(link, path);
			System.out.println("Soft link criado!");
		} catch (IOException e) {
			System.out.println("Erro durante criação do soft link: " + e.getMessage());
		}
	}
}
