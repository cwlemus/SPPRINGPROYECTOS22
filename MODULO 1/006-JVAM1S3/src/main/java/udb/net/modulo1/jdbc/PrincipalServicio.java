package udb.net.modulo1.jdbc;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PrincipalServicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext cnt= new AnnotationConfigApplicationContext(ConfiguradorSpring.class);
		EstudianteService er = cnt.getBean(EstudianteService.class);
		Estudiante es1 = new Estudiante(12,"Marina","Morales",9.80,56.90);
		Estudiante es2 = new Estudiante(13,"Marina","Morales",9.80,56.90);
		er.insertarVarios(es1, es2);
	}
}
