package udb.m3.s1;

import udb.m3.s1.servicio.EmpleadoServicio;

public class Ejercicio008 {
	public static void main(String[] args) {
	// cambiar el salario
		EmpleadoServicio servicio = new EmpleadoServicio();
		servicio.listarEmpleados()
		.stream()
		.peek(e->e.setSalarioEmp(e.getSalarioEmp()*0.10))
		.forEach(System.out::println);
	}
}
