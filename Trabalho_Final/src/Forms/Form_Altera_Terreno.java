package Forms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import edu.fatec.leilao.Endereco;
import edu.fatec.leilao.Main;
import edu.fatec.leilao.produto.Imoveis;
import edu.fatec.leilao.produto.Produto;
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

public class Form_Altera_Terreno extends JFrame {

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
					Form_Altera_Terreno frame = new Form_Altera_Terreno();
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
	public Form_Altera_Terreno() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 496);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSpinner spinner = new JSpinner();
		spinner.setEnabled(false);
		spinner.setBounds(81, 53, 45, 20);
		spinner.setValue((Main.getProdutoTelas()).idLeilao);
		contentPane.add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setEnabled(false);
		spinner_1.setBounds(81, 79, 45, 20);
		spinner_1.setValue(( Main.getProdutoTelas()).idProduto);
		contentPane.add(spinner_1);
		
		JLabel lblCadastroDeTerreno = new JLabel("Cadastro de Terreno");
		lblCadastroDeTerreno.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastroDeTerreno.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCadastroDeTerreno.setBounds(101, 0, 281, 21);
		contentPane.add(lblCadastroDeTerreno);
		
		JLabel label_1 = new JLabel("Tipo");
		label_1.setBounds(53, 107, 24, 16);
		contentPane.add(label_1);
		
		textField = new JTextField();
		textField.setText("Casas");
		textField.setEnabled(false);
		textField.setColumns(10);
		textField.setBounds(81, 107, 114, 20);
		textField.setText(( Main.getProdutoTelas()).tipo);
		contentPane.add(textField);
		
		JLabel label_2 = new JLabel("Pre\u00E7o");
		label_2.setBounds(43, 133, 34, 16);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("Rua");
		label_3.setBounds(55, 213, 22, 16);
		contentPane.add(label_3);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(81, 213, 114, 20);
		textField_1.setText(((Imoveis)Main.getProdutoTelas()).getEndereco().getEnderecoCompleto());
		contentPane.add(textField_1);
		
		JLabel label_4 = new JLabel("Cidade");
		label_4.setBounds(38, 239, 39, 16);
		contentPane.add(label_4);
		
		textField_2 = new JTextField();
		textField_2.setText((String) null);
		textField_2.setColumns(10);
		textField_2.setBounds(81, 239, 114, 20);
		textField_2.setText(((Imoveis) Main.getProdutoTelas()).endereco.cidade);
		contentPane.add(textField_2);
		
		JLabel label_5 = new JLabel("Estado");
		label_5.setBounds(38, 265, 39, 16);
		contentPane.add(label_5);
		
		textField_3 = new JTextField();
		textField_3.setText((String) null);
		textField_3.setColumns(10);
		textField_3.setBounds(81, 265, 114, 20);
		textField_3.setText(((Imoveis) Main.getProdutoTelas()).endereco.estado);
		contentPane.add(textField_3);
		
		JLabel label_6 = new JLabel("CEP");
		label_6.setBounds(54, 291, 23, 16);
		contentPane.add(label_6);
		
		textField_4 = new JTextField();
		textField_4.setText((String) null);
		textField_4.setColumns(10);
		textField_4.setBounds(81, 291, 114, 20);
		textField_4.setText(((Imoveis) Main.getProdutoTelas()).endereco.cep);
		contentPane.add(textField_4);
		
		JLabel label_10 = new JLabel("Condominio");
		label_10.setBounds(10, 184, 67, 16);
		contentPane.add(label_10);
		
		JLabel label_11 = new JLabel("Area");
		label_11.setBounds(50, 159, 27, 16);
		contentPane.add(label_11);
		
		JSpinner spinner_5 = new JSpinner();
		spinner_5.setModel(new SpinnerNumberModel(new Double(0), null, null, new Double(1)));
		spinner_5.setBounds(81, 159, 27, 20);
		spinner_5.setValue(((Imoveis) Main.getProdutoTelas()).area);
		contentPane.add(spinner_5);
		
		JLabel label_12 = new JLabel("M\u00B2");
		label_12.setBounds(112, 159, 14, 16);
		contentPane.add(label_12);
		
		JSpinner spinner_6 = new JSpinner();
		spinner_6.setBounds(81, 185, 27, 20);
		spinner_6.setModel(new SpinnerNumberModel(new Double(0), null, null, new Double(1)));
		spinner_6.setValue(((Imoveis) Main.getProdutoTelas()).condominio); 
		contentPane.add(spinner_6);
		
		JLabel label_13 = new JLabel("ID Leil\u00E3o");
		label_13.setBounds(22, 55, 55, 16);
		contentPane.add(label_13);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setModel(new SpinnerNumberModel(new Double(0), null, null, new Double(1)));
		spinner_2.setBounds(81, 131, 114, 20);
		spinner_2.setValue(Main.getProdutoTelas().preco);
		contentPane.add(spinner_2);
		
		JLabel label_14 = new JLabel("ID Produto");
		label_14.setBounds(18, 81, 59, 16);
		contentPane.add(label_14);
		
		JButton button = new JButton("Cadastrar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Produto a = new Imoveis(
						(int) spinner.getValue(),//Id
						(int) spinner_1.getValue(),//IdImovel
						textField.getText(),
						(double) spinner_5.getValue(), //Tipo do produto
						new Endereco(
								textField_1.getText(),
								textField_2.getText(),
								textField_3.getText(),
								textField_4.getText()
								),
						(double) spinner_2.getValue(),
						(double) spinner_6.getValue()
						);
				ModelProduto.atualizarProduto(a);
				
				Form_Lances b = new Form_Lances();
				b.setVisible(true);
				dispose();
			}
		});
		button.setBounds(150, 360, 91, 26);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Cancelar");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Form_Lances b = new Form_Lances();
				b.setVisible(true);
				dispose();
			}
		});
		button_1.setBounds(330, 365, 85, 26);
		contentPane.add(button_1);
		
		
	}

}
