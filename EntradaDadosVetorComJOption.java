package br.com.entradasdedados;

import javax.swing.JOptionPane;

public class EntradaDadosVetorComJOption {

	public static void main(String[] args) {
		double nota1, nota2, media;
		String nota_digitada;

		try {
			nota_digitada = JOptionPane.showInputDialog(null, "Digite a primeira nota: ");
			nota1 = Double.parseDouble(nota_digitada);

			nota_digitada = JOptionPane.showInputDialog(null, "Digite a segunda nota: ");
			nota2 = Double.parseDouble(nota_digitada);

			media = (nota1 + nota2) / 2;
			JOptionPane.showMessageDialog(null, "A nota é? " + media);

		} catch (NumberFormatException erroNumber) {
			JOptionPane.showMessageDialog(null, "Somente valor validos! " + erroNumber);
		} finally {
			JOptionPane.showMessageDialog(null, "Fim da compilação! ");
		}
	}
}
