package Forms;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import edu.fatec.leilao.Endereco;
import edu.fatec.leilao.Main;
import edu.fatec.leilao.produto.Casas;
import edu.fatec.model.ModelProduto;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class Form_Cadastro_Casa extends JFrame {

	private JPanel contentPane;
	private JTextField txtTipo;
	private JTextField txtPreo;
	private JTextField textField_1;
	private JTextField txtCidade;
	private JTextField txtEstado;
	private JTextField txtCep;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form_Cadastro_Casa frame = new Form_Cadastro_Casa();
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
	public Form_Cadastro_Casa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 436);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblIdLeilo = new JLabel("ID Leil\u00E3o");
		lblIdLeilo.setBounds(29, 60, 55, 16);
		
		JLabel lblIdProduto = new JLabel("ID Produto");
		lblIdProduto.setBounds(25, 86, 59, 16);
		
		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setBounds(60, 112, 24, 16);
		
		txtTipo = new JTextField();
		txtTipo.setBounds(88, 112, 114, 20);
		txtTipo.setColumns(10);
		
		JLabel lblPreo = new JLabel("Pre\u00E7o");
		lblPreo.setBounds(50, 138, 34, 16);
		
		txtPreo = new JTextField();
		txtPreo.setBounds(88, 138, 114, 20);
		txtPreo.setColumns(10);
		
		JLabel lblArea = new JLabel("Area");
		lblArea.setBounds(57, 164, 27, 16);
		
		JLabel lblEndereo = new JLabel("Rua");
		lblEndereo.setBounds(62, 218, 22, 16);
		
		textField_1 = new JTextField();
		textField_1.setBounds(88, 218, 114, 20);
		textField_1.setColumns(10);
		
		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setBounds(45, 244, 39, 16);
		
		txtCidade = new JTextField();
		txtCidade.setBounds(88, 244, 114, 20);
		txtCidade.setColumns(10);
		
		JLabel lblEstado = new JLabel("Estado");
		lblEstado.setBounds(45, 270, 39, 16);
		
		txtEstado = new JTextField();
		txtEstado.setBounds(88, 270, 114, 20);
		txtEstado.setColumns(10);
		
		JLabel lblCep = new JLabel("CEP");
		lblCep.setBounds(61, 296, 23, 16);
		
		txtCep = new JTextField();
		txtCep.setBounds(88, 296, 114, 20);
		txtCep.setColumns(10);
		
		
		
		
		
		JLabel lblCadastroDe = new JLabel("Cadastro de Casa");
		lblCadastroDe.setBounds(108, 5, 281, 21);
		lblCadastroDe.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastroDe.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel lblGaragem = new JLabel("Garagem");
		lblGaragem.setBounds(32, 322, 52, 16);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(88, 322, 27, 20);
		
		JLabel lblQuarto = new JLabel("Quarto");
		lblQuarto.setBounds(45, 348, 39, 16);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(88, 348, 27, 20);
		
		JLabel lblBanheiro = new JLabel("Banheiro");
		lblBanheiro.setBounds(33, 375, 51, 16);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setBounds(88, 373, 27, 20);
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setModel(new SpinnerNumberModel(new Double(0), null, null, new Double(1)));
		spinner_3.setBounds(88, 164, 27, 20);
		
		JLabel lblM = new JLabel("M\u00B2");
		lblM.setBounds(119, 164, 14, 16);
		
		JLabel lblCondominio = new JLabel("Condominio");
		lblCondominio.setBounds(17, 189, 67, 16);
		
		JSpinner spinner_4 = new JSpinner();
		spinner_4.setModel(new SpinnerNumberModel(new Double(0), null, null, new Double(1)));
		spinner_4.setBounds(88, 190, 27, 20);
		
		
		JSpinner spinner_5 = new JSpinner();
		spinner_5.setEnabled(false);
		spinner_5.setModel(new SpinnerNumberModel(new Integer(0), null, null, new Integer(1)));
		spinner_5.setBounds(88, 58, 45, 20);
		spinner_5.setValue(Main.getIdLeilao_AddProduto());
		contentPane.add(spinner_5);
		
		JSpinner spinner_6 = new JSpinner();
		spinner_6.setEnabled(false);
		spinner_6.setModel(new SpinnerNumberModel(new Integer(0), null, null, new Integer(1)));
		spinner_6.setBounds(88, 84, 45, 20);
		spinner_6.setValue(ModelProduto.geraId());
		contentPane.add(spinner_6);

		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Casas a = new Casas(
						Main.getIdLeilao_AddProduto(), //Id
						(Integer) spinner_6.getValue(),//IdImovel
						txtTipo.getText(),
						(double) spinner_3.getValue(), //Tipo do produto
						new Endereco(
								textField_1.getText(),
								txtCidade.getText(),
								txtEstado.getText(),
								txtCep.getText()
								),
						Double.valueOf(txtPreo.getText()),
						(double) spinner_4.getValue(),
						(int) spinner.getValue(),
						(int) spinner_1.getValue(),
						(int) spinner_2.getValue()
						);
				ModelProduto.AdicionarProduto(a);
//				System.out.println(ModelProduto.getProdutosPorLeilao(Main.getIdLeilao_AddProduto()));
				Form_Tela_CadastroGeral cadastro_produto = new Form_Tela_CadastroGeral();
				cadastro_produto.setVisible(true);
				dispose();
			}
		});
		btnCadastrar.setBounds(157, 365, 91, 26);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(337, 370, 85, 26);
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				spinner_5.setValue(null);
				textField_1.setText(null);
				spinner_6.setValue(null);
				txtCep.setText(null);
				txtCidade.setText(null);
				txtEstado.setText(null);
				txtPreo.setText(null);
				txtTipo.setText(null);
				textField_1.setText(null);
				spinner.setValue(0);
				spinner_1.setValue(0);
				spinner_2.setValue(0);
				spinner_3.setValue(0);
				spinner_4.setValue(0);
				Form_Tela_CadastroGeral c = new Form_Tela_CadastroGeral();
				c.setVisible(true);
				dispose();	
			}
		});
		contentPane.setLayout(null);
		contentPane.add(lblCadastroDe);
		contentPane.add(lblTipo);
		contentPane.add(txtTipo);
		contentPane.add(lblPreo);
		contentPane.add(txtPreo);
		contentPane.add(lblEndereo);
		contentPane.add(textField_1);
		contentPane.add(lblCidade);
		contentPane.add(txtCidade);
		contentPane.add(lblEstado);
		contentPane.add(txtEstado);
		contentPane.add(lblCep);
		contentPane.add(txtCep);
		contentPane.add(lblGaragem);
		contentPane.add(spinner);
		contentPane.add(lblQuarto);
		contentPane.add(lblBanheiro);
		contentPane.add(spinner_1);
		contentPane.add(spinner_2);
		contentPane.add(btnCadastrar);
		contentPane.add(btnCancelar);
		contentPane.add(lblCondominio);
		contentPane.add(lblArea);
		contentPane.add(spinner_3);
		contentPane.add(lblM);
		contentPane.add(spinner_4);
		contentPane.add(lblIdLeilo);
		contentPane.add(lblIdProduto);
	}
}
