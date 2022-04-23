package br.com.kasolution.teste;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import br.com.kasolution.dominio.Funcionario;

public class TesteFuncionario03 {

	public static void main(String[] args) {

		List<Funcionario> funcionarios = Funcionario.getFuncionarios();
		
		System.out.println("Funcion�rios ordenados pelo sal�rio. Do maior para o menor: ");
		//funcionarios ordenados pelo sal�rio
		funcionarios.stream()
			.sorted((f1, f2) -> f2.getSalario().compareTo(f1.getSalario()))
			.forEach(f -> System.out.println(f));
		
		System.out.println("\n\nLocalizar apenas o funcion�rio com o maior sal�rio: ");
		//funcion�rio com o maior sal�rio
		Optional<Funcionario> f = funcionarios.stream()
			.max((f1, f2) -> f2.getSalario().compareTo(f1.getSalario()));
		System.out.println(f.get());
		
		
		System.out.println("\n\nFuncion�rios ordenados pelo estado e idade. Do mais jovem para o mais velho: ");
		//funcionarios ordenados pelo estado e idade
		Function<Funcionario, String> comparaEstado = funcionario -> funcionario.getEstado();
		Comparator<Funcionario> comparaIdade = (f1, f2) -> f1.getIdade().compareTo(f2.getIdade());
		funcionarios.stream()
		.sorted(Comparator.comparing(comparaEstado)
				.thenComparing(comparaIdade))
		.forEach(funcionario -> System.out.println(funcionario));
	}

}
