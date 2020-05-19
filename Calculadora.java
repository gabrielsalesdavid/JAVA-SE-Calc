package br.com.formularios;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

public class Calculadora extends JFrame implements ActionListener {
	JButton btnSomar, btnSubtrair, btnMultiplicar, btnDividir, btnSair,
                btnCe, btnApagar, btnIgual, btn1, btn2, btn3, btn4, btn5, btn6,
                btn7, btn8, btn9, btn0, btnPonto, btnBackSpace;
	JTextField jtfCalRes;
	JMenuBar jmbMenu;
	JMenu jmCalculadora;
	JMenuItem jmiSomar, jmiSubtrair, jmiMultiplicar, jmiDividir, jmiSair,
                jmiLimpar;
        
        char crTecla;
	double numero1 = 0;
	double numero2 = 0;
	double resultado = 0;        
        boolean cliquei = false, segunNumero = false;

	public Calculadora() {

		setTitle("Calculadora");
		setSize(10, 20);
		setLocation(30, 40);
		setResizable(true);
		getContentPane().setBackground(Color.black);
		getContentPane().setLayout(null);             
                
                jtfCalRes = new JTextField();
		getContentPane().add(jtfCalRes);
		jtfCalRes.addActionListener(this);
		jtfCalRes.setBounds(80, 20, 470, 40);
                jtfCalRes.setForeground(Color.black);
                jtfCalRes.setFont(new Font("Arial", Font.BOLD, 16));
                
                btnCe = new JButton("CE");
		getContentPane().add(btnCe);
                btnCe.addActionListener(this);
		btnCe.setBounds(10, 20, 60, 40);		
                btnCe.setForeground(Color.black);
                btnCe.setFont(new Font("Arial", Font.BOLD, 18));

		btnSomar = new JButton("+");
		getContentPane().add(btnSomar);
		btnSomar.addActionListener(this);
		btnSomar.setBounds(450, 80, 100, 100);
                btnSomar.setForeground(Color.black);
                btnSomar.setFont(new Font("Arial", Font.BOLD, 14));

		btnSubtrair = new JButton("-");
		getContentPane().add(btnSubtrair);
		btnSubtrair.addActionListener(this);
		btnSubtrair.setBounds(380, 120, 60, 40);
                btnSubtrair.setForeground(Color.black);
                btnSubtrair.setFont(new Font("Arial", Font.BOLD, 14));

		btnMultiplicar = new JButton("x");
		getContentPane().add(btnMultiplicar);
		btnMultiplicar.addActionListener(this);
		btnMultiplicar.setBounds(380, 170, 60, 40);
                btnMultiplicar.setForeground(Color.black);
                btnMultiplicar.setFont(new Font("Arial", Font.BOLD, 14));

		btnDividir = new JButton("/");
		getContentPane().add(btnDividir);
		btnDividir.addActionListener(this);
		btnDividir.setBounds(380, 220, 60, 40);
                btnDividir.setForeground(Color.black);
                btnDividir.setFont(new Font("Arial", Font.BOLD, 14));

		btnSair = new JButton("Sair");
		getContentPane().add(btnSair);
		btnSair.addActionListener(this);
		btnSair.setBounds(450, 190, 100, 70);
                btnSair.setForeground(Color.black);
                btnSair.setFont(new Font("Arial", Font.BOLD, 14));
                
                btn1 = new JButton("1");
		getContentPane().add(btn1);
		btn1.addActionListener(this);
		btn1.setBounds(10, 80, 80, 50);
                btn1.setForeground(Color.black);
                btn1.setFont(new Font("Arial", Font.BOLD, 14));
                
                btn2 = new JButton("2");
		getContentPane().add(btn2);
		btn2.addActionListener(this);
		btn2.setBounds(100, 80, 80, 50);
                btn2.setForeground(Color.black);
                btn2.setFont(new Font("Arial", Font.BOLD, 14));
                
                btn3 = new JButton("3");
		getContentPane().add(btn3);
		btn3.addActionListener(this);
		btn3.setBounds(190, 80, 80, 50);
                btn3.setForeground(Color.black);
                btn3.setFont(new Font("Arial", Font.BOLD, 14));
                
                btn4 = new JButton("4");
		getContentPane().add(btn4);
		btn4.addActionListener(this);
		btn4.setBounds(10, 140, 80, 50);
                btn4.setForeground(Color.black);
                btn4.setFont(new Font("Arial", Font.BOLD, 14));
                
                btn5 = new JButton("5");
		getContentPane().add(btn5);
		btn5.addActionListener(this);
		btn5.setBounds(100, 140, 80, 50);
                btn5.setForeground(Color.black);
                btn5.setFont(new Font("Arial", Font.BOLD, 14));
                
                btn6 = new JButton("6");
		getContentPane().add(btn6);
		btn6.addActionListener(this);
		btn6.setBounds(190, 140, 80, 50);
                btn6.setForeground(Color.black);
                btn6.setFont(new Font("Arial", Font.BOLD, 14));
                
                btn7 = new JButton("7");
		getContentPane().add(btn7);
		btn7.addActionListener(this);
		btn7.setBounds(10, 200, 80, 50);
                btn7.setForeground(Color.black);
                btn7.setFont(new Font("Arial", Font.BOLD, 14));
                
                btn8 = new JButton("8");
		getContentPane().add(btn8);
		btn8.addActionListener(this);
		btn8.setBounds(100, 200, 80, 50);
                btn8.setForeground(Color.black);
                btn8.setFont(new Font("Arial", Font.BOLD, 14));
                
                btn9 = new JButton("9");
		getContentPane().add(btn9);
		btn9.addActionListener(this);
		btn9.setBounds(190, 200, 80, 50);
                btn9.setForeground(Color.black);
                btn9.setFont(new Font("Arial", Font.BOLD, 14));
                
                btn0 = new JButton("0");
		getContentPane().add(btn0);
		btn0.addActionListener(this); 
		btn0.setBounds(280, 80, 90, 60);
                btn0.setForeground(Color.black);
                btn0.setFont(new Font("Arial", Font.BOLD, 14));
                
                btnIgual = new JButton("=");
		getContentPane().add(btnIgual);
		btnIgual.addActionListener(this);
		btnIgual.setBounds(280, 150, 90, 100);
                btnIgual.setForeground(Color.black);
                btnIgual.setFont(new Font("Arial", Font.BOLD, 60));
                
                btnPonto = new JButton(".");
		getContentPane().add(btnPonto);
		btnPonto.addActionListener(this);
		btnPonto.setBounds(380, 80, 60, 30);
                btnPonto.setForeground(Color.black);
                btnIgual.setFont(new Font("Arial", Font.BOLD, 14));
                
                btnBackSpace = new JButton("Backspace");
		getContentPane().add(btnBackSpace);
		btnBackSpace.addActionListener(this);
		btnBackSpace.setBounds(10, 270, 540, 60);
                btnBackSpace.setForeground(Color.black);
                btnBackSpace.setFont(new Font("Arial", Font.BOLD, 22));

		jmbMenu = new JMenuBar();
		setJMenuBar(jmbMenu);

		jmCalculadora = new JMenu("Calculos");
		jmbMenu.add(jmCalculadora);

		jmiSomar = new JMenuItem("+");
		jmCalculadora.add(jmiSomar);
                jmiSomar.addActionListener(this);

		jmiSubtrair = new JMenuItem("-");
		jmCalculadora.add(jmiSubtrair);
                jmiSubtrair.addActionListener(this);

		jmiMultiplicar = new JMenuItem("x");
		jmCalculadora.add(jmiMultiplicar);
                jmiMultiplicar.addActionListener(this);

		jmiDividir = new JMenuItem("/");
		jmCalculadora.add(jmiDividir);
                jmiDividir.addActionListener(this);

		jmiLimpar = new JMenuItem("CE");
		jmCalculadora.add(jmiLimpar);
                jmiLimpar.addActionListener(this);

		jmCalculadora.addSeparator();

		jmiSair = new JMenuItem("Sair");
		jmCalculadora.add(jmiSair);
                jmiSair.addActionListener(this);
	}

