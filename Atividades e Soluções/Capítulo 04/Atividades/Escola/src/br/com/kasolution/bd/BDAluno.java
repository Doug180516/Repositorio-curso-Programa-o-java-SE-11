package br.com.kasolution.bd;

import java.util.ArrayList;
import java.util.List;

import br.com.kasolution.dominio.Aluno;

public class BDAluno {
	
	private static final List<Aluno> alunos = new ArrayList<>() {{
		add(new Aluno("Diego Enzo Moura", 7.8, 6.5, 7.0, 6.0));
		add(new Aluno("Danilo Francisco dos Santos", 7.0, 5.5, 5.0, 4.5));
		add(new Aluno("Julia Mirella Fernandes", 9.0, 9.0, 8.0, 9.5));
		add(new Aluno("Anderson Diego Melo", 7.0, 6.5, 7.0, 7.0));
		add(new Aluno("Ryan Francisco Melo", 8.0, 8.5, 8.0, 7.0));
		add(new Aluno("Olívia Manuela da Cunha", 5.0, 6.0, 5.0, 4.0));
		add(new Aluno("Andreia Rosângela Moreira", 6.0, 6.0, 5.0, 5.0));
		add(new Aluno("Renata Esther Rezende", 9.0, 10.0, 10.0, 9.8));
		add(new Aluno("Laís Alícia Ferreira", 6.8, 6.5, 6.0, 9.0));
		add(new Aluno("Geraldo Manoel Castro", 7.0, 6.0, 5.5, 8.0));
	}};

	public static List<Aluno> getAlunos() {
		return alunos;
	}
}
