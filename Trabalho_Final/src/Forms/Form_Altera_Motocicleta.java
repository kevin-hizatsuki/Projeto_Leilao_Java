package Forms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import edu.fatec.leilao.Main;
import edu.fatec.leilao.produto.Carro;
import edu.fatec.leilao.produto.Produto;
import edu.fatec.leilao.produto.Veiculos;
import edu.fatec.model.ModelProduto;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SpinnerNumberModel;

public class Form_Altera_Motocicleta extends JFrame {

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
					Form_Altera_Motocicleta frame = new Form_Altera_Motocicleta();
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
	public Form_Altera_Motocicleta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(125, 148, 196, 18);
		textField.setText(((Veiculos) Main.getProdutoTelas()).modelo);
		contentPane.add(textField);
		
		JLabel label = new JLabel("Cilindrada");
		label.setBounds(54, 178, 66, 16);
		contentPane.add(label);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(125, 176, 38, 18);
		spinner.setModel(new SpinnerNumberModel(new Double(0), null, null, new Double(1)));
		spinner.setValue(((Veiculos) Main.getProdutoTelas()).cilindrada);
		contentPane.add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(125, 206, 38, 18);
		spinner_1.setValue(((Veiculos) Main.getProdutoTelas()).ano);
		contentPane.add(spinner_1);
		
		JLabel label_1 = new JLabel("Ano");
		label_1.setBounds(96, 208, 24, 16);
		contentPane.add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(125, 229, 196, 18);
		textField_1.setText(((Veiculos) Main.getProdutoTelas()).cambio);
		contentPane.add(textField_1);
		
		JLabel label_2 = new JLabel("Cambio");
		label_2.setBounds(65, 230, 48, 16);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("Km");
		label_3.setBounds(96, 261, 24, 16);
		contentPane.add(label_3);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setBounds(125, 259, 38, 18);
		spinner_2.setValue(((Veiculos) Main.getProdutoTelas()).km);
		spinner_2.setModel(new SpinnerNumberModel(new Double(0), null, null, new Double(1)));
		contentPane.add(spinner_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(125, 288, 196, 18);
		textField_2.setText(((Veiculos) Main.getProdutoTelas()).combustivel);
		contentPane.add(textField_2);
		
		JLabel label_4 = new JLabel("Combustivel");
		label_4.setBounds(39, 289, 74, 16);
		contentPane.add(label_4);
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setModel(new SpinnerNumberModel(new Double(0), null, null, new Double(1)));
		spinner_3.setBounds(125, 319, 38, 18);

		spinner_3.setValue(((Veiculos) Main.getProdutoTelas()).preco);
		contentPane.add(spinner_3);
		
		JLabel label_5 = new JLabel("Valor");
		label_5.setBounds(81, 321, 39, 16);
		contentPane.add(label_5);
		
		JSpinner spinner_5 = new JSpinner();
		spinner_5.setEnabled(false);
		spinner_5.setBounds(125, 45, 66, 18);
		spinner_5.setValue(((Veiculos) Main.getProdutoTelas()).idLeilao);
		contentPane.add(spinner_5);
		
		JSpinner spinner_6 = new JSpinner();
		spinner_6.setEnabled(false);
		spinner_6.setBounds(125, 70, 59, 18);
		spinner_6.setValue(((Veiculos) Main.getProdutoTelas()).idProduto);
		contentPane.add(spinner_6);
		
		JLabel lblMotocicleta = new JLabel("Motocicleta");
		lblMotocicleta.setHorizontalAlignment(SwingConstants.CENTER);
		lblMotocicleta.setFont(new Font("Arial", Font.BOLD, 13));
		lblMotocicleta.setBounds(81, 0, 293, 19);
		contentPane.add(lblMotocicleta);
		
		JLabel label_8 = new JLabel("ID Produto");
		label_8.setBounds(54, 72, 59, 16);
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel("ID Leil\u00E3o");
		label_9.setBounds(65, 46, 48, 16);
		contentPane.add(label_9);
		
		JLabel label_10 = new JLabel("Tipo");
		label_10.setBounds(89, 97, 24, 16);
		contentPane.add(label_10);
		
		JLabel label_11 = new JLabel("Marca");
		label_11.setBounds(65, 120, 48, 16);
		contentPane.add(label_11);
		
		textField_3 = new JTextField();
		textField_3.setText("Carros");
		textField_3.setEnabled(false);
		textField_3.setColumns(10);
		textField_3.setBounds(125, 96, 196, 17);
		textField_3.setText(((Veiculos) Main.getProdutoTelas()).tipo);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(125, 119, 196, 18);
		textField_4.setText(((Veiculos) Main.getProdutoTelas()).marca);	
		contentPane.add(textField_4);
		
		JButton button = new JButton("Cadastrar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Produto a =  new Veiculos( 
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
						(double)spinner_3.getValue()
				);
				
				ModelProduto.atualizarProduto(a);
				Form_Lances b = new Form_Lances();
				b.setVisible(true);
				dispose();
			}
		});
		button.setBounds(22, 381, 91, 26);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Cancelar");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Form_Lances b = new Form_Lances();
				b.setVisible(true);
				dispose();
			}
		});
		button_1.setBounds(322, 381, 85, 26);
		contentPane.add(button_1);
		
		JLabel label_12 = new JLabel("Modelo");
		label_12.setBounds(65, 149, 48, 16);
		contentPane.add(label_12);
	}

}
