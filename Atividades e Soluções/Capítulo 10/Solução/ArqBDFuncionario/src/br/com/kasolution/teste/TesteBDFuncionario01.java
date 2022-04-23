package br.com.kasolution.teste;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import br.com.kasolution.bd.BDFuncionario;
import br.com.kasolution.dominio.Funcionario;
import br.com.kasolution.dominio.ListaSPMG;

public class TesteBDFuncionario01 {

	public static void main(String[] args) {

		List<Funcionario> funcionarios = BDFuncionario.getFuncionarios();
		
		//Gerar uma lista apenas com os funcionários de SP/MG
		List<Funcionario> spmg = funcionarios.stream()
				.filter(f -> f.getEstado().equals("SP") || f.getEstado().equals("MG"))
				.collect(Collectors.toList());
		
		//instancia um objeto ListaSPMG passando a lista
		ListaSPMG listaSPMG = new ListaSPMG(spmg);
		
		//Criar a pasta de destino caso não exista
		Path destino = Paths.get("c:/bdFuncionario");
		if (Files.notExists(destino)) {
			try {
				Files.createDirectory(destino);
			} catch (IOException e) {
				new RuntimeException("Erro ao criar pasta: " + e.getMessage());
			}
		}
		
		String arquivo = destino.resolve("funcionariosSPMG.dat").toString();

		try (FileOutputStream fos = new FileOutputStream(arquivo);
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			oos.writeObject(listaSPMG);
			System.out.println("Aquivo gravado no disco!");
		} catch (IOException ex) {
			System.out.println("Erro ao gravar arquivo! " + "\n" + ex.getMessage());
		}

	}

}
