package edu.fatec.leilao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import edu.fatec.leilao.banco.InstituicaoFinanceira;
import edu.fatec.leilao.produto.Casas;
import edu.fatec.leilao.produto.EnumImoveis;
import edu.fatec.leilao.produto.Imoveis;
import edu.fatec.leilao.produto.Produto;
import edu.fatec.leilao.usuario.Cliente;
import edu.fatec.leilao.usuario.Lance;

//import com.db4o.Db4oEmbedded;
//import com.db4o.ObjectContainer;
//import com.db4o.ObjectSet;
//import com.db4o.query.Query;


public class SiteLeilao {

private static SiteLeilao modeloUniqueInstance;
	

	public static SiteLeilao getInstance() {
		if (modeloUniqueInstance == null) {
			modeloUniqueInstance = new SiteLeilao();
		}
		return modeloUniqueInstance;
	}
	
	List<Leiloes> leilao = new LinkedList();
	//ObjectContainer leilao = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), "bd/leilao.db4o");
	List<Produto> produto = new LinkedList();
	List<Lance> lance= new LinkedList();
	List<Cliente> cliente =new LinkedList();
//--------------------------------------------------------
	public void AdicionarProduto(Produto p) {
		this.produto.add(p);
	}
	
	public void atualizarProduto(Produto atualizar) {
		for(Produto p:produto) {
			if(p.equals(atualizar)) {
				produto.set(produto.indexOf(p), atualizar);
			}
		}
	}
	
	public void removerProduto(Produto remover) {
		for(Produto p:produto) {
			if(p.equals(remover)) {
				produto.remove(produto.indexOf(p));
			}
		}
	}
	
	public List<Produto> getListaProduto(){
		return this.produto;
	}
//--------------------------------------------------------	
	public void AdicionarLeilao(Leiloes v) {
		this.leilao.add(v);
	}

	public void AtualizarLeilao(Leiloes atualizar) {
		for (Leiloes l : leilao) {
			if (l.equals(atualizar)) {
				leilao.set(leilao.indexOf(l), atualizar);
			}
		}
	}

	public void RemoverLeilao(Leiloes remover) {
		for (Leiloes l : leilao) {
			if (l.equals(remover)) {
				leilao.remove(leilao.indexOf(l));
			}
		}
	}

	public List<Leiloes> getListaLeilao() {
		return this.leilao;
	}
//--------------------------------------------------------
	public void adicionarLance(Lance l) {
		this.lance.add(l);
	}
//--------------------------------------------------------

	public void adicionarCliente(Cliente c) {
		this.cliente.add(c);
	}
	
	public void atualizarCliente(Cliente atualizar) {
		for (Cliente c : cliente) {
			if (c.equals(atualizar)) {
				cliente.set(cliente.indexOf(c), atualizar);
			}
		}
	}
	
	public void removerCliente(Cliente remover) {
		for (Cliente c : cliente) {
			if (c.equals(remover)) {
				cliente.remove(cliente.indexOf(c));
			}
		}
	}
//--------------------------------------------------------
	public void CadastroLeilao() throws IOException {
		int id;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		while (true) {
			id = geraId();
			if (leilaoRepetido(id)) {
				break;
			}
		}
		System.out.print("Digite o nome do Leilao: ");
		String leilao = br.readLine();
		System.out.print("Digite um cep: ");
		String cep = br.readLine();
		System.out.print("Digite um cidade: ");
		String cidade = br.readLine();
		System.out.print("Digite endereco completo: ");
		String enderecoCompleto = br.readLine();
		System.out.print("Digite estado: ");
		String estado = br.readLine();
		System.out.print("Digite cnpj da Instituicao Financeira: ");
		String cnpj = br.readLine();
		System.out.print("Digite site da Instituicao Financeira: ");
		String site = br.readLine();
		System.out.print("Digite Razao Social da Instituicao Financeira: ");
		String razaoSocial = br.readLine();
		System.out.print("Digite data de inicio leilao(dd/mm/yyyy): ");
		String data = br.readLine();
		System.out.print("Digite data de fim leilao(dd/mm/yyyy): ");
		String dataFim = br.readLine();
		AdicionarLeilao(new Leiloes(id, leilao, new Endereco(enderecoCompleto, cidade, estado, cep),
				new InstituicaoFinanceira(cnpj, site, razaoSocial), LocalDate.parse(data, formatter),LocalDate.parse(dataFim, formatter)));
	}

	public int geraId() {
		Random gerador = new Random();
		return gerador.nextInt(100000);
	}

	public boolean leilaoRepetido(int id) {
		for (Leiloes l : leilao) {
			if (l.getId() == id)
				return false;
		}
		return true;
	}

	public boolean imovelRepetido(int id) {
		for (Produto l : produto) {
			if (l.getIdProduto() == id)
				return false;
		}
		return true;
	}

	public void CadastroTerreno() throws IOException {
		int confir = 0;
		String id;
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		while (true) {
			int conf = 0;
			System.out.print("Digite o ID do leilao: ");
			id = br.readLine();
			for (Leiloes l : leilao) {
				if (l.id == Integer.parseInt(id)) {
					conf++;
					break;
				}
			}
			if (conf == 0) {
				System.out.print("Nao há este leilao cadastrado");
				System.out.print("Deseja tentar novamente?(S/N)");
				String tentar = br.readLine();
				if (tentar.equals("N")) {
					confir = -1;
					break;
				}
			} else {
				break;
			}

		}
		if (confir == -1) {
			return;
		} else {
			int idImovel;
			while (true) {
				idImovel = geraId();
				if (imovelRepetido(idImovel)) {
					break;
				}
			}
			System.out.print("Digite a sua area");
			String area = br.readLine();
			System.out.print("Digite um cep: ");
			String cep = br.readLine();
			System.out.print("Digite um cidade: ");
			String cidade = br.readLine();
			System.out.print("Digite endereco completo: ");
			String enderecoCompleto = br.readLine();
			System.out.print("Digite estado: ");
			String estado = br.readLine();
			System.out.print("Digite o preco: ");
			String preco = br.readLine();
			System.out.print("Digite o condominio: ");
			String condominio = br.readLine();
			AdicionarProduto(new Imoveis(Integer.parseInt(id), idImovel, EnumImoveis.Terrenos.toString(),
					Double.parseDouble(area), new Endereco(enderecoCompleto, cidade, estado, cep),
					Double.parseDouble(preco), Double.parseDouble(condominio)));
		}

	}

