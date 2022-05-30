package udb.m3.s1;

import java.util.OptionalDouble;

import udb.m3.s1.servicio.EmpleadoServicio;

public class Ejercicio010 {
	public static void main(String[] args) {
		EmpleadoServicio servicio = new EmpleadoServicio();
		OptionalDouble salario=servicio.listarEmpleados()
		.stream()
		.filter(e->e.getNombreEmp().toLowerCase().contains("m"))
		.mapToDouble(e->e.getSalarioEmp())		
		.reduce((s1,s2)->s1+s2);
		
		System.out.println(salario);
		
	}
}
