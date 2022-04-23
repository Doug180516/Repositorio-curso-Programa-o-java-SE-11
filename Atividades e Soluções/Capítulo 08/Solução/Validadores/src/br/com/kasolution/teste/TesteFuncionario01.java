package br.com.kasolution.teste;

import br.com.kasolution.dominio.Funcionario;
import br.com.kasolution.exception.NomeCurtoException;
import br.com.kasolution.exception.SalarioNegativoException;
import br.com.kasolution.exception.SexoInvalidoException;

public class TesteFuncionario01 {

	public static void main(String[] args) {

		Funcionario funcionario = null;
		
		try {
			funcionario = new Funcionario("Roberto Costa de Oliveira", 'M', 5_000.00);
			funcionario.setSexo('M');
			funcionario.setNome("Ronaldo Costa de Oliveira");
			funcionario.aumetaSalario(1_000.00);
		} catch (SalarioNegativoException | SexoInvalidoException | NomeCurtoException e) {
			System.out.println("Impossivel alterar os dados do funcionario: " + e.getMessage());			
		}

		System.out.println("\n\n" + funcionario);
		
	}

}
