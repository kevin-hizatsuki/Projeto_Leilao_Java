package Forms;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Form_Cadastro_Edificio extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form_Cadastro_Edificio frame = new Form_Cadastro_Edificio();
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
	public Form_Cadastro_Edificio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 430);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton button = new JButton("Cadastrar");
		button.setBounds(216, 357, 91, 23);
		
		
		
		
		JLabel lblCadastroDeEdificios = new JLabel("Cadastro de Edificios Comerciais");
		lblCadastroDeEdificios.setBounds(98, 5, 281, 21);
		lblCadastroDeEdificios.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastroDeEdificios.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel label_1 = new JLabel("ID Leil\u00E3o");
		label_1.setBounds(69, 57, 58, 14);
		
		textField = new JTextField();
		textField.setBounds(129, 51, 86, 20);
		textField.setColumns(10);
		
		JLabel label_2 = new JLabel("CEP");
		label_2.setBounds(93, 291, 34, 14);
		
		JLabel label_3 = new JLabel("Estado");
		label_3.setBounds(79, 264, 48, 14);
		
		JLabel label_4 = new JLabel("Cidade");
		label_4.setBounds(79, 238, 48, 14);
		
		JLabel label_5 = new JLabel("Rua");
		label_5.setBounds(98, 212, 29, 14);
		
		JLabel label_7 = new JLabel("Pre\u00E7o");
		label_7.setBounds(85, 135, 42, 14);
		
		JLabel label_8 = new JLabel("Tipo");
		label_8.setBounds(92, 109, 35, 14);
		
		JLabel label_9 = new JLabel("ID Produto");
		label_9.setBounds(60, 83, 67, 14);
		
		textField_1 = new JTextField();
		textField_1.setBounds(129, 77, 86, 20);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(129, 103, 86, 20);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(129, 129, 86, 20);
		textField_3.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(129, 206, 86, 20);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(129, 232, 86, 20);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(129, 258, 86, 20);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(129, 285, 86, 20);
		textField_8.setColumns(10);
		
		JLabel label = new JLabel("Area");
		label.setBounds(94, 158, 33, 14);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(129, 152, 29, 20);
		
		JLabel label_6 = new JLabel("M\u00B2");
		label_6.setBounds(170, 158, 19, 14);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(129, 178, 29, 20);
		
		JLabel label_10 = new JLabel("Condominio");
		label_10.setBounds(52, 184, 75, 14);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setBounds(129, 338, 29, 20);
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setBounds(129, 313, 29, 20);
		contentPane.add(spinner_3);
		
		JButton button_1 = new JButton("Cancelar");
		button_1.setBounds(317, 357, 91, 23);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
				textField_5.setText(null);
				textField_6.setText(null);
				textField_7.setText(null);
				textField_8.setText(null);
				spinner.setValue(0);
				spinner_1.setValue(0);
				spinner_2.setValue(0);
				spinner_3.setValue(0);
				Form_Tela_CadastroGeral c = new Form_Tela_CadastroGeral();
				c.setVisible(true);
				dispose();				
			}
		});
		
		JLabel lblSala = new JLabel("Sala");
		lblSala.setBounds(93, 344, 34, 14);
		
		
		contentPane.setLayout(null);
		contentPane.add(button);
		contentPane.add(lblCadastroDeEdificios);
		contentPane.add(label_1);
		contentPane.add(textField);
		contentPane.add(label_2);
		contentPane.add(label_3);
		contentPane.add(label_4);
		contentPane.add(label_5);
		contentPane.add(label_7);
		contentPane.add(label_8);
		contentPane.add(label_9);
		contentPane.add(textField_1);
		contentPane.add(textField_2);
		contentPane.add(textField_3);
		contentPane.add(textField_5);
		contentPane.add(textField_6);
		contentPane.add(textField_7);
		contentPane.add(textField_8);
		contentPane.add(label);
		contentPane.add(spinner);
		contentPane.add(label_6);
		contentPane.add(spinner_1);
		contentPane.add(label_10);
		contentPane.add(button_1);
		contentPane.add(lblSala);
		contentPane.add(spinner_2);
		
		JLabel lblAndar = new JLabel("Andar");
		lblAndar.setBounds(90, 319, 37, 14);
		contentPane.add(lblAndar);
		
		
	}

}
