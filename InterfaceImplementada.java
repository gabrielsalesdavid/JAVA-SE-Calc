package br.com.orientacaoaobjeto;

public class InterfaceImplementada implements Calculos {
	private double numero1, numero2;
	
	public void interfaceImplementada(double numero1, double numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}
	
	public static void main(String []args) {
		InterfaceImplementada objCalculo = new InterfaceImplementada();
		System.out.println("O resultado da soma: " + objCalculo.somar());
		System.out.println("O resultado da subtração: " + objCalculo.subtrair());
		System.out.println("O resultado da multiplicação: " + objCalculo.multiplicar());
		System.out.println("O resultado da divisão: " + objCalculo.divisao());
	}
	
	@Override
	public double somar() {
		return 9 + 8;
	}
	
	@Override
	public double subtrair() {
		return 9 - 8;
	}

	@Override
	public double multiplicar() {
		return 9 * 8;
	}
	
	@Override
	public double divisao() {
		return 9 / 8;
	}
}
