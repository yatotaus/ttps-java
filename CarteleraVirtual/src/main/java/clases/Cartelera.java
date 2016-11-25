package clases;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="cartelera")
public class Cartelera {
	@Id @GeneratedValue
	 @Column(name="idCartelera")
	private Long id;

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
	
	private boolean comentarios;
	
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
