package br.com.onzedevs.finansdev.domain.enums;

public enum Sexo {
	MASCULINO("Masculino"), FEMININO("Feminino");
	
	private String descricao;
	
	private Sexo(String sexo) { this.descricao = sexo; }
}
