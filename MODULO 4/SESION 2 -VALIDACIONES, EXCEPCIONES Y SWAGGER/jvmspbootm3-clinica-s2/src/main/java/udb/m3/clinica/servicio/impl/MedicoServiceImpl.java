package udb.m3.clinica.servicio.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import udb.m3.clinica.modelo.Medico;
import udb.m3.clinica.repositorio.IMedicoRepo;
import udb.m3.clinica.servicio.IMedicoService;

@Service
public class MedicoServiceImpl implements IMedicoService {

	private final IMedicoRepo servicioMedico;
	
	@Autowired
	public MedicoServiceImpl(IMedicoRepo servicioMedico) {
		// TODO Auto-generated constructor stub
		this.servicioMedico = servicioMedico;
	}
	
	@Override
	public Medico registrar(Medico obj) {
		// TODO Auto-generated method stub
		return this.servicioMedico.save(obj);
	}

	@Override
	public Medico modificar(Medico obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Medico> listar() {
		List<Medico> listMedicos= this.servicioMedico.findAll();
		return listMedicos;
	}

	@Override
	public Medico leerPorId(Integer id) {
		// TODO Auto-generated method stub
		Optional<Medico> opMed= this.servicioMedico.findById(id);
		if(opMed.isPresent()) {
			return opMed.get();
		}else {
			return null;
		}
		
	}

	@Override
	public boolean eliminar(Medico obj) {
		// TODO Auto-generated method stub
		try {			
			this.servicioMedico.delete(obj);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		
		
	}

}
