package edu.fatec.model;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import edu.fatec.leilao.usuario.Usuario;

public class ModelUsuario {

	static List<Usuario> usuario = new LinkedList();

	public static void adicionarCliente(Usuario c) {
		if (usuarioRepetido(c.getUser()))
			usuario.add(c);
	}

	public static void atualizarCliente(Usuario atualizar) {
		for (Usuario c : usuario) {
			if (c.getUser().equals(atualizar.getUser())) {
				usuario.set(usuario.indexOf(c), atualizar);
			}
		}
	}
	
	public static void removerCliente(Usuario u) {
		usuario.remove(usuario.indexOf(u));
	}
/*
	public static void removerCliente(Usuario remover) {
		for (Usuario c : usuario) {
			if (c.equals(remover)) {
				usuario.remove(usuario.indexOf(c));
			}
		}
	}*/

	public static boolean usuarioRepetido(String user) {
		for (Usuario u : usuario) {
			if (u.getUser().equals(user)) {
				return false;
			}
		}
		return true;
	}

	public static List<Usuario> getLisUsuario() {
		return usuario;
	}

	public static void ListarTodos() {
		for (Usuario u : usuario) {
			System.out.println(u.toString());

		}
	}
	
	
	

}
