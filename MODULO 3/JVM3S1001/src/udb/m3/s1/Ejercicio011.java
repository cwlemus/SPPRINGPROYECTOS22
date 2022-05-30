package udb.m3.s1;

import java.util.Optional;

import udb.m3.s1.modelo.Empleado;

public class Ejercicio011 {
	public static void main(String[] args) {
		Empleado emp =null;
		//Optional<Empleado> op = Optional.empty();
		Optional<Empleado> op = Optional.of(new Empleado(1,"Jose Bonilla",600.98));
		if(op.isPresent()) {
			System.out.println("tiene valor "+op.get());
		}else {
			System.out.println("no tiene valor");
		}
	}
}