	public static void main(String[] args) {
		JFrame objCalc = new Calculadora();
		objCalc.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) { 
            
                if(e.getSource() == btn1) {
                    numeros("1");                    
                }
                
                if(e.getSource() == btn2) {
                    numeros("2");               
                }
                
                if(e.getSource() == btn3) {
                    numeros("3");                      
                }
                
                if(e.getSource() == btn4) {
                     numeros("4");                    
                }
                
                if(e.getSource() == btn5) {
                    numeros("5");                   
                }
                
                if(e.getSource() == btn6) {
                    numeros("6");                    
                }
                
                if(e.getSource() == btn7) {
                    numeros("7");                   
                }
                
                if(e.getSource() == btn8) {
                    numeros("8");                   
                }
                
                if(e.getSource() == btn9) {
                   numeros("9");                    
                }
                
                if(e.getSource() == btn0) {
                    numeros("0");                   
                }
                
                if(e.getSource() == btnBackSpace) {  
                int conta = jtfCalRes.getText().length();                  
                  if(conta > 0) {
                    jtfCalRes.setText(jtfCalRes.getText().substring(0, conta - 1));
                 }         
                }
                
                if (e.getSource() == btnSomar || e.getSource() == jmiSomar) { 
                    if (segunNumero == true)
                        calculado();                    
                  calcular ('+');
                  segunNumero = true;
                }

		if (e.getSource() == btnSubtrair || e.getSource() == jmiSubtrair) { 
                    if (segunNumero == true)
                        calculado();
                  calcular ('-');
                  segunNumero = true;
                }

		if (e.getSource() == btnMultiplicar || e.getSource() == jmiMultiplicar) { 
                    if (segunNumero == true)
                        calculado();
                  calcular ('*');
                  segunNumero = true;
                }

		if (e.getSource() == btnDividir || e.getSource() == jmiDividir) {
                    if (segunNumero == true)
                        calculado();
                    calcular ('/');
                    segunNumero = true;
                }
            
                if(e.getSource() == btnCe || e.getSource() == jmiLimpar) {
                    jtfCalRes.setText("");
                }
		
		if (e.getSource() == btnSair || e.getSource() == jmiSair) {
			System.exit(0);
		}
                
                if (e.getSource() == btnIgual) {
                    calculado();
                }
	}
        public void calcular(char botao) {
            cliquei = true;
            crTecla = botao;
            numero1 = Double.parseDouble(jtfCalRes.getText());
        }
        
        public void numeros(String numero) {
            
            if (cliquei == true) 
                    jtfCalRes.setText(numero);
                     else 
                        jtfCalRes.setText(jtfCalRes.getText() + numero);
                        cliquei = false;           
        }
        
        public void calculado() {
            if (crTecla == '+')
                            resultado = numero1 + Double.parseDouble(jtfCalRes.getText());
                    else if (crTecla == '-')
                            resultado = numero1 - Double.parseDouble(jtfCalRes.getText());
                    else if (crTecla == '*')      
                            resultado = numero1 * Double.parseDouble(jtfCalRes.getText());
                    else if (crTecla == '/')     
                            resultado = numero1 / Double.parseDouble(jtfCalRes.getText());
                       
                    jtfCalRes.setText(String.valueOf(resultado));
                    cliquei = true;
        }
}
