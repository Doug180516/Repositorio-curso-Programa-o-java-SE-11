package br.com.kasolution.teste;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.stream.Stream;

public class TesteNIO08 {

	public static void main(String[] args) {

		var path = Paths.get("c:/temp");

		Path pasta = path.resolve("pasta");
		if (Files.notExists(pasta)) {
			criaPasta(pasta);
			Path subPasta = pasta.resolve("subpasta");
			criaPasta(subPasta);
			for (int k = 1; k < 5; k++) {
				Path arquivo = subPasta.resolve("arquivo" + k);
				criaArquivo(arquivo);
			}
		}

		Path destino = Paths.get("c:/temp/copiaPasta");
		if (Files.notExists(destino)) {
			criaPasta(destino);
			copiaPasta(pasta, destino);
		}

	}

	static private void criaPasta(Path pasta) {
		try {
			Files.createDirectories(pasta);
		} catch (IOException e) {
			System.out.println("Erro ao criar pasta: " + e.getMessage());
		}
	}

	static private void criaArquivo(Path arquivo) {
		try {
			Files.createFile(arquivo);
		} catch (IOException e) {
			System.out.println("Erro ao criar arquivo: " + e.getMessage());
		}
	}
	
	static public  void copiaPasta(Path raiz, Path dest)  {
	    try (Stream<Path> stream = Files.walk(raiz)) {
	        stream.forEach(origem -> {
	        	Path destino = dest.resolve(raiz.relativize(origem));
	        	System.out.printf("Copiando de: %s para %s \n", origem, destino);
	        	copia(origem, destino);
	        });
	    } catch (IOException e) {
	    	System.out.println("Erro ao copiar pasta: " + e.getMessage());
	    }
	}
	
	static private void copia(Path origem, Path destino) {
		try {
			Files.copy(origem, destino, StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			System.out.println("Erro ao copiar: " + e.getMessage());
		}
	}
}