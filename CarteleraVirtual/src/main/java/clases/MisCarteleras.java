package clases;
import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="MENSAJES")
 

public class MisCarteleras implements Serializable{
	@Id @GeneratedValue
	
	@OneToOne
	private Usuario dueño;
	
	@ManyToMany
	private Set<Cartelera> carteleras;
	private Long id;
	
	public MisCarteleras() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Usuario getDueño() {
		return dueño;
	}
	
	public void setDueño(Usuario dueño) {
		this.dueño = dueño;
	}
	
	public Set<Cartelera> getCarteleras() {
		return carteleras;
	}
	
	public void setCarteleras(Set<Cartelera> carteleras) {
		this.carteleras = carteleras;
	}
	
}
