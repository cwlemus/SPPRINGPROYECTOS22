package udb.net.m1.regacad.spring;

import java.util.List;

class EstudianteCep extends Estudiante {

	
	public EstudianteCep() {
		super();
		// TODO Auto-generated constructor stub
	}


	public EstudianteCep(Integer codigo, String nombre, String apellido, Double cum, Double cuotaMensual,
			List<Curso> lstCursos) {
		super(codigo, nombre, apellido, cum, cuotaMensual, lstCursos);
		// TODO Auto-generated constructor stub
	}


	@Override
	public Double calcularMontoBeca() {
		// TODO Auto-generated method stub
		return getCum()>=9.0?getCuotaMensual()*0.90:0.00;
	}
	
}
