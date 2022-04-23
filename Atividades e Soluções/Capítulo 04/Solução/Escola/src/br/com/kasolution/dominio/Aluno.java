package br.com.kasolution.dominio;

public class Aluno implements Comparable<Aluno> {

	@Override
	public int compareTo(Aluno aluno) {
		return this.getNome().compareTo(aluno.getNome());
	}
	
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
	
}
