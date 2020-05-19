package br.com.entradasdedados;

import javax.swing.JOptionPane;

public class EntradaDadosThrows {
	public static void main(String [] args) {
		
		try {
			String nome;
			nome = JOptionPane.showInputDialog(null, "Digite o seu nome: " );
			JOptionPane.showInputDialog(null, "Olá! " );
			JOptionPane.showInputDialog(null, "Seu nome: " + nome);
			
			throw new Exception("ErroOcorrido");
		} catch(Exception ErroOcorrido) {
			JOptionPane.showMessageDialog(null, "O ErroOcorrido foi acionado! ");
		}
	}
}
