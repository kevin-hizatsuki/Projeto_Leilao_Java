package edu.fatec.leilao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Main {
	
	
	public static void main(String[] args) throws IOException {
		
		
		
		/* INICIO - FRAME EXIBE LEILAO */	
		//Configuracoes janela - Exibe Leilão (Leiloes ativos)
		JFrame frame_exib_leilao = new JFrame ("Leilões Ativos");
		frame_exib_leilao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame_exib_leilao.setSize(250,250);
		frame_exib_leilao.setLayout(null);//Desabilita o gerenciador automatico de layout
		
		JButton exib_leilao_imoveis = new JButton("Casas");
		exib_leilao_imoveis.setBounds(30, 50, 150, 40);
		
		JButton exib_leilao_veiculos = new JButton("Veiculos");
		exib_leilao_veiculos.setBounds(30, 100, 150, 40);
	
//		JButton exib_leilao_ambos = new JButton("ambos");
//		exib_leilao_ambos.setBounds(30, 100, 150, 40);
		
//		frame_exib_leilao.add(exib_leilao_ambos);
		frame_exib_leilao.add(exib_leilao_imoveis);
		frame_exib_leilao.add(exib_leilao_veiculos);
		/*FIM - FRAME EXIBE LEILAO */
		
		/*INICIO - FRAME EXIBE LEILAO -> IMOVEL */
		JFrame frame_exib_imovel = new JFrame("Exibe leilão ativo de imoveis");
		frame_exib_imovel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame_exib_imovel.setSize(350,400);
		frame_exib_imovel.setLayout(null);//Desabilita o gerenciador automatico de layout
		
		final JLabel lbl_casa = new JLabel("Casa");
		lbl_casa.setBounds(15, 5, 200, 40);
		JTextField txt_casa = new JTextField();
		txt_casa.setBounds(50,20,150,20); 
		
		
		final JLabel lbl_Id_Leilao = new JLabel("ID Leilão");
		lbl_Id_Leilao.setBounds(15, 25, 200, 40);
		JTextField txt_Id_Leilao = new JTextField();
		txt_Id_Leilao.setBounds(50,50,150,20); 
		
		final JLabel lbl_Id_Imovel = new JLabel("ID Imovel");
		lbl_Id_Imovel.setBounds(15, 45, 200, 40);
		JTextField txt_Id_Imovel = new JTextField();
		txt_Id_Imovel.setBounds(50,50,150,20); 
		
		final JLabel lbl_Area = new JLabel("Area");
		lbl_Area.setBounds(15, 65, 200, 40);
		JTextField txt_Area = new JTextField();
		txt_Area.setBounds(50,50,150,20); 
		
		final JLabel lbl_Preco = new JLabel("Preço");
		lbl_Preco.setBounds(15, 85, 200, 40);
		JTextField txt_Preco = new JTextField();
		txt_Preco.setBounds(50,50,150,20); 
		
		final JLabel lbl_Area2 = new JLabel("Area");
		lbl_Area2.setBounds(15, 105, 200, 40);
		JTextField txt_Area2 = new JTextField();
		txt_Area2.setBounds(50,50,150,20); 
		
		final JLabel lbl_Cep = new JLabel("CEP");
		lbl_Cep.setBounds(15, 125, 200, 40);
		JTextField txt_Cep = new JTextField();
		txt_Cep.setBounds(50,50,150,20); 
		
		final JLabel lbl_Cidade = new JLabel("Cidade");
		lbl_Cidade.setBounds(15, 145, 200, 40);
		JTextField txt_Cidade = new JTextField();
		txt_Cidade.setBounds(50,50,150,20); 
		
		final JLabel lbl_Endereco_completo = new JLabel("Endereço Completo");
		lbl_Endereco_completo.setBounds(15, 165, 200, 40);
		JTextField txt_Endereco_completo = new JTextField();
		txt_Endereco_completo.setBounds(50,50,150,20); 
		
		final JLabel lbl_Estado = new JLabel("Estado");
		lbl_Estado.setBounds(15, 185, 200, 40);
		JTextField txt_Estado = new JTextField();
		txt_Estado.setBounds(50,50,150,20); 
		
		final JLabel lbl_Condominio = new JLabel("Condominio");
		lbl_Condominio.setBounds(15, 205, 200, 40);
		JTextField txt_Condominio = new JTextField();
		txt_Condominio.setBounds(50,50,150,20); 
		
		final JLabel lbl_Qtd_garagem = new JLabel("Quantidade Garagem");
		lbl_Qtd_garagem.setBounds(15, 225, 200, 40);
		JTextField txt_Qtd_garagem = new JTextField();
		txt_Qtd_garagem.setBounds(50,50,150,20); 
		
		final JLabel lbl_Qtd_quarto = new JLabel("Quantidade QUarto");
		lbl_Qtd_quarto.setBounds(15, 245, 200, 40);
		JTextField txt_Qtd_quarto = new JTextField();
		txt_Qtd_quarto.setBounds(50,50,150,20); 
		
		final JLabel lbl_Qtd_banheiro = new JLabel("Quantidade Banheiro");
		lbl_Qtd_banheiro.setBounds(15, 265, 200, 40);
		JTextField txt_Qtd_banheiro = new JTextField();
		txt_Qtd_banheiro.setBounds(50,50,150,20); 
		
		frame_exib_imovel.add(txt_casa);
		frame_exib_imovel.add(lbl_casa);
		frame_exib_imovel.add(lbl_Id_Leilao);
		frame_exib_imovel.add(lbl_Id_Imovel);
		frame_exib_imovel.add(lbl_Area);
		frame_exib_imovel.add(lbl_Preco);
		frame_exib_imovel.add(lbl_Area2);
		frame_exib_imovel.add(lbl_Cep);
		frame_exib_imovel.add(lbl_Cidade);
		frame_exib_imovel.add(lbl_Endereco_completo);
		frame_exib_imovel.add(lbl_Estado);
		frame_exib_imovel.add(lbl_Condominio);
		frame_exib_imovel.add(lbl_Qtd_garagem);
		frame_exib_imovel.add(lbl_Qtd_quarto);
		frame_exib_imovel.add(lbl_Qtd_banheiro);

		/*FIM - FRAME EXIBE LEILAO -> IMOVEL */
		
		/*INICIO - FRAME EXIBE LEILAO -> VEICULO */
		JFrame frame_exib_veiculo = new JFrame("Exibe leilão ativo de veiculos");
		frame_exib_veiculo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame_exib_veiculo.setSize(250,250);
		frame_exib_veiculo.setLayout(null);//Desabilita o gerenciador automatico de layout
		/*FIM - FRAME EXIBE LEILAO -> IMOVEL */
		
		/*INICIO - FRAME EXIBE LEILAO -> AMBOS */
//		JFrame frame_exib_ambos = new JFrame("Exibe leilão ativo de ambas acategorias");
//		frame_exib_ambos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame_exib_ambos.setSize(250,250);
//		frame_exib_ambos.setLayout(null);//Desabilita o gerenciador automatico de layout
		/*FIM - FRAME EXIBE LEILAO -> AMBOS */
		
		/*INICIO - FRAME HISTORICO DE LEILAO */
		//Configuracoes janela - Historico de Leilao
		JFrame frame_hist_leilao = new JFrame ("Historicos de Leilões");
		frame_hist_leilao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame_hist_leilao.setSize(250,250);
		frame_hist_leilao.setLayout(null);//Desabilita o gerenciador automatico de layout
		/*FIM - FRAME EXIBE LEILAO */
		
		/*INICIO - FRAME NOVO LEILAO */
		//Configuracoes janela - Novo leilao
		JFrame frame_novo_leilao = new JFrame ("Adicionar um novo leilão");
		frame_novo_leilao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame_novo_leilao.setSize(250,250);
		frame_novo_leilao.setLayout(null);//Desabilita o gerenciador automatico de layout
		/*FIM - FRAME NOVO LEILAO */

		//INICIO - BOTOES HOME - MENU PRINCIPAL
		JButton home_exib_leilao = new JButton("Exibir Leilões Ativos");
		home_exib_leilao.setBounds(30,50,150, 40);
		 
		
		JButton home_hist_leilao = new JButton("Histórico de Leilões");
		home_hist_leilao.setBounds(30,100,150, 40);
 
		
		JButton home_novo_leilao = new JButton("Novo Leilão");
		home_novo_leilao.setBounds(50,150,100, 40);
		//FIM - BOTOES HOME - MENU PRINCIPAL
		
		/*INICIO - FRAME HOME*/
		JFrame frame_home = new JFrame("JFrame Leilão Fatec");
		frame_home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.pack(); //pack() faz com que a janela seja ajustada para o tamanho preferido de todos os seus subcomponentes.
		frame_home.setSize(250,250);
		frame_home.setLayout(null);//Desabilita o gerenciador automatico de layout
		frame_home.setVisible(true);
		
		//Caixa de texto da Home
		final JLabel label = new JLabel("Selecione uma das opções abaixo: ");
		
		//Adicionando os botoes em janela Home
		label.setBounds(15, 5, 200, 40);
		frame_home.add(label);
		frame_home.add(home_exib_leilao);
		frame_home.add(home_hist_leilao);
		frame_home.add(home_novo_leilao);
		/*FIM - FRAME HOME*/
		
		//INICIO - ACOES DOS BOTOES DA JANELA HOME
		home_exib_leilao.addActionListener(new ActionListener(){  //Adicionando uma escuta de ação ao clicar o botao
			public void actionPerformed(ActionEvent e){  //adicionando uma ação quando apertado
			            //tf.setText("Welcome to Javatpoint."); 
						frame_home.setVisible(false); //Esconde a janela principal para mostrar a de exibir leiloes ativos
						frame_exib_leilao.setVisible(true);
						
			        }  
			    }); 
		
		home_hist_leilao.addActionListener(new ActionListener(){  //Adicionando uma escuta de ação ao clicar o botao
			public void actionPerformed(ActionEvent e){  //adicionando uma ação quando apertado
			            //tf.setText("Welcome to Javatpoint."); 
						frame_home.setVisible(false); //Esconde a janela principal para mostrar a de exibir leiloes ativos
						frame_hist_leilao.setVisible(true);
			        }  
			    }); 
		
		home_novo_leilao.addActionListener(new ActionListener(){  //Adicionando uma escuta de ação ao clicar o botao
			public void actionPerformed(ActionEvent e){  //adicionando uma ação quando apertado
			            //tf.setText("Welcome to Javatpoint."); 
					frame_exib_leilao.setVisible(false); //Esconde a janela principal para mostrar a de exibir leiloes ativos
						frame_novo_leilao.setVisible(true);
			        }  
			    });  
		//FIM - ACOES DOS BOTOES DA JANELA HOME
		
		
		//INICIO - ACOES BOTOES - FRAME EXIBE LEILOES 
		exib_leilao_imoveis.addActionListener(new ActionListener(){  //Adicionando uma escuta de ação ao clicar o botao
			public void actionPerformed(ActionEvent e){  //adicionando uma ação quando apertado
			            //tf.setText("Welcome to Javatpoint."); 
						frame_exib_leilao.setVisible(false); //Esconde a janela principal para mostrar a de exibir leiloes ativos
						frame_exib_imovel.setVisible(true);
			        }  
			    });
		
		
		exib_leilao_veiculos.addActionListener(new ActionListener(){  //Adicionando uma escuta de ação ao clicar o botao
			public void actionPerformed(ActionEvent e){  //adicionando uma ação quando apertado
			            //tf.setText("Welcome to Javatpoint."); 
						frame_exib_leilao.setVisible(false); //Esconde a janela principal para mostrar a de exibir leiloes ativos
						frame_exib_veiculo.setVisible(true);
			        }  
			    });
		
		
//		exib_leilao_ambos.addActionListener(new ActionListener(){  //Adicionando uma escuta de ação ao clicar o botao
//			public void actionPerformed(ActionEvent e){  //adicionando uma ação quando apertado
//			            //tf.setText("Welcome to Javatpoint."); 
//						frame_exib_leilao.setVisible(false); //Esconde a janela principal para mostrar a de exibir leiloes ativos
////						frame_exib_ambos.setVisible(true);
//			        }  
//			    });
		//FIM - ACOES BOTOES - FRAME EXIBE LEILOES 
		
		/*
		Object[] options = {"Sim!", "Não","Quem sabe?"};
		int n = JOptionPane.showOptionDialog(frame, "Tem certeza?",	
						"Confirmação",
						JOptionPane.YES_NO_CANCEL_OPTION,
						JOptionPane.QUESTION_MESSAGE,
						null,
						options,
						options[2]);
		System.out.println(n);*/
		
		
		
		/*
		SiteLeilao s = new SiteLeilao();
		s.AdicionarLeilao(new Leiloes(1,"Leilao do ze",new Endereco("Rua Ma","SJC","SP","123457"),new InstituicaoFinanceira("456789","www.bradesco","Bradesco"),LocalDate.of(2018,11,20),LocalDate.of(2018,11,29)));
		s.AdicionarProduto(new Casas(1,1,EnumImoveis.Casas.toString(),100,new Endereco("Rua M","SJC","SP","123456"),10.50,0,4,3,2));
		s.AdicionarProduto(new Casas(1,2,EnumImoveis.Casas.toString(),100,new Endereco("Rua Mas","SJC","SP","123455"),20.50,0,4,3,2));
		s.AdicionarProduto(new Casas(1,3,EnumImoveis.Casas.toString(),100,new Endereco("Rua Mdas","SJC","SP","123454"),30.50,0,4,3,2));
		s.AdicionarProduto(new Casas(1,4,EnumImoveis.Casas.toString(),100,new Endereco("Rua Masdasd","SJC","SP","143456"),40.50,0,4,3,2));
		s.AdicionarProduto(new Casas(1,5,EnumImoveis.Casas.toString(),100,new Endereco("Rua aadsM","SJC","SP","123856"),60.50,0,4,3,2));
		s.AdicionarProduto(new Apartamento(1,6,50,new Endereco("Rua aadsM","SJC","SP","1238599"),39,5,EnumImoveis.Apartamentos.toString(),15,1,2,1));
		//s.listarTodosLeilao();
		
		//s.listarTodosProdutos();
		List<Produto> prod = new LinkedList();
		prod=s.buscaPorFaixa(20.0, 40.4); 
		
		for(Produto p:prod) {
			System.out.println(p.toString());
		}
		*/
	}
	
}
