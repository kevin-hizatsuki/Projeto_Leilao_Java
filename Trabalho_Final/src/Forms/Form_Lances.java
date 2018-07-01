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
		setBounds(100, 100, 450, 403);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLeiloNumero = new JLabel("Leil\u00E3o Numero: ");
		lblLeiloNumero.setBounds(126, 11, 92, 14);
		contentPane.add(lblLeiloNumero);
		
		JLabel lblNa = new JLabel("N/A");
		lblNa.setBounds(218, 10, 55, 16);
		lblNa.setText(String.valueOf(Main.getIdLeilao_AddProduto()));
		contentPane.add(lblNa);
		
		String [] colunas = {"ID","TIPO","PRECO"}; 
		DefaultTableModel tabelaModelo = new DefaultTableModel(colunas, 0);
		
		table = new JTable(tabelaModelo);
		table.setBounds(12, 77, 410, 275);
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
		spinner.setBounds(41, 45, 107, 29);
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
		btnNewButton.setBounds(160, 46, 113, 26);
		contentPane.add(btnNewButton);
		
		
	}
}
