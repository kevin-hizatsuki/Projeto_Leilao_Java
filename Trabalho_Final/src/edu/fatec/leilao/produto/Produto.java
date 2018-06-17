package edu.fatec.leilao.produto;

public abstract class Produto {
	
	public Integer idLeilao;
	public Integer idProduto;
	public String tipo;
	public double preco;
	
	public Produto(Integer idLeilao,Integer idProduto,String tipo,double preco) {
		this.idLeilao=idLeilao;
		this.idProduto=idProduto;
		this.tipo=tipo;
		this.preco=preco;
	}

	public Integer getIdLeilao() {
		return idLeilao;
	}

	public void setIdLeilao(Integer idLeilao) {
		this.idLeilao = idLeilao;
	}

	public Integer getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Integer idProduto) {
		this.idProduto = idProduto;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ID Leilao: "+this.idLeilao).append("\n");
		sb.append("ID Imovel: "+this.idProduto).append("\n");
		sb.append("Area: "+this.tipo).append("\n");
		sb.append("Preco: R$ "+this.preco).append("\n");
		return sb.toString();
	}
	
	
}

