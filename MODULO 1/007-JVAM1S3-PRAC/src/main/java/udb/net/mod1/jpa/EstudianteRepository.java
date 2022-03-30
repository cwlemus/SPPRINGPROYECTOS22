package udb.net.mod1.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class EstudianteRepository {

	@PersistenceContext
	private EntityManager em;
	
	@Transactional
	public List<Estudiante> buscarTodos(){
		TypedQuery<Estudiante> queryJpa=em.createQuery("select e from Estudiante e",Estudiante.class);
		return queryJpa.getResultList();
	}
	
	@Transactional
	public void borrar(Estudiante estudiante) {
		em.remove(em.merge(estudiante));
	}
	
	@Transactional
	public void insertar(Estudiante e) {
		em.persist(e);
	}
	
	@Transactional
	public void actualizar(Estudiante estudiante) {
		em.merge(estudiante);
	}
}
