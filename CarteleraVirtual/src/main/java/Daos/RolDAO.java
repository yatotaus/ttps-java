package Daos;

import clases.*;

public class RolDAO<T> extends GenericoDAOHibernateJPA<T>{

	public Rol buscar(int idRol){
		
		return new Rol();
	}
	
	public Rol buscar(String nombre){
		Rol r = new Rol();
		r.setNombre(nombre);
		this.agregar(r);
		return r;
		
	}
	
}
