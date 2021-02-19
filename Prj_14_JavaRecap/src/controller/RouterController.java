package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RouterController
 */
@WebServlet("/router")
public class RouterController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if (   request.getParameter("nota") != null ) {
			response.getWriter().append("<h1>Ciao " + request.getParameter("nota") +"! Sono il router.</h1>");
		} else {
			
			response.getWriter().append("<h1>Ciao! Sono il router.</h1>");
		}
		
		//response.setContentType("text/html");
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (   request.getParameter("nota") != null && request.getParameter("nota").equals("pippo") ) {
			
			request.setAttribute("autorizzato", "YES");
			request.getRequestDispatcher("riservata.jsp").include(request, response);
			
			//response.getWriter().append("<h1>Ciao " + request.getParameter("nota") +"! Sono il router.</h1>");
		} else {
			request.getRequestDispatcher("nonpuoientrare.html").forward(request, response);
			
//			response.getWriter().append("<h1>Ciao! Sono il router.</h1>");
		}
	}

	
	
	
}
