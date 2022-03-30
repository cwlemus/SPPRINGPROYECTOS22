package udb.net.mod1.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EstudianteServicio2 {
@Autowired
EstudianteServicio servicio1;

@Transactional
public List<Estudiante> buscarTodos() {
	return servicio1.buscarTodos();
}

@Transactional
public void guardar(Estudiante e1,Estudiante e2) {
	//insertarSercicio1 es required
	
	insertarServicio1(e1);
	servicio1.insertar(e2);

}

@Transactional
public void insertarServicio1(Estudiante e) {
	servicio1.insertar(e);

}




}