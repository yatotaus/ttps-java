package Daos;

import Daos.CarteleraDAO;
/*
 * import clasesDAO.ComponenteDAO;

import clasesDAOHiberJPA.ComponenteDAOHiberJPA;
*/

public class FactoryDAO {
	//private static ComponenteDAOHiberJPA componenteDAOHiberJPA = new ComponenteDAOHiberJPA();
	private static 
	
	/*
	public static ComponenteDAO getComponenteDAO(){
		return componenteDAOHiberJPA;
	}
	*/
	

	public ComentarioDAO getUsuariosOnlineDAO(){
		return new ComentarioDAO();
	}
	
	public AdminDAO getUsuarioAdminDAO(){
		return new AdminDAO();
	}
	
	public CarteleraDAO getCarteleraDAO(){
		return new CarteleraDAO();
	}
	
	public MisCartelerasDAO getMisCartelerasDAO(){
		return new MisCartelerasDAO();
	}
	
	public PublicacionDAO getPublicacionDAO(){
		return new PublicacionDAO();
	}
	
	public UsuarioDAO getUsuarioDAO(){
		return new UsuarioDAO();
	}
}
