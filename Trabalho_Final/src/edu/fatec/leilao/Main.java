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
import edu.fatec.leilao.produto.Produto;
import edu.fatec.leilao.usuario.Cliente;
import edu.fatec.leilao.usuario.EnumUsuario;
import edu.fatec.leilao.usuario.Usuario;
import edu.fatec.model.ModelCliente;
import edu.fatec.model.ModelLeilao;
import edu.fatec.model.ModelProduto;

public class Main {
	

	

	static int IdProduto_Form; //Utilizado para passar status para outra janela
	static String tipoProduto_Form; //Utilizado para passar status para outra janela
	static Produto produtoTelas;
	public static Produto getProdutoTelas() {
		return produtoTelas;
	}
	public static void setProdutoTelas(Produto produtoTelas) {
		Main.produtoTelas = produtoTelas;
	}

	static int idLeilao_AddProduto; //Captura o ID do leilao em que o produto sera inserido na tela de cadastro deproduto!!
	
	static String idUsuarioLogado;
	 
	
	
	public static String getIdUsuarioLogado() {
		return idUsuarioLogado;
	}
	public static void setIdUsuarioLogado(String idUsuarioLogado) {
		Main.idUsuarioLogado = idUsuarioLogado;
	}
	public static int getIdLeilao_AddProduto() {
		return idLeilao_AddProduto;
	}
	public static void setIdLeilao_AddProduto(int idLeilao_AddProduto) {
		Main.idLeilao_AddProduto = idLeilao_AddProduto;
	}
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
		
		
		//Form_Login c = new Form_Login();
		ModelLeilao leilao = new ModelLeilao();
		Leiloes l, l2, l3, l4;
		Endereco endereco;
		InstituicaoFinanceira banco; 
		ModelProduto produto;
		Casas produto1;
		banco = new InstituicaoFinanceira("123456","www.itau.com","Itau");
		endereco = new Endereco("Rua x", "SJC", "SP", "123456");

		Usuario a = new Usuario(EnumUsuario.Administrador, "a", "a");
		Cliente c = new Cliente(EnumUsuario.Cliente, "123", "as", "ab", "123");
		
		ModelCliente.adicionarCliente(a);
		ModelCliente.adicionarCliente(c);
		
		
		 
		
		
		ModelCliente usuario = null;
		Usuario admin;
		Cliente usuario1;
		Cliente usuario2;
		Cliente usuario3;
		Cliente usuario4;
		Cliente usuario5;
		Cliente atualizar;
//		admin = new Usuario(EnumUsuario.Administrador, "Admin", "Admin");
		usuario1 = new Cliente(EnumUsuario.Cliente, "123456", "Jose", "JOJO", "123");
//		usuario2 = new Cliente(EnumUsuario.Cliente, "123457", "Julia", "JULIA", "124");
//		usuario3 = new Cliente(EnumUsuario.Cliente, "123458", "Karinao", "karinao", "125");
//		usuario4 = new Cliente(EnumUsuario.Cliente, "123459", "Lusca", "lucasdlg", "126");
//		usuario5 = new Cliente(EnumUsuario.Cliente, "123457", "Julia", "JULIA", "12426");
//		atualizar = new Cliente(EnumUsuario.Cliente, "123456", "Jose", "JOJO", "321");
		
		
		
		Form_Login b = new Form_Login();
		b.setVisible(true);
}
}