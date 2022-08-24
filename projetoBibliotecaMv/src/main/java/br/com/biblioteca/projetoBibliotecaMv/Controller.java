package br.com.biblioteca.projetoBibliotecaMv;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	
	
//	@GetMapping("/Usuarios")
//	public Usuario getAllUsuarios() {
//		Usuario a = new Usuario("asdv", "null", "null", "null");
//		return a;
//	}

	@PostMapping("/usuario/verificar")
	public String verificarUsuario(@RequestBody Usuario a) {
		if (Usuario.dataUsuarios.containsKey(a.getCpf())) {
			 return "Usuario ja cadastrado!";
		} else {
			return "Usuario nao cadastrado!";
		}
		//System.out.println("User "+a.getNome()+ " " + a.getCpf()+ " " + a.getTel() + " " + a.getMatricula());
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
	
	
	
	
	
	
}
