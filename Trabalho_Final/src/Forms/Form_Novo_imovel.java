package Forms;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import edu.fatec.leilao.Endereco;
import edu.fatec.leilao.SiteLeilao;
import edu.fatec.leilao.produto.Casas;
import edu.fatec.leilao.produto.EnumImoveis;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class Form_Novo_imovel extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private final JButton btnNewButton_1 = new JButton("Cancelar");
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form_Novo_imovel frame = new Form_Novo_imovel();
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
	public Form_Novo_imovel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 460);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNovoImvel = new JLabel("Novo: Im\u00F3vel");
		lblNovoImvel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNovoImvel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNovoImvel.setBounds(10, 0, 424, 19);
		contentPane.add(lblNovoImvel);
		
		JLabel lblNewLabel = new JLabel("ID Leil\u00E3o");
		lblNewLabel.setBounds(69, 81, 97, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(119, 78, 262, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblIdImvel = new JLabel("ID Im\u00F3vel");
		lblIdImvel.setBounds(69, 109, 97, 14);
		contentPane.add(lblIdImvel);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(119, 106, 262, 20);
		contentPane.add(textField_1);
		
		JLabel lblArea = new JLabel("Tipo");
		lblArea.setBounds(91, 137, 20, 14);
		contentPane.add(lblArea);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(119, 134, 262, 20);
		contentPane.add(textField_2);
		
		JLabel lblPreo = new JLabel("Area");
		lblPreo.setBounds(91, 167, 27, 14);
		contentPane.add(lblPreo);
		
		JComboBox<EnumImoveis> comboBox = new JComboBox<EnumImoveis>();
		comboBox.setBounds(119, 43, 262, 19);
		contentPane.add(comboBox);
		
		for (EnumImoveis c : EnumImoveis.getValues()) {
//			System.out.println(c);
			comboBox.addItem(c);
		}
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(119, 164, 262, 20);
		contentPane.add(textField_3);
		
		JLabel lblArea_1 = new JLabel("Endere\u00E7o");
		lblArea_1.setBounds(69, 197, 46, 14);
		contentPane.add(lblArea_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(119, 194, 262, 20);
		contentPane.add(textField_4);
		
		JLabel lblPreco = new JLabel("Pre\u00E7o");
		lblPreco.setBounds(84, 319, 27, 14);
		contentPane.add(lblPreco);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(119, 222, 262, 20);
		contentPane.add(textField_5);
		
		JLabel lblCidade = new JLabel("Condominio");
		lblCidade.setBounds(61, 347, 55, 14);
		contentPane.add(lblCidade);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(119, 253, 262, 20);
		contentPane.add(textField_6);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				JDialog cadastrado = new JDialog();
//				cadastrado.setVisible(true);
				SiteLeilao s = new SiteLeilao();
//				s.AdicionarProduto(new Casas(textField.getText(),textField_1.getText(),EnumImoveis.Casas.toString(),textField_8.getText(),new Endereco(textField_4.getText(),textField_5.getText(),textField_6.getText(),textField_7.getText()),10.50,0,4,3,2));
				s.AdicionarProduto(new Casas(1,1,EnumImoveis.Casas.toString(),100,new Endereco("Rua M","SJC","SP","123456"),10.50,0,4,3,2));
			//(comboBox.getSelectedItem())
			}
		});
		
		btnNewButton.setBounds(59, 387, 89, 23);
		contentPane.add(btnNewButton);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Controller janela_home = new Controller();
				janela_home.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(308, 386, 89, 25);
		contentPane.add(btnNewButton_1);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(119, 284, 262, 20);
		contentPane.add(textField_7);
		
		JLabel lblCidade_1 = new JLabel("Cidade");
		lblCidade_1.setBounds(79, 225, 46, 14);
		contentPane.add(lblCidade_1);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(119, 316, 262, 20);
		contentPane.add(textField_8);
		
		JLabel lblEstado = new JLabel("Estado");
		lblEstado.setBounds(78, 259, 33, 14);
		contentPane.add(lblEstado);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(119, 344, 262, 20);
		contentPane.add(textField_9);
		
		JLabel lblCep_1 = new JLabel("CEP");
		lblCep_1.setBounds(91, 284, 20, 14);
		contentPane.add(lblCep_1);
		
		
		
		
		
		SiteLeilao s = new SiteLeilao();

	}
}
