package Forms;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import edu.fatec.leilao.Endereco;
import edu.fatec.leilao.Main;
import edu.fatec.leilao.SiteLeilao;
import edu.fatec.leilao.produto.Apartamento;
import edu.fatec.leilao.produto.Casas;
import edu.fatec.leilao.produto.EnumImoveis;
import edu.fatec.leilao.produto.EnumVeiculo;
import edu.fatec.leilao.produto.Imoveis;
import edu.fatec.leilao.produto.Produto;
import edu.fatec.model.ModelProduto;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.management.modelmbean.ModelMBeanOperationInfo;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Observable;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class Form_Pesquisa_ProdutoGeral extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form_Pesquisa_ProdutoGeral frame = new Form_Pesquisa_ProdutoGeral();
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
	public Form_Pesquisa_ProdutoGeral() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 506);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Tela de Pesquisa de Cadastro");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.BOLD, 15));
		label.setBounds(126, 1, 219, 19);
		contentPane.add(label);
		
		JButton button = new JButton("Voltar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Form_Pesquisa_CadastroGeral c = new Form_Pesquisa_CadastroGeral();
				c.setVisible(true);
				dispose();
			}
		});
		button.setBounds(0, 0, 89, 23);
		contentPane.add(button);
		
		String [] colunas = {"id","idImovel","tipo","area","endereco","preco","condominio", "garagem", "quarto","banheiro"}; 
		DefaultTableModel tabelaModelo = new DefaultTableModel(colunas, 0);
		table = new JTable(tabelaModelo);
		table.setBounds(10, 64, 412, 312);
		SiteLeilao s = new SiteLeilao();
		List<Produto> dados = s.getListaProduto();
		for (int i = 0; i < dados.size(); i++) {
			Integer id = dados.get(i).getIdLeilao();
			Integer idImovel = dados.get(i).getIdProduto();
			String tipo = dados.get(i).getTipo();
			double area = ((Imoveis) dados.get(i)).getArea();
			Endereco endereco = ((Imoveis) dados.get(i)).getEndereco(); //ARRUMAR
			double preco = dados.get(i).getPreco();
			double condominio = ((Imoveis) dados.get(i)).getCondominio();
			int garagem = ((Casas) dados.get(i)).getGaragem();
			int quarto = ((Casas) dados.get(i)).getQuarto();
			int banheiro = ((Casas) dados.get(i)).getBanheiro();
			
			Object [] dados1 = {id, idImovel, tipo, area, endereco, preco, condominio, garagem, quarto, banheiro};
			tabelaModelo.addRow(dados1);
		}
		contentPane.add(table);
		
		
		//Arrumar uma forma de trazer a lista de produtos cadastrados
		//s.AdicionarLeilao(new Leiloes(1,"Leilao do ze",new Endereco("Rua Ma","SJC","SP","123457"),new InstituicaoFinanceira("456789","www.bradesco","Bradesco"),LocalDate.of(2018,11,20),LocalDate.of(2018,11,29)));
	
		JComboBox comboBox = new JComboBox();
//		JComboBox<EnumImoveis> comboBox = new JComboBox<EnumImoveis>();
//		List<Produto> dados;
		comboBox.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
//		    	System.out.println(comboBox.getSelectedItem());
		    	tabelaModelo.setRowCount(0);
