package br.com.kasolution.teste;

import br.com.kasolution.dominio.BananaUtils;
import br.com.kasolution.dominio.BananinhaException;

public class TesteBananaUtils01 {
	
	public static void main(String[] args) {
		try {
			BananaUtils.comaBanana();
		} catch (BananinhaException e) {
			e.printStackTrace();
		}
	}

}
