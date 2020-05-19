package br.com.orientacaoaobjeto;

import javax.swing.JOptionPane;

public class VendasContrutor {
	public String cliente;
	public String produto;
	public double valor;

	public String vendaConstrutor(String cliente) {
		this.cliente = cliente;
		return cliente;
	}
	
	public String vendaConstrutor(String cliente, String produto) {
		this.cliente = cliente;
		this.produto = produto;
		return toString();
	}
	
	public double vendaConstrutor(double valor) {
		this.valor= valor;
		return valor;
	}

	public double alteraValor(double alteraP) {
		valor = alteraP;
		return valor;
	}

	public void imprime(double valor) {
		JOptionPane.showMessageDialog(null,
				"Nome.: " + cliente + " Produto.: " + produto + " Valor.: " + alteraValor(valor));
	}
}
