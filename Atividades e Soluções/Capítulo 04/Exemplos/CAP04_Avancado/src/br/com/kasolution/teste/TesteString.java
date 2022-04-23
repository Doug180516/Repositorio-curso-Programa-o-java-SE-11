package br.com.kasolution.teste;

import br.com.kasolution.dominio.array.ArrayString;

public class TesteString {

    public static void main(String[] args) {
        ArrayString aS = new ArrayString(3);
        aS.add("A");
        aS.add("B");
        aS.add("C");
        System.out.println(aS); //sout + TAB
        System.out.println("Removendo: " + aS.remove());
        System.out.println(aS);
    }
    
}
