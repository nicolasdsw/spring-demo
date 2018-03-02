package com.example.demo;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UsuarioService {

	private final UsuarioRepository usuarioRepository;
	
	public Iterable<Usuario> lista() {
		return usuarioRepository.findAll();
	}
	
	public Usuario busca(Long id) {
		return usuarioRepository.getOne(id);
	}

	public Usuario salva(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	 
	public void apaga(Long id) {
		usuarioRepository.deleteById(id);
	}
}
