package clases;
import java.io.Serializable;
/*
import java.util.HashSet;
import java.util.Set;
*/
import javax.persistence.*;

@Entity
 

public class Usuario implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue
	@Column(name="idUsuario")
	private int idUsuario;
	
	private Integer rol;
	private String usuario;
	private String clave;
	private Integer dni;
	private String email;
	private String estado="Habilitado";
	

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}


	public int getId() {
		return idUsuario;
	}

	public void setId(int i) {
		this.idUsuario = i;
	}

	
	public Usuario() {
		super();
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
