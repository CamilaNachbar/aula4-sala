package br.com.aula4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.aula4.entity.Usuario;
import br.com.aula4.servico.UsuarioServico;

@RestController
public class HomeController {

	@Autowired
	private UsuarioServico servico;

	@PostMapping(value = "/add/usuario")
	public ResponseEntity<?> salvar(@RequestBody Usuario usuario) {
		try {
			servico.salvarUsuario(usuario);
			return new ResponseEntity<>(HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

		}

	}
}
