package Forms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import edu.fatec.leilao.Endereco;
import edu.fatec.leilao.Main;
import edu.fatec.leilao.produto.Apartamento;
import edu.fatec.leilao.produto.Casas;
import edu.fatec.leilao.produto.Produto;
import edu.fatec.model.ModelProduto;

import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SpinnerNumberModel;

public class Form_Altera_Apartamento extends JFrame {

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
					Form_Altera_Apartamento frame = new Form_Altera_Apartamento();
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
	public Form_Altera_Apartamento() {
		Produto p = Main.getProdutoTelas();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 487);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("Cancelar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Form_Lances a = new Form_Lances();
				a.setVisible(true);
				dispose();
			}
		});
		button.setBounds(283, 405, 86, 23);
		contentPane.add(button);
		
		
	
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(123, 372, 29, 20);
		spinner.setValue(( (Casas) Main.getProdutoTelas()).getBanheiro());
		contentPane.add(spinner);
		 
		JLabel label = new JLabel("Banheiro");
		label.setBounds(64, 378, 52, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Quarto");
		label_1.setBounds(64, 353, 52, 14);
		contentPane.add(label_1);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(123, 347, 29, 20);
		spinner_1.setValue(((Casas) Main.getProdutoTelas()).getQuarto());
		contentPane.add(spinner_1);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setBounds(123, 326, 29, 20);
		spinner_2.setValue(((Casas) Main.getProdutoTelas()).getGaragem());
		contentPane.add(spinner_2);
		
		JLabel label_2 = new JLabel("Garagem");
		label_2.setBounds(64, 332, 52, 14);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("Andar");
		label_3.setBounds(81, 300, 35, 14);
		contentPane.add(label_3);
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setBounds(123, 294, 29, 20);
		spinner_3.setValue(((Apartamento) Main.getProdutoTelas()).getAndar());
		contentPane.add(spinner_3); 
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(123, 263, 86, 20);
		textField.setText(((Casas) Main.getProdutoTelas()).getEndereco().cep);
		contentPane.add(textField);
		
		JLabel label_4 = new JLabel("CEP");
		label_4.setBounds(89, 269, 27, 14);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("Estado");
		label_5.setBounds(77, 243, 39, 14);
		contentPane.add(label_5);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(123, 237, 86, 20);
		textField_1.setText(((Apartamento) Main.getProdutoTelas()).getEndereco().estado);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(123, 211, 86, 20);
		textField_2.setText(((Apartamento) Main.getProdutoTelas()).getEndereco().cidade);
		contentPane.add(textField_2);
		
		JLabel label_6 = new JLabel("Cidade");
		label_6.setBounds(77, 217, 39, 14);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("Rua");
		label_7.setBounds(89, 191, 27, 14);
		contentPane.add(label_7);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(123, 185, 86, 20);
		textField_3.setText(((Apartamento) Main.getProdutoTelas()).getEndereco().enderecoCompleto);
		contentPane.add(textField_3);
		
		JSpinner spinner_4 = new JSpinner();
		spinner_4.setBounds(123, 157, 29, 20);
		spinner_4.setModel(new SpinnerNumberModel(new Double(0), null, null, new Double(1)));
		spinner_4.setValue(((Apartamento) Main.getProdutoTelas()).getCondominio());
		contentPane.add(spinner_4);
		
		JLabel label_8 = new JLabel("Condominio");
		label_8.setBounds(49, 163, 67, 14);
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel("Area");
		label_9.setBounds(89, 137, 27, 14);
		contentPane.add(label_9);
		
		JLabel label_10 = new JLabel("M\u00B2");
		label_10.setBounds(160, 134, 21, 14);
		contentPane.add(label_10);
		
		JSpinner spinner_6 = new JSpinner();
		spinner_6.setModel(new SpinnerNumberModel(new Double(0), null, null, new Double(1)));
		spinner_6.setBounds(123, 108, 52, 17);
		spinner_6.setValue(Main.getProdutoTelas().preco);
		contentPane.add(spinner_6);
		
		JLabel label_11 = new JLabel("Pre\u00E7o");
		label_11.setBounds(77, 111, 39, 14);
		contentPane.add(label_11);
		
		JLabel label_12 = new JLabel("Tipo");
		label_12.setBounds(89, 85, 27, 14);
		contentPane.add(label_12);
		
		textField_4 = new JTextField();
		textField_4.setEnabled(false);
		textField_4.setColumns(10);
		textField_4.setText(Main.getProdutoTelas().getTipo());
		textField_4.setBounds(123, 79, 86, 20);
		contentPane.add(textField_4);
		
		JSpinner spinner_7 = new JSpinner();
		spinner_7.setEnabled(false);
		spinner_7.setValue(Main.getProdutoTelas().idProduto);
		spinner_7.setBounds(123, 56, 39, 20);
		contentPane.add(spinner_7);
		
		JLabel label_13 = new JLabel("ID Produto");
		label_13.setBounds(53, 59, 63, 14);
		contentPane.add(label_13);
		
		JLabel label_14 = new JLabel("ID Leil\u00E3o");
		label_14.setBounds(64, 33, 52, 14);
		contentPane.add(label_14);
		
		JSpinner spinner_5 = new JSpinner();
		spinner_5.setModel(new SpinnerNumberModel(new Double(0), null, null, new Double(1)));
		spinner_5.setBounds(125, 134, 27, 20);
		spinner_5.setValue(((Apartamento) Main.getProdutoTelas()).getArea());
		contentPane.add(spinner_5);
		
		JSpinner spinner_8 = new JSpinner();
		spinner_8.setEnabled(false);
		spinner_8.setBounds(123, 30, 39, 17);
		spinner_8.setValue(Main.getProdutoTelas().idLeilao);
		contentPane.add(spinner_8);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Apartamento a = new Apartamento(
						(int) spinner_8.getValue(),
						 (int) spinner_7.getValue(),
						 (double) spinner_5.getValue(),
						 new Endereco(textField_3.getText(),
									textField_2.getText(),
									textField_1.getText(),
									textField.getText()),
						(double) spinner_6.getValue(),
						(double) spinner_4.getValue(),
						textField_4.getText(),
						(int) spinner_3.getValue(),
						(int) spinner_2.getValue(),
						(int) spinner_1.getValue(),
						(int) spinner.getValue()
						);
				
				ModelProduto.atualizarProduto(a);
				
				
				Form_Lances b = new Form_Lances();
				b.setVisible(true);
				dispose();
			}
		});
		btnAlterar.setBounds(112, 405, 91, 23);
		contentPane.add(btnAlterar);
		
		JLabel lblAlterarCadastroApartamento = new JLabel("Alterar Cadastro Apartamento");
		lblAlterarCadastroApartamento.setBounds(133, 5, 199, 14);
		contentPane.add(lblAlterarCadastroApartamento);
		
		
	}
}
