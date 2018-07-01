package Forms;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import edu.fatec.leilao.Leiloes;
import edu.fatec.leilao.Main;
import edu.fatec.leilao.produto.EnumImoveis;
import edu.fatec.leilao.produto.EnumVeiculo;
import edu.fatec.leilao.produto.Produto;
import edu.fatec.leilao.usuario.Cliente;
import edu.fatec.leilao.usuario.EnumUsuario;
import edu.fatec.leilao.usuario.Lance;
import edu.fatec.leilao.usuario.Usuario;
import edu.fatec.model.ModelCliente;
import edu.fatec.model.ModelLance;
import edu.fatec.model.ModelLeilao;
import edu.fatec.model.ModelProduto;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JList;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.JSeparator;

public class Form_Lances extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form_Lances frame = new Form_Lances();
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
	public Form_Lances() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 501, 476);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLeiloNumero = new JLabel("Leil\u00E3o Numero: ");
		lblLeiloNumero.setFont(new Font("Dialog", Font.BOLD, 15));
		lblLeiloNumero.setBounds(157, 9, 134, 14);
		contentPane.add(lblLeiloNumero);
		
		JLabel lblNa = new JLabel("N/A");
		lblNa.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNa.setBounds(268, 9, 55, 16);
		lblNa.setText(String.valueOf(Main.getIdLeilao_AddProduto()));
		contentPane.add(lblNa);
		
		String [] colunas = {"ID","TIPO","PRECO"}; 
		DefaultTableModel tabelaModelo = new DefaultTableModel(colunas, 0);
		
		table = new JTable(tabelaModelo);
		table.setBounds(12, 192, 461, 233);
		List<Produto> dados = ModelProduto.getProdutosPorLeilao(Main.getIdLeilao_AddProduto());
		for (int i = 0; i < dados.size(); i++) {
			Integer id = dados.get(i).getIdProduto();
			String tipo = dados.get(i).getTipo();
			double preco = dados.get(i).getPreco();
			
			
			Object [] dados1 = {id,tipo, preco};
			tabelaModelo.addRow(dados1);
		}
		contentPane.add(table);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Form_Leiloes_Atuais a = new Form_Leiloes_Atuais();
				a.setVisible(true);
				dispose();
			}
		});
		btnVoltar.setBounds(0, -1, 98, 26);
		contentPane.add(btnVoltar);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(new Double(0), null, null, new Double(1)));
		spinner.setBounds(37, 53, 107, 29);
		contentPane.add(spinner);
		
		JButton btnNewButton = new JButton("Fazer Lance!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Usuario usuario1 = new Cliente(EnumUsuario.Cliente, "123456", "Jose", "JOJO", "123");
				ModelCliente.adicionarCliente(usuario1);
				Main.setIdUsuarioLogado(usuario1.getUser());
				
//				System.out.println("Usuario: "+Main.getIdUsuarioLogado());
//				System.out.println("Usuario logado?:"+ModelCliente.getObjClienteLogado(Main.getIdUsuarioLogado().toString()));
				ModelLance.adicionarLance(
						new Lance(
								1,
								ModelLeilao.getLeilao((int)Main.getIdLeilao_AddProduto()),
								ModelProduto.getProdutoDoLeilaoX((int) table.getValueAt(table.getSelectedRow(), 0),Main.getIdLeilao_AddProduto()),
								ModelCliente.getObjClienteLogado(Main.getIdUsuarioLogado()),
								(double)spinner.getValue()
						)
				);
//				System.out.println((int) table.getValueAt(table.getSelectedRow(), 0));
//				System.out.println(ModelProduto.getProdutoDoLeilaoX((int) table.getValueAt(table.getSelectedRow(), 0),Main.getIdLeilao_AddProduto()));
				
//				System.out.println(ModelLance.getLisLance());
				
				tabelaModelo.setRowCount(0);
				for (int i = 0; i < dados.size(); i++) {
					Integer id = dados.get(i).getIdProduto();
					String tipo = dados.get(i).getTipo();
					double preco = dados.get(i).getPreco();
					
					
					Object [] dados1 = {id,tipo, preco,};
					tabelaModelo.addRow(dados1);
				}
				
				spinner.setValue(0);
				
				
				 
				//Teste de vencedores
//				System.out.println(.toString());
				
				
				Map<Integer,Cliente> vencedor = new HashMap();
				vencedor = ModelLance.getVencedor(dados);
				Set chaves = vencedor.keySet(); 
				for(Object i:chaves) {
					System.out.println(vencedor.get(i));
					System.out.println(ModelProduto.retornarPorId(Integer.parseInt(i.toString())));
				}
			}
			
			
		});
		btnNewButton.setBounds(148, 54, 113, 26);
		contentPane.add(btnNewButton);
		
		JLabel lblBuscar = new JLabel("Buscar");
		lblBuscar.setBounds(218, 109, 55, 16);
		contentPane.add(lblBuscar);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerNumberModel(new Double(0), null, null, new Double(1)));
		spinner_1.setBounds(12, 140, 55, 20);
		contentPane.add(spinner_1);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setModel(new SpinnerNumberModel(new Double(0), null, null, new Double(1)));
		spinner_2.setBounds(71, 140, 60, 20);
		contentPane.add(spinner_2);
		
		JLabel lblFaixa = new JLabel("Pesquisa por Faixa");
		lblFaixa.setBounds(18, 119, 113, 16);
		contentPane.add(lblFaixa);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				List<Produto> pesquisaFaixaProduto = ModelProduto.buscaPorFaixa((double) spinner_1.getValue(), (double) spinner_2.getValue());
				tabelaModelo.setRowCount(0);
				for (int i = 0; i < pesquisaFaixaProduto.size(); i++) {
					Integer id = pesquisaFaixaProduto.get(i).getIdProduto();
					String tipo = pesquisaFaixaProduto.get(i).getTipo();
					double preco = pesquisaFaixaProduto.get(i).getPreco();
					
					Object [] dados1 = {id,tipo, preco,};
					tabelaModelo.addRow(dados1);
				}
			}
		});
		btnPesquisar.setBounds(134, 137, 98, 26);
		contentPane.add(btnPesquisar);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(236, 137, 121, 26);
		for (EnumImoveis c : EnumImoveis.values()) {
			if (c.toString() != "Nenhum") {
				comboBox.addItem(c);
			}
		}
		for (EnumVeiculo c : EnumVeiculo.values()) {
			if (c.toString() != "Nenhum") {
				comboBox.addItem(c);
			}
		}
		contentPane.add(comboBox);
		
		
		JButton btnPesquisar_1 = new JButton("Pesquisar");
		btnPesquisar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				List<Produto> pesquisaCategoria = ModelProduto.getLisProduto();
				if ( comboBox.getSelectedIndex() <= 3) {
					switch (comboBox.getSelectedItem().toString().toLowerCase()) {
					case "apartamentos":
						
						tabelaModelo.setRowCount(0);
						
						for (Produto produto : pesquisaCategoria) {
							if(produto.getTipo().toString().equals(comboBox.getSelectedItem().toString())) {
								
								Integer id = produto.getIdProduto();
								String tipo = produto.getTipo();
								double preco = produto.getPreco();
								
								Object [] dados1 = {id,tipo, preco,};
								tabelaModelo.addRow(dados1);
							}
						}
						
						
						break;
					case "terrenos":
						
						tabelaModelo.setRowCount(0);
						
						for (Produto produto : pesquisaCategoria) {
							System.out.println("Categoria Produto: "+produto.getTipo().toString());
							System.out.println("Selecionado ComboBox: "+comboBox.getSelectedItem().toString()+"\n");
							if(produto.getTipo().toString().equals(comboBox.getSelectedItem().toString())) {
								
								Integer id = produto.getIdProduto();
								String tipo = produto.getTipo();
								double preco = produto.getPreco();
								
								Object [] dados1 = {id,tipo, preco,};
								tabelaModelo.addRow(dados1);
							}
						}
						
						
						break;
					case "casas":
						
						tabelaModelo.setRowCount(0);
						
						for (Produto produto : pesquisaCategoria) {
							System.out.println("Categoria Produto: "+produto.getTipo().toString());
							System.out.println("Selecionado ComboBox: "+comboBox.getSelectedItem().toString()+"\n");
							if(produto.getTipo().toString().equals(comboBox.getSelectedItem().toString())) {
								
								Integer id = produto.getIdProduto();
								String tipo = produto.getTipo();
								double preco = produto.getPreco();
								
								Object [] dados1 = {id,tipo, preco,};
								tabelaModelo.addRow(dados1);
							}
						}
						
						break;
					case "edificios_comerciais":
						
						tabelaModelo.setRowCount(0);
						
						for (Produto produto : pesquisaCategoria) {
							System.out.println("Categoria Produto: "+produto.getTipo().toString());
							System.out.println("Selecionado ComboBox: "+comboBox.getSelectedItem().toString()+"\n");
							if(produto.getTipo().toString().equals(comboBox.getSelectedItem().toString())) {
								
								Integer id = produto.getIdProduto();
								String tipo = produto.getTipo();
								double preco = produto.getPreco();
								
								Object [] dados1 = {id,tipo, preco,};
								tabelaModelo.addRow(dados1);
							}
						}
						
						break;
					}
				}else {
					switch (comboBox.getSelectedItem().toString().toLowerCase()) {
					case "carros":
						
						tabelaModelo.setRowCount(0);
						
						for (Produto produto : pesquisaCategoria) {
							System.out.println("Categoria Produto: "+produto.getTipo().toString());
							System.out.println("Selecionado ComboBox: "+comboBox.getSelectedItem().toString()+"\n");
							if(produto.getTipo().toString().equals(comboBox.getSelectedItem().toString())) {
								
								Integer id = produto.getIdProduto();
								String tipo = produto.getTipo();
								double preco = produto.getPreco();
								
								Object [] dados1 = {id,tipo, preco,};
								tabelaModelo.addRow(dados1);
							}
						}
						
						break;
					case "motocicletas":
						
						tabelaModelo.setRowCount(0);
						
						for (Produto produto : pesquisaCategoria) {
							System.out.println("Categoria Produto: "+produto.getTipo().toString());
							System.out.println("Selecionado ComboBox: "+comboBox.getSelectedItem().toString()+"\n");
							if(produto.getTipo().toString().equals(comboBox.getSelectedItem().toString())) {
								
								Integer id = produto.getIdProduto();
								String tipo = produto.getTipo();
								double preco = produto.getPreco();
								
								Object [] dados1 = {id,tipo, preco,};
								tabelaModelo.addRow(dados1);
							}
						}
						
						break;
					}
				}
			}
		});
		btnPesquisar_1.setBounds(369, 137, 98, 26);
		contentPane.add(btnPesquisar_1);
		
		JLabel lblPesquisaPorCategoria = new JLabel("Pesquisa por categoria");
		lblPesquisaPorCategoria.setBounds(307, 119, 140, 16);
		contentPane.add(lblPesquisaPorCategoria);
		
		JButton btnDeletarProduto = new JButton("Deletar Produto");
		btnDeletarProduto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int v = (int) table.getValueAt(table.getSelectedRow(), 0);
				tabelaModelo.setRowCount(0);
				List<Produto> produto = ModelProduto.getLisProduto();
				for (Produto p : produto) {
					if (p.idProduto!=v) {
						
						Integer id = p.getIdProduto();
						String tipo = p.getTipo();
						double preco = p.getPreco();
						Object [] dados1 = {id,tipo, preco};
						tabelaModelo.addRow(dados1);
					
											
					}
					}
				
				for (Produto p : produto) {
					if (p.idProduto==v) {
						ModelProduto.removerProduto(p); //Dando erro, o kewao disse que ia concertar porque estava dando problema nos testes também
						break;
					}
				}
			}
		});
		btnDeletarProduto.setBounds(339, 12, 134, 26);
		contentPane.add(btnDeletarProduto);
		
		JButton btnAlterarProduto = new JButton("Alterar Produto");
		btnAlterarProduto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				List<Produto> produto = ModelProduto.getLisProduto();
				for (Produto p : produto) {
					if (p.idProduto==(int) table.getValueAt(table.getSelectedRow(), 0)) {
//						Main.setProdutoTelas(p);
						
						switch (p.tipo.toString()) {
						case "Apartamentos":
							System.out.println(p.tipo);
							Main.setProdutoTelas(p);
							break;
						case "Terrenos":
							System.out.println(p.tipo);
							Main.setProdutoTelas(p);
							break;
						case "Casas":
							System.out.println(p.tipo);
							Main.setProdutoTelas(p);
							break;
						case "Edificios_Comerciais":
							System.out.println(p.tipo);
							Main.setProdutoTelas(p);
							break;
						case "Carros":
							System.out.println(p.tipo);
							Main.setProdutoTelas(p);
							break;
						case "Motocicletas":
							System.out.println(p.tipo);
							Main.setProdutoTelas(p);
							break;

						}
					}
				}
				
			}
		});
		btnAlterarProduto.setBounds(339, 39, 134, 26);
		contentPane.add(btnAlterarProduto);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(12, 98, 461, 71);
		contentPane.add(separator);
		
		
	}
}
