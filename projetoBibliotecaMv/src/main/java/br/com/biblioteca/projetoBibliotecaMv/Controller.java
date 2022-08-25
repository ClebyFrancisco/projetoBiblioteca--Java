package br.com.biblioteca.projetoBibliotecaMv;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class Controller {

	// USUARIOS 
	@GetMapping("/usuarios")
	@ResponseBody
	public List<Usuario> getUsuarios() {
		List<Usuario> list = new ArrayList<Usuario>(Usuario.dataUsuarios.values());
	    return list;
	}
	
	@PostMapping("/usuario/verificar")
	public String verificarUsuario(@RequestBody Usuario a) {
		if (Usuario.dataUsuarios.containsKey(a.getCpf())) {
			 return "Usuario ja cadastrado!";
		} else {
			return "Usuario nao cadastrado!";
		}
	}
	
	@PostMapping("/usuario/cadastrar")
	public String cadastrarUsuario(@RequestBody Usuario a) {
		if (Usuario.dataUsuarios.containsKey(a.getCpf())) {
			 return "Usuario ja cadastrado!";
		} else {
			Usuario.dataUsuarios.put(a.getCpf(), a);
			 return "Usuario cadastrado com sucesso!";
		}
	}
	
	
	// AUTORES
	@GetMapping("/autores")
	@ResponseBody
	public List<Autor> getAutores() {
		List<Autor> list = new ArrayList<Autor>(Autor.dataAutores.values());
	    return list;
	}
	
	@PostMapping("/autor/verificar")
	public String verificarAutor(@RequestBody Autor a) {
		if (Autor.dataAutores.containsKey(a.getNome())) {
			 return "Autor ja cadastrado!";
		} else {
			return "Autor nao cadastrado!";
		}
	}
	
	@PostMapping("/autor/cadastrar")
	public String cadastrarAutor(@RequestBody Autor a) {
		if (Autor.dataAutores.containsKey(a.getNome())) {
			 return "Autor ja cadastrado!";
		} else {
			Autor.dataAutores.put(a.getNome(), a);
			 return "Autor cadastrado com sucesso!";
		}
	}
	
	
	// EXEMPLARES
	@GetMapping("/exemplares")
	@ResponseBody
	public List<Exemplar> getExemplares() {
		List<Exemplar> list = new ArrayList<Exemplar>(Exemplar.dataExemplares.values());
	    return list;
	}
	
	@PostMapping("/exemplar/verificar")
	public String verificarExemplar(@RequestBody Exemplar a) {
		if (Exemplar.dataExemplares.containsKey(a.getTitulo())) {
			 return "Exemplar ja cadastrado!";
		} else {
			return "Exemplar nao cadastrado!";
		}
	}
	
	@PostMapping("/exemplar/cadastrar")
	public String cadastrarLivro(@RequestBody Exemplar a) {
		if (Exemplar.dataExemplares.containsKey(a.getTitulo())) {
			 return "Exemplar ja cadastrado!";
		} else {
			Exemplar.dataExemplares.put(a.getTitulo(), a);
			 return "Exemplar cadastrado com sucesso!";
		}
	}
	
	
}
