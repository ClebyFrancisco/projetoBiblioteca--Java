package br.com.biblioteca.projetoBibliotecaMv.models;

import java.time.LocalDate;

public class Compra {
	
	
	LocalDate dataCompra;
	Usuario usuario;
	Exemplar exemplar;
	float valor;


	public Compra(Usuario usuario, Exemplar exemplar) {
		super();
		this.dataCompra = LocalDate.now();
		this.usuario = usuario;
		this.exemplar = exemplar;
	}

	@Override
	public String toString() {
		return "Compra [dataCompra=" + dataCompra + ", usuario=" + usuario + ", exemplar=" + exemplar + ", valor="
				+ valor + "]";
	}
	
}
