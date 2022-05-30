package udb.m3.s1;

import java.util.function.Function;

import udb.m3.s1.modelo.EmpleadoAs;
import udb.m3.s1.servicio.EmpleadoServicio;

public class Ejercicio003 {
	
	static Function<Double,Double> opEmpleado = (Double s)->{return s-=s*0.10;};
	static Function<Double,Double> opServ = (Double s)->{return s-=s*0.05;};
	
	public static void main(String[] args) {
		EmpleadoServicio servicio = new EmpleadoServicio();
		for(EmpleadoAs e: servicio.listarEmpleados()) {
			System.out.println(String.format("%d %s %.2f", 
					e.getCodigoEmp(),e.getNombreEmp(),
					opEmpleado.apply(e.getSalarioEmp())));
		}
	}
}
