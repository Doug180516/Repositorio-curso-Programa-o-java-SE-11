/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.kasolution.dominio;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author igort
 */
public class Funcionario implements Comparable<Funcionario> {

	private static int ultimoCodigo;

    private final Integer codigo;
    private final String nome;
    private final char sexo;
    private final Integer idade;
    private final String cidade;
    private final String estado;
    private final Double salario;
    private static final List<Funcionario> funcionarios = new ArrayList<>();
    
    static {
    }

    //compareTo
    @Override
    public int compareTo(Funcionario f) {
        return this.nome.compareTo(f.nome);
    }

    public static void print(Funcionario f) {
        System.out.println(f);
    }

    public static class Builder {

        private String nome = "";
        private char sexo = '\u0000';
        private Integer idade= 0;
        private String cidade = "";
        private String estado = "";
        private Double salario = 0.0;

        public Funcionario.Builder nome(String nome) {
            this.nome = nome;
            return this;
        }
        
        public Funcionario.Builder sexo(char sexo) {
            this.sexo = (sexo == 'M' || sexo == 'm') ? 'M' : 'F';
            return this;
        }
        
        public Funcionario.Builder idade(Integer idade) {
            this.idade = idade;
            return this;
        }
        
        public Funcionario.Builder cidade(String cidade) {
            this.cidade = cidade;
            return this;
        }
        
        public Funcionario.Builder estado(String estado) {
            this.estado = estado;
            return this;
        }
        
        public Funcionario.Builder salario(Double salario) {
            this.salario = salario;
            return this;
        }
        
        public Funcionario build() {
            return new Funcionario(this);
        }
    }
    
    private Funcionario(Funcionario.Builder builder) {
        this.codigo = ++ultimoCodigo;
        this.nome = builder.nome;
        this.sexo = builder.sexo;
        this.idade = builder.idade;
        this.cidade = builder.cidade;
        this.estado = builder.estado;
        this.salario = builder.salario;
    }

    @Override
    public String toString() {
        return "Funcionario {" + "codigo: " + codigo + ", nome: " + nome + ", sexo: " + sexo + ","
                + " idade: " + idade + ", cidade: " + cidade + ", estado: " + estado + ", salario: " + salario + '}';
    }
    
    public Integer getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public char getSexo() {
        return sexo;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public Double getSalario() {
        return salario;
    }
}
