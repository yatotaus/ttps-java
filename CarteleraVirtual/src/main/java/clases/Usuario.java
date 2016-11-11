package clases;
import javax.persistence.*;

@Entity
@Table(name="MENSAJES")
 

public class Usuario {
	@Id @GeneratedValue
	 @Column(name="MENSAJE_ID")	
	private String usuario;
	private String clave;
	private Integer rol;
	private Integer dni;
	private String email;
	private MisCarteleras misCarteleras;
	private Long id;
	
	public Usuario() {
		super();
	}

	public MisCarteleras getMiTemplate() {
		return misCarteleras;
	}

	public void setMiTemplate(MisCarteleras miTemplate) {
		this.misCarteleras = miTemplate;
	}

	public Usuario(String usuario, String clave,Integer rol) {
		super();
		this.usuario = usuario;
		this.clave = clave;
		this.rol = rol;
	}
	
	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}

	public Integer getRol() {
		return rol;
	}

	public void setRol(Integer rol) {
		this.rol = rol;
	}
}
