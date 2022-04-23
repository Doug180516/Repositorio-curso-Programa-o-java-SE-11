package br.com.kasolution.teste;

import java.nio.file.Path;
import java.nio.file.Paths;

public class TesteNIO03 {
	public static void main(String[] args) {
		Path p1 = Paths.get("C:/oracle/home/product/java/97875/curso.pdf");
		System.out.println(p1.subpath(0, 3));
	}
}
//Output: oracle\home\product
