package Forms;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import edu.fatec.leilao.Main;
import edu.fatec.leilao.produto.EnumVeiculo;
import edu.fatec.leilao.produto.Produto;
import edu.fatec.leilao.produto.Veiculos;
import edu.fatec.model.ModelProduto;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;

public class Form_Cadastro_Motocicleta extends JFrame {

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
					Form_Cadastro_Motocicleta frame = new Form_Cadastro_Motocicleta();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * 				
	 * Create the frame.
	 */
	public Form_Cadastro_Motocicleta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 421);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(316, 348, 89, 23);
		contentPane.add(btnCancelar);
		
		JLabel lblCadastroDeMotocicleta = new JLabel("Cadastro de Motocicleta");
		lblCadastroDeMotocicleta.setBounds(147, 11, 144, 14);
		contentPane.add(lblCadastroDeMotocicleta);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(181, 36, 14, 14);
		contentPane.add(lblNewLabel);
		
		JSpinner spinner = new JSpinner();
		spinner.setEnabled(false);
		spinner.setBounds(205, 36, 55, 20);
		spinner.setValue(Main.getIdLeilao_AddProduto());
		contentPane.add(spinner);
		
		JLabel lblIdveiculo = new JLabel("IdVeiculo");
		lblIdveiculo.setBounds(148, 64, 62, 14);
		contentPane.add(lblIdveiculo);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setEnabled(false);
		spinner_1.setBounds(205, 61, 55, 20);
		spinner_1.setValue(ModelProduto.geraId());
		contentPane.add(spinner_1);
		
		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setBounds(171, 88, 24, 14);
		contentPane.add(lblTipo);
		
		textField = new JTextField();
		textField.setEnabled(false);
		textField.setBounds(205, 88, 139, 20);
		contentPane.add(textField);
		textField.setText(EnumVeiculo.Motocicletas.toString());
		textField.setColumns(10);
		
		JLabel lblMarca = new JLabel("Marca");
		lblMarca.setBounds(162, 117, 48, 14);
		contentPane.add(lblMarca);
		
		textField_1 = new JTextField();
		textField_1.setBounds(205, 114, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(147, 139, 48, 14);
		contentPane.add(lblModelo);
		
		textField_2 = new JTextField();
		textField_2.setBounds(205, 139, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblCilindrada = new JLabel("Cilindrada");
		lblCilindrada.setBounds(133, 167, 57, 14);
		contentPane.add(lblCilindrada);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setModel(new SpinnerNumberModel(new Double(0), null, null, new Double(1)));
		spinner_2.setBounds(205, 164, 63, 20);
		contentPane.add(spinner_2);
		
		JLabel lblAno = new JLabel("Ano");
		lblAno.setBounds(171, 191, 24, 14);
		contentPane.add(lblAno);
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setBounds(205, 191, 53, 20);
		contentPane.add(spinner_3);
		
		JLabel lblCambio = new JLabel("Cambio");
		lblCambio.setBounds(147, 214, 48, 14);
		contentPane.add(lblCambio);
		
		textField_3 = new JTextField();
		textField_3.setBounds(205, 214, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblKm = new JLabel("Km");
		lblKm.setBounds(171, 239, 24, 14);
		contentPane.add(lblKm);
		
		JSpinner spinner_4 = new JSpinner();
		spinner_4.setModel(new SpinnerNumberModel(new Double(0), null, null, new Double(1)));
		spinner_4.setBounds(205, 239, 71, 20);
		contentPane.add(spinner_4);
		
		JLabel lblCombustivel = new JLabel("Combustivel");
		lblCombustivel.setBounds(124, 270, 71, 14);
		contentPane.add(lblCombustivel);
		
		textField_4 = new JTextField();
		textField_4.setBounds(205, 270, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblValor = new JLabel("Valor");
		lblValor.setBounds(157, 301, 38, 14);
		contentPane.add(lblValor);
		
		JSpinner spinner_5 = new JSpinner();
		spinner_5.setModel(new SpinnerNumberModel(new Double(0), null, null, new Double(1)));
		spinner_5.setBounds(205, 298, 29, 20);
		contentPane.add(spinner_5);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Produto a = new Veiculos(
						(int) spinner.getValue(),	
						(int) spinner_1.getValue(),
						textField.getText(),
						textField_1.getText(),
						textField_2.getText(),
						(double) spinner_2.getValue(),
						(int) spinner_3.getValue(),
						textField_3.getText(),
						(double) spinner_4.getValue(),
						textField_4.getText(),
						(double) spinner_5.getValue()
				);
				ModelProduto.AdicionarProduto(a);
				
				Form_Tela_CadastroGeral c = new Form_Tela_CadastroGeral();
				c.setVisible(true);
				dispose();	
			}
		});
		btnCadastrar.setBounds(10, 348, 97, 23);
		contentPane.add(btnCadastrar);
		
		
	}
}
