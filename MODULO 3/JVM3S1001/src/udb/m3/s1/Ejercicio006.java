package udb.m3.s1;

import udb.m3.s1.modelo.EmpleadoAs;
import udb.m3.s1.servicio.EmpleadoServicio;

public class Ejercicio006 {
	public static void main(String[] args) {
EmpleadoServicio servicio = new EmpleadoServicio();
		
		/// una forma simplificada.		
		servicio.listarEmpleados()
				.stream()
				.filter((e)->(e.getNombreEmp().toLowerCase().contains("m") 
						&& e.getSalarioEmp()>900.00))
				.forEach(System.out::println);
	}
	
	public static void imprimir(EmpleadoAs e) {
		System.out.println("******************");
		System.out.println(e);
		System.out.println("******************");
	}
}
