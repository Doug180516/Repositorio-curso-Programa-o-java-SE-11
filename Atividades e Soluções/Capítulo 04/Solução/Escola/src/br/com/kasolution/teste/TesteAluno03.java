package br.com.kasolution.teste;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.kasolution.bd.BDAluno;
import br.com.kasolution.dominio.Aluno;

public class TesteAluno03 {
	
	public static void main(String[] args) {
		
		List<Aluno> alunos = BDAluno.getAlunos();
		
		Comparator<Aluno> ordemMedia = (a1, a2) -> a2.getMedia().compareTo(a1.getMedia());		
		Collections.sort(alunos, ordemMedia);		
		for (Aluno a : alunos) {
			System.out.printf("%s \n\n", a);
		}
	}

}
