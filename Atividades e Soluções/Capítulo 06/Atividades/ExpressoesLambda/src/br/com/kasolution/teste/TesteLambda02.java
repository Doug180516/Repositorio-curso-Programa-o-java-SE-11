package br.com.kasolution.teste;

import java.util.List;
import java.util.function.Function;

import br.com.kasolution.bd.BDFuncionario;
import br.com.kasolution.dominio.Funcionario;

public class TesteLambda02 {

	
//	public static String getNome(Funcionario f) {
//		return f.getNome().toUpperCase();
//	}
	
	public static void main(String[] args) {
		List<Funcionario> funcionarios = BDFuncionario.getFuncionarios();

		Function<Funcionario, String> obterNome = f -> f.getNome().toUpperCase();
		
		funcionarios.stream()
			.filter(f -> f.getSexo() == 'F')
			.forEach(f -> System.out.println(obterNome.apply(f)));
		
		Funcionario funcionario3 = funcionarios.get(15);
		System.out.println("Funcionario 15: " + obterNome.apply(funcionario3));
		
//		for (Funcionario f : funcionarios) {  //Java 1.7
//			if (f.getSexo() == 'F') {
//				System.out.println(getNome(f));
//			}
//		}
	}
}
