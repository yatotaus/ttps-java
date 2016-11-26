package clases;
import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="Usuario")
 

public class Usuario implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue
	@Column(name="idUsuario")
	private int id;
	
	private String usuario;
	
	private String clave;
	private Integer rol;
	private Integer dni;
	private String email;
	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public MisCarteleras getMisCarteleras() {
		return misCarteleras;
	}

	public void setMisCarteleras(MisCarteleras misCarteleras) {
		this.misCarteleras = misCarteleras;
	}

	public int getId() {
		return id;
	}

	public void setId(int i) {
		this.id = i;
	}

	private String estado="Habilitado";
	
		
	@OneToOne(mappedBy="dueño")
	private MisCarteleras misCarteleras;
	
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
