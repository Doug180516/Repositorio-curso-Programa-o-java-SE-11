package br.com.kasolution.teste;

import java.util.stream.Stream;

public class TesteStream01 {

	public static void main(String[] args) {
		
		Stream<String> vazia = Stream.empty();
		System.out.println(vazia.count()); //0
		
		Stream<Integer> unico = Stream.of(1);
		System.out.println(unico.count()); //1
		
		Stream<Integer> deArray = Stream.of(1, 2, 3, 4, 5, 6, 7);
		System.out.println(deArray.count()); //3
		
	}

}
