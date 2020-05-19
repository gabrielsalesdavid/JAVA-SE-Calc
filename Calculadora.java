package br.com.formularios;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Calculadora extends JFrame implements ActionListener, InterfaceCalculadora {
	JLabel lblTitulo, lblAutor, lblLogo, lblCalculo1, lblCalculo2, lblResultado;
	JButton btnSomar, btnSubtrair, btnMultiplicar, btnDividir, btnSair, btnLimpar;
	JTextField jtfNumero1, jtfNumero2, jtfResultado;
	ImageIcon icoLogo;
	JMenuBar jmbMenu;
	JMenu jmCalculadora;
	JMenuItem jmiSomar, jmiSubtrair, jmiMultiplicar, jmiDividir, jmiSair, jmiLimpar;
	NumberFormat calculo;
	HerancaCalculadora objCalculos;

	double numero1 = 0;
	double numero2 = 0;
	double resultado = 0;

	public Calculadora() {

		setTitle("Calculadora");
		setSize(10, 20);
		setLocation(30, 40);
		setResizable(true);
		getContentPane().setBackground(Color.black);
		getContentPane().setLayout(null);

		lblTitulo = new JLabel("Calculadora");
		getContentPane().add("North", lblTitulo);
		lblTitulo.setBounds(900, 20, 800, 80);
		lblTitulo.setForeground(Color.red);
		lblTitulo.setFont(new Font("Arial", Font.BOLD, 60));

		lblAutor = new JLabel("Gabriel Sales");
		getContentPane().add("West", lblAutor);
		lblAutor.setBounds(1000, 980, 600, 60);
		lblAutor.setForeground(Color.red);
		lblAutor.setFont(new Font("Arial", Font.BOLD, 40));

		lblLogo = new JLabel("Java");
		icoLogo = new ImageIcon("C:/Users/Gabriel Sales David/Pictures/download.png");
		lblLogo = new JLabel(icoLogo);
		getContentPane().add(lblLogo);
		lblLogo.setBounds(1500, 20, 400, 800);

		lblCalculo1 = new JLabel("Calculo 1:");
		getContentPane().add("West", lblCalculo1);
		lblCalculo1.setBounds(190, 150, 200, 60);
		lblCalculo1.setForeground(Color.red);
		lblCalculo1.setFont(new Font("Arial", Font.BOLD, 30));

		lblCalculo2 = new JLabel("Calculo 2:");
		getContentPane().add("West", lblCalculo2);
		lblCalculo2.setBounds(630, 150, 200, 60);
		lblCalculo2.setForeground(Color.red);
		lblCalculo2.setFont(new Font("Arial", Font.BOLD, 30));

		lblResultado = new JLabel("Resultado:");
		getContentPane().add("West", lblResultado);
		lblResultado.setBounds(850, 300, 200, 60);
		lblResultado.setForeground(Color.red);
		lblResultado.setFont(new Font("Arial", Font.BOLD, 30));

		btnSomar = new JButton("Somar");
		getContentPane().add(btnSomar);
		btnSomar.setBounds(60, 450, 200, 50);
		btnSomar.addActionListener(this);

		btnSubtrair = new JButton("Subtrair");
		getContentPane().add(btnSubtrair);
		btnSubtrair.setBounds(290, 450, 200, 50);
		btnSubtrair.addActionListener(this);

		btnMultiplicar = new JButton("Multiplicar");
		getContentPane().add(btnMultiplicar);
		btnMultiplicar.setBounds(520, 450, 200, 50);
		btnMultiplicar.addActionListener(this);

		btnDividir = new JButton("Dividir");
		getContentPane().add(btnDividir);
		btnDividir.setBounds(750, 450, 200, 50);
		btnDividir.addActionListener(this);

		btnSair = new JButton("Sair");
		getContentPane().add(btnSair);
		btnSair.setBounds(980, 450, 200, 50);
		btnSair.addActionListener(this);

		btnLimpar = new JButton("Limpar");
		getContentPane().add("Center", btnLimpar);
		btnLimpar.setBounds(1210, 450, 200, 50);
		btnLimpar.addActionListener(this);

		jtfNumero1 = new JTextField("0", 10);
		getContentPane().add("Center", jtfNumero1);
		jtfNumero1.setBounds(400, 150, 200, 40);
		jtfNumero1.setFont(new Font("Arial", Font.BOLD, 30));

		jtfNumero2 = new JTextField("0", 10);
		getContentPane().add("Center", jtfNumero2);
		jtfNumero2.setBounds(830, 150, 200, 40);
		jtfNumero2.setFont(new Font("Arial", Font.BOLD, 30));

		jtfResultado = new JTextField("0", 20);
		getContentPane().add("Center", jtfResultado);
		jtfResultado.setBounds(1050, 300, 200, 60);
		jtfResultado.setFont(new Font("Arial", Font.BOLD, 30));
		jtfResultado.setEditable(false);
		calculo = NumberFormat.getInstance();
		calculo.setMinimumFractionDigits(2);

		jmbMenu = new JMenuBar();
		setJMenuBar(jmbMenu);

		jmCalculadora = new JMenu("Calculos");
		jmbMenu.add(jmCalculadora);

		jmiSomar = new JMenuItem("Somar");
		jmCalculadora.add(jmiSomar);

		jmiSubtrair = new JMenuItem("Subtrair");
		jmCalculadora.add(jmiSubtrair);

		jmiMultiplicar = new JMenuItem("Multiplicar");
		jmCalculadora.add(jmiMultiplicar);

		jmiDividir = new JMenuItem("Dividir");
		jmCalculadora.add(jmiDividir);

		jmiLimpar = new JMenuItem("Limpar");
		jmCalculadora.add(jmiLimpar);

		jmCalculadora.addSeparator();

		jmiSair = new JMenuItem("Sair");
		jmCalculadora.add(jmiSair);

		objCalculos = new HerancaCalculadora();
	}

	public static void main(String[] args) {
		JFrame objCalc = new Calculadora();
		objCalc.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnLimpar) {
			limpar();
		} else {
			converter();
		}

		if (e.getSource() == btnSomar) {
//			resultado = numero1 + numero2;
			jtfResultado.setText(String.valueOf(calculo.format(objCalculos.somar(numero1, numero2))));
		}

		if (e.getSource() == btnSubtrair) {
//			resultado = numero1 - numero2;
			jtfResultado.setText(String.valueOf(calculo.format(objCalculos.subtrair(numero1, numero2))));
		}

		if (e.getSource() == btnMultiplicar) {
//			resultado = numero1 * numero2;
			jtfResultado.setText(String.valueOf(calculo.format(objCalculos.multiplicar(numero1, numero2))));
		}

		if (e.getSource() == btnDividir) {
//			resultado = numero1 / numero2;
			jtfResultado.setText(String.valueOf(calculo.format(objCalculos.dividir(numero1, numero2))));
		}

		if (e.getSource() == btnSair || e.getSource() == jmiSair) {
			System.exit(0);
		}
	}

	@Override
	public double somar(double numero1, double numero2) {
		return numero1 + numero2;
	}

	@Override
	public double subtrair(double numero1, double numero2) {
		return numero1 - numero2;
	}

	@Override
	public double multiplicar(double numero1, double numero2) {
		return numero1 * numero2;
	}

	@Override
	public double dividir(double numero1, double numero2) {
		return numero1 / numero2;
	}

	@Override
	public void converter() {
		try {
			numero1 = Double.parseDouble(jtfNumero1.getText());
			numero2 = Double.parseDouble(jtfNumero2.getText());
		} catch (NumberFormatException erroNumber) {
			JOptionPane.showMessageDialog(null, "Digite um valor numérico! " + erroNumber);
			JOptionPane.showMessageDialog(null, "O erro que deu é: " + erroNumber);
			erroNumber.printStackTrace();
			limpar();
		}
	}

	@Override
	public void limpar() {
		jtfNumero1.setText("0");
		jtfNumero2.setText("0");
		jtfResultado.setText("0");
		jtfNumero1.requestFocus();
	}
}
