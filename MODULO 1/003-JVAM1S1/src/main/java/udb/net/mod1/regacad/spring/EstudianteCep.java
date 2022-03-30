package udb.net.mod1.regacad.spring;

 class EstudianteCep extends Estudiante {

	
	public EstudianteCep() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EstudianteCep(Integer codigo, String nombre, String apellido, Double cum, Double coutaMenusual) {
		super(codigo, nombre, apellido, cum, coutaMenusual);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double calcularMontoBeca() {
		// TODO Auto-generated method stub
		return getCum()>=9.0?getCuotaMensual()*0.90:0.00;
	}
	
}
