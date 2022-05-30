package udb.m3.s1;

import udb.m3.s1.servicio.ProveedorServicio;

public class Ejercicio012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProveedorServicio servicio = new ProveedorServicio();
		
		servicio.listaProveedores().stream()
		.flatMap(e->e.getActividades().stream())
		.map(a->a.getNombre())
		.distinct()
		.forEach(System.out::println);
	}

}
