package clases;
import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="Cometario")
 

public class Comentario implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue
	

	@OneToOne
	private Usuario autorComentario;
	private String texto;
	
	@OneToMany
	@JoinColumn(name="Comentario")
	private Set<Comentario> respuestas;
	private Long id;
	
	private String estado="Habilitado";
	
	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTexto() {
		return texto;
	}
	
	public Comentario() {
		super();
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	public Set<Comentario> getRespuestas() {
		return respuestas;
	}
	
	public void setRespuestas(Set<Comentario> respuestas) {
		this.respuestas = respuestas;
	}
	
	public Usuario getAutorComentario() {
		return autorComentario;
	}
	
	public void setAutorComentario(Usuario autorComentario) {
		this.autorComentario = autorComentario;
	}
}
