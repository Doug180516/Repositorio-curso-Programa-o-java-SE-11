package br.com.kasolution.teste;

import java.util.Scanner;

public class TesteTryWithResources01 {
	public static void main(String[] args) {
		try (
				Scanner sc = new Scanner(System.in)
		) {
			System.out.print("O scanner será encerrado após a execução");
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
	}
}
