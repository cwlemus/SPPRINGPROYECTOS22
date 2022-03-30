package udb.net.m1.regacad.spring;

public class FactoriaEstudiante {
	public static Estudiante getInstance(String tipo) {
		if(tipo.equals("CEP")) {
			return new EstudianteCep();
			//return new EstudianteProxy(new EstudianteCep());			
		}else {
			return new EstudianteColP();
		}
	}
}
