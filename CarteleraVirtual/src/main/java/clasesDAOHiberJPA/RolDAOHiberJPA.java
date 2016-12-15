package clasesDAOHiberJPA;

import Daos.RolDAO;
import clases.Rol;

public class RolDAOHiberJPA extends GenericoDAOHibernateJPA<Rol> implements RolDAO {

	public RolDAOHiberJPA() {
		this.persistentClass = Rol.class;		
	}


}
