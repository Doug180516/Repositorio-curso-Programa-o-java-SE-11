package br.com.kasolution.teste;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import br.com.kasolution.dominio.Funcionario;

public class TesteFuncionario04 {
	
	public static void main(String[] args) {

		List<Funcionario> funcionarios = Funcionario.getFuncionarios();
		
		System.out.println("Funcionarios listados por estado:");
		/*
		  imprimir uma lista agrupada por estado. Acrescentar a quandidade de funcionários
		  na impressão de cada lista
		  
		  Ex.: 
		  Estado: SP
		  	Paulo Roberto Silva
		  	Karina Oliveira Vieira
		  	Pamela Cristina Souza
		  Total: 3
		  
		  Estado: MG
		     .....
		  Total: 

		*/
		Map<String, List<Funcionario>> funcionariosPorEstado = funcionarios.stream()
				.collect(Collectors.groupingBy(f -> f.getEstado()));
		
		funcionariosPorEstado.forEach((estado, lista) -> {
			System.out.printf("\nEstado: %s", estado);
			lista.forEach(f -> System.out.printf("\n\t%s", f));
			System.out.printf("\nTotal: %d\n", lista.stream().count() );
		});

	}

}
