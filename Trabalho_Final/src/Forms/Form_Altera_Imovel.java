package Forms;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import edu.fatec.leilao.Main;
import edu.fatec.model.ModelProduto;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Form_Altera_Imovel extends JFrame {

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
					Form_Altera_Imovel frame = new Form_Altera_Imovel();
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
	public Form_Altera_Imovel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 444);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		
		JLabel label = new JLabel("Cadastro de Edificios Comerciais");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.BOLD, 13));
		label.setBounds(79, 0, 281, 21);
		label.setVisible(false);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("ID Leil\u00E3o");
		label_1.setBounds(56, 52, 58, 14);
		contentPane.add(label_1);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBounds(116, 46, 86, 20);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(116, 72, 86, 20);
		contentPane.add(textField_1);
		
		JLabel label_2 = new JLabel("ID Produto");
		label_2.setBounds(47, 78, 67, 14);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("Tipo");
		label_3.setBounds(79, 104, 35, 14);
		contentPane.add(label_3);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(116, 98, 86, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(116, 124, 86, 20);
		
		contentPane.add(textField_3);
		
		JLabel label_4 = new JLabel("Pre\u00E7o");
		label_4.setBounds(72, 130, 42, 14);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("Area");
		label_5.setBounds(81, 153, 33, 14);
		contentPane.add(label_5);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(116, 147, 29, 20);
		contentPane.add(spinner);
		
		JLabel label_6 = new JLabel("M\u00B2");
		label_6.setBounds(157, 153, 19, 14);
		contentPane.add(label_6);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(116, 173, 29, 20);
		contentPane.add(spinner_1);
		
		JLabel label_7 = new JLabel("Condominio");
		label_7.setBounds(39, 179, 75, 14);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("Rua");
		label_8.setBounds(85, 207, 29, 14);
		contentPane.add(label_8);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(116, 201, 86, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(116, 227, 86, 20);
		contentPane.add(textField_5);
		
		JLabel label_9 = new JLabel("Cidade");
		label_9.setBounds(66, 233, 48, 14);
		contentPane.add(label_9);
		
		JLabel label_10 = new JLabel("Estado");
		label_10.setBounds(66, 259, 48, 14);
		contentPane.add(label_10);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(116, 253, 86, 20);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(116, 280, 86, 20);
		contentPane.add(textField_7);
		
		JLabel label_11 = new JLabel("CEP");
		label_11.setBounds(80, 286, 34, 14);
		contentPane.add(label_11);
		
		JLabel label_12 = new JLabel("Andar");
		label_12.setBounds(77, 314, 37, 14);
		label_12.setVisible(false);
		contentPane.add(label_12);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setBounds(116, 308, 29, 20);
		spinner_2.setVisible(false);
		contentPane.add(spinner_2);
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setBounds(116, 333, 29, 20);
		spinner_3.setVisible(false);
		contentPane.add(spinner_3);
		
		JLabel label_13 = new JLabel("Sala");
		label_13.setBounds(80, 339, 34, 14);
		label_13.setVisible(false);
		contentPane.add(label_13);
		
		
		
		JButton button_1 = new JButton("Cancelar");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Form_Pesquisa_ProdutoGeral c = new Form_Pesquisa_ProdutoGeral();
				c.setVisible(true);
				dispose();
			}
		});
		button_1.setBounds(333, 371, 91, 23);
		contentPane.add(button_1);
		
		JSpinner spinner_4 = new JSpinner();
		spinner_4.setBounds(116, 311, 29, 20);
		spinner_4.setVisible(false);
		contentPane.add(spinner_4);
		
		JLabel label_14 = new JLabel("Cadastro de Apartamento");
		label_14.setHorizontalAlignment(SwingConstants.CENTER);
		label_14.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_14.setBounds(79, 0, 281, 21);
		label_14.setVisible(false);
		contentPane.add(label_14);
		
		JLabel label_15 = new JLabel("Andar");
		label_15.setBounds(79, 314, 35, 14);
		label_15.setVisible(false);
		contentPane.add(label_15);
		
		JLabel label_16 = new JLabel("Cadastro de Terrenos");
		label_16.setHorizontalAlignment(SwingConstants.CENTER);
		label_16.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_16.setBounds(79, 0, 281, 21);
		label_16.setVisible(false);
		contentPane.add(label_16);
		
		JLabel label_17 = new JLabel("Cadastro de Casa");
		label_17.setHorizontalAlignment(SwingConstants.CENTER);
		label_17.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_17.setBounds(79, 0, 281, 21);
		label_17.setVisible(false);
		contentPane.add(label_17);
		
		JSpinner spinner_5 = new JSpinner();
		spinner_5.setBounds(116, 333, 27, 20);
		spinner_5.setVisible(false);
		contentPane.add(spinner_5);
		
		JSpinner spinner_6 = new JSpinner();
		spinner_6.setBounds(116, 308, 27, 20);
		spinner_6.setVisible(false);
		contentPane.add(spinner_6);
		
		JSpinner spinner_7 = new JSpinner();
		spinner_7.setBounds(116, 356, 27, 20);
		spinner_7.setVisible(false);
		contentPane.add(spinner_7);
		
		JLabel label_18 = new JLabel("Banheiro");
		label_18.setBounds(56, 358, 51, 16);
		label_18.setVisible(false);
		contentPane.add(label_18);
		
		JLabel label_19 = new JLabel("Quarto");
		label_19.setBounds(72, 339, 39, 16);
		label_19.setVisible(false);
		contentPane.add(label_19);
		
		JLabel label_20 = new JLabel("Garagem");
		label_20.setBounds(62, 311, 52, 16);
		label_20.setVisible(false);
		contentPane.add(label_20);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				
			}
		});
		btnAlterar.setBounds(232, 371, 91, 23);
		contentPane.add(btnAlterar);
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//Main.getIdProduto_FormPesquisa() //Puxa o ID do produto escolhido na planilha anterior
//		Main.getTipoProduto_FormPesquisa() //Puxa o tipo do produto escolhido anteriormente
		/*System.out.println("Id do produto escolhido - "+Main.getIdProduto_FormPesquisa());
		System.out.println("Tipo do produto escolhido - "+Main.getTipoProduto_FormPesquisa());
		ModelProduto t = new ModelProduto();
		switch (Main.getTipoProduto_FormPesquisa().toLowerCase()) {
		case "apartamentos":
			textField_1.setText(String.valueOf(Main.getIdProduto_FormPesquisa()));
			label_14.setVisible(true);
			label_15.setVisible(true);
			spinner_4.setVisible(true);
			break;
		case "terrenos":
			textField_1.setText(String.valueOf(Main.getIdProduto_FormPesquisa()));
			label_16.setVisible(true);
			
			break;
		case "casas":
			textField_1.setText(String.valueOf(Main.getIdProduto_FormPesquisa()));
			label_17.setVisible(true);
			label_20.setVisible(true);
			label_19.setVisible(true);
			label_18.setVisible(true);
			spinner_6.setVisible(true);
			spinner_5.setVisible(true);
			spinner_7.setVisible(true);
			
			break;
		case "edifícios_comerciais":
			textField_1.setText(String.valueOf(Main.getIdProduto_FormPesquisa()));
			spinner_2.setVisible(true);
			spinner_3.setVisible(true);
			label.setVisible(true);
			label_12.setVisible(true);
			label_13.setVisible(true);
			break;
		case "carros":
			
			break;
		case "motocicletas":
			
			break;

		default:
			break;
		}
	*/
	}

}
