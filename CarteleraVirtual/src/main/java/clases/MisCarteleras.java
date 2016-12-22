package clases;
import java.io.Serializable;
import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name="MisCarteleras")
 

public class MisCarteleras implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue
	@Column(name="idMisCarteleras")
	private int id;

	
	@OneToOne
	private Usuario dueño;
	
	@ManyToMany
	private Set<Cartelera> carteleras;
	
	private String estado="Habilitado";
	
	
	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public MisCarteleras() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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