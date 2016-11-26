package Daos;

import java.io.Serializable;
import javax.persistence.*;

import clases.Cartelera;

public class CarteleraDAO<T> extends GenericoDAOHibernateJPA<T> {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("juan");
	EntityManager em = emf.createEntityManager();
	
	
	public void agregar(Cartelera cart){
		
		
		EntityTransaction etx = em.getTransaction();
	
		etx.begin();
		
		Cartelera c = new Cartelera();
		c.setNombreCartelera("AyED");
		em.persist(c);
		etx.commit();
		em.close();
	}

	public void actualizar(Class<T> Objeto) {
		EntityTransaction etx = em.getTransaction();
		
		etx.begin();
		
		Cartelera c = new Cartelera();
		c.setNombreCartelera("AyED");
		c.setId(2);
		em.merge(c);
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