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
import java.awt.Font;
import javax.swing.SwingConstants;

public class Forn_Leiloes_Atuais extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JLabel label_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Forn_Leiloes_Atuais frame = new Forn_Leiloes_Atuais();
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
	public Forn_Leiloes_Atuais() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(5, 5, 424, 0);
		contentPane.add(label);
		
		table = new JTable();
		table.setBounds(15, 41, 409, 215);
		contentPane.add(table);
		
		label_1 = new JLabel("Hist\u00F3rico de Leil\u00F5es");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_1.setBounds(5, 11, 424, 19);
		contentPane.add(label_1);
	}
}
