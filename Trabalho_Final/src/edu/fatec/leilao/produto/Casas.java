package edu.fatec.leilao.produto;

import edu.fatec.leilao.Endereco;

public class Casas extends Imoveis{

	public int garagem;
	public int quarto;
	public int banheiro;
	
	public Casas(Integer id,Integer idImovel,String tipo,double area,Endereco endereco,double preco,double condominio, int garagem, int quarto,int banheiro) {
		super(id,idImovel,tipo,area,endereco, preco,condominio);
		this.garagem=garagem;
		this.quarto=quarto;
		this.banheiro=banheiro;
	}

	public int getGaragem() {
		return garagem;
	}

	public void setGaragem(int garagem) {
		this.garagem = garagem;
	}

	public int getQuarto() {
		return quarto;
	}

	public void setQuarto(int quarto) {
		this.quarto = quarto;
	}

	public int getBanheiro() {
		return banheiro;
	}

	public void setBanheiro(int banheiro) {
		this.banheiro = banheiro;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Quantidade garagem: "+this.garagem).append("\n");
		sb.append("Quantidade quarto: "+this.quarto).append("\n");
		sb.append("Quantidade banheiro: "+this.banheiro).append("\n");
		return super.toString()+sb.toString();
	}
	
}
