package br.com.kasolution.teste;

import java.util.Scanner;

public class TesteTryWithResources01 {
	public static void main(String[] args) {
		try (
				Scanner sc = new Scanner(System.in)
		) {
			System.out.print("O scanner ser� encerrado ap�s a execu��o");
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
	}
}
