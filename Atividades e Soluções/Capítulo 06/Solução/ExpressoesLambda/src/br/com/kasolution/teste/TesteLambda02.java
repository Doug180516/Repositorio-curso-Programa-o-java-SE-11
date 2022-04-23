package br.com.kasolution.teste;

import java.util.List;
import java.util.function.Function;

import br.com.kasolution.bd.BDFuncionario;
import br.com.kasolution.dominio.Funcionario;

public class TesteLambda02 {

	
	public static String getNome(Funcionario f) {
		return f.getNome().toUpperCase();
	}
	
	public static void main(String[] args) {
		List<Funcionario> funcionarios = BDFuncionario.getFuncionarios();
		
		Function<Funcionario, String> nomeFuncionario = f -> getNome(f);
		
		funcionarios.stream()
			.filter(f -> f.getSexo() == 'F')
			.forEach(f -> System.out.println(nomeFuncionario.apply(f)));
	}
}
