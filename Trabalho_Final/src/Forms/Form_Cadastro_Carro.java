package Forms;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import edu.fatec.leilao.Main;
import edu.fatec.leilao.produto.Carro;
import edu.fatec.leilao.produto.Produto;
import edu.fatec.model.ModelLeilao;
import edu.fatec.model.ModelProduto;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SpinnerDateModel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class Form_Cadastro_Carro extends JFrame {

	private JPanel contentPane;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form_Cadastro_Carro frame = new Form_Cadastro_Carro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * 				Form_Novo_Leilao c = new Form_Novo_Leilao();
				c.setVisible(true);
				dispose();
	 * Create the frame.
	 */
	public Form_Cadastro_Carro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 464);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblCadastroDeNovo = new JLabel("Cadastro de Novo Carro");
		lblCadastroDeNovo.setBounds(96, 7, 293, 19);
		lblCadastroDeNovo.setFont(new Font("Arial", Font.BOLD, 13));
		lblCadastroDeNovo.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblIdLeilo = new JLabel("ID Leil\u00E3o");
		lblIdLeilo.setBounds(80, 64, 48, 16);
		
		JLabel lblIdProduto = new JLabel("ID Produto");
		lblIdProduto.setBounds(69, 90, 59, 16);
		
		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setBounds(104, 115, 24, 16);
		
		textField_2 = new JTextField();
		textField_2.setBounds(140, 114, 196, 17);
		textField_2.setColumns(10);
		
		JLabel lblPreo = new JLabel("Marca");
		lblPreo.setBounds(80, 138, 48, 16);
		
		textField_3 = new JTextField();
		textField_3.setBounds(140, 137, 196, 18);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(140, 166, 196, 18);
		contentPane.add(textField_4);
		
		JLabel lblCilindrada = new JLabel("Cilindrada");
		lblCilindrada.setBounds(69, 196, 66, 16);
		contentPane.add(lblCilindrada);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(new Double(0), null, null, new Double(1)));
		spinner.setBounds(140, 194, 38, 18);
		contentPane.add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(140, 224, 38, 18);
		contentPane.add(spinner_1);
		
		JLabel lblAno = new JLabel("Ano");
		lblAno.setBounds(111, 226, 24, 16);
		contentPane.add(lblAno);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(140, 247, 196, 18);
		contentPane.add(textField_5);
		
		JLabel lblCambio = new JLabel("Cambio");
		lblCambio.setBounds(80, 248, 48, 16);
		contentPane.add(lblCambio);
		
		JLabel lblKm = new JLabel("Km");
		lblKm.setBounds(111, 279, 24, 16);
		contentPane.add(lblKm);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setModel(new SpinnerNumberModel(new Double(0), null, null, new Double(1)));
		spinner_2.setBounds(140, 277, 38, 18);
		contentPane.add(spinner_2);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(140, 306, 196, 18);
		contentPane.add(textField_6);
		
		JLabel lblCombustivel = new JLabel("Combustivel");
		lblCombustivel.setBounds(54, 307, 74, 16);
		contentPane.add(lblCombustivel);
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setModel(new SpinnerNumberModel(new Double(0), null, null, new Double(1)));
		spinner_3.setBounds(140, 337, 38, 18);
		contentPane.add(spinner_3);
		
		JLabel lblValor = new JLabel("Valor");
		lblValor.setBounds(96, 339, 39, 16);
		contentPane.add(lblValor);
		
		JSpinner spinner_4 = new JSpinner();
		spinner_4.setBounds(140, 369, 38, 18);
		contentPane.add(spinner_4);
		
		JLabel lblNumeroPorta = new JLabel("Numero Porta");
		lblNumeroPorta.setBounds(54, 371, 81, 16);
		contentPane.add(lblNumeroPorta);
		
		JSpinner spinner_5 = new JSpinner();
		spinner_5.setEnabled(false);
		spinner_5.setBounds(140, 63, 66, 18);
		spinner_5.setValue(Main.getIdLeilao_AddProduto());
		contentPane.add(spinner_5);
		
		JSpinner spinner_6 = new JSpinner();
		spinner_6.setEnabled(false);
		spinner_6.setBounds(140, 88, 59, 18);
		spinner_6.setValue(ModelProduto.geraId());
		contentPane.add(spinner_6);
		
		JButton btnNewButton_1 = new JButton("Cadastrar");
		btnNewButton_1.setBounds(37, 399, 91, 26);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Carro a = new Carro( 
						(int) spinner_5.getValue(),
						(int) spinner_6.getValue(),
						textField_2.getText(),
						textField_3.getText(),
						textField_4.getText(),
						(double) spinner.getValue(),
						(int)spinner_1.getValue(),
						textField_5.getText(),
						(double)spinner_2.getValue(),
						textField_6.getText(),
						(double)spinner_3.getValue(),
						(int)spinner_4.getValue()
				);
				
				ModelProduto.AdicionarProduto(a);
//				System.out.println(ModelProduto.getProdutosPorLeilao(Main.getIdLeilao_AddProduto()));
				Form_Tela_CadastroGeral cadastro_produto = new Form_Tela_CadastroGeral();
				cadastro_produto.setVisible(true);
				dispose();
			}
		});
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(337, 399, 85, 26);
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Form_Tela_CadastroGeral c = new Form_Tela_CadastroGeral();
				c.setVisible(true);
				dispose();	
				
			}
		});
		contentPane.setLayout(null);
		contentPane.add(lblCadastroDeNovo);
		contentPane.add(lblIdProduto);
		contentPane.add(lblIdLeilo);
		contentPane.add(lblTipo);
		contentPane.add(lblPreo);
		contentPane.add(textField_2);
		contentPane.add(textField_3);
		contentPane.add(btnNewButton_1);
		contentPane.add(btnCancelar);
		
		JLabel lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(80, 167, 48, 16);
		contentPane.add(lblModelo);
		

		
		
	}
}
