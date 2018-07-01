package Forms;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import edu.fatec.leilao.Main;
import edu.fatec.leilao.produto.Carro;
import edu.fatec.model.ModelProduto;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.SpinnerNumberModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Form_Altera_Carro extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form_Altera_Carro frame = new Form_Altera_Carro();
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
	public Form_Altera_Carro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 477);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(129, 159, 196, 18);
		textField.setText(((Carro) Main.getProdutoTelas()).modelo);
		contentPane.add(textField);
		
		JLabel label = new JLabel("Cilindrada");
		label.setBounds(58, 189, 66, 16);
		contentPane.add(label);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(new Double(0), null, null, new Double(1)));
		spinner.setBounds(129, 187, 38, 18);
		spinner.setValue(((Carro) Main.getProdutoTelas()).cilindrada);
		contentPane.add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(129, 217, 38, 18);
		spinner_1.setValue(((Carro) Main.getProdutoTelas()).ano);
		contentPane.add(spinner_1);
		
		JLabel label_1 = new JLabel("Ano");
		label_1.setBounds(100, 219, 24, 16);
		contentPane.add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(129, 240, 196, 18);
		textField_1.setText(((Carro) Main.getProdutoTelas()).cambio);
		contentPane.add(textField_1);
		
		JLabel label_2 = new JLabel("Cambio");
		label_2.setBounds(69, 241, 48, 16);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("Km");
		label_3.setBounds(100, 272, 24, 16);
		contentPane.add(label_3);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setModel(new SpinnerNumberModel(new Double(0), null, null, new Double(1)));
		spinner_2.setBounds(129, 270, 38, 18);
		spinner_2.setValue(((Carro) Main.getProdutoTelas()).km);
		contentPane.add(spinner_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(129, 299, 196, 18);
		textField_2.setText(((Carro) Main.getProdutoTelas()).combustivel);
		contentPane.add(textField_2);
		
		JLabel label_4 = new JLabel("Combustivel");
		label_4.setBounds(43, 300, 74, 16);
		contentPane.add(label_4);
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setModel(new SpinnerNumberModel(new Double(0), null, null, new Double(1)));
		spinner_3.setBounds(129, 330, 38, 18);
		spinner_3.setValue(((Carro) Main.getProdutoTelas()).preco);
		contentPane.add(spinner_3);
		
		JLabel label_5 = new JLabel("Valor");
		label_5.setBounds(85, 332, 39, 16);
		contentPane.add(label_5);
		
		JSpinner spinner_4 = new JSpinner();
		spinner_4.setBounds(129, 362, 38, 18);
		spinner_4.setValue(((Carro) Main.getProdutoTelas()).numPorta);
		contentPane.add(spinner_4);
		
		JLabel label_6 = new JLabel("Numero Porta");
		label_6.setBounds(43, 364, 81, 16);
		contentPane.add(label_6);
		
		JSpinner spinner_5 = new JSpinner();
		spinner_5.setEnabled(false);
		spinner_5.setBounds(129, 56, 66, 18);
		spinner_5.setValue(((Carro) Main.getProdutoTelas()).idLeilao);
		contentPane.add(spinner_5);
		
		JSpinner spinner_6 = new JSpinner();
		spinner_6.setEnabled(false);
		spinner_6.setBounds(129, 81, 59, 18);
		spinner_6.setValue(((Carro) Main.getProdutoTelas()).idProduto);
		contentPane.add(spinner_6);
		
		JLabel label_7 = new JLabel("Cadastro de Novo Carro");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setFont(new Font("Arial", Font.BOLD, 13));
		label_7.setBounds(85, 0, 293, 19);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("ID Produto");
		label_8.setBounds(58, 83, 59, 16);
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel("ID Leil\u00E3o");
		label_9.setBounds(69, 57, 48, 16);
		contentPane.add(label_9);
		
		JLabel label_10 = new JLabel("Tipo");
		label_10.setBounds(93, 108, 24, 16);
		contentPane.add(label_10);
		
		JLabel label_11 = new JLabel("Marca");
		label_11.setBounds(69, 131, 48, 16);
		contentPane.add(label_11);
		
		textField_3 = new JTextField();
		textField_3.setText("Carros");
		textField_3.setEnabled(false);
		textField_3.setColumns(10);
		textField_3.setBounds(129, 107, 196, 17);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(129, 130, 196, 18);
		textField_4.setText(((Carro) Main.getProdutoTelas()).marca);
		contentPane.add(textField_4);
		
		JButton button = new JButton("Cadastrar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Carro a = new Carro( 
						(int) spinner_5.getValue(),
						(int) spinner_6.getValue(),
						textField_3.getText(),
						textField_4.getText(),
						textField.getText(),
						(double) spinner.getValue(),
						(int)spinner_1.getValue(),
						textField_1.getText(),
						(double)spinner_2.getValue(),
						textField_2.getText(),
						(double)spinner_3.getValue(),
						(int)spinner_4.getValue()
				);
				
				ModelProduto.atualizarProduto(a);
				Form_Lances b = new Form_Lances();
				b.setVisible(true);
				dispose();
			}
		});
		button.setBounds(26, 392, 91, 26);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Cancelar");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Form_Lances b = new Form_Lances();
				b.setVisible(true);
				dispose();
			}
		});
		button_1.setBounds(326, 392, 85, 26);
		contentPane.add(button_1);
		
		JLabel label_12 = new JLabel("Modelo");
		label_12.setBounds(69, 160, 48, 16);
		contentPane.add(label_12);
	}

}
