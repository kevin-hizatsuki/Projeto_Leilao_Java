package edu.fatec.leilao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.time.LocalDate;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Forms.Form_Login;
import edu.fatec.leilao.banco.InstituicaoFinanceira;
import edu.fatec.leilao.produto.Apartamento;
import edu.fatec.leilao.produto.Casas;
import edu.fatec.leilao.produto.EnumImoveis;
import edu.fatec.model.ModelLeilao;
import edu.fatec.model.ModelProduto;

public class Main {
	
	static int IdProduto_Form;
	static String tipoProduto_Form;
	
	
	
	public static void setIdProduto_FormPesquisa(int IdProduto) {
		IdProduto_Form = IdProduto;
	}
	public static int getIdProduto_FormPesquisa() {
		return IdProduto_Form;
	}
	
	public static void setTipoProduto_FormPesquisa(String tipoProduto) {
		tipoProduto_Form = tipoProduto;
	}
	public static String getTipoProduto_FormPesquisa( ) {
		return tipoProduto_Form;
	}
	
	public static void main(String[] args) throws IOException {
		
		ModelLeilao leilao = null;
		InstituicaoFinanceira banco = new InstituicaoFinanceira("123456","www.itau.com","Itau");
		Endereco endereco = new Endereco("Rua x", "SJC", "SP", "123456");
		Leiloes l1 = new Leiloes(1, "Leilao do ze", endereco, banco, LocalDate.of(2018, 6, 27), LocalDate.of(2018, 6, 28));
		Leiloes l2 = new Leiloes(2, "Leilao do ze 2", endereco, banco, LocalDate.of(2018, 6, 1), LocalDate.of(2018, 6, 18));
		Leiloes l3 = new Leiloes(3, "Leilao do ze 2", endereco, banco, LocalDate.of(2018, 6, 1), LocalDate.of(2018, 6, 18));
		
<<<<<<< HEAD
		
		leilao.AdicionarLeilao(l1);
		leilao.AdicionarLeilao(l2);
		leilao.AdicionarLeilao(l3);
		
		//leilao.listarTodosLeilao();
		leilao.gerarArquivo(leilao.getLisLeiloes());
		
		System.out.println(leilao.statusLeilao(l1));
=======
		Form_Login c = new Form_Login();
		ModelLeilao leilao = new ModelLeilao();
		Leiloes l;
		Endereco endereco;
		InstituicaoFinanceira banco; 
		ModelProduto produto;
		Casas produto1;
		banco = new InstituicaoFinanceira("123456","www.itau.com","Itau");
		endereco = new Endereco("Rua x", "SJC", "SP", "123456");
		l = new Leiloes(1, "Leilao do ze", endereco, banco, LocalDate.of(2018, 6, 16), LocalDate.of(2018, 6, 25));
		produto1 = new Casas(1, 1, "Casa", 150, endereco, 150, 0, 2, 2, 1);
		c.setVisible(true);
		
		//SiteLeilao s = new SiteLeilao();
		
		leilao.AdicionarLeilao(l);
		//produto.AdicionarProduto(produto1);
		
		
		//s.AdicionarLeilao(new Leiloes(1,"Leilao do ze",new Endereco("Rua Ma","SJC","SP","123457"),new InstituicaoFinanceira("456789","www.bradesco","Bradesco"),LocalDate.of(2018,11,20),LocalDate.of(2018,11,29)));
//		/l.AdicionarProduto(new Casas(1,1,EnumImoveis.Casas.toString(),100,new Endereco("Rua M","SJC","SP","123456"),10.50,0,4,3,2));
//		s.AdicionarProduto(new Casas(1,2,EnumImoveis.Casas.toString(),100,new Endereco("Rua Mas","SJC","SP","123455"),20.50,0,4,3,2));
//		s.AdicionarProduto(new Casas(1,3,EnumImoveis.Casas.toString(),100,new Endereco("Rua Mdas","SJC","SP","123454"),30.50,0,4,3,2));
//		s.AdicionarProduto(new Casas(1,4,EnumImoveis.Casas.toString(),100,new Endereco("Rua Masdasd","SJC","SP","143456"),40.50,0,4,3,2));
//		s.AdicionarProduto(new Casas(1,5,EnumImoveis.Casas.toString(),100,new Endereco("Rua aadsM","SJC","SP","123856"),60.50,0,4,3,2));
//		s.AdicionarProduto(new Apartamento(1,6,50,new Endereco("Rua aadsM","SJC","SP","1238599"),39,5,EnumImoveis.Apartamentos.toString(),15,1,2,1));
//		//s.listarTodosLeilao();
//		s.listarTodosProdutos();
//		System.out.println(s.getListaLeilao());
		
>>>>>>> e3a4dea7a4bb66ff730bafdfd073a27cb5216684
	}
	
}
