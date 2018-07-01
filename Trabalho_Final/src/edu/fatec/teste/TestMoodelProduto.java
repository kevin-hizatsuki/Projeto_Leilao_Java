package edu.fatec.teste;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.time.LocalDate;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Forms.Form_Altera_Apartamento;
import Forms.Form_Altera_Carro;
import Forms.Form_Altera_Casa;
import Forms.Form_Altera_Edificio_Comercial;
import Forms.Form_Altera_Motocicleta;
import Forms.Form_Altera_Terreno;
import Forms.Form_Cadastro_Administrador;
import Forms.Form_Cadastro_Apartamento;
import Forms.Form_Cadastro_Carro;
import Forms.Form_Cadastro_Casa;
import Forms.Form_Cadastro_Edificio;
import Forms.Form_Cadastro_Instituicao_Financeira;
import Forms.Form_Cadastro_Motocicleta;
import Forms.Form_Cadastro_Terreno;
import edu.fatec.leilao.Endereco;
import edu.fatec.leilao.Leiloes;
import edu.fatec.leilao.banco.InstituicaoFinanceira;
import edu.fatec.leilao.produto.Apartamento;
import edu.fatec.leilao.produto.Carro;
import edu.fatec.leilao.produto.Casas;
import edu.fatec.leilao.produto.EdificiosComerciais;
import edu.fatec.leilao.produto.EnumImoveis;
import edu.fatec.leilao.produto.Imoveis;
import edu.fatec.leilao.produto.Veiculos;
import edu.fatec.model.ModelLeilao;
import edu.fatec.model.ModelProduto;

class TestMoodelProduto {

	ModelProduto produto;
	ModelLeilao leilao;
	Leiloes l;
	Leiloes l2;
	Casas produto1;
	Apartamento produto2;	
	Imoveis produto3;
	EdificiosComerciais produto4;
	Carro produto5;
	Veiculos produto6;
	Veiculos produto7;
	Casas produto8;
	Apartamento produto9;
	Apartamento atualizacao;
	Endereco endereco;
	Endereco endereco2;
	Endereco endereco3;
	Endereco endereco4;
	Form_Cadastro_Carro c = new Form_Cadastro_Carro();
	Form_Cadastro_Administrador iCA = new Form_Cadastro_Administrador();
	Form_Cadastro_Apartamento iCap = new Form_Cadastro_Apartamento();
	Form_Cadastro_Edificio iCed= new Form_Cadastro_Edificio();
	Form_Cadastro_Instituicao_Financeira iCif = new Form_Cadastro_Instituicao_Financeira();
	Form_Cadastro_Terreno iCt = new Form_Cadastro_Terreno();
	Form_Cadastro_Casa iCc = new Form_Cadastro_Casa(); 
	Form_Altera_Carro aCar = new Form_Altera_Carro();
	Form_Altera_Casa aCas = new Form_Altera_Casa();
	//Form_Altera_Terreno aTr = Form_Altera_Terreno();
	//Form_Altera_Edificio_Comercial aEc = new Form_Altera_Edificio_Comercial();
	//Form_Altera_Apartamento aAp = new Form_Altera_Apartamento();
	Form_Altera_Motocicleta aMc = new Form_Altera_Motocicleta();
	//Form_Cadastro_Motocicleta iCm = Form_Cadastro_Motocicleta();
	InstituicaoFinanceira banco;
	
