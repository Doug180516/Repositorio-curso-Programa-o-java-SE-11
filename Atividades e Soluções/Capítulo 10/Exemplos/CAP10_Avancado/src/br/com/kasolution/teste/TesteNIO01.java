package br.com.kasolution.teste;

import java.nio.file.Path;
import java.nio.file.Paths;

public class TesteNIO01 {
	public static void main(String[] args) {
		Path p = Paths.get("C:/oracle/home/product/java/97875/curso.pdf");
		System.out.println("getFileName(): " + p.getFileName());
		System.out.println("getParent(): " + p.getParent());
		System.out.println("getNameCount(): " + p.getNameCount());
		System.out.println("isAbsolute(): " + p.isAbsolute());
		System.out.println("toAbsolutePath(): " + p.toAbsolutePath());
		System.out.println("toURI(): " + p.toUri());
	}
}
/*
Output:
getFileName(): curso.pdf
getParent(): C:\oracle\home\product\java\97875
getNameCount(): 6
isAbsolute(): true
toAbsolutePath(): C:\oracle\home\product\java\97875\curso.pdf
toURI(): file:///C:/oracle/home/product/java/97875/curso.pdf
*/
