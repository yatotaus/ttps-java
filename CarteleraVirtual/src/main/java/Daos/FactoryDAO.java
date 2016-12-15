package Daos;

import Daos.CarteleraDAO;
import Daos.UsuarioDAO;
import Daos.AdminDAO;
import Daos.ComentarioDAO;
import Daos.MisCartelerasDAO;
import Daos.PublicacionDAO;

import clasesDAOHiberJPA.CarteleraDAOHiberJPA;
import clasesDAOHiberJPA.UsuarioDAOHiberJPA;
import clasesDAOHiberJPA.AdminDAOHiberJPA;
import clasesDAOHiberJPA.ComentarioDAOHiberJPA;
import clasesDAOHiberJPA.MisCartelerasDAOHiberJPA;
import clasesDAOHiberJPA.PublicacionDAOHiberJPA;


public class FactoryDAO {
	
	private static CarteleraDAOHiberJPA carteleraDAOHiberJPA = new CarteleraDAOHiberJPA();  
	private static UsuarioDAOHiberJPA usuarioDAOHiberJPA = new UsuarioDAOHiberJPA();
	private static AdminDAOHiberJPA adminDAOHiberJPA = new AdminDAOHiberJPA();
	private static ComentarioDAOHiberJPA comentarioDAOHiberJPA = new ComentarioDAOHiberJPA();
	private static MisCartelerasDAOHiberJPA miscartelerasDAOHiberJPA = new MisCartelerasDAOHiberJPA();
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
	
	public MisCartelerasDAO getMisCartelerasDAO(){
		return (MisCartelerasDAO) miscartelerasDAOHiberJPA;
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
