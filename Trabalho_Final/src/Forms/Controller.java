package Forms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import edu.fatec.model.ModelInstituicaoFinanceira;
import edu.fatec.model.ModelLeilao;
import edu.fatec.model.ModelProduto;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.ParseException;

public class Controller extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Controller frame = new Controller();
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
	public Controller() {
		
//		ModelLeilao leilao;
//		Leiloes l;
//		Leiloes l2;
//		Leiloes l3;
//		Leiloes l4;
//		Leiloes l5;
//		Leiloes atualizar;
//		Casas produto1;
//		Apartamento produto2;	
//		Imoveis produto3;
//		EdificiosComerciais produto4;
//		Carro produto5;
//		Veiculos produto6;
//		Endereco endereco;
//		Endereco endereco2;
//		Endereco endereco3;
//		Endereco endereco4;
//		InstituicaoFinanceira banco; 
		
		
//		banco = new InstituicaoFinanceira("123456","www.itau.com","Itau");
//		endereco = new Endereco("Rua x", "SJC", "SP", "123456");
//		endereco2 = new Endereco("Rua y", "SJC", "SP", "123457");
//		endereco3 = new Endereco("Rua z", "SJC", "SP", "123458");
//		endereco4 = new Endereco("Rua h", "SJC", "SP", "123459");
//		l = new Leiloes(1, "Leilao do ze", endereco, banco, LocalDate.of(2018, 6, 16), LocalDate.of(2018, 7, 25));
//		l2 = new Leiloes(2, "Leilao do ze 2", endereco, banco, LocalDate.of(2018, 6, 1), LocalDate.of(2018, 6, 18));	
//		l3 = new Leiloes(3, "Leilao do ze 3", endereco, banco, LocalDate.of(2018, 6, 21), LocalDate.of(2018, 9, 25));
//		l4 = new Leiloes(4, "Leilao do ze 4", endereco, banco, LocalDate.of(2018, 6, 21), LocalDate.of(2018, 6, 25));
//		l5 = new Leiloes(5, "Leilao do ze 5", endereco, banco, LocalDate.of(2018, 6, 21), LocalDate.of(2018, 6, 25));
//		produto1 = new Casas(1, 1, "Casas", 150, endereco, 150, 0, 2, 2, 1);
//		produto2 = new Apartamento(1, 2, 100, endereco2, 200, 0.5, "Apartamentos", 15, 1, 2, 2);
//		produto3 = new Imoveis(1, 3, "Terrenos", 120, endereco3, 60, 0);
//		produto4 = new EdificiosComerciais(1, 4, 50, endereco4, 100, 0.6, EnumImoveis.Edificios_Comerciais.toString(), 2, 3, 3, 1, 30);
//		produto5 = new Carro(1, 5, "Carros", "Ford", "Fusion", 4.0, 2017, "Automatico", 50, "Gasolina", 70, 4);
		
		
		
//		ModelLeilao.AdicionarLeilao(l);
//		ModelLeilao.AdicionarLeilao(l2);
//		ModelLeilao.AdicionarLeilao(l3);
//		ModelLeilao.AdicionarLeilao(l4);
//		ModelLeilao.AdicionarLeilao(l5);
//		ModelProduto.AdicionarProduto(produto1);
//		ModelProduto.AdicionarProduto(produto2);
//		ModelProduto.AdicionarProduto(produto3);
//		ModelProduto.AdicionarProduto(produto4);
//		ModelProduto.AdicionarProduto(produto5);
		
		 
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 344);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(" Bem-Vindo ao Sistema de Leil\u00F5es Eletr\u00F4nicos (SLE) ");
		lblNewLabel.setBounds(5, 5, 424, 19);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(lblNewLabel);
		 
		JButton btnChecarLeilesAtuais = new JButton("Area de Leil\u00F5es");
		btnChecarLeilesAtuais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				ModelLeilao leilao = new ModelLeilao();
				//System.out.println(ModelLeilao.getLisLeiloes());
				if (ModelLeilao.getLisLeiloes().size()<1) {
					Form_Cadastro_Leilao a = null;
					try {
						a = new Form_Cadastro_Leilao();
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					a.setVisible(true);
					dispose();
				} 
				else {
				Form_Leiloes_Atuais janela_leiloes_atuais = new Form_Leiloes_Atuais();
				janela_leiloes_atuais.setVisible(true);
				dispose();
				}
			}
		});
		btnChecarLeilesAtuais.setBounds(128, 36, 164, 71);
		contentPane.add(btnChecarLeilesAtuais);
		
		JButton btnHistricoDeLeiles = new JButton("Hist\u00F3rico de\r\n Leil\u00F5es");
		btnHistricoDeLeiles.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Form_Historico_Leiloes janela_historico_leiloes = new Form_Historico_Leiloes();
				janela_historico_leiloes.setVisible(true);
				dispose();
				
			}
		});
		btnHistricoDeLeiles.setBounds(128, 202, 164, 71);
		contentPane.add(btnHistricoDeLeiles);
		
		JButton btnLeiloesFinalizados = new JButton("Leiloes Finalizados");
		btnLeiloesFinalizados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Form_Vencedores_Leilao a = new Form_Vencedores_Leilao();
				a.setVisible(true);
				dispose();
			}
		});
		btnLeiloesFinalizados.setBounds(128, 119, 164, 71);
		contentPane.add(btnLeiloesFinalizados);
		
		JButton btnSair = new JButton("Exit");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					ModelLeilao.gerarArquivo(ModelLeilao.getLisLeiloes());
//					ModelCliente.gerarArquivo(ModelCliente.getLisLeiloes());
//					ModelLance.gerarArquivo(ModelLance.getLisLeiloes());
					ModelProduto.gerarArquivo(ModelProduto.getLisProduto());
					ModelInstituicaoFinanceira.gerarArquivo(ModelInstituicaoFinanceira.getListInstituicaoFinanceira());
					System.exit(0);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnSair.setBounds(331, 279, 98, 26);
		contentPane.add(btnSair);
	}
 

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
