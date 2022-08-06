package projetoBiblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class EmprestimoTeste {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		ArrayList<Usuario> listUsuarios = new ArrayList<Usuario>();
		ArrayList<Exemplar> listExemplares = new ArrayList<Exemplar>();
		ArrayList<Autor> listAutores = new ArrayList<Autor>();
		ArrayList<Emprestimo> listEmprestimo = new ArrayList<Emprestimo>();

		// criando usuario
		listUsuarios.add(new Usuario("Fulano", 15455489, "125487525", "17187"));
		listUsuarios.add(new Usuario("Beltrano", 15457729, "125491879", "17125287"));

		// criando Autor

		listAutores.add(new Autor("Ciclano"));
		listAutores.add(new Autor("Beltrano"));
		listAutores.add(new Autor("Deltrano"));
		listAutores.add(new Autor("Elano"));
		listAutores.add(new Autor("Fulano"));

		// criando exemplar
		listExemplares
				.add(new Exemplar(listAutores.get(0), "A Cabana", "2018", 4, "edit", "54719", 1, 142, true, true));
		listExemplares.add(new Exemplar(listAutores.get(2), "livro 2", "2018", 4, "edit", "54719", 1, 172, true, true));
		listExemplares.add(new Exemplar(listAutores.get(3), "livro 3", "2018", 4, "edit", "54719", 1, 187, true, true));
		listExemplares
				.add(new Exemplar(listAutores.get(4), "livro 4", "2018", 4, "edit", "54719", 2, 17872, true, true));
		listExemplares.add(
				new Exemplar(listAutores.get(1), "boas praticas", "2018", 4, "edit", "54719", 1, 1782, true, true));

		// System.out.println(pesquisarExemplar("Ciclano", listExamplares));
		/*System.out.println("Oque voçê Deseja fazer:");
		System.out.println("Digite 1 - Cadastrar Usuario!");
		System.out.println("Digite 2 - Consultar Autor/Livro!");
		System.out.println("Digite 3 - Realizar Emprestimo!");
		System.out.println("Digite 4 - Realizar Devolução!");
		System.out.println("Digite 0 - Para Encerrar!");*/

		//int valor = input.nextInt();

		/* switch (valor) {
		case 1:
			System.out.println("Digite o nome do usuario:");
			String nome = input.next();
			System.out.println("Digite o numero do cpf");
			int cpf = input.nextInt();
			System.out.println("Digite o telefone do usuario:");
			String telefone = input.next();
			System.out.println("Digite a matricula do usuario:");
			String matricula = input.next();

			listUsuarios.add(new Usuario(nome, cpf, telefone, matricula));

			System.out.println("Usuario Criado com sucesso!");
			break;

		case 2:
			System.out.println("Digite o nome do Autor ou do livro que você que consultar:");
			String textDigitado = input.next();
			System.out.println(pesquisarExemplar(textDigitado, listExemplares));
			break;

		case 3:
			System.out.println("Digite o nome do usuario:");
			String nomeUsuario = input.next();
			System.out.println("Digite o exemplar:");
			String exemplar = input.next();
			System.out.println("Digite a data de devolução");
			String dataDevolução = input.next();
			break;
			
			//boolean verificarUsuario;
			
			 if(verificarUsuario(nomeUsuario, listUsuarios) && verificarExemplar(exemplar, listExemplares )) {
				listEmprestimo.add(new Emprestimo(nomeUsuario, listExemplares.get(1),
					"656", "4797");
				
			}
			
			
			
			

		} */
		
		System.out.println("Implementado testes Unitarios");

		// System.out.println(pesquisarExemplar("livro 10", listExamplares));

		// verificando exemplar antes do empréstimo
		System.out.println(listExemplares.get(1));

		// testando
		Emprestimo emp1 = new Emprestimo(listUsuarios.get(0), listExemplares.get(1), "06/08/20222", "21/08/2022");
		Emprestimo emp2 = new Emprestimo(listUsuarios.get(1), listExemplares.get(1), "06/08/20222", "21/08/2022");
		//Emprestimo emp3 = new Emprestimo(listUsuarios.get(1), listExemplares.get(6), "06/08/20222", "21/08/2022");

		// verificando exemplar depois do empréstimo
		System.out.println(listExemplares.get(1));

		// Devolvendo
		 emp1.Devolver();

		// verificando exemplar depois da devolução
		 System.out.println(listExemplares.get(1));

		input.close();

	};

	public static String pesquisarExemplar(String text, ArrayList<Exemplar> list) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getAutor().getNome() == text || list.get(i).getTitulo() == text) {
				return list.get(i).getTitulo() + " - " + list.get(i).getAutor().getNome();
			}

		}
		return "Este Exemplar não está disponivel!";

	}
	public static boolean verificarUsuario(String text,ArrayList<Usuario> list) {
		for(int i = 0; i< list.size(); i++) {
			if(list.get(i).getNome() == text) {
				return true;
				
			}
			
		}
		return false;
		
		
	}
	public static boolean verificarExemplar(String text,ArrayList<Exemplar> list) {
		for(int i = 0; i< list.size(); i++) {
			if(list.get(i).getTitulo() == text) {
				return true;
				
			}
			
		}
		return false;
		
		
	}

};