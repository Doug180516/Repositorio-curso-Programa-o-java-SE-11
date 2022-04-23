package br.com.kasolution.teste;

import java.util.List;

import br.com.kasolution.bd.BDFuncionario;
import br.com.kasolution.dominio.Funcionario;

public class TesteLambda01 {

	public static void mostraNomeSalario(Funcionario f) {
		System.out.printf("Nome: %s - Salario: R$%.2f \n", f.getNome(), f.getSalario());
	}
	
	public static void main(String[] args) {
		List<Funcionario> funcionarios = BDFuncionario.getFuncionarios();

		funcionarios.stream()
			.filter(f -> f.getEstado().equals("SP"))
			.forEach(f -> mostraNomeSalario(f));
	}
}
