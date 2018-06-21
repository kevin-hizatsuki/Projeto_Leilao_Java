package Forms;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import edu.fatec.leilao.Endereco;
import edu.fatec.leilao.Leiloes;
import edu.fatec.leilao.SiteLeilao;
import edu.fatec.leilao.banco.InstituicaoFinanceira;
import edu.fatec.leilao.produto.Apartamento;
import edu.fatec.leilao.produto.Casas;
import edu.fatec.leilao.produto.EnumImoveis;
import edu.fatec.leilao.produto.Produto;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.List;

import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.JButton;

public class Form_Historico_Leiloes extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JButton button;

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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHistricoDeLeiles = new JLabel("Hist\u00F3rico de Leil\u00F5es");
		lblHistricoDeLeiles.setBounds(5, 5, 424, 19);
		lblHistricoDeLeiles.setHorizontalAlignment(SwingConstants.CENTER);
		lblHistricoDeLeiles.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(lblHistricoDeLeiles);
		
		Object [][] dados = {
			    {"Ana Monteiro", "48 9923-7898", "ana.monteiro@gmail.com"},
			    {"João da Silva", "48 8890-3345", "joaosilva@hotmail.com"},
			    {"Pedro Cascaes", "48 9870-5634", "pedrinho@gmail.com"}
			};
		
		String [] colunas = {"id","idImovel","tipo","area","endereco","preco","condominio", "garagem", "quarto","banheiro"}; 
		
		SiteLeilao s = new SiteLeilao();
		s.AdicionarLeilao(new Leiloes(1,"Leilao do ze",new Endereco("Rua Ma","SJC","SP","123457"),new InstituicaoFinanceira("456789","www.bradesco","Bradesco"),LocalDate.of(2018,11,20),LocalDate.of(2018,11,29)));
		s.AdicionarProduto(new Casas(1,1,EnumImoveis.Casas.toString(),100,new Endereco("Rua M","SJC","SP","123456"),10.50,0,4,3,2));
		s.AdicionarProduto(new Casas(1,2,EnumImoveis.Casas.toString(),100,new Endereco("Rua Mas","SJC","SP","123455"),20.50,0,4,3,2));
		s.AdicionarProduto(new Casas(1,3,EnumImoveis.Casas.toString(),100,new Endereco("Rua Mdas","SJC","SP","123454"),30.50,0,4,3,2));
		s.AdicionarProduto(new Casas(1,4,EnumImoveis.Casas.toString(),100,new Endereco("Rua Masdasd","SJC","SP","143456"),40.50,0,4,3,2));
		s.AdicionarProduto(new Casas(1,5,EnumImoveis.Casas.toString(),100,new Endereco("Rua aadsM","SJC","SP","123856"),60.50,0,4,3,2));
		s.AdicionarProduto(new Apartamento(1,6,50,new Endereco("Rua aadsM","SJC","SP","1238599"),39,5,EnumImoveis.Apartamentos.toString(),15,1,2,1));
		//s.listarTodosLeilao();
		
		//s.listarTodosProdutos();
		List<Produto> prod = new LinkedList();
		prod=s.buscaPorFaixa(20.0, 40.4); 
		
		for(Produto p:prod) {
			System.out.println(p.toString());
		}
		Object [] = 
		table = new JTable(s, colunas);
		table.setBounds(15, 35, 409, 215);
		JScrollPane barraRolagem = new JScrollPane(table);
//		contentPane.add(barraRolagem);
		contentPane.add(table);
		
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
	}

}
