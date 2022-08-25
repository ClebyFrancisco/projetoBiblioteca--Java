package br.com.biblioteca.projetoBibliotecaMv.models;

import java.util.HashMap;
import java.util.Map;

public class Usuario {
	
	public static Map<String, Usuario> dataUsuarios = new HashMap<String, Usuario>();
	
	private String nome;
	private String cpf;
	private String tel;
	private String matricula;

	
	public Usuario(String nome, String cpf, String tel, String matricula) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.tel = tel;
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String toString() {
		return "Usuario [nome=" + nome + ", cpf=" + cpf + ", tel=" + tel + ", matricula=" + matricula + "]";
	}
}
