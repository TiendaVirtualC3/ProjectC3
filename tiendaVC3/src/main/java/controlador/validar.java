package controlador;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modelo.usuario;
import modelo.usuarioDAO;

/**
 * Servlet implementation class validar
 */
public class validar extends HttpServlet {
	
	usuarioDAO uDAO = new usuarioDAO();
	usuario us = new usuario();
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public validar() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String accion = request.getParameter("accion");
		if(accion.equalsIgnoreCase("ingresar")) {
			String usuario = request.getParameter("txtuser");
			String pass = request.getParameter("txtpass");
			us=uDAO.validar(usuario, pass);
			if(us.getUsuario()!=null) {
				request.setAttribute("usuario", us);
				request.getRequestDispatcher("controlador?menu=principal").forward(request, response);
				System.out.println("conexion YES2");
				
			}else {
				request.getRequestDispatcher("index.jsp").forward(request, response);
			}
		}
		
		else {
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
		doGet(request, response);
	}

}
