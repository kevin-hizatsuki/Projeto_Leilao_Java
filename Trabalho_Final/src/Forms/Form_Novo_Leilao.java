package Forms;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import edu.fatec.leilao.produto.EnumImoveis;
import edu.fatec.leilao.produto.EnumVeiculo;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JComboBox;

public class Form_Novo_Leilao extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form_Novo_Leilao frame = new Form_Novo_Leilao();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Form_Novo_Leilao() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(266, 165, 109, 20);
		for (EnumVeiculo c : EnumVeiculo.getValues()) {
			comboBox_1.addItem(c);
		}
		contentPane.add(comboBox_1);
		
		JLabel lblLeilesAtuais = new JLabel("Novo Leil\u00E3o");
		lblLeilesAtuais.setBounds(164, 10, 105, 19);
		lblLeilesAtuais.setHorizontalAlignment(SwingConstants.CENTER);
		lblLeilesAtuais.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(lblLeilesAtuais);
		
		JComboBox<EnumImoveis> comboBox = new JComboBox<EnumImoveis>();
		comboBox.setBounds(36, 166, 119, 19);
		for (EnumImoveis c : EnumImoveis.getValues()) {
			comboBox.addItem(c);
		}
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("Im\u00F3vel");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (comboBox.getSelectedIndex() == 1 || comboBox.getSelectedIndex() == 2 || comboBox.getSelectedIndex() == 3 || comboBox.getSelectedIndex() == 4) {
					comboBox_1.setSelectedIndex(0);
				}
				switch(comboBox.getSelectedIndex()) {
					case 1:{ 
						Form_Cadastro_Apartamento c = new Form_Cadastro_Apartamento();
						c.setVisible(true);
						dispose();
						break;
					}
					case 2:{ 
						Form_Cadastro_Terreno c = new Form_Cadastro_Terreno();
						c.setVisible(true);
						dispose();
						break;
					}
					case 3:{ 
						Form_Cadastro_Casa c = new Form_Cadastro_Casa();
						c.setVisible(true);
						dispose();
						break;
					}
					case 4:{ 
						Form_Cadastro_Edificio c = new Form_Cadastro_Edificio();
						c.setVisible(true);
						dispose();
						break;
					}
				}
			}
		});
		btnNewButton.setBounds(36, 101, 119, 51);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Automovel");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (comboBox_1.getSelectedIndex() == 1 || comboBox.getSelectedIndex() == 2) {
					comboBox.setSelectedIndex(0);
				}
				switch(comboBox_1.getSelectedIndex()) {
						case 1:{ 
							Form_Cadastro_Carro c = new Form_Cadastro_Carro();
							c.setVisible(true);
							dispose();
							break;
						}
						case 2:{ 
							Form_Cadastro_Motocicleta c = new Form_Cadastro_Motocicleta();
							c.setVisible(true);
							dispose();
							break;
						}
					}
			}
		});
		btnNewButton_1.setBounds(270, 101, 105, 51);
		contentPane.add(btnNewButton_1);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Controller janela_home = new Controller();
				janela_home.setVisible(true);
				dispose();
			}
		});
		btnVoltar.setBounds(0, 0, 89, 23);
		contentPane.add(btnVoltar);
		
		
		
		
		
	
	}
	
}
