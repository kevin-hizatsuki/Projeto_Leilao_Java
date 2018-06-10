package edu.fatec.leilao.usuario;

import edu.fatec.leilao.produto.Produto;

public class Lance {
	
	public Produto produto;
	public Cliente cliente;
	public Double lanceDeValor;
	
	public Lance(Produto produto, Cliente cliente, Double lanceDeValor) {
		this.produto=produto;
		this.cliente=cliente;
		this.lanceDeValor=lanceDeValor;
	}

}
