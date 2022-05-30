package udb.m3.s1.modelo;

public class Actividad {
	private String nombre;
	private Integer horas;
	
	public Actividad() {
		// TODO Auto-generated constructor stub
	}

	public Actividad(String nombre, Integer horas) {
		super();
		this.nombre = nombre;
		this.horas = horas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}
	
	
	
}
