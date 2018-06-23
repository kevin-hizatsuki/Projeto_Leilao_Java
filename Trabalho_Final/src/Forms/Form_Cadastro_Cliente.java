package Forms;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import edu.fatec.leilao.usuario.Cliente;
import edu.fatec.model.ModelCliente;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Form_Cadastro_Cliente extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form_Cadastro_Cliente frame = new Form_Cadastro_Cliente();
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
	public Form_Cadastro_Cliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 362, 255);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFaaSeuCadastro = new JLabel("Fa\u00E7a seu cadastro aqui!");
		lblFaaSeuCadastro.setHorizontalAlignment(SwingConstants.CENTER);
		lblFaaSeuCadastro.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblFaaSeuCadastro.setBounds(-31, 0, 424, 19);
		contentPane.add(lblFaaSeuCadastro);
		
		JLabel lblNewLabel = new JLabel("Nome Completo");
		lblNewLabel.setBounds(10, 54, 92, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(105, 51, 195, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblUsurio = new JLabel("CPF");
		lblUsurio.setBounds(80, 82, 22, 14);
		contentPane.add(lblUsurio);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(105, 79, 195, 20);
		contentPane.add(textField_1);
		
		JLabel lblUsurio_1 = new JLabel("Usu\u00E1rio");
		lblUsurio_1.setBounds(58, 110, 44, 14);
		contentPane.add(lblUsurio_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(105, 107, 195, 20);
		contentPane.add(textField_2);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(66, 136, 36, 14);
		contentPane.add(lblSenha);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(105, 135, 195, 20);
		contentPane.add(textField_3);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Ver o porque o cadastro nao consegue fazer o login!!
				ModelCliente.adicionarCliente(new Cliente(textField_1.getText(),textField.getText(),textField_2.getText(),textField_3.getText()));
				dispose();
				Form_Login a = new Form_Login();
				a.setVisible(true);
			}
		});
		btnNewButton.setBounds(10, 185, 92, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
				Form_Login c = new Form_Login();
				c.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(250, 185, 89, 23);
		contentPane.add(btnNewButton_1);
	}

}
