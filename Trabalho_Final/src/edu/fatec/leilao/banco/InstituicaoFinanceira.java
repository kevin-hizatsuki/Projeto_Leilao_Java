package edu.fatec.leilao.banco;

public class InstituicaoFinanceira {
	
	public String cnpj;
	public String site;
	public String razaoSocial;
	
	public InstituicaoFinanceira(String cnpj,String site,String razaoSocial) {
		this.cnpj=cnpj;
		this.site=site;
		this.razaoSocial=razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("CNPJ: "+this.cnpj).append("\n");
		sb.append("Razao social: "+this.razaoSocial).append("\n");
		sb.append("Site: "+this.site).append("\n");
		return sb.toString();
	}

}
