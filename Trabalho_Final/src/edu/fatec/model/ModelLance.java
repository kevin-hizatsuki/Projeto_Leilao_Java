package edu.fatec.model;

import java.util.LinkedList;
import java.util.List;

import edu.fatec.leilao.usuario.Cliente;
import edu.fatec.leilao.usuario.Lance;

public class ModelLance {
	
	static List<Lance> lance= new LinkedList();
	
	public static void adicionarLance(Lance l) {
		lance.add(l);
	}
	
	public static List<Lance> getLisLance(){
		return lance;
	}
	

}
