package Forms;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import edu.fatec.leilao.Endereco;
import edu.fatec.leilao.Leiloes;
import edu.fatec.leilao.banco.InstituicaoFinanceira;
import edu.fatec.model.ModelLeilao;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.awt.event.ActionEvent;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.DropMode;

public class Form_Cadastro_Leilao extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
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
					Form_Cadastro_Leilao frame = new Form_Cadastro_Leilao();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
 
	/**
	 * Create the frame.
	 * @throws ParseException 
	 */
	public Form_Cadastro_Leilao() throws ParseException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 460);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastroDeLeilao = new JLabel("Cadastro de Leilao");
		lblCadastroDeLeilao.setBounds(160, 11, 126, 14);
		contentPane.add(lblCadastroDeLeilao);
		
		JLabel lblId = new JLabel("Id");
		lblId.setBounds(112, 39, 19, 14);
		contentPane.add(lblId);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(141, 36, 203, 20);
		textField.setText(String.valueOf(ModelLeilao.getLisLeiloes().size()+1));
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(96, 70, 35, 14);
		contentPane.add(lblNome);
		
		textField_1 = new JTextField();
		textField_1.setBounds(141, 67, 203, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblDataDeInicio = new JLabel("Data de Inicio");
		lblDataDeInicio.setBounds(52, 307, 79, 14);
		contentPane.add(lblDataDeInicio);
		
		
		
		//teste
	    MaskFormatter mf1 = null;
		mf1 = new MaskFormatter("##/##/####");
	    mf1.setPlaceholderCharacter('_');
		JFormattedTextField formattedTextField = new JFormattedTextField(mf1);
		formattedTextField.setBounds(141, 302, 89, 25);
		contentPane.add(formattedTextField);
		
	
	    //teste
	    
	    
	    
	    
		JLabel lblDataFim = new JLabel("Data Fim");
		lblDataFim.setBounds(82, 335, 49, 14);
		contentPane.add(lblDataFim);
		
		
	    MaskFormatter mf2 = null;
		mf2 = new MaskFormatter("##/##/####");
		mf2.setPlaceholderCharacter('_');
		JFormattedTextField formattedTextField_1 = new JFormattedTextField(mf2);
		formattedTextField_1.setBounds(141, 333, 89, 23);
		contentPane.add(formattedTextField_1);
		
		
		
		
		JLabel lblEnderecoCompleto = new JLabel("Endereco Completo");
		lblEnderecoCompleto.setBounds(19, 98, 112, 14);
		contentPane.add(lblEnderecoCompleto);
		
		textField_2 = new JTextField();
		textField_2.setBounds(141, 95, 203, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setBounds(85, 126, 46, 14);
		contentPane.add(lblCidade);
		
		textField_4 = new JTextField();
		textField_4.setBounds(141, 123, 203, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblEstado = new JLabel("Estado");
		lblEstado.setBounds(92, 155, 39, 14);
		contentPane.add(lblEstado);
		
		textField_5 = new JTextField();
		textField_5.setBounds(141, 152, 203, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("CEP");
		lblNewLabel.setBounds(104, 180, 27, 14);
		contentPane.add(lblNewLabel);
		
		
		textField_6 = new JTextField();
		textField_6.setBounds(141, 183, 203, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ModelLeilao c = new ModelLeilao();
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				
				c.AdicionarLeilao(
				new Leiloes(Integer.valueOf(textField.getText()),textField_1.getText(),
				new Endereco(textField_2.getText(),textField_4.getText(),textField_5.getText(),textField_6.getText()),
				new InstituicaoFinanceira(textField_9.getText(), textField_8.getText(), textField_7.getText()),LocalDate.parse(formattedTextField.getText(), formatter), LocalDate.parse(formattedTextField_1.getText(), formatter)));
				
				System.out.println("Saida data inicio: "+formattedTextField.getText()+" - "+formattedTextField.getClass());
				System.out.println("Saida data Fim: "+formattedTextField_1.getText()+" - "+formattedTextField_1.getClass());
				
				Form_Leiloes_Atuais janela_leiloes_atuais = new Form_Leiloes_Atuais();
				janela_leiloes_atuais.setVisible(true);
				dispose();
				
				

			}
		});
		btnCadastrar.setBounds(77, 363, 100, 23);
		contentPane.add(btnCadastrar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				
				Controller a = new Controller();
				a.setVisible(true);

				dispose();
			}
		});
		btnCancelar.setBounds(299, 363, 89, 23);
		contentPane.add(btnCancelar);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(141, 273, 203, 20);
		contentPane.add(textField_7);
		
		JLabel label = new JLabel("Raz\u00E3o Social");
		label.setBounds(58, 277, 73, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Site");
		label_1.setBounds(104, 245, 27, 16);
		contentPane.add(label_1);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(141, 246, 203, 20);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(141, 219, 203, 20);
		contentPane.add(textField_9);
		
		JLabel label_2 = new JLabel("CNPJ");
		label_2.setBounds(100, 218, 31, 16);
		contentPane.add(label_2);
	}
}
