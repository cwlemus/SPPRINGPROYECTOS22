package udb.net.mod1.regacad.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;



public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//EstudianteCep e3 = new EstudianteCep(1,"Jose","Perez",8.21,65.00);
		//EstudianteColp e4 = new EstudianteColp(2,"Mario","Martinez",9.26,70.40);
		ApplicationContext cont = new FileSystemXmlApplicationContext("src/main/resources/applicationContext.xml");
		Estudiante e1 = cont.getBean(EstudianteCep.class);		
		Estudiante e2 = cont.getBean(EstudianteColp.class);		
		
		imprimir(e1);
		imprimir(e2);
		
	}
	
	public static void imprimir(Estudiante e) {
		System.out.println(String.format("Nombre: %s %s\nCum: %.2f\nCuota: %.2f",e.getNombre(),e.getApellido(),e.getCum(),e.getCum(),(e.getCuotaMensual()-e.calcularMontoBeca())));
		System.out.println("****************************************");
	}

}
