package Forms;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import edu.fatec.leilao.Endereco;
import edu.fatec.leilao.Leiloes;
import edu.fatec.leilao.Main;
import edu.fatec.model.ModelLeilao;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.List;
import java.awt.event.ActionEvent;

public class Form_Leiloes_Atuais extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JLabel lblLeilesAtivos;
	private JButton button;
	private JButton btnFazerLance;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form_Leiloes_Atuais frame = new Form_Leiloes_Atuais();
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
	public Form_Leiloes_Atuais() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 422);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(5, 5, 424, 0);
		contentPane.add(label);
		
		
		String [] colunas = {"ID","NOME","CEP","CIDADE","ENDERECO COMPLETO","ESTADO","CNPJ", "DATA INICIO", "DATA FIM"}; 
		DefaultTableModel tabelaModelo = new DefaultTableModel(colunas, 0);
		
		table = new JTable(tabelaModelo);
		table.setBounds(15, 77, 409, 295);
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
		contentPane.add(table);
		
		lblLeilesAtivos = new JLabel("Leil\u00F5es Ativos");
		lblLeilesAtivos.setHorizontalAlignment(SwingConstants.CENTER);
		lblLeilesAtivos.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblLeilesAtivos.setBounds(5, 11, 424, 19);
		contentPane.add(lblLeilesAtivos);
		
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
		
		JButton btnAdicionarProduto = new JButton("Adicionar Produto");
		btnAdicionarProduto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//System.out.println((int) table.getValueAt(table.getSelectedRow(), 0));
				Main.setIdLeilao_AddProduto((int) table.getValueAt(table.getSelectedRow(), 0));// Aqui ele faz esquema X,Y - verifica qual a linha e qual a coluna para pegar o ID do produto listado
//				Main.getIdLeilao_AddProduto()
				Form_Tela_CadastroGeral cadastro_produto = new Form_Tela_CadastroGeral();
				cadastro_produto.setVisible(true);
				dispose();
			}
		});
		btnAdicionarProduto.setBounds(278, 42, 144, 26);
		contentPane.add(btnAdicionarProduto);
		
		JButton btnNovoLeilao = new JButton("Novo Leilao");
		btnNovoLeilao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Form_Cadastro_Leilao a = new Form_Cadastro_Leilao();
				a.setVisible(true);
				dispose();
			}
		});
		btnNovoLeilao.setBounds(15, 42, 115, 26);
		contentPane.add(btnNovoLeilao);
		
		btnFazerLance = new JButton("Fazer Lance");
		btnFazerLance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.setIdLeilao_AddProduto((int) table.getValueAt(table.getSelectedRow(), 0));
				Form_Lances a = new Form_Lances();
				a.setVisible(true);
				dispose();
			}
		});
		btnFazerLance.setBounds(153, 42, 113, 26);
		contentPane.add(btnFazerLance);
	}
}
