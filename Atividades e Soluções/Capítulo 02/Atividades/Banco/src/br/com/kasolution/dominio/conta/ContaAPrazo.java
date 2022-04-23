package br.com.kasolution.dominio.conta;

import java.time.LocalDate;
import static java.time.format.FormatStyle.*;
import static br.com.kasolution.ferramenta.Formatador.*;

public class ContaAPrazo extends Conta {

	private LocalDate dataMaturidade;

	public ContaAPrazo(String numero, double saldo, LocalDate dataAbertura, Prazo mesesMaturidade) {
		super(numero, saldo);
		setDataMaturidade(dataAbertura, mesesMaturidade);
	}

	public ContaAPrazo(String numero, double saldo, Prazo mesesMaturidade) {
		this(numero, saldo, LocalDate.now(), mesesMaturidade);
	}

	public LocalDate getDataMaturidade() {
		return dataMaturidade;
	}

	public void setDataMaturidade(LocalDate dataAbertura, Prazo mesesMaturidade) {
		this.dataMaturidade = dataAbertura.plusMonths(mesesMaturidade.getMesesMaturidade());
	}

	@Override
	public String getTipo() {
		return "Conta a prazo";
	}
	
	@Override
	public void saca(double valor) {
		LocalDate hoje = LocalDate.now();
		if (isAtiva() && this.saldo >= valor && hoje.isAfter(dataMaturidade)) {
			this.saldo -= valor;
		} else {
			System.out.println("Verifique o saldo disponível e a maturidade da conta.");
		}
	}

	@Override
	public String toString() {
		StringBuilder infoSuper = new StringBuilder(super.toString());
		StringBuilder infoSub = new StringBuilder(",\n\tdata maturidade: ")
				.append(data(dataMaturidade, "dd 'de' MMMM 'de' yyyy - EEEE")); //SHORT, MEDIUM, LONG, FULL

		infoSuper.insert(infoSuper.length() -1, infoSub);
		
		return infoSuper.toString();
	}

}
