package br.com.entradasdedados;

import java.io.DataInputStream;
import java.io.IOException;

import javax.swing.JOptionPane;

public class EntradaDadosComInputStream {

	public static void main(String[] args) {
		double nota1, nota2, media;
		DataInputStream dado_entrada;
		String nota_digitada;
		
			try {
				System.out.println("Digite a primeira nota! ");
				dado_entrada = new DataInputStream(System.in);
				nota_digitada = dado_entrada.readLine();
				nota1 = Double.parseDouble(nota_digitada);
				
				System.out.println("Digite a segunda nota! ");
				dado_entrada = new DataInputStream(System.in);
				nota_digitada = dado_entrada.readLine();
				nota2 = Double.parseDouble(nota_digitada);

				media = (nota1 + nota2) / 2;
				System.out.println("A nota é? " + media);

			} catch (IOException erroIO) {
				System.out.println("Somente valor validos! " + erroIO);
			}  catch (NumberFormatException erroNumber) {
				System.out.println("Somente valor validos! " + erroNumber.getMessage());
				erroNumber.printStackTrace();
			} finally {
				System.out.println("Fim da compilação!");
			}
	}
}
