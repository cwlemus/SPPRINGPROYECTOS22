package udb.net.mod1.regacad.spring;

import java.util.Date;

public class RegistroAcad {
	private Integer idRegistro;
	private Date fechaRegistro;
	private EstudianteCep estudiante;
	
	public RegistroAcad() {
		// TODO Auto-generated constructor stub
	}

	public RegistroAcad(Integer idRegistro, Date fechaRegistro, EstudianteCep estudiante) {
		super();
		this.idRegistro = idRegistro;
		this.fechaRegistro = fechaRegistro;
		this.estudiante = estudiante;
	}

	public Integer getIdRegistro() {
		return idRegistro;
	}

	public void setIdRegistro(Integer idRegistro) {
		this.idRegistro = idRegistro;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public EstudianteCep getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(EstudianteCep estudiante) {
		this.estudiante = estudiante;
	}

	
	
	
	
}
