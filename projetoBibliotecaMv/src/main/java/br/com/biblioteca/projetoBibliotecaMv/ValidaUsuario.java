package br.com.biblioteca.projetoBibliotecaMv;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValidaUsuario {

	//Map<String, Usuario> dataUsuarios = new HashMap<String, Usuario>();
	
	/*
	@GetMapping("/Usuario")
	public Usuario validaUsuario() {
	
		return "ok";
	}*/
	
	@PostMapping("/Usuario")
	public String recebeUsuario(@RequestBody Usuario a) {
		System.out.println("User "+a.getNome()+ " " + a.getCpf()+ " " + a.getTel() + " " + a.getMatricula());
		return "Produdo recebido";
	}
}
