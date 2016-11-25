package Daos;

import java.io.Serializable;
//import javax.persistence.*;
 
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.FlushModeType;
import javax.persistence.Persistence;

import clases.Cartelera;

public class CarteleraDAO<T> extends GenericoDAOHibernateJPA<T> {
	
	public void agregar(Cartelera cart){
		

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("juan");

		EntityManager em = emf.createEntityManager();
		
		EntityTransaction etx = em.getTransaction();
	
		etx.begin();
		
		Cartelera c = new Cartelera();
		c.setNombreCartelera("Soy la primera cartelera");
		em.persist(c);
		etx.commit();
		em.close();
	}

	public void actualizar(Class<T> Objeto) {
		
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
