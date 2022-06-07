package udb.m3.clinica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import udb.m3.clinica.modelo.Medico;
import udb.m3.clinica.servicio.IMedicoService;

@RestController
@RequestMapping("/medico")
public class MedicoController {
	
	private final IMedicoService servicioMedico;
	
	@Autowired
	public MedicoController(IMedicoService servicioMedico) {
		// TODO Auto-generated constructor stub
		this.servicioMedico = servicioMedico;
	}
	
	@GetMapping
	public ResponseEntity<List<Medico>> mostrarMedicos(){
		List<Medico> medicos = this.servicioMedico.listar();		
		return new ResponseEntity<List<Medico>>(medicos,HttpStatus.OK);
	}
	
	@PostMapping
	public Medico guardarMedico(@RequestBody Medico medico) {
		return this.servicioMedico.registrar(medico);
	}
	
}
