package br.com.kasolution.teste;

import java.nio.file.Path;
import java.nio.file.Paths;

public class TesteNIO02 {
	public static void main(String[] args) {
		Path p1 = Paths.get("C:/oracle/home/product/java/97875/curso.pdf");
		Path p2 = Paths.get("C:/oracle/home/product/bd/sql/fundamentoSQL.pdf");
		
		Path p3 = (p1.relativize(p2));
		System.out.println(p3);
		Path p4 = p1.resolve(p3);
		System.out.println(p4);
		Path p5 = p4.normalize();
		System.out.println(p5);
	}
}
/*
Output:
..\..\..\bd\sql\fundamentoSQL.pdf
C:\oracle\home\product\java\97875\curso.pdf\..\..\..\bd\sql\fundamentoSQL.pdf
C:\oracle\home\product\bd\sql\fundamentoSQL.pdf
*/
