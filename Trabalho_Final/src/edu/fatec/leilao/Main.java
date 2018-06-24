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

import Forms.Form_Login;
import edu.fatec.leilao.produto.Apartamento;
import edu.fatec.leilao.produto.Casas;
import edu.fatec.leilao.produto.EnumImoveis;

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
		
		
		Form_Login c = new Form_Login();
		c.setVisible(true);
		
		SiteLeilao s = new SiteLeilao();
		//s.AdicionarLeilao(new Leiloes(1,"Leilao do ze",new Endereco("Rua Ma","SJC","SP","123457"),new InstituicaoFinanceira("456789","www.bradesco","Bradesco"),LocalDate.of(2018,11,20),LocalDate.of(2018,11,29)));
//		s.AdicionarProduto(new Casas(1,1,EnumImoveis.Casas.toString(),100,new Endereco("Rua M","SJC","SP","123456"),10.50,0,4,3,2));
//		s.AdicionarProduto(new Casas(1,2,EnumImoveis.Casas.toString(),100,new Endereco("Rua Mas","SJC","SP","123455"),20.50,0,4,3,2));
//		s.AdicionarProduto(new Casas(1,3,EnumImoveis.Casas.toString(),100,new Endereco("Rua Mdas","SJC","SP","123454"),30.50,0,4,3,2));
//		s.AdicionarProduto(new Casas(1,4,EnumImoveis.Casas.toString(),100,new Endereco("Rua Masdasd","SJC","SP","143456"),40.50,0,4,3,2));
//		s.AdicionarProduto(new Casas(1,5,EnumImoveis.Casas.toString(),100,new Endereco("Rua aadsM","SJC","SP","123856"),60.50,0,4,3,2));
//		s.AdicionarProduto(new Apartamento(1,6,50,new Endereco("Rua aadsM","SJC","SP","1238599"),39,5,EnumImoveis.Apartamentos.toString(),15,1,2,1));
		//s.listarTodosLeilao();
//		s.listarTodosProdutos();
//		System.out.println(s.getListaLeilao());
		
	}
	
}
