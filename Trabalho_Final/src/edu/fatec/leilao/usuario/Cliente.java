package edu.fatec.leilao.usuario;

public class Cliente extends Usuario{
	
	public String cpf;
	public String nome;

	public Cliente(String tipo,String cpf,String nome,String usuario,String senha) {
		super(tipo,usuario,senha);
		this.cpf=cpf;
		this.nome=nome;
		
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Cpf: "+this.cpf).append("\n");
		sb.append("Nome: "+this.getNome()).append("\n");
		return super.toString()+sb.toString();  
	}
	
}
