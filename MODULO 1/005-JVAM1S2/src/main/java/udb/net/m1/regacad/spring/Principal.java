package udb.net.m1.regacad.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext cont = new AnnotationConfigApplicationContext(ConfiguradorSpring.class);
		Servicio servicio = cont.getBean(Servicio.class);
		cont.close();
		servicio.objEstudianteCep();
		servicio.objEstudianteColp();
		servicio.objEstudianteBecado();
	}	
}
