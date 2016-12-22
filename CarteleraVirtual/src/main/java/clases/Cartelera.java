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
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinTable(name = "SubCarteleras",
	joinColumns = @JoinColumn(name = "idCarteleraPadre"),
	inverseJoinColumns = @JoinColumn(name="idCarteleraHija") )
	private Set<Cartelera> carteleras = new HashSet<Cartelera>();

	@Column(name="nombre")
	private String nombreCartelera;
	
	private String estado="Hablitado";
	

	@Id @GeneratedValue
	@Column(name="idCartelera")
	private int id;
	
	private boolean comentarios;

	@ManyToMany
	private Set<Usuario> participantes = new HashSet<Usuario>();
	
	
	public void agregarSuscriptores(Usuario u){
		participantes.add(u);
	}
	
	
	public Set<Usuario> getSuscriptores() {
		return participantes;
	}

	public void setSuscriptores(Set<Usuario> suscriptores) {
		this.participantes = suscriptores;
	}

	
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
	public Set<Cartelera> getCarteleras() {
		return carteleras;
	}

	public void setCarteleras(Set<Cartelera> carteleras) {
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


	public void agregarCartelera(Cartelera cartelera) {
		carteleras.add(cartelera);
		
	}
}