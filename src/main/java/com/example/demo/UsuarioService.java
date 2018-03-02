package com.example.demo;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UsuarioService {

	private final UsuarioRepository usuarioRepository;
	
//	public UsuarioService(UsuarioRepository usuarioRepository) {
//		super();
//		this.usuarioRepository = usuarioRepository;
//	}

	public Iterable<Usuario> findAll() {
		return usuarioRepository.findAll();
	}
}
