package br.com.kasolution.teste;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.kasolution.bd.BDAluno;
import br.com.kasolution.dominio.Aluno;

public class TesteAluno01 {
	
	public static void main(String[] args) {

		List<Aluno> alunos = BDAluno.getAlunos();
		
		Map<Integer, Aluno> alunosPorCodigo = new HashMap<>();
		for (Aluno a : alunos) {
			alunosPorCodigo.put(a.getCodigo(), a);
		}
		
		System.out.println(alunosPorCodigo.get(5000));
	}

}
