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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Form_Leiloes_Atuais extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JLabel lblLeilesAtivos;
	private JButton button;

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
	}
}
