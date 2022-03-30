package udb.net.m1.regacad.spring;

import java.util.List;

public class EstudianteBecado extends Estudiante {

	
	public EstudianteBecado() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public EstudianteBecado(Integer codigo, String nombre, String apellido, Double cum, Double cuotaMensual,
			List<Curso> lstCursos) {
		super(codigo, nombre, apellido, cum, cuotaMensual, lstCursos);
		// TODO Auto-generated constructor stub
	}



	@Override
	public Double calcularMontoBeca() {
		// TODO Auto-generated method stub
		return getCuotaMensual();
	}

}
