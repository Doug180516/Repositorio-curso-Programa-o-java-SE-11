package br.com.kasolution.teste;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import br.com.kasolution.bd.BDAluno;
import br.com.kasolution.dominio.Aluno;

public class TesteAluno02 {
	
	public static void main(String[] args) {
		List<Aluno> alunos = BDAluno.getAlunos();
		
		Set<Aluno> aprovados = new TreeSet<>();
		Set<Aluno> reprovados = new TreeSet<>();
		
		for (Aluno a : alunos) {
			if (a.isAprovado()) {
				aprovados.add(a);
			} else {
				reprovados.add(a);
			}
		}
		
		System.out.println("Lista de aprovados: \n");
		for (Aluno a : aprovados) {
			System.out.printf("%s \n\n", a);
		}
		
		System.out.println("\n\nLista de reprovados: \n");
		for (Aluno a : reprovados) {
			System.out.printf("%s \n\n", a);
		}
	}

}
