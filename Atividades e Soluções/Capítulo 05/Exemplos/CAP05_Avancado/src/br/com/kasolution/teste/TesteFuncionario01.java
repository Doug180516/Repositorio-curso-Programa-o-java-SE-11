package br.com.kasolution.teste;

import br.com.kasolution.dominio.Funcionario;

public class TesteFuncionario01 {
	public static void main(String[] args) {
		//usando todos os campos
		Funcionario f1 = new Funcionario.Builder()
										.nome("Mateus Carlos da Rosa")
										.salario(7_600.00)
										.build();
		//fora da ordem
		Funcionario f2 = new Funcionario.Builder()
										.salario(5_400.00)
										.nome("Samuel Otávio")
										.build();
		//sem argumentos
		Funcionario f3 = new Funcionario.Builder().build();
		
	}
}
