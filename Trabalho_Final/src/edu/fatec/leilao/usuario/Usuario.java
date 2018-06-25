package edu.fatec.leilao.usuario;

public class Usuario {
	
	public EnumUsuario tipo;
	public String user;
	public String senha;
	
	public Usuario(EnumUsuario cliente,String user,String senha) {
		this.tipo=cliente;
		this.user=user;
		this.senha=senha;
	}
	

	public EnumUsuario getTipo() {
		return tipo;
	}



	public void setTipo(EnumUsuario tipo) {
		this.tipo = tipo;
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
		sb.append("Tipo: "+this.tipo).append("\n");
		sb.append("User: "+this.user).append("\n");
		sb.append("Senha: "+this.senha).append("\n");
		return sb.toString();
	}
}
