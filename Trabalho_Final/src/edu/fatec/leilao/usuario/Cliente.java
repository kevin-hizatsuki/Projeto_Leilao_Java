package edu.fatec.leilao.usuario;

public class Cliente {
	
	public String cpf;
	public String nome;
	public String usuario;
	public String senha;

	public Cliente(String cpf,String nome,String usuario,String senha) {
		this.cpf=cpf;
		this.nome=nome;
		this.usuario=usuario;
		this.senha=senha;
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

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Cpf: "+this.cpf).append("\n");
		sb.append("Nome: "+this.getNome()).append("\n");
		sb.append("User: "+this.usuario).append("\n");
		return sb.toString();  
	}
	
}
