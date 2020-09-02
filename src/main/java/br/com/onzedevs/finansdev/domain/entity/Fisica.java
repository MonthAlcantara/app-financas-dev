package br.com.onzedevs.finansdev.domain.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.com.onzedevs.finansdev.domain.enums.Sexo;

@Entity
@Table(name = "fisica")
public class Fisica {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String cpf;
	
	@Enumerated(EnumType.STRING)
	private Sexo sexo;
	
	private String rg;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = Pessoa.class)
	private Pessoa pessoa;
	
//	Constructor
	public Fisica() {}

//	Getts and Setts
	private Long getId() { return id; }

	public String getCpf() { return cpf; }
	public void setCpf(String cpf) { this.cpf = cpf; }

	public Sexo getSexo() { return sexo; }
	public void setSexo(Sexo sexo) { this.sexo = sexo; }

	public String getRg() { return rg; }
	public void setRg(String rg) { this.rg = rg; }

	private Pessoa getPessoa() { return pessoa; }
	private void setPessoa(Pessoa pessoa) { this.pessoa = pessoa; }
	
	
}
