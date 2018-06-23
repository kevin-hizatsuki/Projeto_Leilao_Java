package edu.fatec.teste;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.time.LocalDate;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.fatec.leilao.Endereco;
import edu.fatec.leilao.Leiloes;
import edu.fatec.leilao.banco.InstituicaoFinanceira;
import edu.fatec.model.ModelLeilao;

class TestModelLeilao {

	ModelLeilao leilao;
	Leiloes l;
	Leiloes l2;
	Leiloes l3;
	Leiloes l4;
	Leiloes l5;
	Leiloes atualizar;
	Endereco endereco;
	InstituicaoFinanceira banco; 
	@BeforeEach
	void setUp() throws Exception {
		banco = new InstituicaoFinanceira("123456","www.itau.com","Itau");
		endereco = new Endereco("Rua x", "SJC", "SP", "123456");
		l = new Leiloes(1, "Leilao do ze", endereco, banco, LocalDate.of(2018, 6, 16), LocalDate.of(2018, 6, 25));
		l2 = new Leiloes(2, "Leilao do ze 2", endereco, banco, LocalDate.of(2018, 6, 1), LocalDate.of(2018, 6, 18));	
		l3 = new Leiloes(3, "Leilao do ze 3", endereco, banco, LocalDate.of(2018, 8, 21), LocalDate.of(2018, 9, 25));
		l4 = new Leiloes(4, "Leilao do ze 4", endereco, banco, LocalDate.of(2018, 6, 21), LocalDate.of(2018, 6, 25));
		l5 = new Leiloes(4, "Leilao do ze 5", endereco, banco, LocalDate.of(2018, 6, 21), LocalDate.of(2018, 6, 25));
	
	}

	@Test
	void testInsercaoLeilao() {
		leilao.AdicionarLeilao(l);
		assertEquals(leilao.getLisLeiloes().size(),1);
	}
	
	@Test
	void testRemocao() {
		leilao.AdicionarLeilao(l5);
		assertEquals(leilao.getLisLeiloes().size(),1);
		leilao.RemoverLeilao(l5);
		assertEquals(leilao.getLisLeiloes().size(),0);
	}
	
	@Test
	void testInsercaoLeilaoRepetido() {
		leilao.AdicionarLeilao(l4);
		leilao.AdicionarLeilao(l5);
		assertEquals(leilao.getLisLeiloes().size(),1);
	}
	
	@Test
	void testStatusEmAndamento() {
		leilao.AdicionarLeilao(l);
		assertEquals(leilao.statusLeilao(leilao.getLisLeiloes().get(leilao.getLisLeiloes().indexOf(l))),"EM ANDAMENTO");
	}
	
	@Test
	void testStatusFinalizado() {
		leilao.AdicionarLeilao(l2);
		assertEquals(leilao.statusLeilao(leilao.getLisLeiloes().get(leilao.getLisLeiloes().indexOf(l2))),"FINALIZADO");
	}
	
	@Test
	void testStatusEmAberto() {
		leilao.AdicionarLeilao(l3);
		assertEquals(leilao.statusLeilao(leilao.getLisLeiloes().get(leilao.getLisLeiloes().indexOf(l3))),"EM ABERTO");
	}
	
	@Test
	void testAtualizarLeilao() {
		leilao.listarTodosLeilao();
		atualizar = new Leiloes(1, "Leilao do ze atualizado", endereco, banco, LocalDate.of(2018, 6, 16), LocalDate.of(2018, 6, 25));
		leilao.AdicionarLeilao(l);
		leilao.AtualizarLeilao(1, atualizar);
		assertEquals(leilao.getLisLeiloes().get(leilao.getLisLeiloes().indexOf(atualizar)).getNome(),"Leilao do ze atualizado");
		//leilao.listarTodosLeilao();
	}
	
	@Test
	void testArquivo() throws IOException {
		leilao.AdicionarLeilao(l);
		leilao.AdicionarLeilao(l2);
		leilao.AdicionarLeilao(l3);
		leilao.AdicionarLeilao(l4);
		leilao.AdicionarLeilao(l5);
		leilao.gerarArquivo(leilao.getLisLeiloes());
	}
	
	
	@AfterEach
	public void limpeza() {
		leilao.getLisLeiloes().clear();
	}
	

}
