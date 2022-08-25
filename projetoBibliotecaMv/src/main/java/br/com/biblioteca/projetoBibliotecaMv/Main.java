package br.com.biblioteca.projetoBibliotecaMv;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import br.com.biblioteca.projetoBibliotecaMv.models.Autor;
import br.com.biblioteca.projetoBibliotecaMv.models.Compra;
import br.com.biblioteca.projetoBibliotecaMv.models.Emprestimo;
import br.com.biblioteca.projetoBibliotecaMv.models.Exemplar;
import br.com.biblioteca.projetoBibliotecaMv.models.Usuario;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// criando usuarios
		Usuario.dataUsuarios.put("111", new Usuario("Fulano", "111", "125487525", "17187"));
		Usuario.dataUsuarios.put("222", new Usuario("Beltrano", "222", "125491879", "17125287"));
		
		// criando autores
		Autor.dataAutores.put("Ciclano", new Autor("Ciclano"));
		Autor.dataAutores.put("Beltrano", new Autor("Beltrano"));
		Autor.dataAutores.put("Deltrano", new Autor("Deltrano"));
		Autor.dataAutores.put("Elano", new Autor("Elano"));
		Autor.dataAutores.put("Fulano", new Autor("Fulano"));
		
		// criando exemplar
		Exemplar.dataExemplares.put("livro1", new Exemplar(Autor.dataAutores.get("Ciclano"), "livro1", "2018", 4, "edit", "54719", 1, 142));
		Exemplar.dataExemplares.put("livro2", new Exemplar(Autor.dataAutores.get("Beltrano"), "livro2", "2018", 4, "edit", "54719", 1, 172));
		Exemplar.dataExemplares.put("livro3", new Exemplar(Autor.dataAutores.get("Deltrano"), "livro3", "2018", 4, "edit", "54719", 1, 187));
		Exemplar.dataExemplares.put("livro4", new Exemplar(Autor.dataAutores.get("Elano"), "livro4", "2018", 4, "edit", "54719", 2, 17872));
		Exemplar.dataExemplares.put("livro5", new Exemplar(Autor.dataAutores.get("Fulano"), "livro5", "2018", 4, "edit", "54719", 1, 1782));
			
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

			Usuario.dataUsuarios.put(cpf, new Usuario(nome, cpf, telefone, matricula));
			System.out.println(Usuario.dataUsuarios.get(cpf).toString());
			System.out.println("Usuario cadastrado.");
		
		// PEGAR LIVRO EMPRESTADO
		} else if (resposta == 2) {
			System.out.println("Informe o cpf do usuario: ");
			String cpf = input.next();

			System.out.println("Informe o nome do exemplar que deseja PEGAR EMPRESTADO: ");
			String exemplar = input.next();
			if (Exemplar.dataExemplares.get(exemplar).getQtdd() > 0) {
				Emprestimo emp = new Emprestimo(Usuario.dataUsuarios.get(cpf), Exemplar.dataExemplares.get(exemplar), "06/08/20222", "21/08/2022");
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
			if (Exemplar.dataExemplares.get(exemplar).getQtdd() > 0) {
				Compra comp = new Compra(Usuario.dataUsuarios.get(cpf), Exemplar.dataExemplares.get(exemplar), "21/08/2022");
				System.out.println(comp.toString());
			} else {
				System.out.println("Exemplar indisponivel!");
			}
		}
			
		} while (resposta != 4); // SAIR
		
	
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

}
