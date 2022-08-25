package br.com.biblioteca.projetoBibliotecaMv.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Exemplar extends Livro {
	
	public static Map<String, Exemplar> dataExemplares = new HashMap<String, Exemplar>();
	
	private int qtdd;
	private int cod;
	private boolean cativa;
	private boolean emprestado;

	public Exemplar(Autor autor, String titulo, String ano, int edicao, String editora, String isbn, int qtdd, int cod) {
		super(autor, titulo, ano, edicao, editora, isbn);
		this.qtdd = qtdd;
		this.cod = cod;
		this.cativa = false;
		this.emprestado = false;
	}

	public String pegarEmprestado() {
		if (qtdd > 0) {
			qtdd -= 1;
			this.emprestado = true;
			return "Emprestimo Realizado com sucesso!";

		}
		return "Emprestimo Indisponivel";

	}

	public void Devolver() {
		this.qtdd += 1;
		this.emprestado = false;
	}

	public int getCod() {
		return cod;
	}

	public int getQtdd() {
		return qtdd;
	}
	
	public void settQtdd(int qtdd) {
		this.qtdd = qtdd;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public boolean isCativa() {
		return cativa;
	}

	public void setCativa(boolean cativa) {
		this.cativa = cativa;
	}

	public boolean isEmprestado() {
		return emprestado;
	}

	public void setEmprestado(boolean emprestado) {
		this.emprestado = emprestado;
	}

	@Override
	public String toString() {
		return "Exemplar [qtdd=" + qtdd + ", cod=" + cod + ", cativa=" + cativa + ", emprestado=" + emprestado + "]";
	}

}
