package clasesDAOHiberJPA;

import Daos.PublicacionDAO;
import clases.Publicacion;

public class PublicacionDAOHiberJPA extends GenericoDAOHibernateJPA<Publicacion> implements PublicacionDAO {

	public PublicacionDAOHiberJPA() {
		this.persistentClass = Publicacion.class;		
	}

}