	public void listarTodosLeilao() {
		try {
			for (Leiloes s : leilao) {
				System.out.println(s.toString());
				System.out.println("--------------");
			}
		} catch (java.lang.NullPointerException e) {
			System.out.println("Nao há nada na lista");
		}
	}

	public void listarTodosProdutos() {
		try {
			for (Produto p : produto) {
				System.out.println(p.toString());
				System.out.println("--------------");
			}
		} catch (java.lang.NullPointerException e) {
			System.out.println("Nao há nada na lista");
		}
	}

	public void consultaLeilao(int id) {
		for (Leiloes s : leilao) {
			if (s.getId() == id) {
				s.toString();
			}
		}
	}

	public void atualizacaoLeilao(int id) throws IOException {
		int cont = 0;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		for (Leiloes l : leilao) {
			if (l.id == id) {
				System.out.print("Digite o nome do Leilao: ");
				String leilao = br.readLine();
				l.setNome(leilao);
				System.out.print("Digite um cep: ");
				String cep = br.readLine();
				l.endereco.setCep(cep);
				System.out.print("Digite um cidade: ");
				String cidade = br.readLine();
				l.endereco.setCidade(cidade);
				System.out.print("Digite endereco completo: ");
				String enderecoCompleto = br.readLine();
				l.endereco.setEnderecoCompleto(enderecoCompleto);
				System.out.print("Digite estado: ");
				String estado = br.readLine();
				l.endereco.setEstado(estado);
				System.out.print("Digite cnpj da Instituicao Financeira: ");
				String cnpj = br.readLine();
				l.instF.setCnpj(cnpj);
				System.out.print("Digite site da Instituicao Financeira: ");
				String site = br.readLine();
				l.instF.setSite(site);
				System.out.print("Digite Razao Social da Instituicao Financeira: ");
				String razaoSocial = br.readLine();
				l.instF.setRazaoSocial(razaoSocial);
				System.out.print("Digite data de inicio leilao(dd/mm/yyyy): ");
				String data = br.readLine();
				l.setDataInicio(LocalDate.parse(data, formatter));
				System.out.print("Digite data de fim leilao(dd/mm/yyyy): ");
				String dataFim = br.readLine();
				l.setDataFim(LocalDate.parse(dataFim, formatter));
				cont++;
			}
		}
		if (cont == 0) {
			System.out.println("Não existe este leilao cadastrado");
		}
	}

	public boolean removerLeilao(int id) {
		int posicao = 0;
		for (Leiloes l : leilao) {
			if (l.id == id) {
				leilao.remove(posicao);
				return true;
			}
			posicao++;
		}
		return false;
	}

	public void cadastroCasa() throws IOException {
		int confir = 0;
		String id;
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		while (true) {
			int conf = 0;
			System.out.print("Digite o ID do leilao: ");
			id = br.readLine();
			for (Leiloes l : leilao) {
				if (l.id == Integer.parseInt(id)) {
					conf++;
					break;
				}
			}
			if (conf == 0) {
				System.out.print("Nao há este leilao cadastrado");
				System.out.print("Deseja tentar novamente?(S/N)");
				String tentar = br.readLine();
				if (tentar.equals("N")) {
					confir = -1;
					break;
				}
			} else {
				break;
			}

		}
		if (confir == -1) {
			return;
		} else {
			int idImovel;
			while (true) {
				idImovel = geraId();
				if (imovelRepetido(idImovel)) {
					break;
				}
			}
			System.out.print("Digite a quantidade de garagem: ");
			String garagem = br.readLine();
			System.out.print("Digite a quantidade de quarto: ");
			String quarto = br.readLine();
			System.out.print("Digite a quantidade de banheiro: ");
			String banheiro = br.readLine();
			System.out.print("Digite a sua area");
			String area = br.readLine();
			System.out.print("Digite um cep: ");
			String cep = br.readLine();
			System.out.print("Digite um cidade: ");
			String cidade = br.readLine();
			System.out.print("Digite endereco completo: ");
			String enderecoCompleto = br.readLine();
			System.out.print("Digite estado: ");
			String estado = br.readLine();
			System.out.print("Digite o preco: ");
			String preco = br.readLine();
			System.out.print("Digite o condominio: ");
			String condominio = br.readLine();
			AdicionarProduto(new Casas(Integer.parseInt(id), idImovel, EnumImoveis.Casas.toString(),
					Double.parseDouble(area), new Endereco(enderecoCompleto, cidade, estado, cep),
					Double.parseDouble(preco), Double.parseDouble(condominio), Integer.parseInt(garagem),
					Integer.parseInt(quarto), Integer.parseInt(banheiro)));
		}

	}
	
	public List<Produto> buscaPorFaixa(double valorMin,double valorMax){
		List<Produto> listaDeProdutos = new LinkedList();
		for(Produto p: produto) {
			if((p.getPreco()>=valorMin)&& (p.getPreco()<=valorMax)) {
				listaDeProdutos.add(p);
			}
		}
		return listaDeProdutos;
	}
	

}