package br.com.kasolution.dominio;

public class Funcionario {
	
	//atributos
	private int codigo;
	private String nome;
	private String setor;
	private double salario;
	private boolean ativo;
	
	//construtor padrão
	public Funcionario() {
		
	}
	
	public Funcionario(int codigo, String nome, String setor, double salario, boolean ativo) {
		this.codigo = codigo;
		this.nome = nome;
		this.setor = setor;
		this.salario = salario;
		this.ativo = ativo;
	}

	//getters e setters
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public int getCodigo() {
		return this.codigo;
	}

	//... demais métodos

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	public void aumentaSalario(double valor) {
		if (valor > 0) {
			salario += valor;
		}
	}
	
	public void aplicaDesconto(double porcentagem) {
		salario -= salario * porcentagem;
	}
	
	@Override
	public boolean equals(Object object) {
		if (object != null && object instanceof Funcionario) {
			Funcionario f = (Funcionario) object;
			if (this.codigo == f.codigo &&
					this.nome == f.nome) {
				return true;
			}
		}
		return false;
	}

}
