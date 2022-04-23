package br.com.kasolution.dominio;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.List;

import br.com.kasolution.dominio.produto.Produto;
import static br.com.kasolution.ferramenta.Formatador.*;

public class Carrinho implements Serializable {

	private static final long serialVersionUID = 1L;

	private static int ultimoCodigo = 0;

	private Integer codigo;
	private LocalDate dataCompra;
	private List<Produto> produtos;
	private Carrinho.Checkout checkout;
	private Double total;

	public Carrinho() {
		codigo = ++ultimoCodigo;
		produtos = new ArrayList<>();
	}

	public void adiciona(Produto... produtos) {
		for (Produto p : produtos) {
			this.produtos.add(p);
		}
	}

	public void adiciona(List<Produto> produtos) {
		this.produtos.addAll(produtos);
	}

	public int getCodigo() {
		return codigo;
	}

	public LocalDate getDataCompra() {
		return dataCompra;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public Double getTotal() {
		return total;
	}

	public Carrinho.Checkout getCheckout() {
		return checkout;
	}

	public void checkout(Integer caixa, String atendente) {
		if (this.checkout == null) {
			Carrinho.Checkout chekout = new Checkout(caixa, atendente);
			chekout.fechaCompra();
		} else {
			System.out.printf("Compra fechada em : %s - Atendente: %s \n", data(dataCompra, FormatStyle.SHORT),
					this.checkout.getAtendente());
		}
	}

	private void writeObject(ObjectOutputStream oos) throws IOException {
		oos.defaultWriteObject();
		oos.writeObject(LocalDateTime.now());
	}

	private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
		ois.defaultReadObject();
		LocalDateTime dataHoraArquivo = (LocalDateTime) ois.readObject();
		System.out.println("Data e hora da geração do arquivo: " + data(dataHoraArquivo));
	}

	public class Checkout implements Serializable {

		private static final long serialVersionUID = 1L;

		private Integer caixa;
		private String atendente;

		private Checkout(Integer caixa, String atendente) {
			this.caixa = caixa;
			this.atendente = atendente;
		}

		public Integer getCaixa() {
			return caixa;
		}

		public String getAtendente() {
			return atendente;
		}

		private void fechaCompra() {
			Carrinho.this.checkout = this;
			Carrinho.this.dataCompra = LocalDate.now();
			Carrinho.this.total = 0.0;
			for (Produto p : Carrinho.this.produtos) {
				Carrinho.this.total += p.getValor();
			}
		}
	}
}