//				dados.clear();
		    	

		    	
		    	
		    	for (Produto t : s.getListaProduto()) {
					if (t.getTipo().toString()==comboBox.getSelectedItem().toString()) {
//						System.out.println("Entrou o produto "+comboBox.getSelectedItem());
//						for (int i = 0; i < dados.size(); i++) {
							Integer id = t.getIdLeilao();
							Integer idImovel = t.getIdProduto();
							String tipo = t.getTipo();
							double area = ((Imoveis) t).getArea();
							Endereco endereco = ((Imoveis) t).getEndereco(); //ARRUMAR
							double preco = t.getPreco();
							double condominio = ((Imoveis) t).getCondominio();
							int garagem = ((Casas)t).getGaragem();
							int quarto = ((Casas) t).getQuarto();
							int banheiro = ((Casas) t).getBanheiro();
							
							Object [] dados1 = {id, idImovel, tipo, area, endereco, preco, condominio, garagem, quarto, banheiro};
//							System.out.println(dados1.toString());
							tabelaModelo.addRow(dados1);
//						}
					}
//					else {
//						System.out.println("Nao entrou - "+t.getTipo()+" - "+comboBox.getSelectedItem());
//					}
					
//					System.out.println(dados.toString());
//					
				}
				
//		
		    }
		});
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
		
		comboBox.setBounds(159, 38, 126, 23);
		contentPane.add(comboBox);
		
		
//		Object [][] dados = {
//	    {"Ana Monteiro", "48 9923-7898", "ana.monteiro@gmail.com","0","0","0","0","0","0","0"},
//	    {"João da Silva", "48 8890-3345", "joaosilva@hotmail.com","0","0","0","0","0","0","0"},
//	    {"Pedro Cascaes", "48 9870-5634", "pedrinho@gmail.com","0","0","0","0","0","0","0"}
//	};
		JButton btnEntrarNoRegistro = new JButton("Entrar no Registro");
		btnEntrarNoRegistro.addActionListener(new ActionListener() {
//			List<Produto> dados = s.getListaProduto();
			public void actionPerformed(ActionEvent e) {
				
				//Aqui sera necessario enviar dois paramentros para a proxima tela: ID do Produto e Tipo de produto selecionado para que os campos possam mudar de status de setVisible de FALSE para TRUE de acordo com os parametros enviados
				//Usar Observable
				/*Main.setIdProduto_FormPesquisa((int) table.getValueAt(table.getSelectedRow(), 1)); // Aqui ele faz esquema X,Y - verifica qual a linha e qual a coluna para pegar o ID do produto listado
				Main.setTipoProduto_FormPesquisa(comboBox.getSelectedItem().toString()); //Tipo selecionado
				*/
				Form_Altera_Imovel c = new Form_Altera_Imovel();
				c.setVisible(true);
				dispose();
				
			}
		});
		btnEntrarNoRegistro.setBounds(10, 35, 148, 26);
		contentPane.add(btnEntrarNoRegistro);

		JButton btnDeletarRegistro = new JButton("Deletar Registro");
		btnDeletarRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				Form_YesNo_DeletaReg_Pesquisa c = new Form_YesNo_DeletaReg_Pesquisa();
//				c.setAlwaysOnTop(true);
//				c.setVisible(true);
				
//				System.out.println((int) table.getValueAt(table.getSelectedRow(), 1)); // Aqui ele faz esquema X,Y - verifica qual a linha e qual a coluna para pegar o ID do produto listado
//				comboBox.getSelectedItem().toString(); //Tipo selecionado
				
				switch (comboBox.getSelectedItem().toString().toLowerCase()) {
				case "apartamentos":
					//Preciso criar os produtos em outra classe e puxar aqui para deletar
					for (Produto a :s.getListaProduto()) {
						if (a.idProduto.equals((int) table.getValueAt(table.getSelectedRow(), 1))) {
//							ModelProduto.removerProduto(a);
							s.removerProduto(a);
							Form_Pesquisa_ProdutoGeral d = new Form_Pesquisa_ProdutoGeral();
							dispose();
							d.setVisible(true);
						}
					}
					break;
				case "terrenos":
					
					break;
				case "casas":
					
					break;
				case "edifícios_comerciais":
					
					break;
				case "carros":
					
					break;
				case "motocicletas":
					
					break;
				}
			}
		});
		btnDeletarRegistro.setBounds(286, 35, 136, 26);
		contentPane.add(btnDeletarRegistro);
		
		
		
		
		

	}
}
