package edu.fatec.leilao;

public class Endereco {

	public String enderecoCompleto;
	public String cidade;
	public String estado;
	public String cep;
	
	public Endereco(String enderecoCompleto,String cidade,String estado,String cep) {
		this.enderecoCompleto=enderecoCompleto;
		this.cidade=cidade;
		this.estado=estado;
		this.cep=cep;
	}

	public String getEnderecoCompleto() {
		return enderecoCompleto;
	}

	public void setEnderecoCompleto(String enderecoCompleto) {
		this.enderecoCompleto = enderecoCompleto;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
	
	
}
