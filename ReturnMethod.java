package br.com.entradasdedados;

import javax.swing.JOptionPane;

public class ReturnMethod {
	public static void main(String[] args) {
		Calcula.valor1 = 8;
		Calcula.valor2 = 6;
		Calcula.somar();
		JOptionPane.showMessageDialog(null, "A soma é: " + Calcula.soma);

		Calcula.somar(8, 5);
		JOptionPane.showMessageDialog(null, "A soma é: " + Calcula.soma);

		JOptionPane.showMessageDialog(null, "A soma é: " + Calcula.retorna_somar(8, 9));
	}
}
