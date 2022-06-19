package udb.m3.clinica.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import udb.m3.clinica.modelo.GenericResponse;
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
	

	@PutMapping
	public ResponseEntity<GenericResponse<Medico>> editarMedico(@RequestBody Medico medico) {
		Optional<Medico> med= Optional.ofNullable(this.servicioMedico.leerPorId(medico.getIdMedico()));
		GenericResponse<Medico> resp;
		if(med.isPresent())
		{
			resp = new GenericResponse<Medico>(1,"medico guardado con exito", guardarMedico(medico));
			return new ResponseEntity<GenericResponse<Medico>>(resp,HttpStatus.OK);
		}			
		else {
			resp = new GenericResponse<Medico>(0,"Error-No pudo encontrarse medico",new Medico());
			return new ResponseEntity<GenericResponse<Medico>>(resp,HttpStatus.NOT_FOUND);
		}
			
	}
	
	@DeleteMapping("/{id}")
	@ResponseBody
	public ResponseEntity<GenericResponse<Medico>> eliminarMedico(@PathVariable("id") Integer id){
		Medico opMed = this.servicioMedico.leerPorId(id);		
		GenericResponse<Medico> rs=new GenericResponse<Medico>();
		rs.setResponse(opMed);
		if(opMed!= null)
		{
			if(this.servicioMedico.eliminar(opMed))
			{
				rs.setCode(1);
				rs.setMessage("Exito - Medico eliminado");
				return new ResponseEntity<GenericResponse<Medico>>(rs,HttpStatus.OK);
			}
				
			else {
				rs.setCode(0);
				rs.setMessage("Error - No fue posible eliminar al medico");
				return new ResponseEntity<GenericResponse<Medico>>(rs,HttpStatus.INTERNAL_SERVER_ERROR);
			}
				
		}else {
			rs.setCode(0);
			rs.setMessage("Error - No pudo encontrarse el medico a eliminar");
			return new ResponseEntity<GenericResponse<Medico>>(rs,HttpStatus.NOT_FOUND);
		}
	}
	
	
}
