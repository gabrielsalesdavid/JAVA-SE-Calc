package br.com.formularios;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class Formulario extends JFrame implements ActionListener, ItemListener, FocusListener {

	JLabel lblTitulo, lblAutor, lblLogo;
	JButton btnCadastro, btnSair;
	JTextField tfNome;
	ImageIcon imagemLogo;
	JComboBox jcbFamilia;
	JList jltLista;
	JRadioButton jrbMasc, jrbFemi;
	ButtonGroup bgSexo;
	JPanel jpSexo;
	JPasswordField jpfSenha;
	JTextArea jtaTexto;
	JScrollPane jspBarraRolagem;
	JMenuBar jmbMenu;
	JMenu jMenu;
	JMenuItem jmiSubMenu;

	public Formulario() {

		String Lista[] = { "Chato", "Totosa", "Amorzão", "Momorada" };

		setTitle("Bem Vindo!");
		setSize(1000, 500);
		setLocation(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.black);
//		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
//		getContentPane().setLayout(new BorderLayout(20, 25));
		getContentPane().setLayout(null);

		lblTitulo = new JLabel("Sistema BR");
		getContentPane().add("North", lblTitulo);
		lblTitulo.setBounds(10, 10, 400, 60);
		lblTitulo.setForeground(Color.red);
		lblTitulo.setFont(new Font("Arial", Font.BOLD, 20));

		lblAutor = new JLabel("Gabriel S");
		getContentPane().add("West", lblAutor);
		lblAutor.setBounds(50, 30, 150, 40);
		lblAutor.setForeground(Color.red);

		lblLogo = new JLabel("");
		imagemLogo = new ImageIcon("C:/Users/Gabriel Sales David/Pictures/20190324_174603.jpg");
		lblLogo = new JLabel(imagemLogo);
		getContentPane().add(lblLogo);
		lblLogo.setBounds(50, 50, 60, 70);

		btnCadastro = new JButton("Botão cadastro");
		getContentPane().add("South", btnCadastro);
		btnCadastro.setBounds(75, 60, 225, 60);

		btnSair = new JButton("Sair");
		getContentPane().add("East", btnSair);
		btnSair.setBounds(100, 90, 250, 90);

		tfNome = new JTextField(25);
		getContentPane().add("Center", tfNome);
		tfNome.setBounds(120, 120, 300, 120);

		jpfSenha = new JPasswordField();
		jpfSenha.setEchoChar('#');
		jpfSenha.setBounds(200, 300, 400, 500);
		getContentPane().add(jpfSenha);

		jcbFamilia = new JComboBox();
		jcbFamilia.addItem("Bryan Gabriel");
		jcbFamilia.addItem("Rebeca Vitoria");
		jcbFamilia.setBounds(300, 400, 500, 50);
		getContentPane().add(jcbFamilia);

		jltLista = new JList(Lista);
		jltLista.setBounds(500, 200, 900, 100);
		getContentPane().add(jltLista);

		jrbMasc = new JRadioButton("Masculino");
		getContentPane().add(jrbMasc);

		jrbFemi = new JRadioButton("Feminino");
		getContentPane().add(jrbFemi);

		bgSexo = new ButtonGroup();
		bgSexo.add(jrbMasc);
		bgSexo.add(jrbFemi);

		jpSexo = new JPanel();
		jpSexo.add(jrbMasc);
		jpSexo.add(jrbFemi);
		jpSexo.setBounds(800, 700, 600, 500);
		getContentPane().add(jpSexo);
		jpSexo.setLayout(new GridLayout(2, 1));

		jtaTexto = new JTextArea("Use a celebro, pois o mesmo não é infeite!", 10, 10);
		jtaTexto.setBounds(10, 20, 30, 40);
		getContentPane().add(jtaTexto);

		jspBarraRolagem = new JScrollPane(jtaTexto);
		jspBarraRolagem.setBounds(10, 20, 30, 40);
		getContentPane().add(jspBarraRolagem);

		jmbMenu = new JMenuBar();
		setJMenuBar(jmbMenu);

		jMenu = new JMenu("Cadastro");
		jmbMenu.add(jMenu);

		jmiSubMenu = new JMenuItem("Agressenta algo");
		jMenu.add(jmiSubMenu);
		jMenu.addSeparator();

		btnCadastro.addActionListener(this);
		btnSair.addActionListener(this);
		jmiSubMenu.addActionListener(this);

		jcbFamilia.addItemListener(this);

		jpfSenha.addFocusListener(this);

	}

	public static void main(String[] args) {

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCadastro) {
			JOptionPane.showMessageDialog(null, "Cadastro com sucesso!");
		}
		if (e.getSource() == btnSair || e.getSource() == jmiSubMenu) {
			System.exit(0);
		}
	}

	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == jcbFamilia) {
			JOptionPane.showMessageDialog(null, "Item da familia selecionado!");
		}
	}

	@Override
	public void focusGained(FocusEvent e) {
		return;
	}

	@Override
	public void focusLost(FocusEvent e) {
		if (e.getSource() == jpfSenha) {
			JOptionPane.showMessageDialog(null, "Saiu do campo senha!");

		}
	}
}
