package clases;

public class Comentario {
	
	private Usuario autorComentario;
	private String texto;
	private Comentario [ ] respuestas;
	private Long id;
	
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
	
	public Comentario[] getRespuestas() {
		return respuestas;
	}
	
	public void setRespuestas(Comentario[] respuestas) {
		this.respuestas = respuestas;
	}
	
	public Usuario getAutorComentario() {
		return autorComentario;
	}
	
	public void setAutorComentario(Usuario autorComentario) {
		this.autorComentario = autorComentario;
	}
}
