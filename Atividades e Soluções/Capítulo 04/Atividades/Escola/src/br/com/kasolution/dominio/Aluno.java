package br.com.kasolution.dominio;

import java.util.Arrays;

public class Aluno implements Comparable<Aluno>{

	private static int ultimoCodigo;
	
	private final Integer codigo;
	private String nome;
	private final Double notas[] = new Double[4];

	public Aluno(String nome, Double...notas) {
		this.codigo = ultimoCodigo += 1000;
		this.nome = nome;
		if (notas.length != 4) {
			throw new RuntimeException("Quantide incorreta de notas. != 4");
		}
		int i = 0;
		for (Double n : notas) {
			this.notas[i++] =  n;
		}
	}
	
	@Override
	public int compareTo(Aluno a) {
		return this.nome.compareTo(a.nome);
	}
	
	public Double getMedia() {
		double soma = 0;
		for (Double n : notas) {
			soma += n;
		}
		return soma/notas.length;
	}
	
	public boolean isAprovado() {
		return getMedia() >= 7.0;
	}
	
	@Override
	public String toString() {
		StringBuilder info = new StringBuilder("Aluno: ").append(codigo)
				.append("\n\tNome: ").append(nome)
				.append("\n\tNotas: ");
		for (Double n : notas) {
			info.append(n).append(" ");
		}
		info.append("\n\tMédia: ").append(getMedia());
		
		return info.toString();
	}
	
	public Integer getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double[] getNotas() {
		return notas;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + Arrays.hashCode(notas);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (!Arrays.equals(notas, other.notas))
			return false;
		return true;
	}
	
	
	
}
