package clases;

public class Comentario {
	
	private Usuario autorComentario;
	private String texto;
	private Comentario [ ] respuestas;
	
	public String getTexto() {
		return texto;
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
