package br.com.biblioteca.projetoBibliotecaMv.models;

public class Compra {
	
	
	String dataCompra;
	Usuario usuario;
	Exemplar exemplar;


	public Compra(Usuario usuario, Exemplar exemplar, String dataCompra) {
		super();
		this.dataCompra = dataCompra;
		this.usuario = usuario;
		this.exemplar = exemplar;
		this.Comprar();
	}


	public void Comprar() {
		if (this.exemplar.getQtdd() > 0) {
			this.exemplar.settQtdd(this.exemplar.getQtdd() - 1);
		}
	}
}
