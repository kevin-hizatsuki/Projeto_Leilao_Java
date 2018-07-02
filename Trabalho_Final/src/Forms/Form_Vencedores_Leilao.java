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

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class Form_Vencedores_Leilao extends JFrame {

	private JPanel contentPane;
	private JTable table;
 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form_Vencedores_Leilao frame = new Form_Vencedores_Leilao();
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
	public Form_Vencedores_Leilao() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 427);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		String [] colunas = {"ID","NOME","CNPJ", "DATA INICIO", "DATA FIM"}; 
		DefaultTableModel tabelaModelo = new DefaultTableModel(colunas, 0);
		table = new JTable(tabelaModelo);
		table.setBounds(12, 37, 410, 339);
		List<Leiloes> dados = ModelLeilao.getLisLeiloes();
		for (int i = 0; i < dados.size(); i++) {
			if (ModelLeilao.statusLeilao(dados.get(i)) == 0) {
				Integer id = dados.get(i).getId();
				String nome = dados.get(i).getNome();
				String cnpj = dados.get(i).getInstF().cnpj;
				LocalDate data_inicio =  dados.get(i).getDataInicio();
				LocalDate data_fim = dados.get(i).getDataFim();
				
				Object [] dados1 = {id, nome, cnpj, data_inicio, data_fim};
				tabelaModelo.addRow(dados1);
			}
		}
		contentPane.add(table);
		
		JLabel lblVencedoresDosLeiles = new JLabel("Vencedores dos Leil\u00F5es");
		lblVencedoresDosLeiles.setBounds(136, 12, 153, 14);
		contentPane.add(lblVencedoresDosLeiles);
		

		
		
		
//		

	

		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Controller a = new Controller();
				a.setVisible(true);
				dispose();
			}
		});
		btnVoltar.setBounds(0, 0, 98, 26);
		contentPane.add(btnVoltar);
		
		JButton btnVerificar = new JButton("Verificar");
		btnVerificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Main.setIdLeilao_AddProduto((int) table.getValueAt(table.getSelectedRow(), 0));
				Form_Vencedores_Janela a = new Form_Vencedores_Janela();
				a.setVisible(true);
				dispose();
			}
		});
		btnVerificar.setBounds(324, 6, 98, 26);
		contentPane.add(btnVerificar);
		
	
	}
}
