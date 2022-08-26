package br.com.biblioteca.projetoBibliotecaMv.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import br.com.biblioteca.projetoBibliotecaMv.models.Autor;
import br.com.biblioteca.projetoBibliotecaMv.models.Exemplar;
import br.com.biblioteca.projetoBibliotecaMv.models.Usuario;

@RestController
public class Controller {

	// USUARIOS 
	@GetMapping(path = "/usuarios", produces="application/json")
	public ResponseEntity<List<Usuario>> getUsuarios() {
		List<Usuario> list = new ArrayList<Usuario>(Usuario.dataUsuarios.values());
		return ResponseEntity.ok(list);
	}
	
	@PostMapping(path = "/usuario/verificar", produces="application/json")
	public String verificarUsuario(@RequestBody Usuario a) {
		if (Usuario.dataUsuarios.containsKey(a.getCpf())) {
			 return "Usuario ja cadastrado!";
		} else {
			return "Usuario nao cadastrado!";
		}
	}
	
	@PostMapping(path = "/usuario/cadastrar", produces="application/json")
	public String cadastrarUsuario(@RequestBody Usuario a) {
		if (Usuario.dataUsuarios.containsKey(a.getCpf())) {
			 return "Usuario ja cadastrado!";
		} else {
			Usuario.dataUsuarios.put(a.getCpf(), a);
			 return "Usuario cadastrado com sucesso!";
		}
	}
	
	
	// AUTORES
	@GetMapping(path = "/autores", produces="application/json")
	@ResponseBody
	public ResponseEntity<List<Autor>> getAutores() {
		List<Autor> list = new ArrayList<Autor>(Autor.dataAutores.values());
	    return ResponseEntity.ok(list);
	}
	
	@PostMapping(path = "/autor/verificar", produces="application/json")
	public String verificarAutor(@RequestBody Autor a) {
		if (Autor.dataAutores.containsKey(a.getNome())) {
			 return "Autor ja cadastrado!";
		} else {
			return "Autor nao cadastrado!";
		}
	}
	
	@PostMapping(path = "/autor/cadastrar", produces="application/json")
	public String cadastrarAutor(@RequestBody Autor a) {
		if (Autor.dataAutores.containsKey(a.getNome())) {
			 return "Autor ja cadastrado!";
		} else {
			Autor.dataAutores.put(a.getNome(), a);
			 return "Autor cadastrado com sucesso!";
		}
	}
	
	// EXEMPLARES
	@GetMapping(path = "/exemplares", produces="application/json")
	public ResponseEntity<List<Exemplar>> getExemplares() {
		List<Exemplar> list = new ArrayList<Exemplar>(Exemplar.dataExemplares.values());
		return ResponseEntity.ok(list);
	}
	
	@PostMapping(path = "/exemplar/verificar", produces="application/json")
	public String verificarExemplar(@RequestBody Exemplar a) {
		if (Exemplar.dataExemplares.containsKey(a.getTitulo())) {
			 return "Exemplar ja cadastrado!";
		} else {
			return "Exemplar nao cadastrado!";
		}
	}
	
	@PostMapping(path = "/exemplar/cadastrar", produces="application/json")
	public String cadastrarLivro(@RequestBody Exemplar a) {
		if (Exemplar.dataExemplares.containsKey(a.getTitulo())) {
			 return "Exemplar ja cadastrado!";
		} else {
			Exemplar.dataExemplares.put(a.getTitulo(), a);
			 return "Exemplar cadastrado com sucesso!";
		}
	}
	
	
}
