package br.com.kasolution.teste;

import java.util.List;
import java.util.Optional;

import br.com.kasolution.dominio.Funcionario;

public class TesteFuncionario02 {

	public static void main(String[] args) {

		List<Funcionario> funcionarios = Funcionario.getFuncionarios();

		System.out.println("Funcionario do RJ: ");
		//busca qualquer funcionario do estado RJ, dar mensagem se n�o for encontrado
		Optional<Funcionario> f = funcionarios.stream()
			.filter(p -> p.getEstado().equals("RJ"))
			.findAny();
		if (f.isPresent()) {
			System.out.println(f.get());
		} else {
			System.out.println("N�O ENCONTRADO!");
		}
		
		System.out.println("\n\nTodos funcion�rio s�o do RJ?");
		//verifica se todos os funcion�rios s�o do RJ
		boolean todosRJ = funcionarios.stream()
				.allMatch(p -> p.getEstado().equals("RJ"));
		if (todosRJ) {
			System.out.println("SIM");
		} else {
			System.out.println("N�O");
		}
		
	}

}
