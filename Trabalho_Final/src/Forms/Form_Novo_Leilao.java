package Forms;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;

public class Form_Novo_Leilao extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form_Novo_Leilao frame = new Form_Novo_Leilao();
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
	public Form_Novo_Leilao() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLeilesAtuais = new JLabel("Novo Leil\u00E3o");
		lblLeilesAtuais.setBounds(164, 10, 105, 19);
		lblLeilesAtuais.setHorizontalAlignment(SwingConstants.CENTER);
		lblLeilesAtuais.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(lblLeilesAtuais);
		
		JButton btnNewButton = new JButton("Im\u00F3vel");
		btnNewButton.setBounds(63, 101, 119, 51);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Automovel");
		btnNewButton_1.setBounds(270, 101, 105, 51);
		contentPane.add(btnNewButton_1);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(0, 0, 89, 23);
		contentPane.add(btnVoltar);
	}
}
