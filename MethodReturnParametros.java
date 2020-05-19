package br.com.entradasdedados;

import javax.swing.JOptionPane;

public class MethodReturnParametros {
	static double nota1 = 0, nota2 = 0, media = 0;

	public static void main(String[] args) {

		ler_notas();
		mensage();
	}

	public static void ler_notas() {
		nota1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a primeira nota.: "));
		nota2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a segunda nota.: "));
	}

	public static double calcula_media(double nt1, double nt2) {
		return (nt1 + nt2) / 2;
	}

	public static void mensage() {
		JOptionPane.showMessageDialog(null, "A sua nota é.: " + calcula_media(nota1, nota2));
	}
}
