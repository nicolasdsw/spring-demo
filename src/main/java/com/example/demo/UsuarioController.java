package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class UsuarioController {

	private final UsuarioService usuarioService;
	
	@GetMapping(value="/")
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView("list");
		mav.addObject("usuarios", usuarioService.findAll());
		return mav;
	}
}
