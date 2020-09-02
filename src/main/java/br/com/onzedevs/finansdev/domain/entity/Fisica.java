package br.com.onzedevs.finansdev.domain.entity;

import br.com.onzedevs.finansdev.domain.enums.Sexo;

public class Fisica {
	
	private Long id;
	private String cpf;
	private Sexo sexo;
	private String rg;
	private Pessoa pessoa;
	
	public Fisica() {}

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
