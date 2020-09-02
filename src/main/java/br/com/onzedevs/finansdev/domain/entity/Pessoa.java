package br.com.onzedevs.finansdev.domain.entity;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;

@Entity
@Table(name = "pessoa")
public class Pessoa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	@Column(name = "idade", length = 3)
	private int idade;
	
	@CreatedDate
	private LocalDateTime cadastradoEm;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = Pessoa.class)
	private Login login;
	
//	Constructor
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
