package udb.net.mod1.regacad.spring;

import java.text.SimpleDateFormat;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		ApplicationContext cont = new FileSystemXmlApplicationContext("src/main/resources/applicationContext.xml");
		Estudiante e1 = cont.getBean(EstudianteCep.class);
		Estudiante e2 = cont.getBean(EstudianteColP.class);
		RegistroAcad regAcad= cont.getBean(RegistroAcad.class);
		imprimir(e1);
		imprimir(e2);
		
		String fecha= new SimpleDateFormat("dd-MM-yyyy").format(regAcad.getFechaRegistro());
		
		System.out.println("Registro: "+regAcad.getIdRegistro());
		System.out.println("Fecha:" + fecha);
		System.out.println("Estudiante: "+regAcad.getEstudiante().getNombre()+" "+regAcad.getEstudiante().getApellido());
		
	}	
	public static void imprimir(Estudiante e) {
		System.out.println(String.format("Nombre: %s %s\nCum: %.2f\nCouta: %.2f", e.getNombre(),e.getApellido(),e.getCum(),(e.getCuotaMensual()-e.calcularMontoBeca())));
		System.out.println("**************************************************");
	}
}
