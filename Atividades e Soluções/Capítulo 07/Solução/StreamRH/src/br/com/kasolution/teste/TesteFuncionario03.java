package br.com.kasolution.teste;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import br.com.kasolution.dominio.Funcionario;

public class TesteFuncionario03 {

	public static void main(String[] args) {

		List<Funcionario> funcionarios = Funcionario.getFuncionarios();
		
		System.out.println("Funcionários ordenados pelo salário. Do maior para o menor: ");
		//funcionarios ordenados pelo salário
		funcionarios.stream()
			.sorted((f1, f2) -> f2.getSalario().compareTo(f1.getSalario()))
			.forEach(f -> System.out.println(f));
		
		System.out.println("\n\nLocalizar apenas o funcionário com o maior salário: ");
		//funcionário com o maior salário
		Optional<Funcionario> f = funcionarios.stream()
			.max((f1, f2) -> f2.getSalario().compareTo(f1.getSalario()));
		System.out.println(f.get());
		
		
		System.out.println("\n\nFuncionários ordenados pelo estado e idade. Do mais jovem para o mais velho: ");
		//funcionarios ordenados pelo estado e idade
		Function<Funcionario, String> comparaEstado = funcionario -> funcionario.getEstado();
		Comparator<Funcionario> comparaIdade = (f1, f2) -> f1.getIdade().compareTo(f2.getIdade());
		funcionarios.stream()
		.sorted(Comparator.comparing(comparaEstado)
				.thenComparing(comparaIdade))
		.forEach(funcionario -> System.out.println(funcionario));
	}

}
