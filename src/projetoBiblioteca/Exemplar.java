package projetoBiblioteca;

import java.util.ArrayList;

public class Exemplar extends Livro {
	
	private int qtdd;
	private int cod;
	private boolean cativa;
	private boolean emprestado;
	
	ArrayList<Exemplar> list = new ArrayList<Exemplar>();
	
	

public Exemplar(Autor autor, String titulo, String ano, int edicao, String editora, String isbn, int qtdd, int cod,
		boolean cativa, boolean emprestado) {
		super(autor, titulo, ano, edicao, editora, isbn);
		this.qtdd = qtdd;
		this.cod = cod;
		this.cativa = cativa;
		this.emprestado = emprestado;
		//this.list.add(new Exemplar(autor,titulo, ano, edicao, editora, isbn, qtdd, cod, cativa, emprestado) );
		
		
	}


public String pegarEmprestado() {
	if(qtdd > 0) {
		qtdd -= 1;
		return "Emprestimo Realizado com sucesso!";
		
	}
	return "Emprestimo Indisponivel";
	
}

	
	public void Devolver(){
		this.qtdd +=1;
	}
	public int getCod() {
		return cod;
	}
	public int getQtdd() {
		return qtdd;
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
		return "Exemplar [qtdd=" + qtdd + ", cod=" + cod + ", cativa=" + cativa + ", emprestado=" + emprestado
				+ ", list=" + list + "]";
	}
	
	

	
	
	
	
	


	
}


