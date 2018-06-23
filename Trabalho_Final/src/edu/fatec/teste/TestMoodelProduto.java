package edu.fatec.teste;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.fatec.leilao.Endereco;
import edu.fatec.leilao.produto.Apartamento;
import edu.fatec.leilao.produto.Carro;
import edu.fatec.leilao.produto.Casas;
import edu.fatec.leilao.produto.EdificiosComerciais;
import edu.fatec.leilao.produto.EnumImoveis;
import edu.fatec.leilao.produto.Imoveis;
import edu.fatec.leilao.produto.Veiculos;
import edu.fatec.model.ModelProduto;

class TestMoodelProduto {

	ModelProduto produto;
	Casas produto1;
	Apartamento produto2;	
	Imoveis produto3;
	EdificiosComerciais produto4;
	Carro produto5;
	Veiculos produto6;
	Veiculos produto7;
	Apartamento atualizacao;
	Endereco endereco;
	Endereco endereco2;
	Endereco endereco3;
	Endereco endereco4;
		
	@BeforeEach
	void setUp() throws Exception {
		endereco = new Endereco("Rua x", "SJC", "SP", "123456");
		endereco2 = new Endereco("Rua y", "SJC", "SP", "123457");
		endereco3 = new Endereco("Rua z", "SJC", "SP", "123458");
		endereco4 = new Endereco("Rua h", "SJC", "SP", "123459");
		produto1 = new Casas(1, 1, "Casa", 150, endereco, 150, 0, 2, 2, 1);
		produto2 = new Apartamento(1, 2, 100, endereco2, 200, 0.5, "Apartamento", 15, 1, 2, 2);
		produto3 = new Imoveis(1, 3, "Terreno", 120, endereco3, 60, 0);
		produto4 = new EdificiosComerciais(1, 4, 50, endereco4, 100, 0.6, "Edificios Comerciais", 2, 3, 3, 1, 30);
		produto5 = new Carro(1, 5, "Carro", "Ford", "Fusion", 4.0, 2017, "Automatico", 50, "Gasolina", 70, 4);
		produto6 = new Veiculos(1, 6, "Moto", "Honda", "CG", 160, 2008, "Manual", 30, "Alcool", 8);
		produto7 = new Veiculos(1, 6, "Moto", "Honda", "CG", 160, 2008, "Manual", 30, "Alcool", 8);
	}

	@Test
	void testInsercaoProduto() {
		produto.AdicionarProduto(produto1);
		assertEquals(produto.getLisProduto().size(),1);
	}
	
	@Test
	void testAtualizacaoProduto() {
		produto.AdicionarProduto(produto2);
		atualizacao = new Apartamento(1, 2, 100, endereco2, 210, 0.5, "Apartamento", 15, 1, 2, 2);
		produto.atualizarProduto(2, atualizacao);
		assertEquals(produto.getLisProduto().get(produto.getLisProduto().indexOf(atualizacao)).getPreco(),210);
	}
	
	@Test
	void testRemover() {
		produto.AdicionarProduto(produto3);
		assertEquals(produto.getLisProduto().size(),1);
		produto.removerProduto(produto3);
		assertEquals(produto.getLisProduto().size(),0);
	}
	
	@Test
	void testBuscarPorFatura() {
		produto.AdicionarProduto(produto4);
		assertEquals(produto.buscaPorFaixa(99, 101).get(0),produto4);
	}
	
	@Test
	void testBuscarPorTipo() {
		produto.AdicionarProduto(produto5);
		assertEquals(produto.buscaPorTipo("Carro").get(0),produto5);
	}
	
	@Test
	void testGeraQuantidade() {
		produto.AdicionarProduto(produto1);
		produto.AdicionarProduto(produto2);
		produto.AdicionarProduto(produto3);
		produto.AdicionarProduto(produto4);
		produto.AdicionarProduto(produto5);
		produto.AdicionarProduto(produto6);
		assertEquals(produto.gerarQuantidadeProdutoPorLeilao(1),6);
	}
	
	@Test
	void testIdRepetido() {
		produto.AdicionarProduto(produto6);
		produto.AdicionarProduto(produto7);
		assertEquals(produto.getLisProduto().size(),1);
		produto.listarTodosProdutos();
		
	}
	@Test
	void testArquivo() throws IOException {
		produto.AdicionarProduto(produto1);
		produto.AdicionarProduto(produto2);
		produto.AdicionarProduto(produto3);
		produto.AdicionarProduto(produto4);
		produto.AdicionarProduto(produto5);
		produto.AdicionarProduto(produto6);
		produto.gerarArquivo(produto.getLisProduto());
	}
	
	@AfterEach
	public void limpeza() {
		produto.getLisProduto().clear();
	}
	
}
