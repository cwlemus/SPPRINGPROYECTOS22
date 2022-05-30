package udb.m3.s1;

import udb.m3.s1.modelo.Actividad;
import udb.m3.s1.servicio.ProveedorServicio;

public class Ejercicio013 {
	public static void main(String[] args) {
		ProveedorServicio servicio = new ProveedorServicio();
		
		int numHoras=servicio.listaProveedores().stream()
		.filter(p->p.getNombre().equals("DATUM"))
		.flatMap(e->e.getActividades().stream())		
		.mapToInt(Actividad::getHoras)	
		.sum();
		
		System.out.println(numHoras);
	}
}
