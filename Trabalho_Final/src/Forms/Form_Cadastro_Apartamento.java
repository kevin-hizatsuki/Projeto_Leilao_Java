package Forms;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import edu.fatec.leilao.Endereco;
import edu.fatec.leilao.produto.Apartamento;
import edu.fatec.model.ModelProduto;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Form_Cadastro_Apartamento extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form_Cadastro_Apartamento frame = new Form_Cadastro_Apartamento();
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
	public Form_Cadastro_Apartamento() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 451);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("ID Leil\u00E3o");
		label.setBounds(33, 41, 52, 14);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setBounds(92, 35, 86, 20);
		textField.setColumns(10);
		contentPane.add(textField);
		
		JLabel label_1 = new JLabel("ID Produto");
		label_1.setBounds(22, 67, 63, 14);
		contentPane.add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(92, 61, 86, 20);
		textField_1.setColumns(10);
		contentPane.add(textField_1);
		
		JLabel label_2 = new JLabel("Tipo");
		label_2.setBounds(58, 93, 27, 14);
		contentPane.add(label_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(92, 87, 86, 20);
		textField_2.setColumns(10);
		contentPane.add(textField_2);
		
		JLabel label_3 = new JLabel("Pre\u00E7o");
		label_3.setBounds(46, 119, 39, 14);
		contentPane.add(label_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(92, 113, 86, 20);
		textField_3.setColumns(10);
		contentPane.add(textField_3);
		
		JLabel label_4 = new JLabel("Area");
		label_4.setBounds(58, 145, 27, 14);
		contentPane.add(label_4);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(92, 139, 29, 20);
		contentPane.add(spinner);
		
		JLabel label_5 = new JLabel("M\u00B2");
		label_5.setBounds(129, 142, 21, 14);
		contentPane.add(label_5);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(92, 165, 29, 20);
		contentPane.add(spinner_1);
		
		JLabel label_6 = new JLabel("Condominio");
		label_6.setBounds(18, 171, 67, 14);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("Rua");
		label_7.setBounds(58, 199, 27, 14);
		contentPane.add(label_7);
		
		textField_4 = new JTextField();
		textField_4.setBounds(92, 193, 86, 20);
		textField_4.setColumns(10);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setBounds(92, 219, 86, 20);
		textField_5.setColumns(10);
		contentPane.add(textField_5);
		
		JLabel label_8 = new JLabel("Cidade");
		label_8.setBounds(46, 225, 39, 14);
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel("Estado");
		label_9.setBounds(46, 251, 39, 14);
		contentPane.add(label_9);
		
		textField_6 = new JTextField();
		textField_6.setBounds(92, 245, 86, 20);
		textField_6.setColumns(10);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setBounds(92, 271, 86, 20);
		textField_7.setColumns(10);
		contentPane.add(textField_7);
		
		JLabel label_10 = new JLabel("CEP");
		label_10.setBounds(58, 277, 27, 14);
		contentPane.add(label_10);
		
		JLabel lblAndar = new JLabel("Andar");
		lblAndar.setBounds(50, 308, 35, 14);
		contentPane.add(lblAndar);
		
		JLabel lblGaragem = new JLabel("Garagem");
		lblGaragem.setBounds(33, 340, 52, 14);
		contentPane.add(lblGaragem);
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setBounds(92, 334, 29, 20);
		contentPane.add(spinner_3);
		
		JLabel lblQuarto = new JLabel("Quarto");
		lblQuarto.setBounds(33, 361, 52, 14);
		contentPane.add(lblQuarto);
		
		JSpinner spinner_4 = new JSpinner();
		spinner_4.setBounds(92, 355, 29, 20);
		contentPane.add(spinner_4);
		
		JLabel lblBanheiro = new JLabel("Banheiro");
		lblBanheiro.setBounds(33, 386, 52, 14);
		contentPane.add(lblBanheiro);
		
		JSpinner spinner_5 = new JSpinner();
		spinner_5.setBounds(92, 380, 29, 20);
		contentPane.add(spinner_5);
		
		JButton button = new JButton("Cadastrar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ModelProduto.AdicionarProduto(
						new Apartamento(
								Integer.valueOf(textField.getText()), 
								Integer.valueOf(textField_1.getText()),
								(double) spinner.getValue(), 
								new Endereco(
										textField_4.getText(),
										textField_5.getText(),
										textField_6.getText(),
										textField_7.getText()), 
								Double.valueOf(textField_3.getText()), 
								(double)spinner_1.getValue(), 
								textField_2.getText(), 
								(int)spinner.getValue(), 
								(int)spinner_3.getValue(), 
								(int)spinner_4.getValue(),  
								(int)spinner_5.getValue()));
			}
		});
		button.setBounds(210, 342, 91, 23);
		contentPane.add(button);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setBounds(92, 302, 29, 20);
		contentPane.add(spinner_2);
		
		JButton button_1 = new JButton("Cancelar");
		button_1.setBounds(317, 342, 86, 23);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
				textField_5.setText(null);
				textField_6.setText(null);
				textField_7.setText(null);
				textField_4.setText(null);
				spinner.setValue(0);
				spinner_1.setValue(0);
				spinner_2.setValue(0);
				Form_Tela_CadastroGeral c = new Form_Tela_CadastroGeral();
				c.setVisible(true);
				dispose();	
			}
		});
		contentPane.add(button_1);
		
		JLabel lblCadastroDeApartamento = new JLabel("Cadastro de Apartamento");
		lblCadastroDeApartamento.setBounds(93, 0, 281, 21);
		lblCadastroDeApartamento.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastroDeApartamento.setFont(new Font("Tahoma", Font.BOLD, 13));
		contentPane.add(lblCadastroDeApartamento);
		
		
	
	}
}
