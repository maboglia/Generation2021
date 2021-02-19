package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// TODO: collegare alla vista di login in jsp
		//redirezione-> vado a finire sula pagina login.html e lo vedo nella barra delle url
		//response.sendRedirect("login.html");
		//
		request.getRequestDispatcher("login.html").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO: leggere i parametri inviati dall'utente e confrontare con user e pw
		String user = "admin";
		String passw = "12345";

		if (request.getParameter("username") != null && request.getParameter("password") != null) {

			if (request.getParameter("username").equals(user) && request.getParameter("password").equals(passw)) {
				response.getWriter().append("okkkeeeeiiiii!");
				
				request.getSession().setAttribute("logged", user);
				
				System.out.println("utente loggato");
			} else {
				System.out.println("NON loggato");
			}

		}

	}

}
