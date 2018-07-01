package edu.fatec.teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.fatec.leilao.usuario.Cliente;
import edu.fatec.leilao.usuario.EnumUsuario;
import edu.fatec.leilao.usuario.Usuario;
import edu.fatec.model.ModelCliente;

class TestModelUsuario {
	
	ModelCliente usuario;
	Usuario admin;
	Cliente usuario1;
	Cliente usuario2;
	Cliente usuario3;
	Cliente usuario4;
	Cliente usuario5;
	Cliente atualizar;
	
	
	@BeforeEach
	void setUp() throws Exception {
		admin = new Usuario(EnumUsuario.Administrador, "Admin", "Admin");
		usuario1 = new Cliente(EnumUsuario.Cliente, "123456", "Jose", "JOJO", "123");
		usuario2 = new Cliente(EnumUsuario.Cliente, "123457", "Julia", "JULIA", "124");
		usuario3 = new Cliente(EnumUsuario.Cliente, "123458", "Karinao", "karinao", "125");
		usuario4 = new Cliente(EnumUsuario.Cliente, "123459", "Lusca", "lucasdlg", "126");
		usuario5 = new Cliente(EnumUsuario.Cliente, "123457", "Julia", "JULIA", "12426");
		atualizar = new Cliente(EnumUsuario.Cliente, "123456", "Jose", "JOJO", "321");
	}

	@Test
	void testInsercao() {
		usuario.adicionarCliente(admin);
		assertEquals(usuario.getLisCliente().size(),1);
	}
	
	@Test
	void testAtualizar() {
		usuario.adicionarCliente(usuario1);
		usuario.atualizarCliente(atualizar);
		assertEquals(usuario.getLisCliente().get(usuario.getLisCliente().indexOf(atualizar)).getSenha(),"321");
	}
	
	@Test
	void testRemover() {
		usuario.adicionarCliente(admin);
		usuario.adicionarCliente(usuario1);
		usuario.adicionarCliente(usuario2);
		usuario.adicionarCliente(usuario3);
		usuario.adicionarCliente(usuario4);
		assertEquals(usuario.getLisCliente().size(),5);
		//usuario.ListarTodos();
		usuario.removerCliente(usuario2);
		usuario.getLisCliente();
		assertEquals(usuario.getLisCliente().size(),4);
		
	}
	
	@Test
	void testUsuarioRepetido() {
		usuario.adicionarCliente(usuario2);
		usuario.adicionarCliente(usuario5);
		assertEquals(usuario.getLisCliente().size(),1);
		
	}
	
 
	@AfterEach
	public void limpeza() {
		usuario.getLisCliente().clear();
	}
}
