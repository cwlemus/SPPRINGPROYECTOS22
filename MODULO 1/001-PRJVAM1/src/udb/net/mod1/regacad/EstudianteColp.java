package udb.net.mod1.regacad;

 class EstudianteColp extends Estudiante{

	
	
	public EstudianteColp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EstudianteColp(Integer codigo, String nombre, String apellido, Double cum, Double cuotaMensual) {
		super(codigo, nombre, apellido, cum, cuotaMensual);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double calcularMontoBeca() {
		// TODO Auto-generated method stub
		return getCum()>=9.0?getCuotaMensual()*0.50:0.00;
	}

}
