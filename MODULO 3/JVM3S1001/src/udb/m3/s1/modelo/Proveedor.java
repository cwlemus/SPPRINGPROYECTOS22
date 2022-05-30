package udb.m3.s1.modelo;

import java.util.List;

public class Proveedor {
		private Integer codigo;
		private String nombre;
		private List<Actividad> actividades;
		
		public Proveedor() {
			// TODO Auto-generated constructor stub
		}

		public Proveedor(Integer codigo, String nombre, List<Actividad> actividades) {
			super();
			this.codigo = codigo;
			this.nombre = nombre;
			this.actividades = actividades;
		}

		public Integer getCodigo() {
			return codigo;
		}

		public void setCodigo(Integer codigo) {
			this.codigo = codigo;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public List<Actividad> getActividades() {
			return actividades;
		}

		public void setActividades(List<Actividad> actividades) {
			this.actividades = actividades;
		}
		
		
		
}
