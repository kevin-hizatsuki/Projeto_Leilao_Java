package edu.fatec.leilao.produto;

import edu.fatec.leilao.Endereco;

public class EdificiosComerciais extends Apartamento {
	
	public int sala;
	
	public EdificiosComerciais(Integer id, Integer idImovel, double area, Endereco endereco, double preco,
			double condominio, String tipo, int andar, int garagem, int quarto, int banheiro,int sala) {
		super(id, idImovel, area, endereco, preco, condominio, tipo, andar, garagem, quarto, banheiro);
		this.sala=sala;
	}
	
}
