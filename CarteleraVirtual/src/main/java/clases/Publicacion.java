package clases;
import javax.persistence.*;

@Entity
@Table(name="MENSAJES")
 

public class Publicacion {
	@Id @GeneratedValue
	 @Column(name="MENSAJE_ID")	
	private String nombrePublicacion;
	private Usuario autor;
	private Comentario [ ] comentarios;
	private boolean comentariosHab;
	private Long id;
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

	public Comentario[] getComentarios() {
		return comentarios;
	}

	public void setComentarios(Comentario[] comentarios) {
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
