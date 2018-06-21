package Forms;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import edu.fatec.model.ModelCliente;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;

public class Controller extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Controller frame = new Controller();
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
	public Controller() {
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 344);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(" Bem-Vindo ao Sistema de Leil\u00F5es Eletr\u00F4nicos (SLE) ");
		lblNewLabel.setBounds(5, 5, 424, 19);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(lblNewLabel);
		
		JButton btnChecarLeilesAtuais = new JButton("Checar Leil\u00F5es Atuais");
		btnChecarLeilesAtuais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Form_Leiloes_Atuais janela_leiloes_atuais = new Form_Leiloes_Atuais();
				janela_leiloes_atuais.setVisible(true);
				dispose();
			}
		});
		btnChecarLeilesAtuais.setBounds(128, 119, 164, 71);
		contentPane.add(btnChecarLeilesAtuais);
		
		JButton btnHistricoDeLeiles = new JButton("Hist\u00F3rico de\r\n Leil\u00F5es");
		btnHistricoDeLeiles.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Form_Historico_Leiloes janela_historico_leiloes = new Form_Historico_Leiloes();
				janela_historico_leiloes.setVisible(true);
				dispose();
				
			}
		});
		btnHistricoDeLeiles.setBounds(128, 202, 164, 71);
		contentPane.add(btnHistricoDeLeiles);
		
		JButton btnCriarUmLeilo = new JButton("Criar um leil\u00E3o");
		btnCriarUmLeilo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Form_Novo_Leilao janela_novo_leilao = new Form_Novo_Leilao();
				janela_novo_leilao.setVisible(true);
				dispose();
			}
		});
		btnCriarUmLeilo.setBounds(150, 36, 116, 71);
		contentPane.add(btnCriarUmLeilo);
	}


	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
