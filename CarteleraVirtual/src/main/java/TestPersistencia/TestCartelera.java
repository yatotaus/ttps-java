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

		publicacion.setNombrePublicacion("Bienvenidos a la cartelera virtual");
		p.setNombrePublicacion("Esta es una publicacion");
		
		cartelera.setNombreCartelera("Cartelera antes de irme");
		cartelera.agregarPublicacion(p);

		carteleraDao.agregar(cartelera);
		
		//publiDAO.agregar(publicacion);
		//publiDAO.agregar(p);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
