package edu.fatec.leilao.usuario;

import edu.fatec.leilao.Leiloes;
import edu.fatec.leilao.produto.Produto;

public class Lance {

	public Integer idLance;
	public Leiloes leilao;
	public Produto produto;
	public Cliente cliente;
	public Double lanceDeValor;

	public Lance(Integer idLance, Leiloes leilao, Produto produto, Cliente cliente, Double lanceDeValor) {
		this.idLance = idLance;
		this.leilao = leilao;
		this.produto = produto;
		this.cliente = cliente;
		this.lanceDeValor = lanceDeValor;
	}
	
	public Integer getIdLance() {
		return idLance;
	}

	public void setIdLance(Integer idLance) {
		this.idLance = idLance;
	}

	public Leiloes getLeilao() {
		return leilao;
	}

	public void setLeilao(Leiloes leilao) {
		this.leilao = leilao;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Double getLanceDeValor() {
		return lanceDeValor;
	}

	public void setLanceDeValor(Double lanceDeValor) {
		this.lanceDeValor = lanceDeValor;
	}

	public boolean validacao() {
		if (this.lanceDeValor > produto.getPreco()) {
			produto.setPreco(lanceDeValor);
			return true;
		}
		return false;

	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ID Lance : " + this.idLance).append("\n");
		sb.append(this.leilao.toString());
		sb.append(this.produto.toString());
		sb.append(this.cliente.toString());
		sb.append("Valor lance: " + this.lanceDeValor).append("\n");
		return sb.toString();
	}

}
