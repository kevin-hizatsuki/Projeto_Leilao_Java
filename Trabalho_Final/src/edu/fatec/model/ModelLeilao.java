package edu.fatec.model;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import edu.fatec.leilao.Leiloes;
import edu.fatec.leilao.usuario.Cliente;

public class ModelLeilao {
	
	static List<Leiloes> leilao = new LinkedList();
	
	public static void AdicionarLeilao(Leiloes v) {
		leilao.add(v);
	}

	public static void AtualizarLeilao(Leiloes atualizar) {
		for (Leiloes l : leilao) {
			if (l.equals(atualizar)) {
				leilao.set(leilao.indexOf(l), atualizar);
			}
		}
	}

	public static void RemoverLeilao(Leiloes remover) {
		for (Leiloes l : leilao) {
			if (l.equals(remover)) {
				leilao.remove(leilao.indexOf(l));
			}
		}
	}

	public static List<Leiloes> getListaLeilao() {
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
	
	public static boolean removerLeilao(int id) {
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
	
	public static boolean idRepetido(int id) {
		for (Leiloes l : leilao) {
				return false;
		}
		return true;
	}
	
	public static int geraId() {
		Random gerador = new Random();
		return gerador.nextInt(100000);
	}
	
	public static List<Leiloes> getLisLeiloes(){
		return leilao;
	}

}
