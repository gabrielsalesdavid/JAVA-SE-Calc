package br.com.orientacaoaobjeto;

import javax.swing.JOptionPane;

public class Vendas {
	public String cliente;
	public String produto;
	public double valor;

	public double alteraValor(double alteraP) {
//		valor = alteraP;
		alteraP = this.valor; // aqui a variavel alteraP que recebe o this(pega) o valor, ou seja, ira return 0, pois não possui nada.
		this.valor = alteraP; // aqui o this(pega) o valor que recebe a variavel alteraP, ou seja, ira return 90.
		return valor;
	}

	public void imprime(double valor) {
		JOptionPane.showMessageDialog(null,
				"Nome.: " + cliente + " Produto.: " + produto + " Valor.: " + alteraValor(valor));
	}
}
