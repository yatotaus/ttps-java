package Daos;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import clases.Usuario;

public class UsuarioDAO<T> extends GenericoDAOHibernateJPA<T> {
	
	public void agregar(Usuario cart){
		

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("juan");

		EntityManager em = emf.createEntityManager();
		
		EntityTransaction etx = em.getTransaction();
	
		etx.begin();
		
		Usuario c = new Usuario();
		c.setUsuario("Pepe");
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
