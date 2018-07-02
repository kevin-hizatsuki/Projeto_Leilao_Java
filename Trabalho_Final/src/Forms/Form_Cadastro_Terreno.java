package Forms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import edu.fatec.leilao.Endereco;
import edu.fatec.leilao.Main;
import edu.fatec.leilao.produto.EnumImoveis;
import edu.fatec.leilao.produto.Imoveis;
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

public class Form_Cadastro_Terreno extends JFrame {

	private JPanel contentPane;
	private JTextField textField_2;
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
					Form_Cadastro_Terreno frame = new Form_Cadastro_Terreno();
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
	public Form_Cadastro_Terreno() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 407);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastroDeTerrenos = new JLabel("Cadastro de Terrenos");
		lblCadastroDeTerrenos.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastroDeTerrenos.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCadastroDeTerrenos.setBounds(93, 0, 281, 21);
		contentPane.add(lblCadastroDeTerrenos);
		
		JLabel label_1 = new JLabel("ID Leil\u00E3o");
		label_1.setBounds(35, 52, 58, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("CEP");
		label_2.setBounds(66, 295, 27, 14);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("Estado");
		label_3.setBounds(45, 269, 48, 14);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("Cidade");
		label_4.setBounds(45, 243, 48, 14);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("Rua");
		label_5.setBounds(59, 217, 34, 14);
		contentPane.add(label_5);
		
		JLabel label_7 = new JLabel("Pre\u00E7o");
		label_7.setBounds(51, 130, 42, 14);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("Tipo");
		label_8.setBounds(58, 104, 35, 14);
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel("ID Produto");
		label_9.setBounds(26, 78, 67, 14);
		contentPane.add(label_9);
		
		textField_2 = new JTextField();
		textField_2.setEnabled(false);
		textField_2.setColumns(10);
		textField_2.setBounds(93, 104, 86, 20);
		textField_2.setText(EnumImoveis.Terrenos.toString());
		contentPane.add(textField_2);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(93, 217, 86, 20);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(93, 243, 86, 20);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(93, 269, 86, 20);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(93, 295, 86, 20);
		contentPane.add(textField_8);
		
		JLabel label = new JLabel("Area");
		label.setBounds(60, 158, 33, 14);
		contentPane.add(label);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(new Double(0), null, null, new Double(1)));
		spinner.setBounds(93, 158, 29, 20);
		contentPane.add(spinner);
		
		JLabel label_6 = new JLabel("M\u00B2");
		label_6.setBounds(131, 161, 21, 14);
		contentPane.add(label_6);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerNumberModel(new Double(0), null, null, new Double(1)));
		spinner_1.setBounds(93, 184, 29, 20);
		contentPane.add(spinner_1);
		
		JLabel label_10 = new JLabel("Condominio");
		label_10.setBounds(18, 184, 75, 14);
		contentPane.add(label_10);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setEnabled(false);
		spinner_2.setBounds(93, 49, 42, 20);
		spinner_2.setValue(Main.getIdLeilao_AddProduto());
		contentPane.add(spinner_2);
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setEnabled(false);
		spinner_3.setBounds(93, 75, 42, 20);
		spinner_3.setValue(ModelProduto.geraId());
		contentPane.add(spinner_3);
		
		JSpinner spinner_4 = new JSpinner();
		spinner_4.setModel(new SpinnerNumberModel(new Double(0), null, null, new Double(1)));
		spinner_4.setBounds(93, 127, 42, 20);
		contentPane.add(spinner_4);
		
		JButton button_1 = new JButton("Cancelar");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_2.setText(null);
				textField_5.setText(null);
				textField_6.setText(null);
				textField_7.setText(null);
				textField_8.setText(null);
				spinner.setValue(0);
				spinner_1.setValue(0);
				Form_Tela_CadastroGeral c = new Form_Tela_CadastroGeral();
				c.setVisible(true);
				dispose();	
			}
		});
		button_1.setBounds(311, 321, 92, 23);
		contentPane.add(button_1);
		
		JButton button = new JButton("Cadastrar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ModelProduto.AdicionarProduto(new Imoveis(
						(int) spinner_2.getValue(),
						(int) spinner_3.getValue(),
						textField_2.getText(),
						(double) spinner.getValue(),
						new Endereco(
								textField_5.getText(),
								textField_6.getText(),
								textField_7.getText(),
								textField_8.getText()
						),
						(double) spinner_4.getValue(),
						(double) spinner_1.getValue()
						
						)
				);
				
				Form_Tela_CadastroGeral c = new Form_Tela_CadastroGeral();
				c.setVisible(true);
				dispose();	
			}
		});
		button.setBounds(202, 321, 99, 23);
		contentPane.add(button);

	}

}
