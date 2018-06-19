package Forms;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTable;

public class Form_Historico_Leiloes extends JFrame {

	private JPanel contentPane;
	private JTable table;

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
		
		table = new JTable();
		table.setBounds(15, 35, 409, 215);
		contentPane.add(table);
	}

}
