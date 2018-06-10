package edu.fatec.leilao.produto;

public class Veiculos extends Produto{

	public String marca;
	public String modelo;
	public double cilindrada;
	public int ano;
	public String cambio;
	public double km;
	public String combustivel;
	
	public Veiculos(Integer id,Integer idVeiculo, String tipo,String marca,String modelo,
	double cilindrada,int ano,String cambio,double km, String combustivel,
	double valor) {
		
		super(id,idVeiculo,tipo,valor);
		this.marca=marca;
		this.modelo=modelo;
		this.cilindrada=cilindrada;
		this.ano=ano;
		this.cambio=cambio;
		this.km=km;
		this.combustivel=combustivel;
		
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(double cilindrada) {
		this.cilindrada = cilindrada;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getCambio() {
		return cambio;
	}

	public void setCambio(String cambio) {
		this.cambio = cambio;
	}

	public double getKm() {
		return km;
	}

	public void setKm(double km) {
		this.km = km;
	}

	public String getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Marca: "+this.marca).append("\n");
		sb.append("Modelo: "+this.modelo).append("\n");
		sb.append("Cilindrada: "+this.cilindrada).append("\n");
		sb.append("Ano: "+this.ano).append("\n");
		sb.append("Cambio: "+this.cambio).append("\n");
		sb.append("KM: "+this.km).append("\n");
		sb.append("Combustivel: "+this.combustivel).append("\n");
		return super.toString()+sb.toString();
	}
	
}
