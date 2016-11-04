package clases;

public class Publicacion {
	
	private String nombrePublicacion;
	private Usuario autor;
	private Comentario [ ] comentarios;
	private boolean comentariosHab;
	
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
