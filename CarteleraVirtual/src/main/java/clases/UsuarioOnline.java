package clases;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.ManyToMany;
import javax.persistence.Entity;
/*
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
*/

@Entity
 
public class UsuarioOnline extends Usuario {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UsuarioOnline(String usuario, String clave, Integer rol) {
		super(usuario, clave, rol);
	}
	
	public UsuarioOnline() {
		super();
	}

	public void suscribirCartelera(Cartelera car){
		
	}
	
	@ManyToMany
	private Set<Cartelera> carteleras =  new HashSet<Cartelera>();
	
	public Set<Cartelera> getCarteleras() {
		return carteleras;
	}

	public void setCarteleras(Set<Cartelera> carteleras) {
		this.carteleras = carteleras;
	}

}