package br.com.biblioteca.projetoBibliotecaMv.models;

import java.util.HashMap;
import java.util.Map;

public class Autor {
	
	public static Map<String, Autor> dataAutores = new HashMap<String, Autor>();
	
	private String nome;

	public Autor(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
