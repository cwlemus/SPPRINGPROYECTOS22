package udb.net.m1.regacad.spring;

import org.springframework.stereotype.Component;

@Component
public class Servicio {
	public void mensaje() {
		System.out.println("Estamos en receso!!!!! ....");
	}
	
	public void imprimir(Estudiante e) {
		System.out.println(String.format("Nombre: %s %s\nCum: %.2f\nCouta: %.2f", e.getNombre(),e.getApellido(),e.getCum(),(e.getCuotaMensual()-e.calcularMontoBeca())));
		System.out.println("**************************************************");
	}
		
	public void objEstudianteCep() {
		Estudiante e1= FactoriaEstudiante.getInstance("CEP");		
		e1.setCodigo(1);
		e1.setNombre("Jose");
		e1.setApellido("Perez");
		e1.setCum(8.90);
		e1.setCuotaMensual(56.90);		
		imprimir(e1);
		
	}
	public void objEstudianteColp() {
		Estudiante e2= FactoriaEstudiante.getInstance("COL");
		e2.setCodigo(2);
		e2.setNombre("Mario");
		e2.setApellido("Martinez");
		e2.setCum(9.90);
		e2.setCuotaMensual(68.90);
		imprimir(e2);
	}
	
}
