package br.com.kasolution.bd;

import java.util.ArrayList;
import java.util.List;

import br.com.kasolution.dominio.Funcionario;

public class BDFuncionario {
	
	private static final List<Funcionario> FUNCIONARIOS = new ArrayList<>() {{
        add(new Funcionario.Builder().nome("Igor").idade(37)
                .sexo('M').cidade("Sao Paulo").estado("SP").salario(7000.0).build());
        add(new Funcionario.Builder().nome("Candido").idade(40)
                .sexo('M').cidade("Sao Paulo").estado("SP").salario(6300.0).build());
        add(new Funcionario.Builder().nome("Victor").idade(57)
                .sexo('M').cidade("Sao Paulo").estado("SP").salario(5900.0).build());
        add(new Funcionario.Builder().nome("Maria Antonia").idade(27)
                .sexo('F').cidade("Uberaba").estado("MG").salario(12000.0).build());
        add(new Funcionario.Builder().nome("Carla").idade(31)
                .sexo('F').cidade("Belo Horizonte").estado("MG").salario(11500.0).build());
        add(new Funcionario.Builder().nome("Renato").idade(43)
                .sexo('M').cidade("Monte Carmelo").estado("MG").salario(8300.0).build());
        add(new Funcionario.Builder().nome("Fernanda").idade(39)
                .sexo('F').cidade("Rio de Janeiro").estado("RJ").salario(9200.0).build());
        add(new Funcionario.Builder().nome("Priscila").idade(50)
                .sexo('F').cidade("Santos").estado("SP").salario(13700.0).build());
        add(new Funcionario.Builder().nome("Robson").idade(45)
                .sexo('M').cidade("Niteroi").estado("RJ").salario(15000.0).build());
        add(new Funcionario.Builder().nome("Leonardo").idade(28)
                .sexo('M').cidade("Nova Iguacu").estado("RJ").salario(21400.0).build());
        add(new Funcionario.Builder().nome("Marcio").idade(21)
                .sexo('M').cidade("Rio de Janeiro").estado("RJ").salario(12700.0).build());
        add(new Funcionario.Builder().nome("Paulo").idade(37)
                .sexo('M').cidade("Belo Horizonte").estado("MG").salario(11200.0).build());
        add(new Funcionario.Builder().nome("Monica").idade(33)
                .sexo('F').cidade("Sao Paulo").estado("SP").salario(6700.0).build());  
        add(new Funcionario.Builder().nome("Jefferson").idade(41)
                .sexo('M').cidade("Uberlandia").estado("MG").salario(9200.0).build());       
        add(new Funcionario.Builder().nome("Sandra").idade(55)
                .sexo('F').cidade("Brasilia").estado("DF").salario(12500.0).build());       
        add(new Funcionario.Builder().nome("Luciano").idade(43)
                .sexo('M').cidade("Brasilia").estado("DF").salario(11100.0).build());       
        add(new Funcionario.Builder().nome("Anderson").idade(39)
                .sexo('M').cidade("Sao Paulo").estado("SP").salario(8600.0).build());       
        add(new Funcionario.Builder().nome("Guilherme").idade(26)
                .sexo('M').cidade("Igarapava").estado("SP").salario(10300.0).build());       
        add(new Funcionario.Builder().nome("Sabrina").idade(28)
                .sexo('F').cidade("Uberaba").estado("MG").salario(9900.0).build());       
        add(new Funcionario.Builder().nome("Eduardo").idade(27)
                .sexo('M').cidade("Niteroi").estado("RJ").salario(7800.0).build());       
	}};
	
	public static List<Funcionario> getFuncionarios() {
		return FUNCIONARIOS;
	}

}
