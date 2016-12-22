package clases;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
/*
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
*/
import javax.persistence.ManyToMany;

@Entity
 
public class UsuarioOnline extends Usuario {
	
	private static final long serialVersionUID = 1L;
	
	@ManyToMany(cascade={CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REFRESH})
	private Set<Cartelera> carteleras =  new HashSet<Cartelera>();

	public UsuarioOnline(String usuario, String clave, Integer rol) {
		super(usuario, clave, rol);
	}
	
	public UsuarioOnline() {
		super();
	}

	public void suscribirCartelera(Cartelera car){
		
	}
	
	
	public Set<Cartelera> getCarteleras() {
		return carteleras;
	}

	public void setCarteleras(Set<Cartelera> carteleras) {
		this.carteleras = carteleras;
	}


}
