package edu.fatec.leilao;

public class Identificador {
	
	public static int idLance=0;
	
	public static int getIdLance() {
		return ++idLance;
	}

}
