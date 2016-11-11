package clases;

public class Cartelera {
	
	private Publicacion [ ] publicaciones;
	private String nombreCartelera;
	private Cartelera [ ] carteleras;
	private Long id;
	public Cartelera() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Publicacion[] getPublicaciones() {
		return publicaciones;
	}

	public void setPublicaciones(Publicacion[] publicaciones) {
		this.publicaciones = publicaciones;
	}
}
