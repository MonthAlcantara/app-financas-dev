package br.com.onzedevs.finansdev.domain.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "juridica")
public class Juridica {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String fantasia;
	
	@Column(unique = true, nullable = false)
	private String cnpj;
	
	private String razaoSocial;
	
	@Column(name = "inscricao_estadual")
	private String inscricaoEstadual;
	
	@Column(name = "inscricao_nacional")
	private String inscricaoNacional;
	
	private String crt;
	private String cnae;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = Pessoa.class)
	private Pessoa pessoa;
	
//	Constructor
	public Juridica() {}

//	Getts and Setts
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
