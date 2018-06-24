package Forms;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Form_Cadastro_Instituicao_Financeira extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form_Cadastro_Instituicao_Financeira frame = new Form_Cadastro_Instituicao_Financeira();
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
	public Form_Cadastro_Instituicao_Financeira() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cadastro Instituicao Financeira");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(91, 0, 248, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Form_Tela_CadastroGeral c = new Form_Tela_CadastroGeral();
				c.setVisible(true);
				dispose();
			}
		});
		btnVoltar.setBounds(0, -2, 89, 23);
		contentPane.add(btnVoltar);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(48, 180, 111, 23);
		contentPane.add(btnCadastrar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				Form_Tela_CadastroGeral c = new Form_Tela_CadastroGeral();
				c.setVisible(true);
				dispose();
				
				
			}
		});
		btnCancelar.setBounds(287, 178, 98, 26);
		contentPane.add(btnCancelar);
		
		JLabel lblCnpj = new JLabel("CNPJ");
		lblCnpj.setBounds(152, 37, 31, 16);
		contentPane.add(lblCnpj);
		
		textField = new JTextField();
		textField.setBounds(193, 37, 114, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblSite = new JLabel("Site");
		lblSite.setBounds(156, 64, 27, 16);
		contentPane.add(lblSite);
		
		textField_1 = new JTextField();
		textField_1.setBounds(193, 64, 114, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblRazoSocial = new JLabel("Raz\u00E3o Social");
		lblRazoSocial.setBounds(110, 91, 73, 16);
		contentPane.add(lblRazoSocial);
		
		textField_2 = new JTextField();
		textField_2.setBounds(193, 91, 114, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
	}
}
