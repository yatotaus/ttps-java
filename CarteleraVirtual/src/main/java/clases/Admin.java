package clases;
import javax.persistence.*;

 
@Entity
public class Admin extends Usuario{
	

	private static final long serialVersionUID = 1L;

	public Admin(String usuario, String clave, Integer rol) {
		super(usuario, clave, rol);
	}

	public void agregarCartelera(Cartelera car){
		
	}
	
	public Admin() {
		super();
	}

}
