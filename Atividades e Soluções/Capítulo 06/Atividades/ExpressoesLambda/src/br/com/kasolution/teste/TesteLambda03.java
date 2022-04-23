package br.com.kasolution.teste;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

import br.com.kasolution.bd.BDFuncionario;
import br.com.kasolution.dominio.Funcionario;

public class TesteLambda03 {	
	
//	public static boolean verificaSalarioMaior(Funcionario f, Double valor) {
//		return f.getSalario() > valor;
//	}
	
//	public static void mostraNomeSalario(Funcionario f) {
//		System.out.printf("Nome: %s - Salario: R$%.2f \n", f.getNome(), f.getSalario());
//	}
	
	public static void main(String[] args) {
		List<Funcionario> funcionarios = BDFuncionario.getFuncionarios();
		
		BiPredicate<Funcionario, Double> verificaSalarioMaior = (f, d) -> f.getSalario() > d;
		Consumer<Funcionario> mostraNomeSalario = f ->
			System.out.printf("Nome: %s - Salario: R$%.2f \n", f.getNome(), f.getSalario());
		
		funcionarios.stream()
			.filter(f -> verificaSalarioMaior.test(f, 10_000.00))
			.forEach(mostraNomeSalario::accept); //f -> mostraNomeSalario.accept(f)
			
//		for (Funcionario f : funcionarios) {
//			if (verificaSalarioMaior(f, 10_000.00)) {
//				mostraNomeSalario(f);
//			}
//		}
	}

}
