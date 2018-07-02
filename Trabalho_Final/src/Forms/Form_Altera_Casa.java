package Forms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import edu.fatec.leilao.Endereco;
import edu.fatec.leilao.Main;
import edu.fatec.leilao.produto.Casas;
import edu.fatec.model.ModelProduto;

import javax.swing.JSpinner;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SpinnerNumberModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Form_Altera_Casa extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form_Altera_Casa frame = new Form_Altera_Casa();
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
	public Form_Altera_Casa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 448);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setEnabled(false);
		spinner_1.setBounds(81, 90, 45, 20);
		spinner_1.setValue(((Casas) Main.getProdutoTelas()).idProduto);
		contentPane.add(spinner_1);
		
		JLabel label = new JLabel("Cadastro de Casa");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.BOLD, 13));
		label.setBounds(101, 11, 281, 21);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Tipo");
		label_1.setBounds(53, 118, 24, 16);
		contentPane.add(label_1);
		
		textField = new JTextField();
		textField.setText("Casas");
		textField.setEnabled(false);
		textField.setColumns(10);
		textField.setBounds(81, 118, 114, 20);
		textField.setText(((Casas) Main.getProdutoTelas()).tipo);
		contentPane.add(textField);
		
		JLabel label_2 = new JLabel("Pre\u00E7o");
		label_2.setBounds(43, 144, 34, 16);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("Rua");
		label_3.setBounds(55, 224, 22, 16);
		contentPane.add(label_3);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(81, 224, 114, 20);
		textField.setText(((Casas) Main.getProdutoTelas()).endereco.getEnderecoCompleto());
		contentPane.add(textField_2);
		
		JLabel label_4 = new JLabel("Cidade");
		label_4.setBounds(38, 250, 39, 16);
		contentPane.add(label_4);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(81, 250, 114, 20);
		textField_3.setText(((Casas) Main.getProdutoTelas()).endereco.getCidade());
		contentPane.add(textField_3);
		
		JLabel label_5 = new JLabel("Estado");
		label_5.setBounds(38, 276, 39, 16);
		contentPane.add(label_5);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(81, 276, 114, 20);
		textField_4.setText(((Casas) Main.getProdutoTelas()).endereco.getEstado());
		contentPane.add(textField_4);
		
		JLabel label_6 = new JLabel("CEP");
		label_6.setBounds(54, 302, 23, 16);
		contentPane.add(label_6);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(81, 302, 114, 20);
		textField_5.setText(((Casas) Main.getProdutoTelas()).endereco.getCep());
		contentPane.add(textField_5);
		
		JLabel label_7 = new JLabel("Garagem");
		label_7.setBounds(25, 328, 52, 16);
		contentPane.add(label_7);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setBounds(81, 328, 27, 20);
		spinner_2.setValue(((Casas) Main.getProdutoTelas()).garagem);
		contentPane.add(spinner_2);
		
		JLabel label_8 = new JLabel("Quarto");
		label_8.setBounds(38, 354, 39, 16);
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel("Banheiro");
		label_9.setBounds(26, 381, 51, 16);
		contentPane.add(label_9);
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setBounds(81, 354, 27, 20);
		spinner_3.setValue(((Casas) Main.getProdutoTelas()).quarto);
		contentPane.add(spinner_3);
		
		JSpinner spinner_4 = new JSpinner();
		spinner_4.setBounds(81, 379, 27, 20);
		spinner_4.setValue(((Casas) Main.getProdutoTelas()).banheiro);
		contentPane.add(spinner_4);
		

		
		
		JLabel label_10 = new JLabel("Condominio");
		label_10.setBounds(10, 195, 67, 16);
		contentPane.add(label_10);
		
		JLabel label_11 = new JLabel("Area");
		label_11.setBounds(50, 170, 27, 16);
		contentPane.add(label_11);
		
		JSpinner spinner_5 = new JSpinner();
		spinner_5.setBounds(81, 170, 27, 20);
		spinner_5.setModel(new SpinnerNumberModel(new Double(0), null, null, new Double(1)));
		spinner_5.setValue(((Casas) Main.getProdutoTelas()).area);
		contentPane.add(spinner_5);
		
		JLabel label_12 = new JLabel("M\u00B2");
		label_12.setBounds(112, 170, 14, 16);
		contentPane.add(label_12);
		
		JSpinner spinner_6 = new JSpinner();
		spinner_6.setModel(new SpinnerNumberModel(new Double(0), null, null, new Double(1)));
		spinner_6.setBounds(81, 196, 27, 20);
		spinner_6.setValue(((Casas) Main.getProdutoTelas()).condominio);
		contentPane.add(spinner_6);
		
		JLabel label_13 = new JLabel("ID Leil\u00E3o");
		label_13.setBounds(22, 66, 55, 16);
		contentPane.add(label_13);
		
		JLabel label_14 = new JLabel("ID Produto");
		label_14.setBounds(18, 92, 59, 16);
		contentPane.add(label_14);
		
		JSpinner spinner = new JSpinner();
		spinner.setEnabled(false);
		spinner.setBounds(79, 59, 47, 20);
		spinner.setValue(((Casas) Main.getProdutoTelas()).idLeilao);
		contentPane.add(spinner);
		
		JSpinner spinner_7 = new JSpinner();
		spinner_7.setModel(new SpinnerNumberModel(new Double(0), null, null, new Double(1)));
		spinner_7.setBounds(81, 142, 102, 18);
		spinner_7.setValue(((Casas) Main.getProdutoTelas()).preco);
		contentPane.add(spinner_7);
		
		
		JButton button = new JButton("Cadastrar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Casas a = new Casas(
						(int) spinner.getValue(),//Id
						(int) spinner_1.getValue(),//IdImovel
						textField.getText(),
						(double) spinner_5.getValue(), //Tipo do produto 
						new Endereco(
								textField_2.getText(),
								textField_3.getText(),
								textField_4.getText(),
								textField_5.getText()
								),
						(double) spinner_7.getValue(),
						(double) spinner_6.getValue(),
						(int) spinner_2.getValue(),
						(int) spinner_3.getValue(),
						(int) spinner_4.getValue()
						);
				ModelProduto.atualizarProduto(a);
				
				Form_Lances b = new Form_Lances();
				b.setVisible(true);
				dispose();
			}
		});
		button.setBounds(150, 371, 91, 26);
		contentPane.add(button);
		
		
		
		JButton button_1 = new JButton("Cancelar");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Form_Lances b = new Form_Lances();
				b.setVisible(true);
				dispose();
			}
		});
		button_1.setBounds(330, 376, 85, 26);
		contentPane.add(button_1);
		
		
		
	}

}
