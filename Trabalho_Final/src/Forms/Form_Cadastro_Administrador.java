package Forms;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import edu.fatec.leilao.usuario.EnumUsuario;
import edu.fatec.leilao.usuario.Usuario;
import edu.fatec.model.ModelUsuario;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Form_Cadastro_Administrador extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form_Cadastro_Administrador frame = new Form_Cadastro_Administrador();
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
	public Form_Cadastro_Administrador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 217);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastroDeAdministrador = new JLabel("Cadastro de Administrador");
		lblCadastroDeAdministrador.setFont(new Font("Dialog", Font.BOLD, 15));
		lblCadastroDeAdministrador.setBounds(121, 11, 199, 14);
		contentPane.add(lblCadastroDeAdministrador);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setBounds(126, 52, 55, 16);
		contentPane.add(lblLogin);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(126, 79, 55, 16);
		contentPane.add(lblSenha);
		
		textField = new JTextField();
		textField.setBounds(172, 50, 128, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(172, 79, 128, 20);
		contentPane.add(textField_1);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ModelUsuario.adicionarCliente(new Usuario (EnumUsuario.Administrador,textField.getText(),textField_1.getText()));
				Form_Login a = new Form_Login();
				a.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(51, 121, 98, 26);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Form_Login a = new Form_Login();
				a.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(308, 121, 98, 26);
		contentPane.add(btnNewButton_1);
	}
}
