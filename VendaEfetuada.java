package br.com.orientacaoaobjeto;

public class VendaEfetuada {
	public static void main(String[] args) {
		Vendas objVendas = new Vendas();
		objVendas.cliente = "Bryan Gabriel";
		objVendas.produto = "Livro";
		objVendas.imprime(90);
	}
}
