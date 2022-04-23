package br.com.kasolution.dominio;

import java.util.ArrayList;

public class Banco {
	
	private static final Banco instance = new Banco(); //(2)
	
	private ArrayList<Cliente> clientes = new ArrayList<>();

	private Banco() { //(1)
	}
	
	public static Banco getInstance() { //(3)
		return instance; //retorna o endereço
	}
	
	public void adiciona(Cliente...clientes) {
		for (Cliente c : clientes) {
			this.clientes.add(c);
		}
	}
	
	@Override
	public String toString() {
		StringBuilder info = new StringBuilder("banco {[");
		for (Cliente c : clientes ) {
			info.append(c);
		}
		info.append("\n]}");
		return info.toString();
	}
}




