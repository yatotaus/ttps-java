package clasesDAOHiberJPA;

import java.util.List;
import javax.persistence.*;
import Interface.GenericDAO;

public class GenericoDAOHibernateJPA<T> implements GenericDAO<T>{

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("juan");
	EntityManager em = emf.createEntityManager();
	
	protected Class<T> persistentClass;
	
	public Class<T> getPersistentClass() {
		return persistentClass;
	}

	public void setPersistentClass(Class<T> persistentClass) {
		this.persistentClass = persistentClass;
	}
	
	public void agregar(Object cartelera){
		em = emf.createEntityManager();
		EntityTransaction etx = em.getTransaction();
		etx.begin();
		em.persist(cartelera);
		etx.commit();
		em.close();
	}
	
	@Override
	public T actualizar(T objetoPersistible) {
		em = emf.createEntityManager();
		EntityTransaction etx = em.getTransaction();
		etx.begin();
		em.merge(objetoPersistible);
		etx.commit();
		em.close();
		return objetoPersistible;
	}

	
	public void eliminar(T entity) {
		em = emf.createEntityManager();
		EntityTransaction etx = em.getTransaction();
		etx.begin();
		em.remove(em.merge(entity));
		etx.commit();
		em.close();		
		
	}
	
	public List<T> listado() {
		
		Query consulta = emf.createEntityManager().createQuery("select e from " + getPersistentClass().getSimpleName()+ " e");
		List<T> resultado = (List<T>) consulta.getResultList();
		return resultado;
	}

	
	public T eliminar(int id) {
		T entity = emf.createEntityManager().find(this.getPersistentClass(), id);
		if (entity != null) {
			this.eliminar(entity);
		}
		return entity;
	}
	
	@Override
	public void persistir(T Objeto) {
		
	}

	@Override
	public void recuperar(T Objeto) {
		
	}

	@Override
	public void existe(T Objeto) {
		
	}

	@Override
	public T buscar(String nombre) {
		return null;
	}
	

	
}
