package br.com.entradasdedados;

public class Calcula {
	static double soma = 0, valor1 = 0, valor2 = 0;
	
	public static void somar() {
		soma = valor1 + valor2;
	}
	
	public static void somar(double vl1, double vl2) {
		soma = vl1 + vl2;
	}
	
	public static double retorna_somar(double vl1, double vl2) {
		return vl1 + vl2;
	}
}
