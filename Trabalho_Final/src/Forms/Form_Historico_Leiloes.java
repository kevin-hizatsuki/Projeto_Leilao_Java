package Forms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import edu.fatec.leilao.Leiloes;
import edu.fatec.model.ModelLeilao;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.List;

import javax.swing.SwingConstants;
import javax.swing.JTable;
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
		lblHistricoDeLeiles.setBounds(120, 4, 424, 19);
		lblHistricoDeLeiles.setHorizontalAlignment(SwingConstants.CENTER);
		lblHistricoDeLeiles.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(lblHistricoDeLeiles);
		
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
		
		String [] colunas = {"ID","NOME","CNPJ", "DATA INICIO", "DATA FIM"}; 
		DefaultTableModel tabelaModelo = new DefaultTableModel(colunas, 0);
		table_1 = new JTable(tabelaModelo);
		
		List<Leiloes> dados = ModelLeilao.getLisLeiloes();
		for (int i = 0; i < dados.size(); i++) {
			Integer id = dados.get(i).getId();
			String nome = dados.get(i).getNome();
			String cnpj = dados.get(i).getInstF().cnpj;
			LocalDate data_inicio =  dados.get(i).getDataInicio();
			LocalDate data_fim = dados.get(i).getDataFim();
			
			Object [] dados1 = {id, nome, cnpj, data_inicio, data_fim};
			tabelaModelo.addRow(dados1);
		}
		
		
		table_1.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		table_1.setBounds(10, 46, 554, 371);
		contentPane.add(table_1);
		
		
	}
}
