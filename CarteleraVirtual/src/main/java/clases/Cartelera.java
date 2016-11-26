package clases;
import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="cartelera")

public class Cartelera implements Serializable{
	
	private static final long serialVersionUID = 1L;

	
	@Column(name="idCartelera")
	@Id @GeneratedValue
	private Long id;
	private boolean comentarios;

	@Column(name="nombre")
	private String nombreCartelera;
	
	@OneToMany
	private Set<Publicacion> publicaciones;
	
	private Cartelera [ ] carteleras;
	public Cartelera() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
	public boolean getComentarios(){
		return comentarios;
	}
	public void setComentarios(boolean coment){
		comentarios = coment;
	}
	public Cartelera[] getCarteleras() {
		return carteleras;
	}

	public void setCarteleras(Cartelera[] carteleras) {
		this.carteleras = carteleras;
	}

	public String getNombreCartelera() {
		return nombreCartelera;
	}

	public void setNombreCartelera(String nombreCartelera) {
		this.nombreCartelera = nombreCartelera;
	}

	public Set<Publicacion> getPublicaciones() {
		return publicaciones;
	}

	public void setPublicaciones(Set<Publicacion> publicaciones) {
		this.publicaciones = publicaciones;
	}
}
