package edu.fatec.model;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

import edu.fatec.leilao.banco.InstituicaoFinanceira;

public class ModelInstituicaoFinanceira {
	
	static List<InstituicaoFinanceira> instituicaoFinanceira = new LinkedList();
	
	public static void AdicionarInstituicaoFinanceira(InstituicaoFinanceira i) {
		if(cnpjRepetido(i.getCnpj())) {
		instituicaoFinanceira.add(i);
		}
	} 

	public static void AtualizarInstituicaoFinanceira(InstituicaoFinanceira i) {
		for(InstituicaoFinanceira ins:instituicaoFinanceira) {
			if(ins.getCnpj().equals(i.getCnpj())) {
				instituicaoFinanceira.set(instituicaoFinanceira.indexOf(ins),i);
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
	
	public static void ListarTodos() {
		for(InstituicaoFinanceira i:instituicaoFinanceira) {
			System.out.println(i.toString());
			System.out.println("--------------");
		}
	}
	
	public static boolean cnpjRepetido(String cnpj) {
		for (InstituicaoFinanceira i:instituicaoFinanceira) {
			if (i.getCnpj().equals(cnpj)) {
				return false;
			}			
		}
		return true;
	}
	
	public static void gerarArquivo(List<InstituicaoFinanceira> list) throws IOException {
		PrintWriter escritor = new PrintWriter( new FileWriter("C:\\temp\\instituicaoFinanceira_"+LocalDate.now().toString()+".det"));
		for(InstituicaoFinanceira p:list) {
			escritor.println(p.toString());
			escritor.println("-----------------------------------");
		}
		escritor.close();
	}
	
}