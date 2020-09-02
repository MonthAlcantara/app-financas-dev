package br.com.onzedevs.finansdev.domain.entity;

public class Login {
	
	private Long id;
	private String login; 
	private String senha;
	private String email;
	
	public Login() {}

	private Long getId() { return id; }

	private String getLogin() { return login; }
	private void setLogin(String login) { this.login = login; }

	private String getSenha() { return senha; }
	private void setSenha(String senha) { this.senha = senha; }

	private String getEmail() { return email; }
	private void setEmail(String email) { this.email = email; }
	
	
	
}
