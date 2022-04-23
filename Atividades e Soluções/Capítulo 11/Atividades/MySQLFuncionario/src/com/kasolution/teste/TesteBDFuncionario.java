/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kasolution.teste;

import com.kasolution.domain.ControleFuncionario;
import com.kasolution.util.Parametrizador;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.Scanner;

/**
 *
 * @author 130955800299
 */
public class TesteBDFuncionario {

	/**
	 * @param args the command line arguments
	 */

	public static void main(String[] args) throws IOException {
		// TODO code application logic here

		Scanner sc = new Scanner(System.in);
		char prompt = '\u0000';
		Parametrizador p = Parametrizador.getInstance();
		
		do {
			System.out.println("\n[=========== SISTEMA DE CONTROLE DE FUNCIONARIOS ===========]\n");
			System.out.printf("[C]%s - [A]%s - [E]%s - [B]%s - [S]%s\n", 
					p.getStrings().getString("menu1"),
					p.getStrings().getString("menu2"),
					p.getStrings().getString("menu3"),
					p.getStrings().getString("menu4"),
					p.getStrings().getString("menu5"));

			System.out.print("Escolha uma das op��es do menu: ");
			prompt = sc.next().charAt(0);

			switch (prompt) {
			case 'C':
			case 'c':
				ControleFuncionario.cadastrar();
				break;
			case 'A':
			case 'a':
				ControleFuncionario.atualizar();
				break;
			case 'E':
			case 'e':
				ControleFuncionario.excluir();
				break;
			case 'B':
			case 'b':
				ControleFuncionario.buscar();
				break;
			case 'S':
			case 's':
				System.out.println("\nAt� breve!\n\n");
				break;
			default:
				System.out.println("[-OP��O INV�LIDA!-]");
			}
		} while (prompt != 'S' && prompt != 's');
	}

}
