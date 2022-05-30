package udb.m3.s1.modelo;

public class EmpleadoAs  {
	private Integer codigoEmp;
	private String nombreEmp;
	private Double salarioEmp;
	
	public EmpleadoAs() {
		// TODO Auto-generated constructor stub
	}
		

	public EmpleadoAs(Integer codigoEmp, String nombreEmp, Double salarioEmp) {
		super();
		this.codigoEmp = codigoEmp;
		this.nombreEmp = nombreEmp;
		this.salarioEmp = salarioEmp;
	}

	public Integer getCodigoEmp() {
		return codigoEmp;
	}

	public void setCodigoEmp(Integer codigoEmp) {
		this.codigoEmp = codigoEmp;
	}

	public String getNombreEmp() {
		return nombreEmp;
	}

	public void setNombreEmp(String nombreEmp) {
		this.nombreEmp = nombreEmp;
	}

	public Double getSalarioEmp() {
		return salarioEmp;
	}

	public void setSalarioEmp(Double salarioEmp) {
		this.salarioEmp = salarioEmp;
	}

	@Override
	public String toString() {
		return String.format("%d %s %.2f", codigoEmp,nombreEmp,
				salarioEmp);
	}


	
	
	
	
	
}
