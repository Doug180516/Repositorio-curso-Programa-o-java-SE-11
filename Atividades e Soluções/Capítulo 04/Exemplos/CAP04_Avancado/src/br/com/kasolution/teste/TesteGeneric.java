/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.kasolution.teste;

import br.com.kasolution.dominio.array.ArrayGeneric;

public class TesteGeneric {

	public static void main(String[] args) {
		ArrayGeneric<Double> aG = new ArrayGeneric<>(3);
		aG.add(1.0);
		aG.add(2.0);
		aG.add(3.0);
		System.out.println(aG); 
		System.out.println("Removendo: " + aG.remove());
		System.out.println(aG);
	}

}
