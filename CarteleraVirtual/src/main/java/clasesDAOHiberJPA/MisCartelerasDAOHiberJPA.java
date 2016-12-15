package clasesDAOHiberJPA;

import Daos.MisCartelerasDAO;
import clases.MisCarteleras;

public class MisCartelerasDAOHiberJPA extends GenericoDAOHibernateJPA<MisCarteleras> implements MisCartelerasDAO {

	public MisCartelerasDAOHiberJPA() {
		this.persistentClass = MisCarteleras.class;		
	}


}
