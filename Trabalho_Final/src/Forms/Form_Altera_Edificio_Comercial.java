package Forms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import edu.fatec.leilao.Endereco;
import edu.fatec.leilao.Main;
import edu.fatec.leilao.produto.Apartamento;
import edu.fatec.leilao.produto.EdificiosComerciais;
import edu.fatec.model.ModelProduto;

import javax.swing.JSpinner;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SpinnerNumberModel;

public class Form_Altera_Edificio_Comercial extends JFrame {

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
					Form_Altera_Edificio_Comercial frame = new Form_Altera_Edificio_Comercial();
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
	public Form_Altera_Edificio_Comercial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 557, 462);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(164, 308, 29, 20);
		spinner.setValue(((Apartamento) Main.getProdutoTelas()).getAndar());
		contentPane.add(spinner);
		
		JLabel label = new JLabel("Cadastro de Edificios Comerciais");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.BOLD, 13));
		label.setBounds(133, 0, 281, 21);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("ID Leil\u00E3o");
		label_1.setBounds(104, 52, 58, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("CEP");
		label_2.setBounds(128, 286, 34, 14);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("Estado");
		label_3.setBounds(114, 259, 48, 14);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("Cidade");
		label_4.setBounds(114, 233, 48, 14);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("Rua");
		label_5.setBounds(133, 207, 29, 14);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("Pre\u00E7o");
		label_6.setBounds(120, 130, 42, 14);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("Tipo");
		label_7.setBounds(127, 104, 35, 14);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("ID Produto");
		label_8.setBounds(95, 78, 67, 14);
		contentPane.add(label_8);
		
		textField = new JTextField();
		textField.setText(((EdificiosComerciais) Main.getProdutoTelas()).getTipo().toString());
		textField.setEnabled(false);
		textField.setColumns(10);
		textField.setBounds(164, 98, 86, 20);
		contentPane.add(textField);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(164, 201, 86, 20);
		textField_2.setText(((EdificiosComerciais) Main.getProdutoTelas()).getEndereco().getEnderecoCompleto());
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(164, 227, 86, 20);
		textField_3.setText(((EdificiosComerciais) Main.getProdutoTelas()).getEndereco().getCidade());
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(164, 253, 86, 20);
		textField_4.setText(((EdificiosComerciais) Main.getProdutoTelas()).getEndereco().getEstado());
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(164, 280, 86, 20);
		textField_5.setText(((EdificiosComerciais) Main.getProdutoTelas()).getEndereco().getCep());
		contentPane.add(textField_5);
		
		JLabel label_9 = new JLabel("Area");
		label_9.setBounds(129, 153, 33, 14);
		contentPane.add(label_9);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerNumberModel(new Double(0), null, null, new Double(1)));
		spinner_1.setBounds(164, 147, 29, 20);
		spinner_1.setValue(((EdificiosComerciais) Main.getProdutoTelas()).getArea());
		contentPane.add(spinner_1);
		
		JLabel label_10 = new JLabel("M\u00B2");
		label_10.setBounds(205, 153, 19, 14);
		contentPane.add(label_10);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setBounds(164, 173, 29, 20);
		spinner_2.setModel(new SpinnerNumberModel(new Double(0), null, null, new Double(1)));
		spinner_2.setValue(((EdificiosComerciais) Main.getProdutoTelas()).getCondominio());
		contentPane.add(spinner_2);
		
		JLabel label_11 = new JLabel("Condominio");
		label_11.setBounds(87, 179, 75, 14);
		contentPane.add(label_11);
		
		JButton button = new JButton("Cancelar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Form_Lances b = new Form_Lances();
				b.setVisible(true);
				dispose();
			}
		});
		button.setBounds(352, 352, 91, 23);
		contentPane.add(button);
		
		JLabel label_12 = new JLabel("Sala");
		label_12.setBounds(128, 339, 34, 14);
		contentPane.add(label_12);
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setBounds(164, 333, 29, 20);
		spinner_3.setValue(((EdificiosComerciais) Main.getProdutoTelas()).sala);
		contentPane.add(spinner_3);
		
		JLabel label_13 = new JLabel("Andar");
		label_13.setBounds(125, 314, 37, 14);
		contentPane.add(label_13);
		
		JSpinner spinner_4 = new JSpinner();
		spinner_4.setBounds(245, 308, 29, 20);
		contentPane.add(spinner_4);
		
		JLabel label_14 = new JLabel("Quarto");
		label_14.setBounds(202, 311, 48, 14);
		contentPane.add(label_14);
		
		JSpinner spinner_5 = new JSpinner();
		spinner_5.setBounds(337, 308, 29, 20);
		spinner_5.setValue(((EdificiosComerciais) Main.getProdutoTelas()).banheiro);
		contentPane.add(spinner_5);
		
		JLabel label_15 = new JLabel("Banheiro");
		label_15.setBounds(284, 311, 58, 14);
		contentPane.add(label_15);
		
		JSpinner spinner_6 = new JSpinner();
		spinner_6.setBounds(428, 308, 29, 20);
		spinner_6.setValue(((EdificiosComerciais) Main.getProdutoTelas()).garagem);
		contentPane.add(spinner_6);
		
		JSpinner spinner_7 = new JSpinner();
		spinner_7.setEnabled(false);
		spinner_7.setBounds(164, 49, 58, 17);
		spinner_7.setValue(((EdificiosComerciais) Main.getProdutoTelas()).idLeilao);
		contentPane.add(spinner_7);
		
		JSpinner spinner_8 = new JSpinner();
		spinner_8.setEnabled(false);
		spinner_8.setBounds(164, 72, 58, 20);
		spinner_8.setValue(((EdificiosComerciais) Main.getProdutoTelas()).getIdProduto());
		contentPane.add(spinner_8);
		
		JLabel label_16 = new JLabel("Garagem");
		label_16.setBounds(371, 311, 60, 14);
		contentPane.add(label_16);
		
		JSpinner spinner_9 = new JSpinner();
		spinner_9.setModel(new SpinnerNumberModel(new Double(0), null, null, new Double(1)));
		spinner_9.setBounds(164, 127, 60, 20);
		spinner_9.setValue(((EdificiosComerciais) Main.getProdutoTelas()).getPreco());
		contentPane.add(spinner_9);
		
		JButton button_1 = new JButton("Cadastrar");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EdificiosComerciais a = new EdificiosComerciais(
						(int) spinner_7.getValue(),
						(int) spinner_8.getValue(),
						(double) spinner_1.getValue(),
						new Endereco(
								textField_2.getText(),
								textField_3.getText(),
								textField_4.getText(),
								textField_5.getText()
								), 
						(double) spinner_9.getValue(),
						(double) spinner_2.getValue(),
						textField.getText(),
						(int) spinner.getValue(),
						 (int) spinner_6.getValue(),
						 (int) spinner_4.getValue(),
						 (int) spinner_5.getValue(), 
						 (int) spinner_3.getValue());
				
				ModelProduto.atualizarProduto(a);
				Form_Lances b = new Form_Lances();
				b.setVisible(true);
				dispose();
			}
		});
		button_1.setBounds(34, 372, 91, 23);
		contentPane.add(button_1);
		
		
	}

}
