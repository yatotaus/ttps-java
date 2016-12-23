package clasesDAOHiberJPA;

import Daos.PublicadorPermisosDAO;
import clases.PublicadorPermisos;

public class PublicadorPermisosDAOHiberJPA extends GenericoDAOHibernateJPA<PublicadorPermisos> implements PublicadorPermisosDAO {

	public PublicadorPermisosDAOHiberJPA() {
		this.persistentClass = PublicadorPermisos.class;		
	}


}