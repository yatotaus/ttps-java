package Daos;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import Interface.GenericDAO;
import clases.Cartelera;

public class GenericoDAOHibernateJPA<T> implements GenericDAO<T>{

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("juan");
	EntityManager em = emf.createEntityManager();
	
	
	public void agregar(Object cartelera){
		
		EntityTransaction etx = em.getTransaction();
		etx.begin();
		em.persist(cartelera);
		etx.commit();
		em.close();
	}
	
	public void actualizar(Class<T> objetoPersistible) {
		EntityTransaction etx = em.getTransaction();
		etx.begin();
		em.merge(objetoPersistible);
		etx.commit();
		em.close();
	}

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
	



}
