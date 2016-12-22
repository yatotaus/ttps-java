package clases;
import java.io.Serializable;
//import java.sql.Date;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="Cometario")
 

public class Comentario implements Serializable {

	//Mapeo terminado??? Creo que si
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue
	private int id;


	@OneToOne
	private Usuario autorComentario;
	private String texto;
	
	
	@OneToMany
	@JoinColumn(name="Comentario")
	private Set<Comentario> respuestas;
	private String estado="Habilitado";
	
	
	@OneToOne(optional=true)
	private Comentario respondeA;
	
	
	public void agregarRespuesta(Comentario respuesta){
		respuestas.add(respuesta);
	}
	
	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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