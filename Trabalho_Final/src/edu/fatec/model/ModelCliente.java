package edu.fatec.model;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

import edu.fatec.leilao.produto.Produto;
import edu.fatec.leilao.usuario.Cliente;
import edu.fatec.leilao.usuario.Usuario;

public class ModelCliente {

	static List<Usuario> cliente = new LinkedList();

	public static void adicionarCliente(Usuario c) {
		if (usuarioRepetido(c.getUser()))
			cliente.add(c);
	}

	public static void atualizarCliente(Usuario atualizar) {
		for (Usuario c : cliente) {
			if (c.getUser().equals(atualizar.getUser())) {
				cliente.set(cliente.indexOf(c), atualizar);
			}
		}
	}

	public static void removerCliente(Usuario remover) {
		cliente.remove(cliente.indexOf(remover));
	}
	/*
	 * public static void removerCliente(Usuario remover) { for (Usuario c :
	 * cliente) { if (c.equals(remover)) { cliente.remove(cliente.indexOf(c)); } } }
	 */

	public static List<Usuario> getLisCliente() {
		return cliente;
	}

	public static Boolean ifClientExists(String username, String senha) {
		for (Usuario c : cliente) {
			if (c.getUser().equals(username) && c.getSenha().equals(senha)) {
				return true;
			}
			return false;
		}
		return null;

	}

	public static boolean usuarioRepetido(String user) {
		for (Usuario u : cliente) {
			if (u.getUser().equals(user)) {
				return false;
			}
		}
		return true;
	}

	public static Cliente getObjClienteLogado(String username) {
		for (Usuario p : getLisCliente()) {
			if (p.getUser().equals(username)) {
				return (Cliente) p;
			}

		}
		return null;
	}

	public static void gerarArquivo(List<Usuario> list) throws IOException {
		PrintWriter escritor = new PrintWriter(
				new FileWriter("C:\\temp\\usuarios_" + LocalDate.now().toString() + ".det"));
		for (Usuario l : list) {
			escritor.println(l.toString());
			escritor.println("-----------------------------------");
		}
		escritor.close();
	}

}
