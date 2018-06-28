package edu.fatec.model;

import java.util.LinkedList;
import java.util.List;

import edu.fatec.leilao.produto.Produto;
import edu.fatec.leilao.usuario.Cliente;

public class ModelCliente {
	
	static List<Cliente> cliente =new LinkedList();
	
	public static void adicionarCliente(Cliente c) {
		cliente.add(c);
	}
	
	public static void atualizarCliente(Cliente atualizar) {
		for (Cliente c : cliente) {
			if (c.equals(atualizar)) {
				cliente.set(cliente.indexOf(c), atualizar);
			}
		}
	}
	
	public static void removerCliente(Cliente remover) {
		for (Cliente c : cliente) {
			if (c.equals(remover)) {
				cliente.remove(cliente.indexOf(c));
			}
		}
	}
	 
	public static List<Cliente> getLisCliente(){
		return cliente;
	}
	 
	public static Boolean ifClientExists(String username, String senha){
		for (Cliente c : cliente) {
			if (c.getUser().equals(username) && c.getSenha().equals(senha)) {
				return true;
			}
			return false;
		}
		return null;
		
		
	}

}
