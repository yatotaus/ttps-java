package clases;
import javax.persistence.*;

@Entity
@Table(name="MENSAJES")
 
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
