package br.com.kasolution.dominio;

import java.util.ArrayList;

import br.com.kasolution.dominio.conta.Conta;

public class Cliente {

    private static int ultimoCodigo = 0;
    
    private int codigo; //auto incremental
    private String nome;
    private Long cpf;
    private ArrayList<Conta> contas; //CTRL+SHIT+I
    
    public Cliente(String nome, Long cpf) {
    	this.codigo = ++ultimoCodigo;
    	this.cpf = cpf;
    	this.contas = new ArrayList<>();
    	setNome(nome);
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (!nome.isBlank()) {
			this.nome = nome;
		} else {
			this.nome = "-- nome não informado --";
		}
	}

	public int getCodigo() {
		return codigo;
	}

	public Long getCpf() {
		return cpf;
	}
	
	public void adiciona(Conta...contas) {
		for (Conta c : contas) {
			this.contas.add(c);
		}
	}

	public ArrayList<Conta> getContas() {
		return contas;
	}

	@Override
	public String toString() {
		StringBuilder info = new StringBuilder("cliente {")
				.append("\n\tcodigo: ").append(codigo)
				.append("\n\tnome: ").append(nome)
				.append("\n\tcpf: ").append(cpf)
				.append("\n\tcontas: [ ");
		for (Conta c : contas) {
			info.append(c.toString().replace("\t", "\t\t"))
			.append(",\n\n\t\t");
		}
		info.append("]");
		return info.toString();
	}
	
}
