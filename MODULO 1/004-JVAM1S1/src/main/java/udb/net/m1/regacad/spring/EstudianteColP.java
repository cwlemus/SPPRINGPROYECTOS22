package udb.net.m1.regacad.spring;

 class EstudianteColP extends Estudiante {

	
	public EstudianteColP() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EstudianteColP(Integer codigo, String nombre, String apellido, Double cum, Double coutaMenusual) {
		super(codigo, nombre, apellido, cum, coutaMenusual);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double calcularMontoBeca() {
		// TODO Auto-generated method stub
		return getCum()>=9.0?getCuotaMensual()*0.50:0.00;
	}

}
