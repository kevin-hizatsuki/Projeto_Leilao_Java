package Forms;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import edu.fatec.leilao.produto.EnumImoveis;
import edu.fatec.leilao.produto.EnumVeiculo;
import edu.fatec.model.ModelInstituicaoFinanceira;

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
import java.awt.Color;

public class Form_Tela_CadastroGeral extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form_Tela_CadastroGeral frame = new Form_Tela_CadastroGeral();
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
	public Form_Tela_CadastroGeral() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 435);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ModelInstituicaoFinanceira.ListarTodos();
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(183, 134, 119, 20);
		for (EnumVeiculo c : EnumVeiculo.values()) {
			comboBox_1.addItem(c);
		}
		contentPane.add(comboBox_1);
		
		JLabel lblMessageSelect = new JLabel("Selecione uma op\u00E7\u00E3o acima");
		lblMessageSelect.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMessageSelect.setForeground(Color.RED);
		lblMessageSelect.setBounds(124, 369, 190, 15);
		contentPane.add(lblMessageSelect);
		lblMessageSelect.setVisible(false);
		
		JLabel lblLeilesAtuais = new JLabel("Tela de Cadastros Gerais");
		lblLeilesAtuais.setBounds(107, 15, 195, 19);
		lblLeilesAtuais.setHorizontalAlignment(SwingConstants.CENTER);
		lblLeilesAtuais.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(lblLeilesAtuais);
		
		JComboBox<EnumImoveis> comboBox = new JComboBox<EnumImoveis>();
		comboBox.setBounds(183, 196, 119, 19);
		for (EnumImoveis c : EnumImoveis.values()) {
			comboBox.addItem(c);
		}
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("Im\u00F3vel");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (comboBox.getSelectedIndex() == 1 || comboBox.getSelectedIndex() == 2 || comboBox.getSelectedIndex() == 3 || comboBox.getSelectedIndex() == 4) {
					comboBox_1.setSelectedIndex(0);
					lblMessageSelect.setVisible(false);
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
				}else {
					lblMessageSelect.setVisible(true);
				}
			}
		});
		btnNewButton.setBounds(52, 180, 119, 51);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Automovel");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (comboBox_1.getSelectedIndex() == 1 || comboBox.getSelectedIndex() == 2) {
					comboBox.setSelectedIndex(0);
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
				}else {
					lblMessageSelect.setVisible(true);
				}
			}
		});
		btnNewButton_1.setBounds(55, 119, 116, 51);
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
		
		JButton btnNewButton_2 = new JButton("Cliente");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Form_Cadastro_Cliente c = new Form_Cadastro_Cliente();
				c.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setBounds(55, 243, 119, 51);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Institui\u00E7\u00E3o Financeira");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Form_Cadastro_Instituicao_Financeira c = new Form_Cadastro_Instituicao_Financeira();
				c.setVisible(true);
				dispose();
			}
		});
		btnNewButton_3.setBounds(55, 306, 161, 51);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Leil\u00E3o");
		btnNewButton_4.setBounds(55, 56, 116, 51);
		contentPane.add(btnNewButton_4);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Form_Pesquisa_CadastroGeral c = new Form_Pesquisa_CadastroGeral();
				c.setVisible(true);
				dispose();
			}
		});
		btnPesquisar.setBounds(324, 12, 98, 26);
		contentPane.add(btnPesquisar);
		
		
		
		
		
		
		
	
	}
}
