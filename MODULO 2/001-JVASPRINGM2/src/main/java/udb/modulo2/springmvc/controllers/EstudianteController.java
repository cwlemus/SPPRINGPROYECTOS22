package udb.modulo2.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EstudianteController {
	
	@RequestMapping("/")
	public String menuApp() {
		return "Menu.html";
	}
}
