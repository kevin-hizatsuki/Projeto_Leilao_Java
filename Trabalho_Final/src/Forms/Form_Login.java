package Forms;
import edu.fatec.model.ModelCliente;
import edu.fatec.leilao.usuario.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Form_Login extends JFrame {

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
					Form_Login frame = new Form_Login();
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
	public Form_Login() {
		
		
		ModelCliente.adicionarCliente(new Cliente("361-306-068-48","Lucas Domingos Leão Gomes","lucasdlg","123"));
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel(" Bem-Vindo ao Sistema de Leil\u00F5es Eletr\u00F4nicos (SLE) ");
		label.setBounds(5, 5, 424, 19);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setBounds(158, 66, 151, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Usu\u00E1rio");
		lblNewLabel.setBounds(117, 69, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(105, 98, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(158, 97, 151, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(textField.getText());
				System.out.println(textField_1.getText());
				System.out.println(ModelCliente.ifClientExists(textField.getText(), textField_1.getText())+"\n");
				if (ModelCliente.ifClientExists(textField.getText(), textField_1.getText())) {
					dispose();
					Controller a = new Controller();
					a.setVisible(true);
				}
			}
		});
		btnNewButton.setBounds(74, 142, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnCriarConta = new JButton("Criar Conta");
		btnCriarConta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Form_Cadastro_Cliente a = new Form_Cadastro_Cliente();
				a.setVisible(true);
				dispose();
			}
		});
		btnCriarConta.setBounds(246, 142, 89, 23);
		contentPane.add(btnCriarConta);
	}
}
