package clases;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="cartelera")

public class Cartelera implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@OneToMany(cascade=CascadeType.ALL)
	private Set<Publicacion> publicaciones = new HashSet<Publicacion>();
	
	private Cartelera [ ] carteleras;

	@Id @GeneratedValue
	@Column(name="idCartelera")
	private int id;
	
	private boolean comentarios;

	@ManyToMany
	private Set<UsuarioOnline> suscriptores = new HashSet<UsuarioOnline>();
	
	@ManyToMany
	private Set<PublicadorPermisos> participantes  = new HashSet<PublicadorPermisos>();
	
	public void agregarSuscriptores(UsuarioOnline u){
		suscriptores.add(u);
	}
	
	public void agregarParticipantes(PublicadorPermisos u){
		participantes.add(u);
	}
	
	public Set<UsuarioOnline> getSuscriptores() {
		return suscriptores;
	}







	public void setSuscriptores(Set<UsuarioOnline> suscriptores) {
		this.suscriptores = suscriptores;
	}







	public Set<PublicadorPermisos> getParticipantes() {
		return participantes;
	}







	public void setParticipantes(Set<PublicadorPermisos> participantes) {
		this.participantes = participantes;
	}

	@Column(name="nombre")
	private String nombreCartelera;
	
	private String estado="Hablitado";
	
	
	public Cartelera() {
		super();
	}

	
	
	
	
	
	
	public void agregarPublicacion(Publicacion p){
		publicaciones.add(p);
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
