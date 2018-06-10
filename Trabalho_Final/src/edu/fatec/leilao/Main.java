package edu.fatec.leilao;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) throws IOException {
		
		JOptionPane.showMessageDialog(null, "Minha mensagem!");
		JFileChooser fileChooser = new JFileChooser();
		int retorno = fileChooser.showOpenDialog(null);

		if (retorno == JFileChooser.APPROVE_OPTION) {
		  File file = fileChooser.getSelectedFile();
		  // faz alguma coisa com arquivo
		} else {
		  // dialogo cancelado
		}
		/*InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);

		SiteLeilao s = new SiteLeilao();
		
		s.CadastroLeilao();
		System.out.println();
		System.out.println("Dados do leilao: ");
		s.listarTodosLeilao();
		//System.out.print("Digite o ID do leilao: ");
		/*String id= br.readLine();
		if(s.removerLeilao(Integer.parseInt(id))) {
			System.out.println("Deletado com sucesso");
		}
		else {
			System.out.println("Este refistro nao existe");
		}
		//s.atualizacaoLeilao(Integer.parseInt(id));
		//s.listarTodosLeilao();
		//s.getListaLeilao().remove(0);
		
		System.out.println("Dados listados: ");
		s.listarTodosLeilao();
		*/
		/*
		s.CadastroTerreno();
		s.cadastroCasa();
		System.out.println();
		s.listarTodosImoveis();
		*/
	}
	
}
