package TestPersistencia;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Daos.CarteleraDAO;
import Daos.FactoryDAO;
import Daos.PublicacionDAO;
import Daos.UsuarioDAO;
import clases.Cartelera;
import clases.Publicacion;
import clases.Rol;
import clases.Usuario;

@WebServlet("/TestCartelera")
public class TestCartelera extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private FactoryDAO fd = new FactoryDAO();
       

    public TestCartelera() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Publicacion publicacion = new Publicacion();
		Publicacion p = new Publicacion();
		
		Cartelera cartelera = new Cartelera();
		
		CarteleraDAO carteleraDao =fd.getCarteleraDAO();
		PublicacionDAO publiDAO = fd.getPublicacionDAO();
		UsuarioDAO userDao = fd.getUsuarioDAO();

		Usuario user = new Usuario();
		
		user.setEmail("Este usuario se persistirá 2 veces??");
		publicacion.setAutor(user);
		p.setAutor(user);
		publicacion.setNombrePublicacion("Esta sería la primer publicacion persistida automaticamente");
		p.setNombrePublicacion("Segunda publicacion persistida automaticamente");
		
		userDao.agregar(user);
		cartelera.setNombreCartelera("Cartelera con persistencia automática");
		cartelera.agregarPublicacion(p);
		cartelera.agregarPublicacion(publicacion);

		carteleraDao.agregar(cartelera);
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
