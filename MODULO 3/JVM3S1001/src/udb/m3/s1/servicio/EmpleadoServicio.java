package udb.m3.s1.servicio;

import java.util.List;

import udb.m3.s1.modelo.EmpleadoAs;

public class EmpleadoServicio {
	public List<EmpleadoAs> listarEmpleados(){
		return List.of(
				new EmpleadoAs(1,"Mario Ramirez",980.69),
				new EmpleadoAs(2,"Maria Perez",1000.60),
				new EmpleadoAs(3,"Julio Renderos",1290.59),
				new EmpleadoAs(4,"Pedro Perez",1200.70),
				new EmpleadoAs(5,"Marcos Sanchez",1390.69)
			);
	}
}
