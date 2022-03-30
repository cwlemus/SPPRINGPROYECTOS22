package udb.net.mod1.jpa;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class PrincipalJPA {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext contexto= new AnnotationConfigApplicationContext(ConfiguradorSpring.class);
		EstudianteServicio2 se2= contexto.getBean(EstudianteServicio2.class);
		EstudianteServicio se= contexto.getBean(EstudianteServicio.class);
		Estudiante es1 = new Estudiante(19,"Maria","Serrano",8.50,77.90);
		Estudiante es2 = new Estudiante(20,"Maria","Serrano",8.50,77.90);
		Estudiante es3 = new Estudiante(21,"Maria","Serrano",8.50,77.90);
		
		//se.insertar(es1); ->para probar mandatory
		se2.guardar(es2,es3);
	}
}
