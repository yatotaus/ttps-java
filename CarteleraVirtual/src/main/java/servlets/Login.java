package servlets;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Daos.CarteleraDAO;
import clases.*;


@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Login() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String usu, pass;
		usu = request.getParameter("dni");
        pass = request.getParameter("password");
		/* carga para ejemplo, maqueta*/
        HashMap<String,Usuario> usuarios = new HashMap<String,Usuario>();
        Usuario[] arregloUsuarios =
    		{new Admin("1", "1234",1),
    		new PublicadorPermisos("2", "1234",2),
    		new UsuarioOnline("3", "1234",3),
    		new UsuarioOnline("4", "1234",0)};
    	for (Usuario usur: arregloUsuarios)
    		usuarios.put(usur.getUsuario(), usur);
    	
        String url=request.getContextPath() + "/default/login.jsp";
        Usuario usuario = usuarios.get(usu);
        HttpSession sesion = request.getSession();
		if (usuario != null){
			if(usuario.getClave().equals(pass) ){
				sesion.setAttribute("usuario",usuario.getUsuario());
				sesion.setAttribute("rol",usuario.getRol());
				sesion.setAttribute("error", null);
				/*se que es feo es solo para la maqueta*/
				if(usuario.getRol() < 2)
					url=request.getContextPath() + "/admin/administracion.jsp";
				else
					url=request.getContextPath() + "/cartelera.jsp";
			}
			else
				sesion.setAttribute("error", "contraseña incorrecta");
		}
		else
			sesion.setAttribute("error", "Usuario no encontrado");
	
		response.sendRedirect(url);
	}

}
