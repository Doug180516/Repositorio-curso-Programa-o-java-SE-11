package br.com.kasolution.teste;

import br.com.kasolution.dominio.array.ArrayInteger;

public class TesteInteger {

    public static void main(String[] args) {
        ArrayInteger aI = new ArrayInteger(3); //CTRL+SHIT+I
        aI.add(1);
        aI.add(2);
        aI.add(3);
        System.out.println(aI); //sout + TAB
        System.out.println("Removendo: " + aI.remove());
        System.out.println(aI);
    }//fim main
}//fim class
