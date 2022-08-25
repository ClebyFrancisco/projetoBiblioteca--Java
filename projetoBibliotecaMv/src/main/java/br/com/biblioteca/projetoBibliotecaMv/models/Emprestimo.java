package br.com.biblioteca.projetoBibliotecaMv.models;

public class Emprestimo {
	
	String dataEmprestimo;
	String dataPrevDevolucao;
	String dataEntregaReal;
	boolean situacao;
	Usuario usuario;
	Exemplar exemplar;

	public Emprestimo(Usuario usuario, Exemplar exemplar, String dataEmprestimo, String dataPrevDevolucao) {
		super();
		System.out.println(exemplar.pegarEmprestado());
		this.dataEmprestimo = dataEmprestimo;
		this.dataPrevDevolucao = dataPrevDevolucao;
		this.usuario = usuario;
		this.exemplar = exemplar;
	}

	public void Devolver() {
		exemplar.Devolver();
		System.out.println("Devolvido com sucesso!");
	}

	@Override
	public String toString() {
		return "Emprestimo [dataEmprestimo=" + dataEmprestimo + ", dataPrevDevolucao=" + dataPrevDevolucao
				+ ", dataEntregaReal=" + dataEntregaReal + ", situacao=" + situacao + ", usuario=" + usuario
				+ ", exemplar=" + exemplar + "]";
	}
}
