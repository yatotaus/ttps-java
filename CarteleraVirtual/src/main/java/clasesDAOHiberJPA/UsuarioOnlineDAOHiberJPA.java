package clasesDAOHiberJPA;

import Daos.UsuarioOnlineDAO;
import clases.UsuarioOnline;

public class UsuarioOnlineDAOHiberJPA extends GenericoDAOHibernateJPA<UsuarioOnline> implements UsuarioOnlineDAO {

	public UsuarioOnlineDAOHiberJPA() {
		this.persistentClass = UsuarioOnline.class;		
	}


}