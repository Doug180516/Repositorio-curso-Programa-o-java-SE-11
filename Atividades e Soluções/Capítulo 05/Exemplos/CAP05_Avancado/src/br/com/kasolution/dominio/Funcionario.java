package br.com.kasolution.dominio;

public class Funcionario {
	
	private static int ultimoCodigo;	
	private final Integer codigo;
	private final String nome;
	private final Double salario;
	
	public static class Builder {
		private String nome;
		private Double salario;
		
		public Funcionario.Builder nome(String nome) {
			this.nome = nome;
			return Builder.this;
		}
		
		public Funcionario.Builder salario(Double salario) {
			this.salario = salario;
			return Builder.this;
		}
		
		public Funcionario build() {
			return new Funcionario(Builder.this);
		}
	}
	
	private Funcionario(Funcionario.Builder builder) {
		this.codigo = ++ultimoCodigo;
		this.nome = builder.nome;
		this.salario = builder.salario;
	}

	public Integer getCodigo() { return codigo; }

	public String getNome() { return nome; }

	public Double getSalario() { return salario; }

}