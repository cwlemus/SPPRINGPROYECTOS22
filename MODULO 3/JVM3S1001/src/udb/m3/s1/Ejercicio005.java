package udb.m3.s1;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

import udb.m3.s1.modelo.EmpleadoAs;
import udb.m3.s1.servicio.EmpleadoServicio;

public class Ejercicio005 {
	
	public static void main(String[] args) {
		EmpleadoServicio servicio = new EmpleadoServicio();		
		/// una forma simplificada.		
		servicio.listarEmpleados()
				.stream()
				.filter((e)->(e.getNombreEmp().toLowerCase().contains("m") 
						&& e.getSalarioEmp()>900.00))
				.forEach((e)->System.out.println(e));
	}
}
