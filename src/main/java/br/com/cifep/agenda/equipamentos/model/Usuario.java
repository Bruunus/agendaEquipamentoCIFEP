package br.com.cifep.agenda.equipamentos.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

//@Entity
public class Usuario {
	
	public Usuario() {}

//	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long matricula;
	private String nome;
	private String senha;
	private String perfil;
	private Boolean perfilAtivo;
	
	@OneToOne
	private Setor setorCadastrado;  // chave estrangeira

	
	
	
	public String getNome() {
		return nome;
	}

	public String getSenha() {
		return senha;
	}

	public String getPerfil() {
		return perfil;
	}

	public Boolean getPerfilAtivo() {
		return perfilAtivo;
	}

	public Setor getSetorCadastrado() {
		return setorCadastrado;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

	public void setPerfilAtivo(Boolean perfilAtivo) {
		this.perfilAtivo = perfilAtivo;
	}

	public void setSetorCadastrado(Setor setorCadastrado) {
		this.setorCadastrado = setorCadastrado;
	}
	
	
	
	
}
