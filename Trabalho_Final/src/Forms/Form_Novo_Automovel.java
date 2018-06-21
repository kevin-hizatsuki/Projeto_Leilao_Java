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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		setBounds(100, 100, 417, 477);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Novo: Im\u00F3vel");
		label.setBounds(10, 0, 424, 19);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(label);
		
		JButton button_1 = new JButton("Cancelar");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Controller janela_home = new Controller();
				janela_home.setVisible(true);
				dispose();
			}
		});
		button_1.setBounds(302, 403, 89, 25);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("Cadastrar");
		button_2.setBounds(114, 404, 89, 23);
		contentPane.add(button_2);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(104, 372, 262, 20);
		contentPane.add(textField);
		
		JLabel label_1 = new JLabel("Qtd Banheiro");
		label_1.setBounds(32, 375, 97, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("Qtd Quartos");
		label_2.setBounds(32, 347, 97, 14);
		contentPane.add(label_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(104, 344, 262, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(104, 316, 262, 20);
		contentPane.add(textField_2);
		
		JLabel label_3 = new JLabel("Qtd Garagem");
		label_3.setBounds(32, 319, 97, 14);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("Condominio");
		label_4.setBounds(43, 290, 97, 14);
		contentPane.add(label_4);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(104, 287, 262, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(104, 259, 262, 20);
		contentPane.add(textField_4);
		
		JLabel label_5 = new JLabel("Estado");
		label_5.setBounds(65, 262, 97, 14);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("Endere\u00E7o Completo");
		label_6.setBounds(5, 234, 97, 14);
		contentPane.add(label_6);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(104, 231, 262, 20);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(104, 203, 262, 20);
		contentPane.add(textField_6);
		
		JLabel label_7 = new JLabel("Cidade");
		label_7.setBounds(65, 206, 97, 14);
		contentPane.add(label_7);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(104, 175, 262, 20);
		contentPane.add(textField_7);
		
		JLabel label_8 = new JLabel("CEP");
		label_8.setBounds(76, 178, 97, 14);
		contentPane.add(label_8);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(104, 147, 262, 20);
		contentPane.add(textField_8);
		
		JLabel label_9 = new JLabel("Area4");
		label_9.setBounds(65, 150, 97, 14);
		contentPane.add(label_9);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(104, 117, 262, 20);
		contentPane.add(textField_9);
		
		JLabel label_10 = new JLabel("Pre\u00E7o");
		label_10.setBounds(65, 120, 97, 14);
		contentPane.add(label_10);
		
		JLabel label_11 = new JLabel("Area");
		label_11.setBounds(76, 87, 97, 14);
		contentPane.add(label_11);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(104, 87, 262, 20);
		contentPane.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setEditable(false);
		textField_11.setEnabled(false);
		textField_11.setColumns(10);
		textField_11.setBounds(104, 59, 262, 20);
		contentPane.add(textField_11);
		
		JLabel label_12 = new JLabel("ID Im\u00F3vel");
		label_12.setBounds(54, 62, 97, 14);
		contentPane.add(label_12);
		
		textField_12 = new JTextField();
		textField_12.setEditable(false);
		textField_12.setColumns(10);
		textField_12.setBounds(104, 31, 262, 20);
		contentPane.add(textField_12);
		
		JLabel label_13 = new JLabel("ID Leil\u00E3o");
		label_13.setBounds(54, 34, 97, 14);
		contentPane.add(label_13);
		
		//Capturando valores do formulario
//		String
	}
}
