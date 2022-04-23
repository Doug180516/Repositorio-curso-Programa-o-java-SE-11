package br.com.kasolution.dominio;

import br.com.kasolution.exception.NomeCurtoException;
import br.com.kasolution.exception.SalarioNegativoException;
import br.com.kasolution.exception.SexoInvalidoException;

public class Funcionario {
	
	private static int ultimoCodigo = 0;
	
	private Integer codigo;
	private String nome;
	private char sexo;
	private Double salario;
	
	public Funcionario() {
		this.codigo = ++ultimoCodigo;
	}

	public Funcionario(String nome, char sexo, Double salario) throws NomeCurtoException,
				SexoInvalidoException, SalarioNegativoException {
		this.codigo = ++ultimoCodigo;
		setNome(nome);
		setSexo(sexo);
		setSalario(salario);
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) throws NomeCurtoException {
		if (nome.length() >= 3) {
			this.nome = nome;
		} else {
			throw new NomeCurtoException("O nome é muito curto!");
		}
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) throws SexoInvalidoException {
		switch (sexo) {
			case 'm': case 'M': case 'f': case 'F' :
				this.sexo = sexo;
				break;
			default:
				throw new SexoInvalidoException("Sexo inválido! Use M ou F.");
		}
	}

	public Integer getCodigo() {
		return codigo;
	}

	private void setSalario(Double salario) throws SalarioNegativoException {
		if (salario > 0) {
			this.salario = salario;
		} else {
			throw new SalarioNegativoException("O valor do salário deve ser positivo!");
		}
	}
	
	public Double getSalario() {
		return salario;
	}
	
	public void aumetaSalario(double salario) throws SalarioNegativoException {
		if (salario > 0) {
			this.salario += salario;
		} else {
			throw new SalarioNegativoException("O valor do salário deve ser positivo!");
		}
	}

	@Override
	public String toString() {
		String info = String.format("Funcionario {codigo: %d, nome: %s, sexo: %c, salario: %.2f}",
				codigo, nome, sexo, salario);
		return info;
	}


}
