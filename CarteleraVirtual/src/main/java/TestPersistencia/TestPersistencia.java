package TestPersistencia;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Daos.CarteleraDAO;
import Daos.ComentarioDAO;
import Daos.FactoryDAO;
/*
import Daos.PublicacionDAO;
import Daos.UsuarioDAO;
*/
import clases.*;

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
		Cartelera hija1 = new Cartelera();
		Cartelera hija2 = new Cartelera();
		
		hija1.setNombreCartelera("1° Año");
		hija2.setNombreCartelera("Organización de computadoras");
		
		CarteleraDAO carteleraDao = FactoryDAO.getCarteleraDAO();
		/*
		 * PublicacionDAO publiDAO = fd.getPublicacionDAO();
		 * UsuarioDAO userDao = fd.getUsuarioDAO();
		 */
		ComentarioDAO comentDAO = fd.getComentarioDAO();

		UsuarioOnline user = new UsuarioOnline();
		PublicadorPermisos docente = new PublicadorPermisos();
		Comentario coment = new Comentario();
		Comentario com = new Comentario();
		Comentario comm = new Comentario();
		Comentario comBorrado = new Comentario();
		
		coment.setTexto("Cuando suben las notas de la la segunda fecha??");
		coment.setAutorComentario(user);		
		user.setEmail("Usuario online");
		docente.setEmail("Docente que publica en cartelera");
		publicacion.setAutor(docente);
		p.setAutor(user);
		publicacion.setNombrePublicacion("Esta es una publicacion en la cartelera nueva con un suscriptor y un docente publicador ");
		p.setNombrePublicacion("Otra publicación de la cartelera con suscriptores");
		p.agregarComentario(coment);
		cartelera.setNombreCartelera("Cartelera académica");
		cartelera.agregarPublicacion(p);
		cartelera.agregarPublicacion(publicacion);
		cartelera.agregarCartelera(hija1);
		hija1.agregarCartelera(hija2);
		
		cartelera.agregarSuscriptores(docente);
		cartelera.agregarSuscriptores(user);

		carteleraDao.agregar(cartelera);
		
		com.setTexto("Comentario que queda");

	
		comm.setTexto("Quedate comentario");
		comBorrado.setTexto("Comentario que se borra");
		
		comentDAO.agregar(com);
		comentDAO.agregar(comm);
		comentDAO.agregar(comBorrado);
		comentDAO.eliminar(comBorrado);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}