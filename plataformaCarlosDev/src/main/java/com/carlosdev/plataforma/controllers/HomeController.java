package com.carlosdev.plataforma.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public ModelAndView viewHome() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home/index");
		
		return mv;
	}

}
