package Forms;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import edu.fatec.leilao.Endereco;
import edu.fatec.leilao.Leiloes;
import edu.fatec.leilao.banco.InstituicaoFinanceira;
import edu.fatec.model.ModelLeilao;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.awt.event.ActionEvent;

public class Form_Cadastro_Leilao extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form_Cadastro_Leilao frame = new Form_Cadastro_Leilao();
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
	public Form_Cadastro_Leilao() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 460);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastroDeLeilao = new JLabel("Cadastro de Leilao");
		lblCadastroDeLeilao.setBounds(160, 11, 126, 14);
		contentPane.add(lblCadastroDeLeilao);
		
		JLabel lblId = new JLabel("Id");
		lblId.setBounds(112, 39, 19, 14);
		contentPane.add(lblId);
		
		textField = new JTextField();
		textField.setBounds(141, 36, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(101, 70, 27, 14);
		contentPane.add(lblNome);
		
		textField_1 = new JTextField();
		textField_1.setBounds(141, 67, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblDataDeInicio = new JLabel("Data de Inicio");
		lblDataDeInicio.setBounds(71, 307, 66, 14);
		contentPane.add(lblDataDeInicio);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setBounds(147, 305, 86, 17);
		contentPane.add(formattedTextField);
		
		JLabel lblDataFim = new JLabel("Data Fim");
		lblDataFim.setBounds(91, 335, 46, 14);
		contentPane.add(lblDataFim);
		
		JFormattedTextField formattedTextField_1 = new JFormattedTextField();
		formattedTextField_1.setBounds(147, 333, 86, 17);
		contentPane.add(formattedTextField_1);
		
		JLabel lblEnderecoCompleto = new JLabel("Endereco Completo");
		lblEnderecoCompleto.setBounds(31, 98, 93, 14);
		contentPane.add(lblEnderecoCompleto);
		
		textField_2 = new JTextField();
		textField_2.setBounds(141, 95, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setBounds(101, 126, 46, 14);
		contentPane.add(lblCidade);
		
		textField_4 = new JTextField();
		textField_4.setBounds(141, 123, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblEstado = new JLabel("Estado");
		lblEstado.setBounds(93, 155, 38, 14);
		contentPane.add(lblEstado);
		
		textField_5 = new JTextField();
		textField_5.setBounds(141, 152, 86, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("CEP");
		lblNewLabel.setBounds(104, 180, 27, 14);
		contentPane.add(lblNewLabel);
		
		textField_6 = new JTextField();
		textField_6.setBounds(141, 183, 86, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ModelLeilao c = new ModelLeilao();
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				
				c.AdicionarLeilao(
				new Leiloes(Integer.valueOf(textField.getText()),textField_1.getText(),
				new Endereco(textField_2.getText(),textField_4.getText(),textField_5.getText(),textField_6.getText()),
				new InstituicaoFinanceira(textField_9.getText(), textField_8.getText(), textField_7.getText()),LocalDate.parse(formattedTextField.getText(), formatter), LocalDate.parse(formattedTextField_1.getText(), formatter)));
			
				ModelLeilao.listarTodosLeilao();
			}
		});
		btnCadastrar.setBounds(31, 392, 89, 23);
		contentPane.add(btnCadastrar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Form_Login c = new Form_Login();
				c.setVisible(true);
				dispose();
			}
		});
		btnCancelar.setBounds(271, 392, 89, 23);
		contentPane.add(btnCancelar);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(139, 273, 89, 20);
		contentPane.add(textField_7);
		
		JLabel label = new JLabel("Raz\u00E3o Social");
		label.setBounds(71, 277, 60, 16);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Site");
		label_1.setBounds(104, 245, 27, 16);
		contentPane.add(label_1);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(139, 246, 89, 20);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(139, 219, 89, 20);
		contentPane.add(textField_9);
		
		JLabel label_2 = new JLabel("CNPJ");
		label_2.setBounds(100, 218, 31, 16);
		contentPane.add(label_2);
	}
}
