package br.com.kasolution.dominio;

import java.util.ArrayList;
import java.util.List;

public class Estoque {

	private static final Estoque instance = new Estoque(); //(2)
	private List<Produto> produtos;
	
	
	private Estoque() { //(1)
		produtos = new ArrayList<>();
	}
	
	public static Estoque getInstance() { //(3)
		return instance;
	}
	
	public void adiciona(Produto...produtos) {
		for (Produto p : produtos) {
			this.produtos.add(p);
		}
	}
	
	public void adiciona(List<Produto> prdutos) {
		this.produtos.addAll(prdutos);
	}
	
	@Override
	public String toString() {
		StringBuilder info = new StringBuilder("estoque { produtos: [\n");
		for (Produto p : produtos) {
			info.append("\n").append(p)
			.append(",\n");
		}
		info.append("]}");
		
		return info.toString();
	}
	
}
