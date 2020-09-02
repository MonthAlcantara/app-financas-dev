package br.com.onzedevs.finansdev.domain.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "login")
public class Login {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String login; 
	private String senha;
	private String email;
	
//	Constructor
	public Login() {}
	
//	Getts and Setts
	private Long getId() { return id; }

	private String getLogin() { return login; }
	private void setLogin(String login) { this.login = login; }

	private String getSenha() { return senha; }
	private void setSenha(String senha) { this.senha = senha; }

	private String getEmail() { return email; }
	private void setEmail(String email) { this.email = email; }
	
}
