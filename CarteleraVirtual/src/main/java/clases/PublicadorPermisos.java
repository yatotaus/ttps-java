package clases;
import javax.persistence.*;

@Entity
 
public class PublicadorPermisos extends Usuario{

	public PublicadorPermisos(String usuario, String clave, Integer rol) {
		super(usuario, clave, rol);
	}

	public PublicadorPermisos() {
		super();
	}

	public void publicar(){
		
	}

}
