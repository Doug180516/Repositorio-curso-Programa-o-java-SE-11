package br.com.kasolution.dominio.array;

import java.util.Arrays;

public class ArrayInteger {

    private Integer[] pilha;
    private int tamanho;

    public ArrayInteger(int tamanho) { pilha = new Integer[tamanho]; }
    public final void add(Integer i) {
        if (tamanho < pilha.length) { pilha[tamanho++] = i; }
    }
    public final Integer remove() {
        Integer elemento = null;
        if (tamanho > 0) {
            elemento = pilha[--tamanho];
            pilha[tamanho] = null;
        }
        return elemento;
    }
    public final Integer[] get() { return pilha; }
    public final int getSize() { return tamanho; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= tamanho; i++) {
            if (i == tamanho || pilha[i] == null) {
                return sb.substring(2);
            } else {
                sb.append(", ").append(pilha[i].toString());
            }
        }
        return null;
    }

    @Override
    public boolean equals(Object object) {
        if (object != null && object instanceof ArrayInteger) {
            ArrayInteger aI = (ArrayInteger) object;
            return Arrays.equals(this.get(), aI.get());
        }
        return false;
    }


}
