package clases;
import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="Rol")

public class Rol implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue
	@Column(name="idCartelera")
	private int id;
	
	private String nombre;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
