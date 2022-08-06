package projetoBiblioteca;

public class Emprestimo{

		String dataEmprestimo;
		String dataPrevDevolucao;
		String dataEntregaReal;
		boolean situacao;
		
		Usuario usuario;
		Exemplar exemplar;

		
		
		
		
		public Emprestimo(Usuario usuario, Exemplar exemplar, String dataEmprestimo, String dataPrevDevolucao) {
			super();
			this.dataEmprestimo = dataEmprestimo;
			this.dataPrevDevolucao = dataPrevDevolucao;
			this.usuario = usuario;
			this.exemplar = exemplar;
			
			System.out.println(exemplar.pegarEmprestado());
			
			
			
			
		}
		public void Devolver() {
			exemplar.Devolver();
			System.out.println("Devolvido com sucesso!");

			
		}






}
