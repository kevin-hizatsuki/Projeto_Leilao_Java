package edu.fatec.leilao.usuario;

import edu.fatec.leilao.produto.Produto;

public class Lance {
	
	public int idLance;
	public Produto produto;
	public Cliente cliente;
	public Double lanceDeValor;
	
	public Lance(int idLance, Produto produto, Cliente cliente, Double lanceDeValor) {
		this.idLance =idLance;
		this.produto=produto;
		this.cliente=cliente;
		this.lanceDeValor=lanceDeValor;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ID Lance : "+this.idLance).append("\n");
		sb.append(this.produto.toString());
		sb.append(this.cliente.toString());
		sb.append("Valor lance: "+this.lanceDeValor).append("\n");
		return sb.toString();
	}

}
