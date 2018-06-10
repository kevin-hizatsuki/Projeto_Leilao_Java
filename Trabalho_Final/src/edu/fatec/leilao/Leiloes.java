package edu.fatec.leilao;

import java.time.LocalDate;

import edu.fatec.leilao.banco.InstituicaoFinanceira;

public class Leiloes {
	
	public int id;
	public String nome;
	public Endereco endereco;
	public InstituicaoFinanceira instF;
	public LocalDate data;
	
	public Leiloes(int id,String nome,Endereco endereco,InstituicaoFinanceira instF,LocalDate data) {
		this.id=id;
		this.nome=nome;
		this.endereco=endereco;
		this.instF=instF;
		this.data=data;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	

	public InstituicaoFinanceira getInstF() {
		return instF;
	}

	public void setInstF(InstituicaoFinanceira instF) {
		this.instF = instF;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ID : "+this.id).append("\n");
		sb.append("Nome: "+this.nome).append("\n");
		sb.append("Cep: "+this.endereco.cep).append("\n");
		sb.append("Cidade: "+this.endereco.cidade).append("\n");
		sb.append("Endereco completo:: "+this.endereco.enderecoCompleto).append("\n");
		sb.append("Estado: "+this.endereco.estado).append("\n");
		sb.append("Cnpj: "+this.instF.cnpj).append("\n");
		sb.append("Site da Instituicao Financeira: "+this.instF.site).append("\n");
		sb.append("Razão social da Instituicao Financeira: "+this.instF.razaoSocial).append("\n");
		sb.append("Data: "+this.data).append("\n");
		return sb.toString();
	}

}
