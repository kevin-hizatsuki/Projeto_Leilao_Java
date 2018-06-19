package Forms;

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

public class Form_Novo_imovel extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form_Novo_imovel frame = new Form_Novo_imovel();
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
	public Form_Novo_imovel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 476);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNovoImvel = new JLabel("Novo: Im\u00F3vel");
		lblNovoImvel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNovoImvel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNovoImvel.setBounds(10, 11, 424, 19);
		contentPane.add(lblNovoImvel);
		
		JLabel lblNewLabel = new JLabel("ID Leil\u00E3o");
		lblNewLabel.setBounds(10, 41, 46, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(66, 38, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblIdImvel = new JLabel("ID Im\u00F3vel");
		lblIdImvel.setBounds(10, 69, 46, 14);
		contentPane.add(lblIdImvel);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(66, 66, 86, 20);
		contentPane.add(textField_1);
		
		JLabel lblArea = new JLabel("Area");
		lblArea.setBounds(10, 97, 46, 14);
		contentPane.add(lblArea);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(66, 94, 86, 20);
		contentPane.add(textField_2);
		
		JLabel lblPreo = new JLabel("Pre\u00E7o");
		lblPreo.setBounds(10, 127, 46, 14);
		contentPane.add(lblPreo);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(66, 124, 86, 20);
		contentPane.add(textField_3);
		
		JLabel lblArea_1 = new JLabel("Area4");
		lblArea_1.setBounds(10, 157, 46, 14);
		contentPane.add(lblArea_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(66, 154, 86, 20);
		contentPane.add(textField_4);
		
		JLabel lblCep = new JLabel("CEP");
		lblCep.setBounds(10, 185, 46, 14);
		contentPane.add(lblCep);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(66, 182, 86, 20);
		contentPane.add(textField_5);
		
		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setBounds(10, 213, 46, 14);
		contentPane.add(lblCidade);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(66, 210, 86, 20);
		contentPane.add(textField_6);
		
		JLabel lblEndereoCompleto = new JLabel("Endere\u00E7o Completo");
		lblEndereoCompleto.setBounds(10, 241, 46, 14);
		contentPane.add(lblEndereoCompleto);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(66, 238, 86, 20);
		contentPane.add(textField_7);
		
		JLabel lblEstado = new JLabel("Estado");
		lblEstado.setBounds(10, 269, 46, 14);
		contentPane.add(lblEstado);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(66, 266, 86, 20);
		contentPane.add(textField_8);
		
		JLabel lblCondominio = new JLabel("Condominio");
		lblCondominio.setBounds(10, 297, 46, 14);
		contentPane.add(lblCondominio);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(66, 294, 86, 20);
		contentPane.add(textField_9);
		
		JLabel lblQtdGaragem = new JLabel("Qtd Garagem");
		lblQtdGaragem.setBounds(10, 326, 46, 14);
		contentPane.add(lblQtdGaragem);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(66, 323, 86, 20);
		contentPane.add(textField_10);
		
		JLabel lblQtdQuartos = new JLabel("Qtd Quartos");
		lblQtdQuartos.setBounds(10, 354, 46, 14);
		contentPane.add(lblQtdQuartos);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(66, 351, 86, 20);
		contentPane.add(textField_11);
		
		JLabel lblQtdBanheiro = new JLabel("Qtd Banheiro");
		lblQtdBanheiro.setBounds(10, 382, 46, 14);
		contentPane.add(lblQtdBanheiro);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(66, 379, 86, 20);
		contentPane.add(textField_12);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.setBounds(181, 403, 89, 23);
		contentPane.add(btnNewButton);
	}
}
