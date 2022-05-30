package udb.m3.s1;

import udb.m3.s1.servicio.EmpleadoServicio;

public class Ejercicio009 {
	public static void main(String[] args) {
		EmpleadoServicio servicio = new EmpleadoServicio();
		Double salario=servicio.listarEmpleados()
		.stream()
		.filter(e->e.getNombreEmp().toLowerCase().contains("m"))
		.mapToDouble(e->e.getSalarioEmp())		
		.sum();
		
		System.out.println(salario);
		
	}
}
