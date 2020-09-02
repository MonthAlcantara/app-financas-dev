package br.com.onzedevs.finansdev.domain.entity;

public class Juridica {
	
	private Long id;
	private String fantasia;
	private String cnpj;
	private String razaoSocial;
	private String inscricaoEstadual;
	private String inscricaoNacional;
	private String crt;
	private String cnae;
	private Pessoa pessoa;
	
	public Juridica() {}


	private Long getId() { return id; }

	public String getFantasia() { return fantasia; }
	public void setFantasia(String fantasia) { this.fantasia = fantasia; }

	public String getCnpj() { return cnpj; }
	public void setCnpj(String cnpj) { this.cnpj = cnpj; }

	public String getRazaoSocial() { return razaoSocial; }
	public void setRazaoSocial(String razaoSocial) { this.razaoSocial = razaoSocial; }

	public String getInscricaoEstadual() { return inscricaoEstadual; }
	public void setInscricaoEstadual(String inscricaoEstadual) { this.inscricaoEstadual = inscricaoEstadual; }

	public String getInscricaoNacional() { return inscricaoNacional; }
	public void setInscricaoNacional(String inscricaoNacional) { this.inscricaoNacional = inscricaoNacional; }

	public String getCrt() { return crt; }
	public void setCrt(String crt) { this.crt = crt; }

	public String getCnae() { return cnae; }
	public void setCnae(String cnae) { this.cnae = cnae; }

	private Pessoa getPessoa() { return pessoa; }
	private void setPessoa(Pessoa pessoa) { this.pessoa = pessoa; }
	
}
