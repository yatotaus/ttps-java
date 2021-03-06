package clases;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class PublicadorPermisos extends Usuario{

	private static final long serialVersionUID = 1L;
	
	@ManyToMany
	private Set<Cartelera> carteleras =  new HashSet<Cartelera>();

	public PublicadorPermisos(String usuario, String clave, Integer rol) {
		super(usuario, clave, rol);
	}
	
	public Set<Cartelera> getCarteleras() {
		return carteleras;
	}

	public void setCarteleras(Set<Cartelera> carteleras) {
		this.carteleras = carteleras;
	}

	public PublicadorPermisos() {
		super();
	}

	public void publicar(){
		
	}

}