package edu.fatec.leilao;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import edu.fatec.leilao.banco.InstituicaoFinanceira;
import edu.fatec.leilao.produto.Apartamento;
import edu.fatec.leilao.produto.Casas;
import edu.fatec.leilao.produto.EnumImoveis;
import edu.fatec.leilao.produto.Produto;

public class Main {

	public static void main(String[] args) throws IOException {
		
		/*JOptionPane.showMessageDialog(null, "Minha mensagem!");
		JFileChooser fileChooser = new JFileChooser();
		int retorno = fileChooser.showOpenDialog(null);

		if (retorno == JFileChooser.APPROVE_OPTION) {
		  File file = fileChooser.getSelectedFile();
		  // faz alguma coisa com arquivo
		} else {
		  // dialogo cancelado
		}*/
		/*InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);

		SiteLeilao s = new SiteLeilao();
		
		s.CadastroLeilao();
		System.out.println();
		System.out.println("Dados do leilao: ");
		s.listarTodosLeilao();
		//System.out.print("Digite o ID do leilao: ");
		*/
		/*String id= br.readLine();
		if(s.removerLeilao(Integer.parseInt(id))) {
			System.out.println("Deletado com sucesso");
		}
		else {
			System.out.println("Este refistro nao existe");
		}
		//s.atualizacaoLeilao(Integer.parseInt(id));
		//s.listarTodosLeilao();
		//s.getListaLeilao().remove(0);
		
		System.out.println("Dados listados: ");
		s.listarTodosLeilao();
		*/
		/*SiteLeilao s = new SiteLeilao();
		s.CadastroLeilao();
		System.out.println();
		System.out.println("Dados do leilao: ");
		s.listarTodosLeilao();
		s.CadastroTerreno();
		s.cadastroCasa();
		System.out.println();
		s.listarTodosProdutos();
		*/
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
		
	}
	
}
