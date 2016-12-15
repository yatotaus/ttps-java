package clasesDAOHiberJPA;

import Daos.ComentarioDAO;
import clases.Comentario;

public class ComentarioDAOHiberJPA extends GenericoDAOHibernateJPA<Comentario> implements ComentarioDAO {

	public ComentarioDAOHiberJPA() {
		this.persistentClass = Comentario.class;		
	}

}