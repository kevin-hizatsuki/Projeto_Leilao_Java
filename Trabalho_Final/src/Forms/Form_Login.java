package Forms;
import edu.fatec.model.ModelCliente;
import edu.fatec.model.ModelLeilao;
import edu.fatec.leilao.Main;
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
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Form_Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

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
		lblNewLabel.setBounds(105, 69, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Senha");
		lblNewLabel_1.setBounds(115, 98, 36, 14);
		contentPane.add(lblNewLabel_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(158, 95, 151, 20);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (ModelCliente.ifClientExists(textField.getText(), String.valueOf(passwordField.getPassword()))) {
					dispose();
					Controller a = new Controller();
				Main.setIdUsuarioLogado(textField.getText());
					a.setVisible(true);
				}
			}
		});
		btnNewButton.setBounds(191, 132, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnCriarConta = new JButton("Criar Conta");
		btnCriarConta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Form_Cadastro_Cliente a = new Form_Cadastro_Cliente();
				a.setVisible(true);
				dispose();
			}
		});
		btnCriarConta.setBounds(324, 225, 105, 23);
		contentPane.add(btnCriarConta);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					ModelLeilao.gerarArquivo(ModelLeilao.getLisLeiloes());
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					System.out.println("Deu problema kkk");
					e1.printStackTrace();
				}
			}
		});
		btnSair.setBounds(30, 223, 98, 26);
		contentPane.add(btnSair);
		
	
	}
}
