package edu.fatec.teste;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.fatec.leilao.banco.InstituicaoFinanceira;
import edu.fatec.model.ModelInstituicaoFinanceira;

class TestModelInstituicaoFinanceira {
	
	ModelInstituicaoFinanceira InsFin;
	InstituicaoFinanceira banco1;
	InstituicaoFinanceira banco2;
	InstituicaoFinanceira banco3;
	InstituicaoFinanceira banco4;
	InstituicaoFinanceira banco5;
	InstituicaoFinanceira atualizar;

	@BeforeEach
	void setUp() throws Exception {
		banco1 = new InstituicaoFinanceira("123456","www.itau.com","Itau");
		banco2 = new InstituicaoFinanceira("123457","www.bradesco.com","Bradesco");
		banco3 = new InstituicaoFinanceira("123458","www.inter.com","Inter");
		banco4 = new InstituicaoFinanceira("123459","www.brasil.com","Brasil");
		banco5 = new InstituicaoFinanceira("123459","www.brasil.com.br","Brasil");
		atualizar = new InstituicaoFinanceira("123459","www.brasil.com.br","Brasil");
	}

	@Test
	void testInsercao() {
		InsFin.AdicionarInstituicaoFinanceira(banco1);
		assertEquals(InsFin.getListInstituicaoFinanceira().size(),1);
	}
	
	@Test
	void testAtualizacao() {
		InsFin.AdicionarInstituicaoFinanceira(banco1);
		InsFin.AdicionarInstituicaoFinanceira(banco4);
		InsFin.AtualizarInstituicaoFinanceira(atualizar);
		InsFin.ListarTodos();
		assertEquals(InsFin.getListInstituicaoFinanceira().get(InsFin.getListInstituicaoFinanceira().indexOf(atualizar)).getSite(),"www.brasil.com.br");
		
	}
	
	@Test
	void testRemocao() {
		InsFin.AdicionarInstituicaoFinanceira(banco1);
		InsFin.AdicionarInstituicaoFinanceira(banco2);
		InsFin.AdicionarInstituicaoFinanceira(banco3);
		InsFin.AdicionarInstituicaoFinanceira(banco4);
		assertEquals(InsFin.getListInstituicaoFinanceira().size(),4);
		InsFin.RemoverInstituicaoFinanceira(banco3);
		assertEquals(InsFin.getListInstituicaoFinanceira().size(),3);
	}
	@Test
	void testCnpjRepetido() throws IOException {
		InsFin.AdicionarInstituicaoFinanceira(banco1);
		InsFin.AdicionarInstituicaoFinanceira(banco2);
		InsFin.AdicionarInstituicaoFinanceira(banco3);
		InsFin.AdicionarInstituicaoFinanceira(banco4);
		InsFin.AdicionarInstituicaoFinanceira(banco5);
		InsFin.gerarArquivo(InsFin.getListInstituicaoFinanceira());
		assertEquals(InsFin.getListInstituicaoFinanceira().size(),4);
	}
	@AfterEach
	public void limpeza() {
		InsFin.getListInstituicaoFinanceira().clear();
	}

}
