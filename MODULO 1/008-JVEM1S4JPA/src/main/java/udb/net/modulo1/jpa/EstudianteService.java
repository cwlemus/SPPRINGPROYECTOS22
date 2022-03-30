package udb.net.modulo1.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EstudianteService {
	@Autowired
	EstudianteRepository repositorio;

	@Transactional(propagation = Propagation.REQUIRED,readOnly = true)
	public List<Estudiante> buscarTodos() {
		return repositorio.buscarTodos();
	}

	public void borrar(Estudiante estudiante) {
		repositorio.borrar(estudiante);
	}

	@Transactional
	public void insertar(Estudiante e) {
		repositorio.insertar(e);
	}

	public void actualizar(Estudiante estudiante) {
		repositorio.actualizar(estudiante);
	}
	
	
}
