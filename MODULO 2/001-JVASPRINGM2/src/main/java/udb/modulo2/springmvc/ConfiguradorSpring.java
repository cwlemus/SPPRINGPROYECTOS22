package udb.modulo2.springmvc;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.thymeleaf.spring5.ISpringTemplateEngine;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.ITemplateResolver;


@Configuration
@ComponentScan("udb.modulo2.springmvc")
@EnableAspectJAutoProxy
@EnableWebMvc
public class ConfiguradorSpring implements ApplicationContextAware {

	private ApplicationContext contexto;
	
	@Override
	public void setApplicationContext(ApplicationContext contexto) throws BeansException {
		// TODO Auto-generated method stub
		this.contexto = contexto;
	}
	
	@Bean
	public ViewResolver viewResolver() {
	ThymeleafViewResolver resolver = new ThymeleafViewResolver();
	resolver.setTemplateEngine(templateEngine());
	resolver.setCharacterEncoding("UTF-8");
	return resolver;
	}
	
	@Bean
	public ISpringTemplateEngine templateEngine() {
	SpringTemplateEngine engine = new SpringTemplateEngine();
	//Habilita soporte para Expression Language
	engine.setEnableSpringELCompiler(true);
	engine.setTemplateResolver(templateResolver());
	return engine;
	}
	
	private ITemplateResolver templateResolver() {
		// que resolutor de plantillas uso
		SpringResourceTemplateResolver resolver = new
		SpringResourceTemplateResolver();
		// contexto con todos los objetos de spring
		resolver.setApplicationContext(contexto);
		resolver.setPrefix("/WEB-INF/vistas/");
		resolver.setSuffix(".html");
		resolver.setCacheable(false);
		resolver.setTemplateMode(TemplateMode.HTML);
		return resolver;
		}
	
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").
		addResourceLocations("/WEB-INF/resources/*");
		registry.addResourceHandler("/resources/**").
		addResourceLocations("/resources/");
		registry.addResourceHandler("/webjars/**").
		addResourceLocations("classpath:/META-INF/resources/webjars/");
		}

	


}
