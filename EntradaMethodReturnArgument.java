package br.com.entradasdedados;

import javax.swing.JOptionPane;

public class EntradaMethodReturnArgument {
	static double nota1 = 0, nota2 = 0, media = 0;

	public static void main(String[] args) {

		ler_notas();
//		calcula_media();
		mensage();
	}

	public static void ler_notas() {
		nota1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a primeira nota.: "));
		nota2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a segunda nota.: "));
	}

	public static double calcula_media() {
		return (nota1 + nota2) / 2;

//		media = (nota1 + nota2) /2;
//		return media;
	}

	public static void mensage() {
		JOptionPane.showMessageDialog(null, "A sua nota é.: " + calcula_media());
	}
}
