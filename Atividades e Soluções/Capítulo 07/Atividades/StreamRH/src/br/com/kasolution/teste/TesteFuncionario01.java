package br.com.kasolution.teste;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

import br.com.kasolution.dominio.Funcionario;

public class TesteFuncionario01 {

	public static void main(String[] args) {

		List<Funcionario> funcionarios = Funcionario.getFuncionarios();
		
		System.out.println("Lista de mulheres da empresa: ");
		//Lista de mulheres ordenadada pelo salário decrescente
		funcionarios.stream()
			.filter(f -> f.getSexo() == 'F')
			.sorted((f1, f2) -> f2.getSalario().compareTo(f1.getSalario()))
			.forEach(f -> System.out.println(f));
		
		System.out.println("\n\nNomes das mulheres separados por ';' :");
		//Apenas nomes das mulheres separado por ponto e vírgula
		String nomes = funcionarios.stream()
				.filter(f -> f.getSexo() == 'F')
				.map(f -> f.getNome())
				.collect(Collectors.joining(";"));
		System.out.println(nomes);
		
		
		System.out.println("\n\nSoma dos salários das mulheres: ");
		//Soma do salário das mulheres
		double somaSalarioF = funcionarios.stream()
		.filter(f -> f.getSexo() == 'F')
		.mapToDouble(f -> f.getSalario())
		.sum();
		System.out.println(somaSalarioF);
		
		System.out.println("\n\nMédia salarial das mulheres: ");
		//Média do salário das mulheres
		OptionalDouble mediaSalarioF = funcionarios.stream()
			.filter(f -> f.getSexo() == 'F')
			.mapToDouble(f -> f.getSalario())
			.average();
		System.out.print(NumberFormat.getCurrencyInstance(new Locale("pt", "BR"))
				.format(mediaSalarioF.getAsDouble()));		
	}

}
