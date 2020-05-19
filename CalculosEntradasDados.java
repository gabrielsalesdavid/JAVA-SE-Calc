package br.com.entradasdedados;

import javax.swing.JOptionPane;

public class CalculosEntradasDados {
	public static void main(String [] args) {
		double nota1 = 0, nota2 = 0, media = 0;
		nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota! "));
		
		nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota! "));
		
		media = (nota1 * nota2) / 2;
		JOptionPane.showMessageDialog(null, "O calculo das duas notas é: " + media);
	}

}
