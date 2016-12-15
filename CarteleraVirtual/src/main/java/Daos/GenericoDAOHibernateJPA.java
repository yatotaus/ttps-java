package Daos;

import java.io.Serializable;
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

	/*
	public T eliminar(Long id) {
		T entity = MiEntityManagerFactory.getEMF().createEntityManager().find(this.getPersistentClass(), id);
		if (entity != null) {
			this.eliminar(entity);
		}
		return entity;
	}
	
	*/	

	public void persistir(Class<T> Objeto) {
		
	}

	public void recuperar(Class<T> Objeto) {
		
	}

	public void existe(Class<T> Objeto) {
		
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public T buscar(String nombre) {
		System.out.print(getPersistentClass().getSimpleName());
		Query consulta= em.createQuery("select e from " +
				getPersistentClass().getSimpleName()+" e where e.nombre = :nombre");
		consulta.setParameter("nombre", nombre);
		List<T> resultado = (List<T>)consulta.getResultList();
		if (resultado.isEmpty()){
			return null;
		}
		return resultado.get(0);	
	}
	



}
