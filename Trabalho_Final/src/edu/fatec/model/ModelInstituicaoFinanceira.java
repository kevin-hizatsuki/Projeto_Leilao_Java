package edu.fatec.model;

import java.util.LinkedList;
import java.util.List;

import edu.fatec.leilao.banco.InstituicaoFinanceira;

public class ModelInstituicaoFinanceira {
	
	static List<InstituicaoFinanceira> instituicaoFinanceira = new LinkedList();
	
	public static void AdicionarInstituicaoFinanceira(InstituicaoFinanceira i) {
		instituicaoFinanceira.add(i);
	}

	public static void AtualizarInstituicaoFinanceira(InstituicaoFinanceira i) {
		for(InstituicaoFinanceira ins:instituicaoFinanceira) {
			if(ins.equals(i)) {
				instituicaoFinanceira.set(instituicaoFinanceira.indexOf(ins), i);
			}
		}
	}
	
	public static void RemoverInstituicaoFinanceira(InstituicaoFinanceira remover) {
		for(InstituicaoFinanceira ins:instituicaoFinanceira) {
			if(ins.equals(remover)) {
				instituicaoFinanceira.remove(instituicaoFinanceira.indexOf(ins));
				}
			}
		}

	public static List<InstituicaoFinanceira> getListInstituicaoFinanceira(){
		return instituicaoFinanceira;
	}
	
}