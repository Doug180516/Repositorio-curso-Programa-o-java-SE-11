package br.com.kasolution.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class TesteMultCatch01 {
	public static void main(String[] args) {
		File arquivo = new File("c:/output/output.txt");
		try (PrintStream ps = new PrintStream(arquivo)) {
			System.setOut(ps);
			System.out.println("Isso será escrito no arquivo de Output!");
		} catch (FileNotFoundException | SecurityException e) {
			System.out.println("Verifique suas pemissões, o nome e o caminho do arquivo: " +
					e.getMessage());
		}
	}
}
