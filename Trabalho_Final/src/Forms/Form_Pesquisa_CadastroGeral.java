package Forms;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JComboBox;
import edu.fatec.leilao.produto.EnumImoveis;
import edu.fatec.leilao.produto.EnumVeiculo;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Form_Pesquisa_CadastroGeral extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form_Pesquisa_CadastroGeral frame = new Form_Pesquisa_CadastroGeral();
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
	public Form_Pesquisa_CadastroGeral() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 442);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Selecione uma das op\u00E7\u00F5es acima!!");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.RED);
		label.setFont(new Font("Tahoma", Font.BOLD, 12));
		label.setBounds(123, 362, 207, 19);
		contentPane.add(label);
		label.setVisible(false);
		
		JButton button = new JButton("Institui\u00E7\u00E3o Financeira");
		button.setBounds(142, 299, 161, 51);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Cliente");
		button_1.setBounds(157, 236, 119, 51);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("Im\u00F3vel");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					}
		});
		button_2.setBounds(157, 173, 119, 51);
		contentPane.add(button_2);

		
		JButton button_3 = new JButton("Automovel");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				}
		});
		button_3.setBounds(157, 113, 116, 51);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("Leil\u00E3o");
		button_4.setBounds(157, 49, 116, 51);
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
		
		JLabel lblTelaDePesquisa = new JLabel("Tela de Pesquisa de Cadastro");
		lblTelaDePesquisa.setHorizontalAlignment(SwingConstants.CENTER);
		lblTelaDePesquisa.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTelaDePesquisa.setBounds(99, 1, 219, 19);
		contentPane.add(lblTelaDePesquisa);
		
		JButton button_6 = new JButton("Cadastrar");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Form_Tela_CadastroGeral c = new Form_Tela_CadastroGeral();
				c.setVisible(true);
				dispose();
			}
		});
		button_6.setBounds(336, 0, 98, 26);
		contentPane.add(button_6);
		
		JButton btnDeletar = new JButton("Deletar");
		btnDeletar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Form_Deleta_CadastroGeral c = new Form_Deleta_CadastroGeral();
				c.setVisible(true);
				dispose();
			}
		});
		btnDeletar.setBounds(336, 33, 98, 26);
		contentPane.add(btnDeletar);
	}

}
