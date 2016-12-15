package Daos;

public class FactoryDAO {

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
	
	public ComentarioDAO getComentarioDAO(){
		return new ComentarioDAO();
	}
}
