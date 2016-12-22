package clasesDAOHiberJPA;

import Daos.AdminDAO;
import clases.Admin;

public class AdminDAOHiberJPA extends GenericoDAOHibernateJPA<Admin> implements AdminDAO {

		public AdminDAOHiberJPA() {
			this.persistentClass = Admin.class;		
		}
}