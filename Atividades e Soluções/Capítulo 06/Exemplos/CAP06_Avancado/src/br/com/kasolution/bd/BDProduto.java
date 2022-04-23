package br.com.kasolution.bd;

import java.util.ArrayList;
import java.util.List;

import br.com.kasolution.dominio.produto.Agenda;
import br.com.kasolution.dominio.produto.Alimento;
import br.com.kasolution.dominio.produto.Bateria;
import br.com.kasolution.dominio.produto.Bicicleta;
import br.com.kasolution.dominio.produto.Celular;
import br.com.kasolution.dominio.produto.Produto;

import static br.com.kasolution.dominio.constante.UnidadeMedida.*;
import static br.com.kasolution.dominio.constante.Operadora.*;
import static java.time.LocalDate.*;

public class BDProduto {
	
	private static final List<Produto> PRODUTOS = new ArrayList<Produto>() {{
		//Agendas
		add(new Agenda.Builder().descricao("Agenda diária, Brief Case")
				.valor(18.90).ano(2022).folhas(184).build());
		add(new Agenda.Builder().descricao("Agenda diária Dreams")
				.valor(19.90).ano(2022).folhas(176).build());
		add(new Agenda.Builder().descricao("Agenda comercial 2022 Brief Case")
				.valor(24.90).ano(2022).folhas(192).build());
		add(new Agenda.Builder().descricao("Agenda diária Lumi 2022")
				.valor(24.90).ano(2022).folhas(176).build());
		
		//Alimento
		add(new Alimento.Builder().descricao("Coxa de frango congelada")
				.valor(10.99).unidade(KG).dataValidade(of(2022, 10, 12)).perecivel(true)
				.build());
		add(new Alimento.Builder().descricao("Lasanha à bolonhesa seara 600g ")
				.valor(9.99).unidade(KG).dataValidade(of(2022, 11, 30)).perecivel(true)
				.build());
		add(new Alimento.Builder().descricao("Cerveja puro malte 350ml (18 Latas)")
				.valor(44.82).unidade(CX).dataValidade(of(2021, 12, 1)).perecivel(false)
				.build());
		add(new Alimento.Builder().descricao("Refrigerante sem açucar 2 LT")
				.valor(9.32).unidade(LT).dataValidade(of(2022, 07, 25)).perecivel(false)
				.build());
		
		
		//Bateria
		add(new Bateria.Builder().descricao("Pilha Alcalina Pequena AA (16 UN)")
				.valor(64.90).categoria("AA").recarregavel(false).build());
		add(new Bateria.Builder().descricao("Pilha Alcalina Pequena AA (4 UN)")
				.valor(24.90).categoria("AA").recarregavel(false).build());
		add(new Bateria.Builder().descricao("Pilha recarregável AA 2500mAh (4 UN)")
				.valor(105.50).categoria("AA").recarregavel(true).build());
		add(new Bateria.Builder().descricao("Pilha recarregável AAA 900mah (2 UN)")
				.valor(59.90).categoria("AAA").recarregavel(true).build());
		
		
		//Bicicleta
		add(new Bicicleta.Builder().descricao("Bicicleta masculina de ciclismo urbano")
				.valor(999.99).aro(26).marchas(21).build());
		add(new Bicicleta.Builder().descricao("Bicicleta MTB rockrider ST50")
				.valor(1399.99).aro(26).marchas(21).build());
		add(new Bicicleta.Builder().descricao("Bicicleta infantil ROBOT")
				.valor(599.99).aro(14).marchas(1).build());
		add(new Bicicleta.Builder().descricao("Bicicleta Caloi 400 comfort")
				.valor(1249.99).aro(26).marchas(21).build());
		
		//Celular
		add(new Celular.Builder().descricao("Samsung Galaxy S21 Cinza")
				.valor(4_306.85).chips(2).operadora(TIM).build());
		add(new Celular.Builder().descricao("iPhone 11 64GB Preto")
				.valor(2_999.00).chips(2).operadora(CLARO).build());
		add(new Celular.Builder().descricao("Smartphone Moto G10 Branco Floral")
				.valor(1_029.00).chips(2).operadora(NEXTEL).build());
		add(new Celular.Builder().descricao("Smartphone Velvet Aurora Gray LG")
				.valor(2_499.00).chips(2).operadora(VIVO).build());
	}};
	
	public static List<Produto> getProdutos() {
		return PRODUTOS;
	}

}
