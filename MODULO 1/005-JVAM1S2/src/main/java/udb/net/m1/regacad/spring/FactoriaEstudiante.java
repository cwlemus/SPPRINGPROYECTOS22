package udb.net.m1.regacad.spring;

public class FactoriaEstudiante {
	public static Estudiante getInstance(int tipo) {
		Estudiante retorno=null;
		switch (tipo) {
		case 1:
			retorno= new EstudianteCep();
			break;
		case 2:
			retorno= new EstudianteColP();
			break;
		case 3:
			retorno= new EstudianteBecado();
			break;
			
		}		
		return retorno;
	}
}
