package br.com.entradasdedados;

import javax.swing.JOptionPane;

public class EntradaDados {

	public static void main(String[] args) {
		String nome;
		nome = JOptionPane.showInputDialog("Digite o seu nome! ");
		JOptionPane.showMessageDialog(null, "Nome digitado: " + nome);
	}

}
