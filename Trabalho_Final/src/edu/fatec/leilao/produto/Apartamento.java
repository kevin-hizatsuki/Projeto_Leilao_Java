package edu.fatec.leilao.produto;

import edu.fatec.leilao.Endereco;

public class Apartamento extends Casas{
	
	public int andar;
	
	public Apartamento(Integer id,Integer idImovel,double area,Endereco endereco, double preco,double condominio,String tipo,
			int andar,int garagem,int quarto,int banheiro) {
		super(id,idImovel,tipo, area, endereco, preco, condominio, garagem, quarto, banheiro);
		this.andar=andar;
	}

	public int getAndar() {
		return andar;
	}

	public void setAndar(int andar) {
		this.andar = andar;
	}
	
	
	
}
