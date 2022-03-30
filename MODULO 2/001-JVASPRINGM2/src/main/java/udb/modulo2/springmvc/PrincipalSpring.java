package udb.modulo2.springmvc;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class PrincipalSpring implements  WebApplicationInitializer{

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext contexto = new AnnotationConfigWebApplicationContext();
		//registramos beans al configurador
		contexto.register(ConfiguradorSpring.class);
		//nos liga ee contexto a la aplicacion
		contexto.setServletContext(servletContext);

		ServletRegistration.Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet(contexto));
		servlet.setLoadOnStartup(1);
		servlet.addMapping("/");
	}
	
	
	
}
