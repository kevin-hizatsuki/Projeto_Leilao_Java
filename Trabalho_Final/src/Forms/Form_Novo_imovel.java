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
import javax.swing.JDialog;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
	private final JButton btnNewButton_1 = new JButton("Cancelar");

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
		setBounds(100, 100, 450, 460);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNovoImvel = new JLabel("Novo: Im\u00F3vel");
		lblNovoImvel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNovoImvel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNovoImvel.setBounds(10, 0, 424, 19);
		contentPane.add(lblNovoImvel);
		
		JLabel lblNewLabel = new JLabel("ID Leil\u00E3o");
		lblNewLabel.setBounds(69, 26, 97, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(119, 23, 262, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblIdImvel = new JLabel("ID Im\u00F3vel");
		lblIdImvel.setBounds(69, 54, 97, 14);
		contentPane.add(lblIdImvel);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(119, 51, 262, 20);
		contentPane.add(textField_1);
		
		JLabel lblArea = new JLabel("Area");
		lblArea.setBounds(91, 79, 97, 14);
		contentPane.add(lblArea);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(119, 79, 262, 20);
		contentPane.add(textField_2);
		
		JLabel lblPreo = new JLabel("Pre\u00E7o");
		lblPreo.setBounds(80, 112, 97, 14);
		contentPane.add(lblPreo);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(119, 109, 262, 20);
		contentPane.add(textField_3);
		
		JLabel lblArea_1 = new JLabel("Area4");
		lblArea_1.setBounds(80, 142, 97, 14);
		contentPane.add(lblArea_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(119, 139, 262, 20);
		contentPane.add(textField_4);
		
		JLabel lblCep = new JLabel("CEP");
		lblCep.setBounds(91, 170, 97, 14);
		contentPane.add(lblCep);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(119, 167, 262, 20);
		contentPane.add(textField_5);
		
		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setBounds(80, 198, 97, 14);
		contentPane.add(lblCidade);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(119, 195, 262, 20);
		contentPane.add(textField_6);
		
		JLabel lblEndereoCompleto = new JLabel("Endere\u00E7o Completo");
		lblEndereoCompleto.setBounds(20, 226, 97, 14);
		contentPane.add(lblEndereoCompleto);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(119, 223, 262, 20);
		contentPane.add(textField_7);
		
		JLabel lblEstado = new JLabel("Estado");
		lblEstado.setBounds(80, 254, 97, 14);
		contentPane.add(lblEstado);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(119, 251, 262, 20);
		contentPane.add(textField_8);
		
		JLabel lblCondominio = new JLabel("Condominio");
		lblCondominio.setBounds(58, 282, 97, 14);
		contentPane.add(lblCondominio);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(119, 279, 262, 20);
		contentPane.add(textField_9);
		
		JLabel lblQtdGaragem = new JLabel("Qtd Garagem");
		lblQtdGaragem.setBounds(47, 311, 97, 14);
		contentPane.add(lblQtdGaragem);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(119, 308, 262, 20);
		contentPane.add(textField_10);
		
		JLabel lblQtdQuartos = new JLabel("Qtd Quartos");
		lblQtdQuartos.setBounds(47, 339, 97, 14);
		contentPane.add(lblQtdQuartos);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(119, 336, 262, 20);
		contentPane.add(textField_11);
		
		JLabel lblQtdBanheiro = new JLabel("Qtd Banheiro");
		lblQtdBanheiro.setBounds(47, 367, 97, 14);
		contentPane.add(lblQtdBanheiro);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(119, 364, 262, 20);
		contentPane.add(textField_12);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDialog cadastrado = new JDialog();
				cadastrado.setVisible(true);
			}
		});
		
		btnNewButton.setBounds(189, 390, 89, 23);
		contentPane.add(btnNewButton);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Controller janela_home = new Controller();
				janela_home.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(335, 389, 89, 25);
		contentPane.add(btnNewButton_1);
	}
}
