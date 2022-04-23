package br.com.kasolution.teste;

import br.com.kasolution.dominio.Funcionario;

public class TesteFuncionario02 {
	
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario(/* sem argumentos */);
		Funcionario f2 = new Funcionario(1, "Fernando", "TI", 23_000.00, true );
		
		System.out.println(f1.getCodigo());
		System.out.println(f2.getCodigo());
		
		System.out.println(f1.getNome());
		System.out.println(f2.getNome());
		
		System.out.println(f1.getSalario());
		System.out.println(f2.getSalario());
	
	}
	
}
