package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class UsuarioController {

	private final UsuarioService usuarioService;
	
	@GetMapping(value="/")
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView("list");
		mav.addObject("usuarios", usuarioService.lista());
		return mav;
	}

	@GetMapping(value="/delete/{id}")
	public String delete(@PathVariable Long id) {
		usuarioService.apaga(id);
		return "redirect:/";
	}

	@GetMapping(value="/new")
	public ModelAndView newObj() {
		ModelAndView mav = new ModelAndView("form");
		mav.addObject("usuario", new Usuario());
		return mav;
	}

	@GetMapping(value="/edit/{id}")
	public ModelAndView edit(@PathVariable Long id) {
		ModelAndView mav = new ModelAndView("form");
		mav.addObject("usuario", usuarioService.busca(id));
		return mav;
	}

	@PostMapping(value="/save")
	public String save(Usuario usuario) {
		usuario = usuarioService.salva(usuario);
		return "redirect:/";
	}
}
