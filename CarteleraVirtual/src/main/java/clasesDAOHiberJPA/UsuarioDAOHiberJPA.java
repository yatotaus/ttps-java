package clasesDAOHiberJPA;

import Daos.UsuarioDAO;
import clases.Usuario;

public class UsuarioDAOHiberJPA extends GenericoDAOHibernateJPA<Usuario> implements UsuarioDAO {

	public UsuarioDAOHiberJPA() {
		this.persistentClass = Usuario.class;		
	}

}