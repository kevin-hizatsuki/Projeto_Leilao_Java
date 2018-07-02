package edu.fatec.model;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

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
	
	public static Map<Integer,Cliente> getVencedor(List<Produto>  produto){
		Map<Integer,Cliente> vencedor = new HashMap();
		
		for(Produto p: produto) {
			Cliente c=null;
				for(Lance l: lance) {
				if((p.getIdLeilao()==l.getProduto().getIdLeilao())&&(p.getIdProduto()==l.getProduto().getIdProduto())&&(p.getPreco()==l.getProduto().getPreco())) {
				c=l.getCliente();
				}
			}
			 vencedor.put(p.getIdProduto(),c);
		}
		
		return vencedor;
	}
	
	public static void gerarArquivo(List<Lance> list)throws IOException {
		PrintWriter escritor = new PrintWriter( new FileWriter("C:\\temp\\lances_"+LocalDate.now().toString()+".det"));
		for(Lance l: list) {
			escritor.println(l.toString());
			escritor.println("-----------------------------------");
		}
		escritor.close();
	}
	

}
