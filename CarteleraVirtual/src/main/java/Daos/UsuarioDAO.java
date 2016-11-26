package Daos;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import clases.Usuario;

public class UsuarioDAO<T> extends GenericoDAOHibernateJPA<T> {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("juan");
	EntityManager em = emf.createEntityManager();
	
	public void agregar(Usuario cart){
				
		EntityTransaction etx = em.getTransaction();
	
		etx.begin();
		
		Usuario user = new Usuario();
		user.setUsuario("Pepe");
		em.persist(user);
		etx.commit();
		em.close();
	}

	public void actualizar(Class<T> Objeto) {
		
		EntityTransaction etx = em.getTransaction();
		
		etx.begin();
		
		Usuario user = new Usuario();
		user.setUsuario("Juan");
		user.setId(1);
		em.merge(user);
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
