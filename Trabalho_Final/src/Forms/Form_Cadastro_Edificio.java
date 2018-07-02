package Forms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import edu.fatec.leilao.Endereco;
import edu.fatec.leilao.Main;
import edu.fatec.leilao.produto.EdificiosComerciais;
import edu.fatec.leilao.produto.EnumImoveis;
import edu.fatec.model.ModelProduto;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class Form_Cadastro_Edificio extends JFrame {

	private JPanel contentPane;
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
		JLabel lblCadastroDeEdificios = new JLabel("Cadastro de Edificios Comerciais");
		lblCadastroDeEdificios.setBounds(98, 5, 281, 21);
		lblCadastroDeEdificios.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastroDeEdificios.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel label_1 = new JLabel("ID Leil\u00E3o");
		label_1.setBounds(69, 57, 58, 14);
		
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
		
		textField_2 = new JTextField();
		textField_2.setEnabled(false);
		textField_2.setBounds(129, 103, 86, 20);
		textField_2.setText(EnumImoveis.Edificios_Comerciais.toString());
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
		spinner.setModel(new SpinnerNumberModel(new Double(0), null, null, new Double(1)));
		spinner.setBounds(129, 152, 29, 20);
		
		JLabel label_6 = new JLabel("M\u00B2");
		label_6.setBounds(170, 158, 19, 14);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerNumberModel(new Double(0), null, null, new Double(1)));
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
		
		contentPane.add(lblCadastroDeEdificios);
		contentPane.add(label_1);
		contentPane.add(label_2);
		contentPane.add(label_3);
		contentPane.add(label_4);
		contentPane.add(label_5);
		contentPane.add(label_7);
		contentPane.add(label_8);
		contentPane.add(label_9);
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
		
		JSpinner spinner_4 = new JSpinner();
		spinner_4.setBounds(210, 313, 29, 20);
		contentPane.add(spinner_4);
		
		JLabel lblQuarto = new JLabel("Quarto");
		lblQuarto.setBounds(167, 316, 48, 14);
		contentPane.add(lblQuarto);
		
		JSpinner spinner_5 = new JSpinner();
		spinner_5.setBounds(302, 313, 29, 20);
		contentPane.add(spinner_5);
		
		JLabel lblBanheiro = new JLabel("Banheiro");
		lblBanheiro.setBounds(249, 316, 58, 14);
		contentPane.add(lblBanheiro);
		
		JSpinner spinner_6 = new JSpinner();
		spinner_6.setBounds(393, 313, 29, 20);
		contentPane.add(spinner_6);
		
		
		JSpinner spinner_7 = new JSpinner();
		spinner_7.setEnabled(false);
		spinner_7.setBounds(129, 54, 58, 17);
		spinner_7.setValue(Main.getIdLeilao_AddProduto());
		contentPane.add(spinner_7);
		
		JSpinner spinner_8 = new JSpinner();
		spinner_8.setEnabled(false);
		spinner_8.setBounds(129, 77, 58, 20);
		spinner_8.setValue(ModelProduto.geraId());
		contentPane.add(spinner_8);
		
		JLabel lblGaragem = new JLabel("Garagem");
		lblGaragem.setBounds(336, 316, 60, 14);
		contentPane.add(lblGaragem);
		JButton button = new JButton("Cadastrar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EdificiosComerciais a = new EdificiosComerciais(
						Main.getIdLeilao_AddProduto(),
						(int) spinner_8.getValue(),
						(double) spinner.getValue(),
						new Endereco(
								textField_5.getText(),
								textField_6.getText(),
								textField_7.getText(),
								textField_8.getText()
								), 
						Double.valueOf(textField_3.getText()), 
						(double) spinner_1.getValue(),
						textField_2.getText(),
						 (int) spinner_3.getValue(), 
						 (int) spinner_6.getValue(),
						 (int) spinner_4.getValue(),
						 (int) spinner_5.getValue(), 
						 (int) spinner_2.getValue());
				
				ModelProduto.AdicionarProduto(a);
//				System.out.println(ModelProduto.getProdutosPorLeilao(Main.getIdLeilao_AddProduto()));
				Form_Tela_CadastroGeral cadastro_produto = new Form_Tela_CadastroGeral();
				cadastro_produto.setVisible(true);
				dispose();
			}
		});
		button.setBounds(216, 357, 91, 23);
		contentPane.add(button);

	}

}
