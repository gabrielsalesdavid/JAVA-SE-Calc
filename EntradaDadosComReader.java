package br.com.entradasdedados;

import java.io.*;

import javax.swing.JOptionPane;

public class EntradaDadosComReader {

	public static void main(String[] args) {
		double nota1 = 0, nota2 = 0, media = 0;
		BufferedReader dado_entrada;
		String nota_digitada;

		try {
			System.out.println("Digite a primeira nota!");
			dado_entrada = new BufferedReader(new InputStreamReader(System.in));
			nota_digitada = dado_entrada.readLine();
			nota1 = Double.parseDouble(nota_digitada);
			
			System.out.println("Digite a segunda nota!");
			dado_entrada = new BufferedReader(new InputStreamReader(System.in));
			nota_digitada = dado_entrada.readLine();
			nota2 = Double.parseDouble(nota_digitada);
			
			media = (nota1 * nota2) / 2;
			System.out.println("O calculo das duas notas é: " + media);
			JOptionPane.showMessageDialog(null, "O calculo das duas notas é: " + media);
			
		} catch (IOException erroIO) {
			System.out.println("Erro de entrada de dados!" + erroIO);
		} catch (NumberFormatException erroNumber) {
			System.out.println("Digite um valor valido!" + erroNumber);
		}
	}

}
