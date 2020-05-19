package br.com.entradasdedados;

import javax.swing.JOptionPane;

public class EntradaMethodComParametros {
	static double nota1 = 0, nota2 = 0, media = 0;

	public static void main(String[] args) {

		ler_notas();
		calcula_media(nota1, nota2);
		mensage(media);
	}

	public static void ler_notas() {
		nota1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a primeira nota.: "));
		nota2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a segunda nota.: "));
	}

	public static void calcula_media(double nt1, double nt2) {
		media = (nt1 + nt2) / 2;
	}

	public static void mensage(double calculomedia) {
		JOptionPane.showMessageDialog(null, "A sua nota é.: " + calculomedia);
	}
}
