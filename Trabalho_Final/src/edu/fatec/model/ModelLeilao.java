package edu.fatec.model;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import edu.fatec.leilao.Leiloes;
import edu.fatec.leilao.produto.Apartamento;
import edu.fatec.leilao.produto.Carro;
import edu.fatec.leilao.produto.Casas;
import edu.fatec.leilao.produto.EdificiosComerciais;
import edu.fatec.leilao.produto.Imoveis;
import edu.fatec.leilao.produto.Produto;

public class ModelLeilao {
	
	static List<Leiloes> leilao = new LinkedList();
	
	public static void AdicionarLeilao(Leiloes v) {
		if(idRepetido(v.getId())) {
		leilao.add(v);
		}
	}

	public static void AtualizarLeilao(int id,Leiloes atualizar) {
		for (Leiloes l : leilao) {
			if (l.getId()==id) {
				leilao.set(leilao.indexOf(l), atualizar);
			}
		}
	}
	
	public static void AdicionaProdutoLeilaoId(int id, Produto produto) {
		for (Leiloes l: leilao) {
			if(l.getId()==id) {
				
				
			}
		}
	}
	
	public static void RemoverLeilao(Leiloes remover) {
		for (Leiloes l : leilao) {
			if (l.getId()==(remover.getId())) {
				leilao.remove(leilao.indexOf(l));
			}
		}
	}

	public static List<Leiloes> getLisLeiloes(){
		return leilao;
	}
	
	public static void listarTodosLeilao() {
		try {
			for (Leiloes s : leilao) {
				System.out.println(s.toString());
				System.out.println("--------------");
			}
		} catch (java.lang.NullPointerException e) {
			System.out.println("Nao há nada na lista");
		}
	}
	
	public static void consultaLeilao(int id) {
		for (Leiloes s : leilao) {
			if (s.getId() == id) {
				s.toString();
			}
		}
	}
	
	public static boolean idRepetido(int id) {
		for (Leiloes l : leilao) {
				if(l.getId()==id) {
				return false;
				}
		}
		return true;
	}
	
	public static int geraId() {
		Random gerador = new Random();
		return gerador.nextInt(100000);
	}
	
	public static Leiloes getLeilao(int idLeilao) {
		for(Leiloes p:getLisLeiloes()) {
			if (p.id == idLeilao) {
				return p;
			}
		}
		return null;
	}
	
	
//	public static String statusLeilao(Leiloes l) {
//		
//		LocalDate hoje = LocalDate.now();
//		
//		if((hoje.isAfter(l.dataInicio))&&(hoje.isBefore(l.dataFim))) {
//			return "EM ANDAMENTO";
//		}
//		if(hoje.isAfter(l.dataFim)) {
//			return "FINALIZADO";
//		}
//		else
//			return "EM ABERTO";
//	}
	
	public static Integer statusLeilao(Leiloes l) {
		
		LocalDate hoje = LocalDate.now();
		
		if((hoje.isAfter(l.dataInicio))&&(hoje.isBefore(l.dataFim))) {
			return 1;
		}
		if(hoje.isAfter(l.dataFim)) {
			return 0;
		}
		else
			return 2;
	}
	
	public static void gerarArquivo(List<Leiloes> list) throws IOException {
		PrintWriter escritor = new PrintWriter( new FileWriter("C:\\temp\\leiloes_"+LocalDate.now().toString()+".det"));
		for(Leiloes l:list) {
			escritor.println(l.toString());
			escritor.println("-----------------------------------");
		}
		escritor.close();
	}
	
	public static void AdicionaCasaLeilaoId(int id, Casas produto) {
		for (Leiloes l: leilao) {
			if(l.getId()==produto.getIdLeilao()) {
				ModelProduto.AdicionarProduto(produto);
			}
		}
	}
	
	public static void AdicionarApartamentoLeilaoId(int id, Apartamento produto) {
		for (Leiloes l: leilao) {
			if(l.getId()==produto.getIdLeilao()) {
				ModelProduto.AdicionarProduto(produto);
			}
		}
	}
	
	public static void AdicionarCarroLeilaoId(int id, Carro produto) {
		for (Leiloes l: leilao) {
			if(l.getId()==produto.getIdLeilao()) {
				ModelProduto.AdicionarProduto(produto);
			}
		}
	}
	
	public static void AdicionarEdificiosComerciaisLeilaoId(int id, EdificiosComerciais produto) {
		for (Leiloes l: leilao) {
			if(l.getId()==produto.getIdLeilao()) {
				ModelProduto.AdicionarProduto(produto);
			}
		}
	}
	
	public static void AdicionarTerrenoLeilaoId(int id, Imoveis produto) {
		for (Leiloes l: leilao) {
			if(l.getId()==produto.getIdLeilao()) {
				ModelProduto.AdicionarProduto(produto);
			}
		}
	}
	
	
	
}
