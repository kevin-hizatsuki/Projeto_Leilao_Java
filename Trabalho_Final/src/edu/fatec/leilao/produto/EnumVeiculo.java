package edu.fatec.leilao.produto;

import java.util.ArrayList;
import java.util.List;

public enum EnumVeiculo {
	Nenhum, Carros,Motocicletas;
	public static EnumVeiculo[] getValues() {
		List<EnumVeiculo> listaRetorno = new ArrayList<>();
		for (EnumVeiculo c : EnumVeiculo.values()){
			listaRetorno.add(c);
		}
		return listaRetorno.toArray(new EnumVeiculo[listaRetorno.size()]);
	}
}

