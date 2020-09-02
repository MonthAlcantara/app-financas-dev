package br.com.onzedevs.finansdev.domain.entity;

import java.time.LocalDateTime;

public class Pessoa {
	
	private Long id;
	private String nome;
	private int idade;
	private LocalDateTime cadastradoEm;
	
	
	public Pessoa() { }

//	Getts and Setts
	private Long getId() { return id; }

	private String getNome() { return nome; }
	private void setNome(String nome) { this.nome = nome; }


	private int getIdade() { return idade; }
	private void setIdade(int idade) { this.idade = idade; }

	private LocalDateTime getCadastradoEm() { return cadastradoEm; }
	private void setCadastradoEm(LocalDateTime cadastradoEm) { this.cadastradoEm = cadastradoEm; }
	
	
}
