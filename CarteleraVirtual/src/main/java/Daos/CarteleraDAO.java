package Daos;

import java.io.Serializable;
import javax.persistence.*;

import clases.Cartelera;

public class CarteleraDAO<T> extends GenericoDAOHibernateJPA<T> {
	
	public void agregar(Cartelera cart){
		
<<<<<<< HEAD
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("juan");
=======
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pepe");
>>>>>>> branch 'master' of https://github.com/yatotaus/ttps-java
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction etx = em.getTransaction();
	
		etx.begin();
		
		Cartelera c = new Cartelera();
		c.setNombreCartelera("Soy la primera cartelera");
		em.persist(c);
		etx.commit();
		em.close();
<<<<<<< HEAD
		
=======
				
>>>>>>> branch 'master' of https://github.com/yatotaus/ttps-java
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
