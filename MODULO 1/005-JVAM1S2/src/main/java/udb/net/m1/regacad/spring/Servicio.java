package udb.net.m1.regacad.spring;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Component;

@Component
public class Servicio {
	public void mensaje() {
		System.out.println("Estamos en receso!!!!! ....");
	}
	
	public void imprimir(Estudiante e) {		
		System.out.println(String.format("Nombre: %s %s\nCum: %.2f\nCouta: %.2f", e.getNombre(),e.getApellido(),e.getCum(),(e.getCuotaMensual()-e.calcularMontoBeca())));		
		if(CollectionUtils.isNotEmpty(e.getLstCursos())) {
			System.out.println("\nCursos inscrito");
			for (Curso c : e.getLstCursos()) {
				System.out.println(c.getNombre());
			}
		}
		System.out.println("**************************************************");
	}
	
	public void objEstudianteBecado() {
		Estudiante e1= FactoriaEstudiante.getInstance(3);		
		e1.setCodigo(1);
		e1.setNombre("Margarita");
		e1.setApellido("Pedrosa");
		e1.setCum(8.90);
		e1.setCuotaMensual(56.90);	
		//cursos
		List cursos = new ArrayList<Curso>();
		cursos.add(new Curso(1,"Fundamentos de POO"));
		cursos.add(new Curso(1,"Codigo limpio"));
		cursos.add(new Curso(1,"Aplicando patrones de diseño"));
		e1.setLstCursos(cursos);
		System.out.println("**************************************************");
		System.out.println("ESTUDIANTE BECADO");
		imprimir(e1);
	}
		
	public void objEstudianteCep() {
		Estudiante e1= FactoriaEstudiante.getInstance(1);		
		e1.setCodigo(1);
		e1.setNombre("Jose");
		e1.setApellido("Perez");
		e1.setCum(8.90);
		e1.setCuotaMensual(56.90);		
		imprimir(e1);
		
	}
	public void objEstudianteColp() {
		Estudiante e2= FactoriaEstudiante.getInstance(2);
		e2.setCodigo(2);
		e2.setNombre("Mario");
		e2.setApellido("Martinez");
		e2.setCum(9.90);
		e2.setCuotaMensual(68.90);
		imprimir(e2);
	}
	
}
