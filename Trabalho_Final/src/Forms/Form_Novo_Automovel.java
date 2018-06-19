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

public class Form_Novo_Automovel extends JFrame {

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
					Form_Novo_Automovel frame = new Form_Novo_Automovel();
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
	public Form_Novo_Automovel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 573);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Novo: Im\u00F3vel");
		label.setBounds(5, 5, 424, 19);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("ID Leil\u00E3o");
		label_1.setBounds(15, 38, 46, 14);
		contentPane.add(label_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(71, 35, 86, 20);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(71, 376, 86, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(71, 63, 86, 20);
		contentPane.add(textField_2);
		
		JLabel label_2 = new JLabel("ID Im\u00F3vel");
		label_2.setBounds(15, 66, 46, 14);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("Area");
		label_3.setBounds(15, 94, 46, 14);
		contentPane.add(label_3);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(71, 91, 86, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(71, 121, 86, 20);
		contentPane.add(textField_4);
		
		JLabel label_4 = new JLabel("Pre\u00E7o");
		label_4.setBounds(15, 124, 46, 14);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("Area4");
		label_5.setBounds(15, 154, 46, 14);
		contentPane.add(label_5);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(71, 151, 86, 20);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(71, 179, 86, 20);
		contentPane.add(textField_6);
		
		JLabel label_6 = new JLabel("CEP");
		label_6.setBounds(15, 182, 46, 14);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("Cidade");
		label_7.setBounds(15, 210, 46, 14);
		contentPane.add(label_7);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(71, 207, 86, 20);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(71, 235, 86, 20);
		contentPane.add(textField_8);
		
		JLabel label_8 = new JLabel("Endere\u00E7o Completo");
		label_8.setBounds(15, 238, 46, 14);
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel("Estado");
		label_9.setBounds(15, 266, 46, 14);
		contentPane.add(label_9);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(71, 263, 86, 20);
		contentPane.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(71, 291, 86, 20);
		contentPane.add(textField_10);
		
		JLabel label_10 = new JLabel("Condominio");
		label_10.setBounds(15, 294, 46, 14);
		contentPane.add(label_10);
		
		JLabel label_11 = new JLabel("Qtd Garagem");
		label_11.setBounds(15, 323, 46, 14);
		contentPane.add(label_11);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(71, 320, 86, 20);
		contentPane.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(71, 348, 86, 20);
		contentPane.add(textField_12);
		
		JLabel label_12 = new JLabel("Qtd Quartos");
		label_12.setBounds(15, 351, 46, 14);
		contentPane.add(label_12);
		
		JLabel label_13 = new JLabel("Qtd Banheiro");
		label_13.setBounds(15, 379, 46, 14);
		contentPane.add(label_13);
		
		JButton button = new JButton("Cadastrar");
		button.setBounds(186, 400, 89, 23);
		contentPane.add(button);
	}
}
