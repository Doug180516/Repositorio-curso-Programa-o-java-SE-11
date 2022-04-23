package br.com.kasolution.teste;

import java.util.List;
import java.util.Optional;

import br.com.kasolution.dominio.Funcionario;

public class TesteFuncionario02 {

	public static void main(String[] args) {

		List<Funcionario> funcionarios = Funcionario.getFuncionarios();

		System.out.println("Funcionario do RJ: ");
		//busca qualquer funcionario do estado RJ, dar mensagem se não for encontrado
		Optional<Funcionario> localizado = funcionarios.stream()
										.filter(f -> f.getEstado().equals("RJ"))
										.findAny();
		if (localizado.isPresent()) {
			System.out.printf("Localizado: %s \n", localizado.get());
		} else {
			System.out.println("Não localizado!");
		}
		
		System.out.println("\n\nTodos funcionário são do RJ?");
		//verifica se todos os funcionários são do RJ
		boolean todosRJ = funcionarios.stream()
						.allMatch(f -> f.getEstado().equals("RJ"));
		System.out.println(todosRJ ? "SIM" : "NÃO");
	}

}
