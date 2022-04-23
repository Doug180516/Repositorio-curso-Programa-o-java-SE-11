package br.com.kasolution.teste;

import java.util.ArrayDeque;
import java.util.Deque;

public class TesteDeque {
	public static void main(String[] args) {
		Deque<String> deque = new ArrayDeque<>();
		deque.add("A");
		deque.add("B");
		deque.add("C");
		deque.add("D");
		deque.push("E");
		deque.push("F");
		deque.push("G");
		deque.add("X");
		System.out.printf("Deque: %s \n", deque);
		System.out.printf("remove: %s \n", deque.remove());
		System.out.printf("remove: %s \n", deque.remove());
		System.out.printf("pop: %s \n", deque.pop());
		System.out.printf("pop: %s \n", deque.pop());
		System.out.printf("Deque: %s \n", deque);
	}
}
/* Output:
	Deque: [G, F, E, A, B, C, D] 
	remove: G 
	remove: F 
	pop: E 
	pop: A 
	Deque: [B, C, D] 
*/