package br.com.entradasdedados;

import javax.swing.JOptionPane;

public class EntradaSimplesMethods {
	static double nota1 = 0, nota2 = 0, media = 0;

	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			ler_notas();
			calcula_media();
			mensage();
		}
	}

	public static void ler_notas() {
		nota1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a primeira nota.: "));
		nota2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a segunda nota.: "));
	}

	public static void calcula_media() {
		media = (nota1 + nota2) / 2;
	}

	public static void mensage() {
		JOptionPane.showMessageDialog(null, "A sua nota é.: " + media);
	}
}
