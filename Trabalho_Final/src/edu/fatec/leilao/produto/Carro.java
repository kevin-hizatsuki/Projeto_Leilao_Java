package edu.fatec.leilao.produto;

public class Carro extends Veiculos {
	
	public int numPorta;
	
	public Carro(Integer id, Integer idVeiculo, String tipo, String marca, String modelo, double cilindrada, int ano,
			String cambio, double km, String combustivel, double valor,int numPorta) {
		super(id, idVeiculo, tipo, marca, modelo, cilindrada, ano, cambio, km, combustivel, valor);
		this.numPorta=numPorta;
	}
	
}
