package edu.fatec.model;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import edu.fatec.leilao.produto.Produto;

public class ModelProduto {
	
	static List<Produto>  produto = new LinkedList();
	
	public static void AdicionarProduto(Produto p) {
		produto.add(p);
	}
	
	public static void atualizarProduto(Produto atualizar) {
		for(Produto p:produto) {
			if(p.equals(atualizar)) {
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

}
