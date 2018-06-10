package edu.fatec.leilao.produto;

import edu.fatec.leilao.Endereco;

public class Imoveis {
	
	public Integer id;
	public Integer idImovel;
	public String tipo;
	public double area;
	public Endereco endereco;
	public double preco;
	public double condominio;
	
	public Imoveis(Integer id,Integer idImovel,String tipo,double area,Endereco endereco,
			double preco,double condominio) {
		this.id=id;
		this.idImovel=idImovel;		
		this.tipo=tipo;
		this.area=area;
		this.endereco=endereco;
		this.preco=preco;
		this.condominio=condominio;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIdImovel() {
		return idImovel;
	}

	public void setIdImovel(Integer idImovel) {
		this.idImovel = idImovel;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getCondominio() {
		return condominio;
	}

	public void setCondominio(double condominio) {
		this.condominio = condominio;
	}
		
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ID Leilao: "+this.id).append("\n");
		sb.append("ID Imovel: "+this.idImovel).append("\n");
		sb.append("Area: "+this.tipo).append("\n");
		sb.append("Area: "+this.area).append("M²\n");
		sb.append("Cep: "+this.endereco.cep).append("\n");
		sb.append("Cidade: "+this.endereco.cidade).append("\n");
		sb.append("Endereco completo: "+this.endereco.enderecoCompleto).append("\n");
		sb.append("Estado: "+this.endereco.estado).append("\n");
		sb.append("Preco: R$ "+this.preco).append("\n");
		sb.append("Condominio: R$"+this.condominio).append("\n");
		return sb.toString();
	}
	
}
