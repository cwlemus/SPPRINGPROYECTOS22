package udb.modulo2.springmvc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import udb.modulo2.springmvc.entidades.Estudiante;
import udb.modulo2.springmvc.servicios.EstudianteService;

@Controller
public class EstudianteController {
	@Autowired
	EstudianteService servicio;
	
	@RequestMapping("/")
	public String menuApp() {
		return "/Menu";
	}
	
	@RequestMapping("/listaEstudiantes")
	public String listaEstudiantes(Model modelo){
		List<Estudiante> lstEst=servicio.buscarTodos();
		modelo.addAttribute("listaEstudiantes",lstEst);
		return "/listaEstudiantes";
	}
}
