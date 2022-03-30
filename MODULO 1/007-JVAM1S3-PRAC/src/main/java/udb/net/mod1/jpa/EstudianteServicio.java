package udb.net.mod1.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EstudianteServicio {
@Autowired
EstudianteRepository repositorio;

@Transactional
public List<Estudiante> buscarTodos() {
	return repositorio.buscarTodos();
}

@Transactional
public void borrar(Estudiante estudiante) {
	repositorio.borrar(estudiante);
}

@Transactional(propagation = Propagation.NEVER)
public void insertar(Estudiante e) {
	repositorio.insertar(e);
}

@Transactional
public void actualizar(Estudiante estudiante) {
	repositorio.actualizar(estudiante);
}
@Transactional(propagation = Propagation.REQUIRES_NEW)
public void insertarVarios(Estudiante estudiante1,Estudiante estudiante2) {
	insertar(estudiante1);
	insertar(estudiante2);
}
}