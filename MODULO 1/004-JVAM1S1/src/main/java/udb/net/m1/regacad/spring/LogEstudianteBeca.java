package udb.net.m1.regacad.spring;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogEstudianteBeca {
	@Before("execution (* objEstudianteCep())")
	public void imprimirCep() {
		System.out.println("Estudiante con mayor monto en beca!!!");
	}
}
