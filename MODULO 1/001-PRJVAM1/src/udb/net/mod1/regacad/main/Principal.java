package udb.net.mod1.regacad.main;

import udb.net.mod1.regacad.Estudiante;
import udb.net.mod1.regacad.FactoriaEstudiante;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//EstudianteCep e3 = new EstudianteCep(1,"Jose","Perez",8.21,65.00);
		//EstudianteColp e4 = new EstudianteColp(2,"Mario","Martinez",9.26,70.40);
		Estudiante e1 = FactoriaEstudiante.getInstance("CEP");
		e1.setCodigo(1);
		e1.setNombre("Jose");
		e1.setApellido("Perez");
		e1.setCum(8.21);
		e1.setCuotaMensual(65.00);
		
		Estudiante e2 = FactoriaEstudiante.getInstance("COL");
		e2.setCodigo(2);
		e2.setNombre("Mario");
		e2.setApellido("Martinez");
		e2.setCum(9.26);
		e2.setCuotaMensual(70.40);
		
		imprimir(e1);
		imprimir(e2);
		
	}
	
	public static void imprimir(Estudiante e) {
		System.out.println(String.format("Nombre: %s %s\nCum: %.2f\nCuota: %.2f",e.getNombre(),e.getApellido(),e.getCum(),e.getCum(),(e.getCuotaMensual()-e.calcularMontoBeca())));
		System.out.println("****************************************");
	}

}
