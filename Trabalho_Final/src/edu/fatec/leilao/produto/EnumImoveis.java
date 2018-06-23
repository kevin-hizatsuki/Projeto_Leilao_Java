package edu.fatec.leilao.produto;

import java.util.ArrayList;
import java.util.List;

public enum EnumImoveis {
	Nenhum, Apartamentos, Terrenos , Casas , Edifícios_Comerciais;

public static EnumImoveis[] getValues() {
		List<EnumImoveis> listaRetorno = new ArrayList<>();
		for (EnumImoveis c : EnumImoveis.values()){
			listaRetorno.add(c);
		}
		return listaRetorno.toArray(new EnumImoveis[listaRetorno.size()]);
	}
}
