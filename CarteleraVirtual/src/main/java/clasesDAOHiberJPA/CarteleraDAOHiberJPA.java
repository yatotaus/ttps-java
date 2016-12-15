package clasesDAOHiberJPA;

import Daos.CarteleraDAO;
import clases.Cartelera;

public class CarteleraDAOHiberJPA extends GenericoDAOHibernateJPA<Cartelera> implements CarteleraDAO {
	
	public CarteleraDAOHiberJPA() {
		this.persistentClass = Cartelera.class;		
	}
}
