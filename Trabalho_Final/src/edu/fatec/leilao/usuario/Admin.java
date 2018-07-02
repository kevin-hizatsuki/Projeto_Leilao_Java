package edu.fatec.leilao.usuario;

public class Admin {
	
	public String user;
	public String senha;
	
	public Admin(String user,String senha) {
		this.user=user;
		this.senha=senha;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("User: "+this.user).append("\n");
		sb.append("Senha: "+this.senha).append("\n");
		return sb.toString();
	}
	
}
