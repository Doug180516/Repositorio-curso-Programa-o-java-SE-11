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
		
		Map<String, List<Funcionario>> funcionarioPorEstado = funcionarios.stream()
											.collect(Collectors.groupingBy(f -> f.getEstado()));
		funcionarioPorEstado.forEach((e, l) -> {
			System.out.printf("\nEstado: %s", e);
			l.stream()
				.forEach(f -> System.out.printf("\n\t%s", f));
			long cont = l.stream().count();
			System.out.printf("\nTotal: %d", cont);
		});
	}

}
