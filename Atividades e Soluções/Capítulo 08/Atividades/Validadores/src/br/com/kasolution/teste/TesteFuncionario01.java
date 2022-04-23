package br.com.kasolution.teste;

import br.com.kasolution.dominio.Funcionario;
import br.com.kasolution.exception.NomeCurtoException;
import br.com.kasolution.exception.SalarioNegativoException;
import br.com.kasolution.exception.SexoInvalidoException;

public class TesteFuncionario01 {

	public static void main(String[] args) {

		try {
			Funcionario funcionario = new Funcionario("Roberto Costa de Oliveira", 'M', 5_000.00);
			funcionario.setSexo('F');
			funcionario.setNome("Roberta Close de Oliveira");
			funcionario.aumetaSalario(1_000.00);
			
			System.out.println(funcionario);
		
		} catch (NomeCurtoException | SexoInvalidoException | SalarioNegativoException e) {
			System.out.println("Erro de validação: " + e.getMessage());
		}
		
	}

}
