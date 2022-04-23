package br.com.kasolution.teste;

import java.util.List;
import java.util.Optional;

import br.com.kasolution.dominio.Funcionario;

public class TesteParallelStream {
	public static void main(String[] args) {
		List<Funcionario> funcionarios = Funcionario.getFuncionarios();

		Optional<Funcionario> localizado = funcionarios.parallelStream()
				.filter(f -> f.getNome().startsWith("A"))
				.findAny();

		if (localizado.isPresent()) {
			System.out.println(localizado.get());
		}
	}
}
