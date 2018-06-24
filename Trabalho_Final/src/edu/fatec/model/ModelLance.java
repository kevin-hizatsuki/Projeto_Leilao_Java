package edu.fatec.model;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import edu.fatec.leilao.produto.Produto;
import edu.fatec.leilao.usuario.Cliente;
import edu.fatec.leilao.usuario.Lance;

public class ModelLance {
	
	static List<Lance> lance= new LinkedList();
	
	public static void adicionarLance(Lance l) {
		if(l.validacao()) {
		lance.add(l);
		}
	}
	
	public static List<Lance> getLisLance(){
		return lance;
	}
	
	public void ListarTodos() {
		for(Lance l:lance) {
			System.out.println(l.toString());
		}
	}
	
	public static List<Lance> lanceOrdenado(){
		List<Lance> lan =new LinkedList();
		lance.stream().sorted((o1, o2)-> o1.getIdLance().compareTo(o2.getIdLance())).forEach(p->lan.add(p));
		
		return lan;
	}
	

}
