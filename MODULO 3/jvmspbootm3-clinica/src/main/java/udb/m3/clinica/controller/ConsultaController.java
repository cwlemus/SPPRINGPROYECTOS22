package udb.m3.clinica.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import udb.m3.clinica.modelo.Consulta;
import udb.m3.clinica.modelo.GenericResponse;
import udb.m3.clinica.servicio.IConsultaService;

@RestController
@RequestMapping("/consulta")
public class ConsultaController {

	private final IConsultaService consultaService;
	
	@Autowired
	public ConsultaController( IConsultaService consultaService) {
		// TODO Auto-generated constructor stub
		this.consultaService=consultaService;
	}
	
	@PostMapping
	public ResponseEntity<GenericResponse<Consulta>> guardarConsulta(@RequestBody Consulta consulta){
		HttpStatus http = HttpStatus.INTERNAL_SERVER_ERROR;
		GenericResponse<Consulta> resp = new GenericResponse<Consulta>(0,"Fallo - No puedo almacenarse consulta",consulta);
		
		Optional<Consulta> opt=Optional.of(consulta);
		if(opt.isPresent()) {
			if(consulta.getDetalleConsulta().size()>0) {
				//consulta.getDetalleConsulta().stream().peek(d->d.setConsulta(consulta)).collect(Collectors.toList());
				try {
					consultaService.registrar(consulta);
					resp.setCode(1);
					resp.setMessage("Exito - Consulta almacenada correctamente");
					http=HttpStatus.OK;					
				} catch (Exception e) {
					// TODO: handle exception					
				}
				
			}
		}
		return new ResponseEntity<GenericResponse<Consulta>>(resp,http);
		
	}
	
}
