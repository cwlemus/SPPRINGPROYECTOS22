package udb.net.modulo1.jdbc;

import java.util.List;

public class Principal1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EstudianteRepository er = new EstudianteRepository();
//		Estudiante es = new Estudiante(12,"Mario","Martinez",9.80,56.90);
//		
//		try {
//			er.insertar(es);
//			System.out.println("Insercion correcta ....");
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
		List<Estudiante> lst= er.buscarTodos();
		for (Estudiante estudiante : lst) {
			System.out.println(estudiante);
		}		
		//lst.forEach((p)-> System.out.println(p));
		
	}
}
