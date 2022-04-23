package br.com.kasolution.teste;

import br.com.kasolution.dominio.SistemaException;

public class TesteSistemaException01 {
	public static void main(String[] args) throws SistemaException {
		throw new SistemaException("Não foi possivel gravar dado no BD.");
	}
}
