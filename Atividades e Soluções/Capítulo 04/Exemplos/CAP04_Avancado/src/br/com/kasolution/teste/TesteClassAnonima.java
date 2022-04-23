package br.com.kasolution.teste;

import br.com.kasolution.dominio.Produto;

public class TesteClassAnonima {
	
	public static void main(String[] args) {
		Produto celular = new Produto(1, "Motorola", 1000.00) {
			Integer chips;

			public Integer getChips() {
				return chips;
			}
			
			@Override
			public String toString() {
				// TODO Auto-generated method stub
				return super.toString();
			}
		};
	}

}
