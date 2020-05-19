package br.com.entradasdedados;

import javax.swing.JOptionPane;

public class Sobrecarga {
	static String mensagem;

	public static void main(String[] args) {

		ler_mensagem("Bryan ", "Rebeca ");
		mostrar_mensagem();
	}

	public static void ler_mensagem() {
		mensagem = "Method not parament! ";
	}
	
	public static void ler_mensagem(String texto) {
		mensagem = texto;
	}
	
	public static void ler_mensagem(String p1, String p2) {
		mensagem = "Method not parament! " + (p1 + p2);
	}
	
	public static void ler_mensagem(int oque) {
		mensagem = "Method not parament! " + oque;
	}
	
	public static void mostrar_mensagem() {
		JOptionPane.showMessageDialog(null, "Return.: " + mensagem);
	}
}
