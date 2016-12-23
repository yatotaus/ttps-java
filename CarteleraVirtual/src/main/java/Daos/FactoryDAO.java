package Daos;

import Daos.*;
import clasesDAOHiberJPA.*;

public class FactoryDAO {
	
	private static CarteleraDAOHiberJPA carteleraDAOHiberJPA = new CarteleraDAOHiberJPA();  
	private static UsuarioDAOHiberJPA usuarioDAOHiberJPA = new UsuarioDAOHiberJPA();
	private static AdminDAOHiberJPA adminDAOHiberJPA = new AdminDAOHiberJPA();
	private static ComentarioDAOHiberJPA comentarioDAOHiberJPA = new ComentarioDAOHiberJPA();
	private static PublicacionDAOHiberJPA publicacionDAOHiberJPA = new PublicacionDAOHiberJPA();
	
	public FactoryDAO() {		
	}
	
	public ComentarioDAO getUsuariosOnlineDAO(){
		return (ComentarioDAO) comentarioDAOHiberJPA;
	}
	
	public AdminDAO getUsuarioAdminDAO(){
		return (AdminDAO) adminDAOHiberJPA;
	}
	
	public static CarteleraDAO getCarteleraDAO(){
		return (CarteleraDAO) carteleraDAOHiberJPA;
	}
	
	
	public PublicacionDAO getPublicacionDAO(){
		return (PublicacionDAO) publicacionDAOHiberJPA;
	}
	
	public static UsuarioDAO getUsuarioDAO(){
		return (UsuarioDAO) usuarioDAOHiberJPA;
	}
	
	public ComentarioDAO getComentarioDAO(){
		return (ComentarioDAO) comentarioDAOHiberJPA;
	}
}
