package edu.fatec.leilao.produto;

public class Veiculos {

	public Integer id;
	public String tipo;
	public String marca;
	public String modelo;
	public double cilindrada;
	public int ano;
	public String cambio;
	public double km;
	public String combustivel;
	public double valor;
	
	public Veiculos(Integer id, String tipo,String marca,String modelo,
	double cilindrada,int ano,String cambio,double km, String combustivel,
	double valor) {
		this.id=id;
		this.tipo=tipo;
		this.marca=marca;
		this.modelo=modelo;
		this.cilindrada=cilindrada;
		this.ano=ano;
		this.cambio=cambio;
		this.km=km;
		this.combustivel=combustivel;
		this.valor=valor;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	
	
	
}
