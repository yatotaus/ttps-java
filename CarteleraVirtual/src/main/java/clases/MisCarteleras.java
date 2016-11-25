package clases;
import javax.persistence.*;

@Entity
@Table(name="MENSAJES")
 

public class MisCarteleras {
	@Id @GeneratedValue
	private Usuario dueño;
	private Cartelera [ ] carteleras;
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
	
	public Cartelera[] getCarteleras() {
		return carteleras;
	}
	
	public void setCarteleras(Cartelera[] carteleras) {
		this.carteleras = carteleras;
	}
	
}
