package udb.net.m1.regacad.spring;

public class Curso {
	private Integer codigo;
	private String nombre;
	public Curso() {
		// TODO Auto-generated constructor stub
	}
	public Curso(Integer codigo, String nombre) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
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
	
}
