package edu.fatec.model;

import java.util.LinkedList;
import java.util.List;

import edu.fatec.leilao.produto.Produto;
import edu.fatec.leilao.usuario.Cliente;
import edu.fatec.leilao.usuario.Usuario;

public class ModelCliente {
	
	static List<Usuario> cliente =new LinkedList();
	
	public static void adicionarCliente(Usuario c) {
		cliente.add(c);
	}
	
	public static void atualizarCliente(Usuario atualizar) {
		for (Usuario c : cliente) {
			if (c.equals(atualizar)) {
				cliente.set(cliente.indexOf(c), atualizar);
			}
		}
	}
	
	public static void removerCliente(Usuario remover) {
		for (Usuario c : cliente) {
			if (c.equals(remover)) {
				cliente.remove(cliente.indexOf(c));
			}
		}
	}
	 
	public static List<Usuario> getLisCliente(){
		return cliente;
	}
	 
	public static Boolean ifClientExists(String username, String senha){
		for (Usuario c : cliente) {
			if (c.getUser().equals(username) && c.getSenha().equals(senha)) {
				return true;
			}
			return false;
		}
		return null;
		
		
	}
	
	public static Cliente getObjClienteLogado(String username) {
		for (Usuario p: getLisCliente()) {
			if (p.getUser().equals(username)) {
				return (Cliente) p;
			}
			
		}
		return null;
	}

}
