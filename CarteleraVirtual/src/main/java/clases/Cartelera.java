package clases;

public class Cartelera {
	
	private Publicacion [ ] publicaciones;
	private String nombreCartelera;
	private Cartelera [ ] carteleras;
	
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
