package projetoBiblioteca;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

//		ArrayList<Usuario> listUsuarios = new ArrayList<Usuario>();
//		ArrayList<Exemplar> listExemplares = new ArrayList<Exemplar>();
//		ArrayList<Autor> listAutores = new ArrayList<Autor>();
		//ArrayList<Emprestimo> listEmprestimo = new ArrayList<Emprestimo>();
		
		
		Map<String, Usuario> dataUsuarios = new HashMap<String, Usuario>();
		Map<String, Exemplar> dataExemplares = new HashMap<String, Exemplar>();
		Map<String, Autor> dataAutores = new HashMap<String, Autor>();
		
		// criando usuarios
		dataUsuarios.put("111", new Usuario("Fulano", "111", "125487525", "17187"));
		dataUsuarios.put("222", new Usuario("Beltrano", "222", "125491879", "17125287"));
		
		// criando autores
		dataAutores.put("Ciclano", new Autor("Ciclano"));
		dataAutores.put("Beltrano", new Autor("Beltrano"));
		dataAutores.put("Deltrano", new Autor("Deltrano"));
		dataAutores.put("Elano", new Autor("Elano"));
		dataAutores.put("Fulano", new Autor("Fulano"));
		
		// criando exemplar
		dataExemplares.put("livro1", new Exemplar(dataAutores.get("Ciclano"), "livro1", "2018", 4, "edit", "54719", 1, 142));
		dataExemplares.put("livro2", new Exemplar(dataAutores.get("Beltrano"), "livro2", "2018", 4, "edit", "54719", 1, 172));
		dataExemplares.put("livro3", new Exemplar(dataAutores.get("Deltrano"), "livro3", "2018", 4, "edit", "54719", 1, 187));
		dataExemplares.put("livro4", new Exemplar(dataAutores.get("Elano"), "livro4", "2018", 4, "edit", "54719", 2, 17872));
		dataExemplares.put("livro5", new Exemplar(dataAutores.get("Fulano"), "livro5", "2018", 4, "edit", "54719", 1, 1782));
			
		int resposta;
		
		do {
		System.out.println("1 - Cadastrar usuario");
		System.out.println("2 - Pegar livro emprestado");
		System.out.println("3 - Comprar");
		System.out.println("4 - Sair");
		
		resposta = input.nextInt();
		
		// CADASTRAR USUARIO
		if (resposta == 1) {
			System.out.println("Informe seu nome: ");
			String nome = input.next();
			
			System.out.println("Informe seu CPF: ");
			String cpf = input.next();
			
			System.out.println("Informe seu telefone: ");
			String telefone = input.next();

			System.out.println("Informe sua matricula: ");
			String matricula = input.next();

			dataUsuarios.put(cpf, new Usuario(nome, cpf, telefone, matricula));
			System.out.println(dataUsuarios.get(cpf).toString());
			System.out.println("Usuario cadastrado.");
		
		// PEGAR LIVRO EMPRESTADO
		} else if (resposta == 2) {
			System.out.println("Informe o cpf do usuario: ");
			String cpf = input.next();

			System.out.println("Informe o nome do exemplar que deseja PEGAR EMPRESTADO: ");
			String exemplar = input.next();
			if (dataExemplares.get(exemplar).getQtdd() > 0) {
				Emprestimo emp = new Emprestimo(dataUsuarios.get(cpf), dataExemplares.get(exemplar), "06/08/20222", "21/08/2022");
				System.out.println(emp.toString());
			} else { 
				System.out.println("Exemplar indisponivel!");
			}

		// COMPRAR LIVRO
		} else if (resposta == 3) { 
			System.out.println("Informe o cpf do usuario: ");
			String cpf = input.next();

			System.out.println("Informe o nome do exemplar que deseja COMPRAR: ");
			String exemplar = input.next();
			if (dataExemplares.get(exemplar).getQtdd() > 0) {
				Compra comp = new Compra(dataUsuarios.get(cpf), dataExemplares.get(exemplar), "21/08/2022");
				System.out.println(comp.toString());
			} else {
				System.out.println("Exemplar indisponivel!");
			}
		}
			
		} while (resposta != 4); // SAIR
		
		
//		// criando usuario
//		listUsuarios.add(new Usuario("Fulano", 15455489, "125487525", "17187"));
//		listUsuarios.add(new Usuario("Beltrano", 15457729, "125491879", "17125287"));
//
//		// criando Autor
//
//		listAutores.add(new Autor("Ciclano"));
//		listAutores.add(new Autor("Beltrano"));
//		listAutores.add(new Autor("Deltrano"));
//		listAutores.add(new Autor("Elano"));
//		listAutores.add(new Autor("Fulano"));
//
//		// criando exemplar
//		listExemplares.add(new Exemplar(listAutores.get(0), "A Cabana", "2018", 4, "edit", "54719", 1, 142, true, true));
//		listExemplares.add(new Exemplar(listAutores.get(2), "livro 2", "2018", 4, "edit", "54719", 1, 172, true, true));
//		listExemplares.add(new Exemplar(listAutores.get(3), "livro 3", "2018", 4, "edit", "54719", 1, 187, true, true));
//		listExemplares.add(new Exemplar(listAutores.get(4), "livro 4", "2018", 4, "edit", "54719", 2, 17872, true, true));
//		listExemplares.add(new Exemplar(listAutores.get(1), "boas praticas", "2018", 4, "edit", "54719", 1, 1782, true, true));
//
//		System.out.println("Implementado testes Unitarios");
//
//		// System.out.println(pesquisarExemplar("livro 10", listExamplares));
//
//		// verificando exemplar antes do empréstimo
//		System.out.println(listExemplares.get(1));
//
//		// testando
//		Emprestimo emp1 = new Emprestimo(listUsuarios.get(0), listExemplares.get(1), "06/08/20222", "21/08/2022");
//		Emprestimo emp2 = new Emprestimo(listUsuarios.get(1), listExemplares.get(1), "06/08/20222", "21/08/2022");
//		// Emprestimo emp3 = new Emprestimo(listUsuarios.get(1), listExemplares.get(6),
//		// "06/08/20222", "21/08/2022");
//
//		// verificando exemplar depois do empréstimo
//		System.out.println(listExemplares.get(1));
//
//		// Devolvendo
//		emp1.Devolver();
//
//		// verificando exemplar depois da devolução
//		System.out.println(listExemplares.get(1));
//
//		input.close();
//		
//		//Casos de teste
//		System.out.println(pesquisarExemplar("Ciclano", listExemplares));
//		System.out.println(pesquisarExemplar("Fulano", listExemplares));
//		System.out.println(pesquisarExemplar("Lauro", listExemplares));
//		System.out.println(pesquisarExemplar("A Cabana", listExemplares));
//		

	};

	public static String pesquisarExemplar(String text, ArrayList<Exemplar> list) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getAutor().getNome() == text || list.get(i).getTitulo() == text) {
				return list.get(i).getTitulo() + " - " + list.get(i).getAutor().getNome();
			}

		}
		return "Este Exemplar não está disponivel!";

	}

	public static Usuario verificarUsuario(String text, ArrayList<Usuario> list) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getNome() == text) {
				return list.get(i);

			}

		}
		return null;

	}

	public static Exemplar verificarExemplar(String text, ArrayList<Exemplar> list) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTitulo() == text) {
				return list.get(i);
			}
		}
		return null;

	}
};