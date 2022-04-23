package br.com.kasolution.teste;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import br.com.kasolution.dominio.Funcionario;
import br.com.kasolution.dominio.ListaSPMG;

public class TesteBDFuncionario02 {

	public static void main(String[] args) {

		Path destino = Paths.get("c:/bdFuncionario");
		
		String arquivo = destino.resolve("funcionariosSPMG.dat").toString();

		ListaSPMG listaSPMG = null;
		try (FileInputStream fis = new FileInputStream(arquivo);
				ObjectInputStream in = new ObjectInputStream(fis)) {

			listaSPMG = (ListaSPMG) in.readObject();
			System.out.println("\n\nConteúdo arquivo: \n");

			listaSPMG.getFuncionariosSPMG().forEach(System.out::println);

		} catch (ClassNotFoundException | IOException ex) {
			System.out.println("Erro de leitura do arquivo!\n" + ex.getMessage());
		}
		
	}

}
