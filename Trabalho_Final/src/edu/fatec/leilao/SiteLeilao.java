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

public class SiteLeilao {

	List<Leiloes> leilao = new LinkedList();
	List<Imoveis> imovel = new LinkedList();

	public void AdicionarLeilao(Leiloes v) {
		this.leilao.add(v);
	}

	public void AdicionarImovel(Imoveis v) {
		this.imovel.add(v);
	}

	public List<Leiloes> getListaLeilao() {
		return this.leilao;
	}

	public List<Imoveis> getListaImovel() {
		return this.imovel;
	}

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
		System.out.print("Digite data do leilao(dd/mm/yyyy): ");
		String data = br.readLine();
		AdicionarLeilao(new Leiloes(id, leilao, new Endereco(enderecoCompleto, cidade, estado, cep),
				new InstituicaoFinanceira(cnpj, site, razaoSocial), LocalDate.parse(data, formatter)));
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
		for (Imoveis l : imovel) {
			if (l.getId() == id)
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
			AdicionarImovel(new Imoveis(Integer.parseInt(id), idImovel, EnumImoveis.Terrenos.toString(),
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

	public void listarTodosImoveis() {
		try {
			for (Imoveis s : imovel) {
				System.out.println(s.toString());
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
				System.out.print("Digite data do leilao(dd/mm/yyyy): ");
				String data = br.readLine();
				l.setData(LocalDate.parse(data, formatter));
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
			AdicionarImovel(new Casas(Integer.parseInt(id), idImovel, EnumImoveis.Casas.toString(),
					Double.parseDouble(area), new Endereco(enderecoCompleto, cidade, estado, cep),
					Double.parseDouble(preco), Double.parseDouble(condominio), Integer.parseInt(garagem),
					Integer.parseInt(quarto), Integer.parseInt(banheiro)));
		}

	}

}