package Forms;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import edu.fatec.leilao.Leiloes;
import edu.fatec.leilao.Main;
import edu.fatec.model.ModelLeilao;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JSpinner;

public class Form_Cadastro_Terreno extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
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
		
		JButton button = new JButton("Cadastrar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Main.getIdLeilao_AddProduto();//Id do leilao que o produto sera cadastrado!!
				ModelLeilao.AtualizarLeilao(id, atualizar);
			}
		});
		button.setBounds(202, 321, 99, 23);
		contentPane.add(button);
		
		
		
		
		
		JLabel lblCadastroDeTerrenos = new JLabel("Cadastro de Terrenos");
		lblCadastroDeTerrenos.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastroDeTerrenos.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCadastroDeTerrenos.setBounds(93, 0, 281, 21);
		contentPane.add(lblCadastroDeTerrenos);
		
		JLabel label_1 = new JLabel("ID Leil\u00E3o");
		label_1.setBounds(35, 52, 58, 14);
		contentPane.add(label_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(93, 52, 86, 20);
		contentPane.add(textField);
		
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
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(93, 78, 86, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(93, 104, 86, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(93, 130, 86, 20);
		contentPane.add(textField_3);
		
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
		spinner.setBounds(93, 158, 29, 20);
		contentPane.add(spinner);
		
		JLabel label_6 = new JLabel("M\u00B2");
		label_6.setBounds(131, 161, 21, 14);
		contentPane.add(label_6);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(93, 184, 29, 20);
		contentPane.add(spinner_1);
		
		JLabel label_10 = new JLabel("Condominio");
		label_10.setBounds(18, 184, 75, 14);
		contentPane.add(label_10);
		
		JButton button_1 = new JButton("Cancelar");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
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
	}

}
