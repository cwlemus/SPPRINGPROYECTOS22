package udb.m3.s1;

import java.util.List;

import udb.m3.s1.modelo.Empleado;
import udb.m3.s1.modelo.EmpleadoAs;
import udb.m3.s1.modelo.IOperacion;

public class Ejercicio002 {
	
	static IOperacion opEmpleado = (Double s)->{return s-=s*0.10;};
	static IOperacion opServ = (Double s) ->{return s-=s*0.05;};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<EmpleadoAs> lstEmpleado = List.of(
				new EmpleadoAs(1,"Mario Ramirez",980.69),
				new EmpleadoAs(2,"Maria Perez",1000.60),
				new EmpleadoAs(3,"Julio Renderos",1290.59),
				new EmpleadoAs(4,"Pedro Perez",1200.70),
				new EmpleadoAs(5,"Marcos Sanchez",1390.69)
			);
		
		for(EmpleadoAs e: lstEmpleado) {
			System.out.println(String.format("%d %s %.2f", e.getCodigoEmp(),e.getNombreEmp(),
					opEmpleado.operar(e.getSalarioEmp())));
		}
		
		
	}

}
