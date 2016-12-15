package Daos;

import java.io.Serializable;
import javax.persistence.*;
import Interface.GenericDAO;

public class GenericoDAOHibernateJPA<T> implements GenericDAO<T>{

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("juan");
	EntityManager em = emf.createEntityManager();
	
	
	public void agregar(Object cartelera){
		em = emf.createEntityManager();
		EntityTransaction etx = em.getTransaction();
		etx.begin();
		em.persist(cartelera);
		etx.commit();
		em.close();
	}
	
	public void actualizar(Object objetoPersistible) {
		em = emf.createEntityManager();
		EntityTransaction etx = em.getTransaction();
		etx.begin();
		em.merge(objetoPersistible);
		etx.commit();
		em.close();
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
	
	public void borrar(Class<T> Objeto) {
		
	}

	public void borrar(Serializable Objeto) {
		
	}

	public void persistir(Class<T> Objeto) {
		
	}

	public void recuperar(Class<T> Objeto) {
		
	}

	public void existe(Class<T> Objeto) {
		
	}

	@Override
	public void actualizar(Class<T> Objeto) {
		// TODO Auto-generated method stub
		
	}
	



}
