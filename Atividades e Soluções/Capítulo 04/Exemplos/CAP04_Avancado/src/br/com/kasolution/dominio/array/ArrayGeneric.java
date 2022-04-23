package br.com.kasolution.dominio.array;

import java.util.Arrays;

@SuppressWarnings("unchecked")
public class ArrayGeneric<T> { //operador diamente
    
    private T[] pilha;
    private int tamanho;

    public ArrayGeneric(int tamanho) {
        pilha =  (T[]) new Object[tamanho];
    }

    public final void add(T e) { if (tamanho < pilha.length) pilha[tamanho++] = e; }
    
    public final T remove() {
        T elemento = null;
        if (tamanho > 0) {
            elemento = pilha[--tamanho];
            pilha[tamanho] = null;
        }
        return elemento;
    }
    
    public final T[] get() { return pilha; }
    
    public final int getSize() { return tamanho; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= tamanho; i++) {
            if (i == tamanho || pilha[i] == null)
                return sb.substring(2);
            else
                sb.append(", ").append(pilha[i].toString());    
        }
        return null;
    }

    @Override
    public boolean equals(Object object) {
        if (object != null && object instanceof ArrayGeneric<?>) {
            ArrayGeneric<?> aG = (ArrayGeneric<?>) object;
            return Arrays.equals(this.get(), aG.get());
        }
        return false;        
    }
}