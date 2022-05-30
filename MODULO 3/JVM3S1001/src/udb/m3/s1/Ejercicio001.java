package udb.m3.s1;

import java.util.List;

import udb.m3.s1.modelo.Empleado;

public class Ejercicio001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Empleado> lstEmpleado = List.of(
					new Empleado(1,"Mario Ramirez",980.69),
					new Empleado(2,"Maria Perez",1000.60),
					new Empleado(3,"Julio Renderos",1290.59),
					new Empleado(4,"Pedro Perez",1200.70),
					new Empleado(5,"Marcos Sanchez",1390.69)
				);
		
		for(Empleado e: lstEmpleado) {
			System.out.println(e);
		}

	}

}
