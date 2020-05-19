package br.com.orientacaoaobjeto;

public class VendaEfetuadaConstrutor {
	public static void main(String[] args) {
		VendasContrutor objVendas = new VendasContrutor();
		objVendas.cliente = "Bryan Gabriel";
		objVendas.produto = "Livro";
		objVendas.imprime(90);
	}
	
	public String vendaEfetuadaConstrutor() {
		return "null";
	}
}
