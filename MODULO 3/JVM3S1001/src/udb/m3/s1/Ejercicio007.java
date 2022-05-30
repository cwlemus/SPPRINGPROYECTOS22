package udb.m3.s1;

import udb.m3.s1.servicio.EmpleadoServicio;

public class Ejercicio007 {
	public static void main(String[] args) {
		EmpleadoServicio servicio = new EmpleadoServicio();
		servicio.listarEmpleados()
		.stream()
		.map(e->String.format("%s %.2f", e.getNombreEmp(),e.getSalarioEmp()))
		.forEach(System.out::println);	
	
	}
}
