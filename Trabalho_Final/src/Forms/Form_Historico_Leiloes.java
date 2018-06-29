package Forms;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import edu.fatec.leilao.Endereco;
import edu.fatec.leilao.Leiloes;
import edu.fatec.leilao.SiteLeilao;
import edu.fatec.leilao.banco.InstituicaoFinanceira;
import edu.fatec.leilao.produto.Apartamento;
import edu.fatec.leilao.produto.Casas;
import edu.fatec.leilao.produto.EnumImoveis;
import edu.fatec.leilao.produto.Imoveis;
import edu.fatec.leilao.produto.Produto;
import edu.fatec.model.ModelLeilao;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.BorderFactory;
import javax.swing.JButton;

public class Form_Historico_Leiloes extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JButton button;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form_Historico_Leiloes frame = new Form_Historico_Leiloes();
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
	public Form_Historico_Leiloes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 603, 478);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHistricoDeLeiles = new JLabel("Hist\u00F3rico de Leil\u00F5es");
		lblHistricoDeLeiles.setBounds(5, 5, 424, 19);
		lblHistricoDeLeiles.setHorizontalAlignment(SwingConstants.CENTER);
		lblHistricoDeLeiles.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(lblHistricoDeLeiles);
		
//		Object [][] dados = {
//			    {"Ana Monteiro", "48 9923-7898", "ana.monteiro@gmail.com","0","0","0","0","0","0","0"},
//			    {"João da Silva", "48 8890-3345", "joaosilva@hotmail.com","0","0","0","0","0","0","0"},
//			    {"Pedro Cascaes", "48 9870-5634", "pedrinho@gmail.com","0","0","0","0","0","0","0"}
//			};
		
		
		SiteLeilao s = new SiteLeilao();
//		s.AdicionarLeilao(new Leiloes(1,"Leilao do ze",new Endereco("Rua Ma","SJC","SP","123457"),new InstituicaoFinanceira("456789","www.bradesco","Bradesco"),LocalDate.of(2018,11,20),LocalDate.of(2018,11,29)));
		s.AdicionarProduto(new Casas(1,1,EnumImoveis.Casas.toString(),100,new Endereco("Rua M","SJC","SP","123456"),10.50,0,4,3,2));
		s.AdicionarProduto(new Casas(1,2,EnumImoveis.Casas.toString(),100,new Endereco("Rua Mas","SJC","SP","123455"),20.50,0,4,3,2));
		s.AdicionarProduto(new Casas(1,3,EnumImoveis.Casas.toString(),100,new Endereco("Rua Mdas","SJC","SP","123454"),30.50,0,4,3,2));
		s.AdicionarProduto(new Casas(1,4,EnumImoveis.Casas.toString(),100,new Endereco("Rua Masdasd","SJC","SP","143456"),40.50,0,4,3,2));
		s.AdicionarProduto(new Casas(1,5,EnumImoveis.Casas.toString(),100,new Endereco("Rua aadsM","SJC","SP","123856"),60.50,0,4,3,2));
		s.AdicionarProduto(new Apartamento(1,6,50,new Endereco("Rua aadsM","SJC","SP","1238599"),39,5,EnumImoveis.Apartamentos.toString(),15,1,2,1));
//		s.listarTodosLeilao();
		s.listarTodosProdutos();
		System.out.println(s.getListaLeilao());
		
		
		List<Produto> prod = new LinkedList();
		prod= s.buscaPorFaixa(20.0, 40.4); 
		for(Produto p:prod) {
			System.out.println(p.getClass()); //Faz somente com retorno do tipo lista 
//			System.out.println(p.toString());
//			System.out.println(p);
		}
		
		button = new JButton("Voltar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Controller janela_home = new Controller();
				janela_home.setVisible(true);
				dispose();
			}
		});
		button.setBounds(0, 0, 89, 23);
		contentPane.add(button);
		
		String [] colunas = {"ID","NOME","CEP","CIDADE","ENDERECO COMPLETO","ESTADO","CNPJ", "DATA INICIO", "DATA FIM"}; 
		DefaultTableModel tabelaModelo = new DefaultTableModel(colunas, 0);
		table_1 = new JTable(tabelaModelo);
		
		List<Leiloes> dados = ModelLeilao.getLisLeiloes();
		for (int i = 0; i < dados.size(); i++) {
			Integer id = dados.get(i).getId();
			String nome = dados.get(i).getNome();
			String cep = dados.get(i).getEndereco().cep;
			String cidade =  dados.get(i).getEndereco().cidade;
			String endereco = dados.get(i).getEndereco().enderecoCompleto; //ARRUMAR
			String estado = dados.get(i).getEndereco().estado;
			String cnpj = dados.get(i).getInstF().cnpj;
			LocalDate data_inicio =  dados.get(i).getDataInicio();
			LocalDate data_fim = dados.get(i).getDataFim();
			
			Object [] dados1 = {id, nome, cep, cidade, endereco, estado, cnpj, data_inicio, data_fim};
			tabelaModelo.addRow(dados1);
		}
		
		
		table_1.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		table_1.setBounds(10, 46, 554, 371);
		contentPane.add(table_1);
		
		
	}
}
