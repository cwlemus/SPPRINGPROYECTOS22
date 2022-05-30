package udb.m3.s1.servicio;

import java.util.List;

import udb.m3.s1.modelo.Actividad;
import udb.m3.s1.modelo.Proveedor;

public class ProveedorServicio {
	public List<Proveedor> listaProveedores(){
		return List.of(
					new Proveedor(1,"DATUM",List.of(
							new Actividad("Configuracion servidor",10),
							new Actividad("Respaldar base de datos",15)
							)),
					new Proveedor(2,"GBM",List.of(
							new Actividad("Configuracion servidor",10),
							new Actividad("Restaurar base de datos",7),
							new Actividad("Configuracion de politicas",5)
							))					
				);
	}
}