	@BeforeEach
	void setUp() throws Exception {
		banco = new InstituicaoFinanceira("123456","www.itau.com","Itau");
		endereco = new Endereco("Rua x", "SJC", "SP", "123456");
		endereco2 = new Endereco("Rua y", "SJC", "SP", "123457");
		endereco3 = new Endereco("Rua z", "SJC", "SP", "123458");
		endereco4 = new Endereco("Rua h", "SJC", "SP", "123459");
		l = new Leiloes(1, "Leilao do ze", endereco, banco, LocalDate.of(2018, 6, 16), LocalDate.of(2018, 7, 25));
		l2 = new Leiloes(2, "Leilao do ze 2", endereco, banco, LocalDate.of(2018, 6, 1), LocalDate.of(2018, 6, 18));	
		produto1 = new Casas(1, 1, "Casa", 150, endereco, 150, 0, 2, 2, 1);
		produto2 = new Apartamento(1, 2, 100, endereco2, 200, 0.5, "Apartamento", 15, 1, 2, 2);
		produto3 = new Imoveis(1, 3, "Terreno", 120, endereco3, 60, 0);
		produto4 = new EdificiosComerciais(1, 4, 50, endereco4, 100, 0.6, "Edificios Comerciais", 2, 3, 3, 1, 30);
		produto5 = new Carro(1, 5, "Carro", "Ford", "Fusion", 4.0, 2017, "Automatico", 50, "Gasolina", 70, 4);
		produto6 = new Veiculos(1, 6, "Moto", "Honda", "CG", 160, 2008, "Manual", 30, "Alcool", 8);
		produto7 = new Veiculos(1, 6, "Moto", "Honda", "CG", 160, 2008, "Manual", 30, "Alcool", 8);
		produto8 = new Casas(2, 56, "Casa", 150, endereco, 150, 0, 2, 2, 1);
		produto9 = new Apartamento(2, 564, 100, endereco2, 200, 0.5, "Apartamento", 15, 1, 2, 2);
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
		produto.atualizarProduto(atualizacao);
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
		//produto.listarTodosProdutos();
		
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
	
	@Test
	void testRetornoListaProdutoPorLeilao() {
		produto.AdicionarProduto(produto1);
		produto.AdicionarProduto(produto2);
		produto.AdicionarProduto(produto3);
		produto.AdicionarProduto(produto4);
		produto.AdicionarProduto(produto5);
		produto.AdicionarProduto(produto6);
		produto.AdicionarProduto(produto8);
		produto.AdicionarProduto(produto9);
		assertEquals(produto.getProdutosPorLeilao(1).size(),6);
		assertEquals(produto.getProdutosPorLeilao(2).size(),2);
		
	}
	
	@Test
	void testBuscaPalavraChave() {
		leilao.AdicionarLeilao(l);
		leilao.AdicionarLeilao(l2);
		produto.AdicionarProduto(produto1);
		produto.AdicionarProduto(produto2);
		produto.AdicionarProduto(produto3);
		produto.AdicionarProduto(produto4);
		produto.AdicionarProduto(produto5);
		produto.AdicionarProduto(produto6);
		produto.AdicionarProduto(produto8);
		produto.AdicionarProduto(produto9);
		System.out.println(produto.produtoAseuLeilao(produto2, leilao.getLisLeiloes()));
	}
	
	@Test
	void testInterfaceCadastroCarro() {
		c.setVisible(true);
		c.dispose();
	}
	
	
	@Test
	void testInterfaceCadastroAdmin() {
		iCA.setVisible(true);
		iCA.dispose();
	}
		
	@Test
	void testInterfaceCadastroAp() {
		iCap.setVisible(true);
		iCap.dispose();
	}
	
	@Test
	void testInterfaceCadastroEd() {
		iCed.setVisible(true);
		iCed.dispose();
	}
	
	@Test
	void testInterfaceCadastroIf() {
		iCif.setVisible(true);
		iCif.dispose();
	}
	
	@Test
	void testInterfaceCadastroTer() {
		iCt.setVisible(true);
		iCt.dispose();
	}
	
	@Test
	void testInterfaceAlteraAp() {
		//aAp.setVisible(true);
		//aAp.dispose();
	}
	
	@Test
	void testInterfaceAlteraCar() {
		aCar.setVisible(true);
		aCar.dispose();
	}
		
	@Test
	void testInterfaceAlteraCas() {
		aCas.setVisible(true);
		aCas.dispose();
	}
	
	@Test
	void testInterfaceAlteraEd() {
		//aEc.setVisible(true);
		//aEc.dispose();
	}
	
	@Test
	void testInterfaceAlteraMc() {
		aMc.setVisible(true);
		aMc.dispose();
	}
	
	@Test
	void testInterfaceAlteraTr() {
		//aTr.setVisible(true);
		//aTr.dispose();
	}
	
	@Test
	void testInterfaceCadCas() {
		iCc.setVisible(true);
		iCc.dispose();
	}
	
	@AfterEach
	public void limpeza() {
		produto.getLisProduto().clear();
	}
	
}
