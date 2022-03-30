package udb.net.m1.regacad.spring;

public class EstudianteProxy extends Estudiante {
private Estudiante estudiante;
	@Override
	public Double calcularMontoBeca() {
		// TODO Auto-generated method stub
		System.out.println("Estudiante con mayor monto en beca!!!!");
		return estudiante.calcularMontoBeca();
	}
	public EstudianteProxy() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public EstudianteProxy(Estudiante estudiante) {
		super();
		// TODO Auto-generated constructor stub
		
		this.estudiante=estudiante;
	}
	public Integer getCodigo() {
		return estudiante.getCodigo();
	}
	public void setCodigo(Integer codigo) {
		estudiante.setCodigo(codigo);
	}
	public String getNombre() {
		return estudiante.getNombre();
	}
	public void setNombre(String nombre) {
		estudiante.setNombre(nombre);
	}
	public String getApellido() {
		return estudiante.getApellido();
	}
	public void setApellido(String apellido) {
		estudiante.setApellido(apellido);
	}
	public Double getCum() {
		return estudiante.getCum();
	}
	public void setCum(Double cum) {
		estudiante.setCum(cum);
	}
	public Double getCuotaMensual() {
		return estudiante.getCuotaMensual();
	}
	public void setCuotaMensual(Double cuotaMensual) {
		estudiante.setCuotaMensual(cuotaMensual);
	}
	
	

}
