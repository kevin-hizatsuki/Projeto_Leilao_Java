package Forms;
/*
 * 
 * 
 * 
 * POSSIVELMENTE ESTA TELA SERA DELETADA
 * ELA FOI MIGRADA PARA FORM_PESQUISA_CADASTRO
 * 
 * 
 * 
 * 
 * */
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JComboBox;
import edu.fatec.leilao.produto.EnumImoveis;
import edu.fatec.leilao.produto.EnumVeiculo;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Form_Deleta_CadastroGeral extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form_Deleta_CadastroGeral frame = new Form_Deleta_CadastroGeral();
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
	public Form_Deleta_CadastroGeral() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 431);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("Leil\u00E3o");
		button.setBounds(49, 49, 116, 51);
		contentPane.add(button);
		
		JComboBox<EnumImoveis> comboBox = new JComboBox<EnumImoveis>();
		comboBox.setBounds(180, 189, 119, 19);
		for (EnumImoveis c : EnumImoveis.getValues()) {
			comboBox.addItem(c);
		}
		contentPane.add(comboBox);
		
		JLabel lblSelecioneUmaDas = new JLabel("Selecione uma das op\u00E7\u00F5es acima!!");
		lblSelecioneUmaDas.setForeground(Color.RED);
		lblSelecioneUmaDas.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelecioneUmaDas.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSelecioneUmaDas.setBounds(123, 362, 207, 19);
		contentPane.add(lblSelecioneUmaDas);
		lblSelecioneUmaDas.setVisible(false);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(177, 128, 119, 20);
		for (EnumVeiculo c : EnumVeiculo.getValues()) {
			comboBox_1.addItem(c);
		}
		contentPane.add(comboBox_1);
		
		JButton button_1 = new JButton("Automovel");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (comboBox_1.getSelectedIndex() == 1 || comboBox_1.getSelectedIndex() == 2) {
					comboBox.setSelectedIndex(0);
				switch(comboBox_1.getSelectedIndex()) {
						case 1:{ 
//							Form_Cadastro_Carro c = new Form_Cadastro_Carro();
//							c.setVisible(true);
							dispose();
							break;
						}
						case 2:{ 
//							Form_Cadastro_Motocicleta c = new Form_Cadastro_Motocicleta();
//							c.setVisible(true);
							dispose();
							break;
						}
					}
				}else {
					lblSelecioneUmaDas.setVisible(true);
				}
				
			}
		});
		button_1.setBounds(49, 113, 116, 51);
		contentPane.add(button_1);
		
		
		
		
		
	
		
		JButton button_2 = new JButton("Im\u00F3vel");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (comboBox.getSelectedIndex() == 1 || comboBox.getSelectedIndex() == 2 || comboBox.getSelectedIndex() == 3 || comboBox.getSelectedIndex() == 4) {
					comboBox_1.setSelectedIndex(0);
					lblSelecioneUmaDas.setVisible(false);
					switch(comboBox.getSelectedIndex()) {
						case 1:{ 
//							Form_Cadastro_Apartamento c = new Form_Cadastro_Apartamento();
//							c.setVisible(true);
							dispose();
							break;
						}
						case 2:{ 
//							Form_Cadastro_Terreno c = new Form_Cadastro_Terreno();
//							c.setVisible(true);
							dispose();
							break;
						}
						case 3:{ 
//							Form_Cadastro_Casa c = new Form_Cadastro_Casa();
//							c.setVisible(true);
							dispose();
							break;
						}
						case 4:{ 
//							Form_Cadastro_Edificio c = new Form_Cadastro_Edificio();
//							c.setVisible(true);
							dispose();
							break;
						}
					}
				}else {
					lblSelecioneUmaDas.setVisible(true);
				}
			}
		});
		button_2.setBounds(49, 173, 119, 51);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("Cliente");
		button_3.setBounds(49, 236, 119, 51);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("Institui\u00E7\u00E3o Financeira");
		button_4.setBounds(49, 299, 161, 51);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("Voltar");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Controller janela_home = new Controller();
				janela_home.setVisible(true);
				dispose();
			}
		});
		button_5.setBounds(0, 0, 89, 23);
		contentPane.add(button_5);
		
		JLabel lblTelaDeDeleo = new JLabel("Tela de Dele\u00E7\u00E3o de Cadastro");
		lblTelaDeDeleo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTelaDeDeleo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTelaDeDeleo.setBounds(99, 1, 219, 19);
		contentPane.add(lblTelaDeDeleo);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Form_Tela_CadastroGeral c = new Form_Tela_CadastroGeral();
				c.setVisible(true);
				dispose();
			}
		});
		btnCadastrar.setBounds(336, 0, 98, 26);
		contentPane.add(btnCadastrar);
		
		JButton button_7 = new JButton("Pesquisar");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Form_Pesquisa_CadastroGeral c = new Form_Pesquisa_CadastroGeral();
				c.setVisible(true);
				dispose();
			}
		});
		button_7.setBounds(336, 33, 98, 26);
		contentPane.add(button_7);
		
	}
}
