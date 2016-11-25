package clases;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="Publicacion")
 

public class Publicacion {
	@Id @GeneratedValue
	private Long id;
	
	
	private String nombrePublicacion;
	
	@OneToOne
	private Usuario autor;
	
	@ManyToMany
	private Set<Comentario> comentarios;
	private boolean comentariosHab;
	public Publicacion() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public boolean isComentariosHab() {
		return comentariosHab;
	}

	public void setComentariosHab(boolean comentariosHab) {
		this.comentariosHab = comentariosHab;
	}

	public Set<Comentario> getComentarios() {
		return comentarios;
	}

	public void setComentarios(Set<Comentario> comentarios) {
		this.comentarios = comentarios;
	}

	public String getNombrePublicacion() {
		return nombrePublicacion;
	}
	
	public void setNombrePublicacion(String nombrePublicacion) {
		this.nombrePublicacion = nombrePublicacion;
	}
	
	public Usuario getAutor() {
		return autor;
	}
	
	public void setAutor(Usuario autor) {
		this.autor = autor;
	}

}
