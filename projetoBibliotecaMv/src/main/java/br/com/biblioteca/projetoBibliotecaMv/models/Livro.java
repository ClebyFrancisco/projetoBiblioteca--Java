package br.com.biblioteca.projetoBibliotecaMv.models;

public class Livro {
	private String titulo;
	private Autor autor;

	private String ano;
	private int edicao;
	private String editora;
	private String isbn;

	public Livro(Autor autor, String titulo, String ano, int edicao, String editora, String isbn) {
		super();
		this.autor = autor;
		this.titulo = titulo;
		this.ano = ano;
		this.edicao = edicao;
		this.editora = editora;
		this.isbn = isbn;

	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public int getEdicao() {
		return edicao;
	}

	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

}
