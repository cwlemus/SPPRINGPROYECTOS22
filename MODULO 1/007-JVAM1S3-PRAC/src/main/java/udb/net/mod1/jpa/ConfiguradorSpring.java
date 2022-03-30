package udb.net.mod1.jpa;

import javax.persistence.EntityManagerFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("udb.net.mod1.jpa")
@EnableAspectJAutoProxy
@EnableTransactionManagement
public class ConfiguradorSpring {
		
	//recibe un entityManagerFactory
	@Bean
	public PlatformTransactionManager transactionManager(EntityManagerFactory emf) {
		//genera transaccion soportada por jpa
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		//seta en la transaccion el emf.
		transactionManager.setEntityManagerFactory(emf);
		return transactionManager;
	}


	//Dar de alta un entitymanagerFactory
	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
		//bean para almacenar entidades
		LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
		//adaptardor para proveedor de hibernate 
		JpaVendorAdapter adaptador = new HibernateJpaVendorAdapter();
		//setear adaptador
		em.setJpaVendorAdapter(adaptador);
		// especificamos unidad de persistencia
		em.setPersistenceUnitName("estudiante");
		return em;
	}
	
//	//traducir excepciones en el log no obliga a ubicar trycatch continuamiente
//	@Bean
//	public PersistenceExceptionTranslationPostProcessor exceptionTranslation() {
//		return new PersistenceExceptionTranslationPostProcessor();
//	}
	
}
