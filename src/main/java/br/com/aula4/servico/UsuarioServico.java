package br.com.aula4.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.aula4.entity.Usuario;
import br.com.aula4.repositorio.UsuarioRepositorio;

@Service
public class UsuarioServico {

	@Autowired
	private UsuarioRepositorio repositorio;

	public void salvarUsuario(Usuario usuario) {
		repositorio.save(usuario);

	}

}
