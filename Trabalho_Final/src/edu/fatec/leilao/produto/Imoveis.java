package edu.fatec.leilao.produto;

import edu.fatec.leilao.Endereco;

public class Imoveis extends Produto{
	
	public double area;
	public Endereco endereco;
	public double condominio;
	
	public Imoveis(Integer id,Integer idImovel,String tipo,double area,Endereco endereco,
			double preco,double condominio) {
		super(id,idImovel,tipo,preco);		
		this.area=area;
		this.endereco=endereco;
		this.condominio=condominio;
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
		sb.append("Area: "+this.area).append("M²\n");
		sb.append("Cep: "+this.endereco.cep).append("\n");
		sb.append("Cidade: "+this.endereco.cidade).append("\n");
		sb.append("Endereco completo: "+this.endereco.enderecoCompleto).append("\n");
		sb.append("Estado: "+this.endereco.estado).append("\n");
		sb.append("Condominio: R$"+this.condominio).append("\n");
		return super.toString()+sb.toString();
	}
	
}
