package edu.fatec.teste;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.fatec.leilao.Endereco;
import edu.fatec.leilao.Identificador;
import edu.fatec.leilao.Leiloes;
import edu.fatec.leilao.banco.InstituicaoFinanceira;
import edu.fatec.leilao.produto.Apartamento;
import edu.fatec.leilao.produto.Carro;
import edu.fatec.leilao.produto.Casas;
import edu.fatec.leilao.produto.EdificiosComerciais;
import edu.fatec.leilao.produto.Imoveis;
import edu.fatec.leilao.usuario.Cliente;
import edu.fatec.leilao.usuario.Lance;
import edu.fatec.model.ModelInstituicaoFinanceira;
import edu.fatec.model.ModelLance;
import edu.fatec.model.ModelLeilao;
import edu.fatec.model.ModelProduto;
import edu.fatec.model.ModelUsuario;

class TestModelLance {

	Identificador id;
	ModelLeilao leilao;
	ModelProduto produto;
	ModelUsuario usuario;
	ModelLance lance;
	ModelInstituicaoFinanceira InsFin;
	Lance l1;
	Lance l2;
	Lance l3;
	Lance l4;
	Cliente usuario1;
	Cliente usuario2;
	Leiloes leilao1;
	Leiloes leilao2;
	Casas produto1;
	Apartamento produto2;
	Imoveis produto3;
	Carro produto5;
	Endereco endereco;
	Endereco endereco2;
	Endereco endereco3;
	InstituicaoFinanceira banco;

	@BeforeEach
	void setUp() throws Exception {
		banco = new InstituicaoFinanceira("123456", "www.itau.com", "Itau");
		endereco = new Endereco("Rua x", "SJC", "SP", "123456");
		endereco2 = new Endereco("Rua y", "SJC", "SP", "123457");
		endereco3 = new Endereco("Rua z", "SJC", "SP", "123458");
		leilao1 = new Leiloes(1, "Leilao do ze", endereco, banco, LocalDate.of(2018, 6, 16), LocalDate.of(2018, 6, 25));
		leilao2 = new Leiloes(2, "Leilao do ze 2", endereco, banco, LocalDate.of(2018, 6, 1),LocalDate.of(2018, 6, 18));
		produto1 = new Casas(1, 1, "Casa", 150, endereco, 150, 0, 2, 2, 1);
		produto2 = new Apartamento(1, 2, 100, endereco2, 200, 0.5, "Apartamento", 15, 1, 2, 2);
		produto3 = new Imoveis(1, 3, "Terreno", 120, endereco3, 60, 0);
		produto5 = new Carro(1, 5, "Carro", "Ford", "Fusion", 4.0, 2017, "Automatico", 50, "Gasolina", 70, 4);
		usuario1 = new Cliente("Cliente", "123456", "Jose", "JOJO", "123");
		usuario2 = new Cliente("Cliente", "123457", "Julia", "JULIA", "124");
		l1 = new Lance(15, leilao1, produto1, usuario1, 155.5);
		l2 = new Lance(8, leilao1, produto2, usuario1, 200.5);
		l3 = new Lance(1, leilao1, produto2, usuario2, 210.5);
		l4 = new Lance(5, leilao1, produto2, usuario1, 260.5);

		produto.AdicionarProduto(produto1);
		produto.AdicionarProduto(produto2);
		produto.AdicionarProduto(produto3);
		produto.AdicionarProduto(produto5);
		leilao.AdicionarLeilao(leilao1);
		leilao.AdicionarLeilao(leilao2);
		usuario.adicionarCliente(usuario1);
		usuario.adicionarCliente(usuario2);
		InsFin.AdicionarInstituicaoFinanceira(banco);
	}

	@Test
	void testInsercao() {
		lance.adicionarLance(l1);
		lance.adicionarLance(l2);
		assertEquals(lance.getLisLance().size(), 2);
		//System.out.println(lance.getLisLance().get(0));
		//lance.ListarTodos();
	}
	
	@Test
	void testOrdenacao() {
		lance.adicionarLance(l1);
		lance.adicionarLance(l2);
		lance.adicionarLance(l3);
		lance.adicionarLance(l4);
		List<Lance> lest = new LinkedList();
		lest = lance.lanceOrdenado();
		for(Lance la:lest) {
			System.out.println(la);
		}
		
	}

	@AfterEach
	public void limpeza() {
		lance.getLisLance().clear();
		leilao.getLisLeiloes().clear();
		produto.getLisProduto().clear();
		usuario.getLisUsuario().clear();
		InsFin.getListInstituicaoFinanceira().clear();
	}

}
