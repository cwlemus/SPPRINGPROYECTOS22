package udb.net.modulo1.jdbc;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PrincipalSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext cnt= new AnnotationConfigApplicationContext(ConfiguradorSpring.class);
		EstudianteRepositoryPlantilla er = cnt.getBean(EstudianteRepositoryPlantilla.class);
		Estudiante es = new Estudiante(11,"Marina","Morales",9.80,56.90);
//		
//		try {
//			er.insertar(es);
//			System.out.println("Insercion correcta ....");
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//		List<Estudiante> lst= er.buscarTodos();
//		for (Estudiante estudiante : lst) {
//			System.out.println(estudiante);
//		}		
		//lst.forEach((p)-> System.out.println(p));
		//er.borrar(es);
		er.actualizar(es);
	}
}
