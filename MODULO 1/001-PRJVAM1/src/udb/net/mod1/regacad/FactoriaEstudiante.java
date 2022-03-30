package udb.net.mod1.regacad;

public class FactoriaEstudiante {
	public static Estudiante getInstance(String tipo) {
		if(tipo.equals("CEP")) {
			return new EstudianteCep();
		}else {
			return new EstudianteColp();
		}
	}
}
