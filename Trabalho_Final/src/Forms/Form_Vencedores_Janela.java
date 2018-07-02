package Forms;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import edu.fatec.leilao.Leiloes;
import edu.fatec.leilao.Main;
import edu.fatec.leilao.produto.Produto;
import edu.fatec.leilao.usuario.Cliente;
import edu.fatec.model.ModelLance;
import edu.fatec.model.ModelLeilao;
import edu.fatec.model.ModelProduto;

import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Form_Vencedores_Janela extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JLabel lblNoHouveGanhadores;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form_Vencedores_Janela frame = new Form_Vencedores_Janela();
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
	public Form_Vencedores_Janela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 551, 404);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		lblNoHouveGanhadores = new JLabel("N\u00E3o houve Ganhadores!!");
		lblNoHouveGanhadores.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNoHouveGanhadores.setHorizontalAlignment(SwingConstants.CENTER);
		lblNoHouveGanhadores.setVisible(false);
		contentPane.add(lblNoHouveGanhadores, BorderLayout.NORTH);
		
		Map<Integer,Cliente> vencedor = new HashMap();
		vencedor =  ModelLance.getVencedor(ModelProduto.getLisProduto());
		Set chaves = vencedor.keySet(); 
		
		/*for(Object i:chaves) {
			System.out.println(vencedor.get(i));
			System.out.println(ModelProduto.retornarPorId(Integer.parseInt(i.toString())));
		}*/
		
		
		
		String [] colunas = {"NOME","CPF","TIPO DO PRODUTO","PRECO"}; 
		DefaultTableModel tabelaModelo = new DefaultTableModel(colunas, 0);
		
		table = new JTable(tabelaModelo);
//		for (int i = 0; i < dados.size(); i++) {
			
//			if (ModelLeilao.statusLeilao(dados.get(i)) == 1) {
				
		
					
						try {
							for(Object i:chaves) {
						String nome = vencedor.get(i).nome;
						String cpf = vencedor.get(i).cpf;
						Produto produto = ModelProduto.retornarPorId(Integer.parseInt(i.toString()));
					Object [] dados1 = {nome,cpf, produto.tipo,produto.preco};
					
					
					tabelaModelo.addRow(dados1);
					lblNoHouveGanhadores.setVisible(false);
				}
						} catch (NullPointerException e) {
							lblNoHouveGanhadores.setVisible(true);
						}
//			}
//		}
		contentPane.add(table, BorderLayout.CENTER);
		
//		Main.setIdLeilao_AddProduto((int) table.getValueAt(table.getSelectedRow(), 0));
		
		
		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Form_Vencedores_Leilao a = new Form_Vencedores_Leilao();
				a.setVisible(true);
				dispose();
			}
		});
		contentPane.add(btnNewButton, BorderLayout.SOUTH);
		
		
	}

}
