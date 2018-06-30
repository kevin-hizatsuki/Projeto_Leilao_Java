package edu.fatec.model;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import edu.fatec.leilao.Leiloes;
import edu.fatec.leilao.produto.Produto;

public class ModelProduto {
	
	static List<Produto>  produto = new LinkedList();
	
	public static void AdicionarProduto(Produto p) {
		if(idRepetido(p.getIdProduto())) {
		produto.add(p);
		}
	}
	
	public static void atualizarProduto(int id,Produto atualizar) {
		for(Produto p:produto) {
			if(p.getIdProduto()==(atualizar.getIdProduto())) {
				produto.set(produto.indexOf(p), atualizar);
			}
		}
	}
	
	public static void removerProduto(Produto remover) {
		for(Produto p:produto) {
			if(p.equals(remover)) {
				produto.remove(produto.indexOf(p));
			}
		}
	}
	
	public static List<Produto> getLisProduto(){
		return produto;
	}
	
	public static void listarTodosProdutos() {
		try {
			for (Produto p : produto) {
				System.out.println(p.toString());
				System.out.println("--------------");
			}
		} catch (java.lang.NullPointerException e) {
			System.out.println("Nao há nada na lista");
		}
	}
	
	public static List<Produto> buscaPorFaixa(double valorMin,double valorMax){
		List<Produto> listaDeProdutos = new LinkedList();
		for(Produto p: produto) {
			if((p.getPreco()>=valorMin)&& (p.getPreco()<=valorMax)) {
				listaDeProdutos.add(p);
			}
		}
		return listaDeProdutos;
	}
	
	public static List<Produto> buscaPorTipo(String tipo){
		List<Produto> listaDeProdutos = new LinkedList();
		for(Produto p: produto) {
			if(p.getTipo().equals(tipo)) {
				listaDeProdutos.add(p);
			}
		}
		return listaDeProdutos;
	}
	
	public static boolean idRepetido(int id) {
		for (Produto l : produto) {
			if (l.getIdProduto() == id)
				return false;
		}
		return true;
	}
	
	public static int geraId() {
		Random gerador = new Random();
		return gerador.nextInt(100000);
	}
	
	public static int gerarQuantidadeProdutoPorLeilao(int idLeilao) {
		int contador=0;
		for(Produto p:produto) {
			if(p.getIdLeilao()==idLeilao) {
				contador++;
			}
		}
		return contador;
	}
	
	public static void gerarArquivo(List<Produto> list) throws IOException {
		PrintWriter escritor = new PrintWriter( new FileWriter("C:\\temp\\produtos_"+LocalDate.now().toString()+".txt"));
		for(Produto p:list) {
			escritor.println(p.toString());
			escritor.println("-----------------------------------");
		}
		escritor.close();
	}

	public static Produto retornarPorId(int id) {
		for(Produto p:produto) {
			if(p.idProduto==id) {
				return p;
			}
		}
		return null;
		
	}
	
}
