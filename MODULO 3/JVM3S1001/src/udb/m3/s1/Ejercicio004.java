package udb.m3.s1;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

import udb.m3.s1.modelo.EmpleadoAs;
import udb.m3.s1.servicio.EmpleadoServicio;

public class Ejercicio004 {
	static Function<Double,Double> opEmpleado = (Double s)->{return s-=s*0.10;};
	static Function<Double,Double> opServ = (Double s)->{return s-=s*0.05;};
	
	public static void main(String[] args) {
		EmpleadoServicio servicio = new EmpleadoServicio();
		
		Consumer<EmpleadoAs> consumer=(EmpleadoAs e)->System.out.println(String.format("%d %s %.2f", 
				e.getCodigoEmp(),e.getNombreEmp(),
				opEmpleado.apply(e.getSalarioEmp())));
		
		Predicate<EmpleadoAs> predicate= 
				(e)->(e.getNombreEmp().toLowerCase().contains("m") 
						&& opEmpleado.apply(e.getSalarioEmp())>900);
		
		Stream stream = servicio.listarEmpleados().stream();
		stream.filter(predicate)		
		.forEach(consumer);		
	}
}
