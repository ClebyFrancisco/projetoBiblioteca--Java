package br.com.biblioteca.projetoBibliotecaMv.models;

import java.time.LocalDate;

public class Emprestimo {
	
	LocalDate dataEmprestimo;
	LocalDate dataPrevDevolucao;
	LocalDate dataEntregaReal;
	boolean situacao;
	Usuario usuario;
	Exemplar exemplar;
	double taxa;

	public Emprestimo(Usuario usuario, Exemplar exemplar) {
		super();
		System.out.println(exemplar.pegarEmprestado());
		this.dataEmprestimo = LocalDate.now();
		this.dataPrevDevolucao = this.dataEmprestimo.plusDays(7);
		this.usuario = usuario;
		this.exemplar = exemplar;
		this.taxa = exemplar.getValor() * 0.25;
	}

	public void Devolver() {
		exemplar.Devolver();
		this.dataEntregaReal = LocalDate.now();
		System.out.println("Devolvido com sucesso!");
	}

	@Override
	public String toString() {
		return "Emprestimo [dataEmprestimo=" + dataEmprestimo + ", dataPrevDevolucao=" + dataPrevDevolucao
				+ ", dataEntregaReal=" + dataEntregaReal + ", situacao=" + situacao + ", usuario=" + usuario
				+ ", exemplar=" + exemplar + ", taxa=" + taxa + "]";
	}


	
}
