package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.DoniDAO;
import model.Dono;

/**
 * Servlet implementation class DoniCtrl
 */
@WebServlet("/doni")
public class DoniCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private DoniDAO doni;   

    public DoniCtrl() {
        doni = new DoniDAO();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("doni", doni.getRegali());
		
		request.getRequestDispatcher("header.jsp").include(request, response);
		
		request.getRequestDispatcher("lista_prova.jsp").include(request, response);
		
		request.getRequestDispatcher("footer.jsp").include(request, response);

		
		//request.getRequestDispatcher("lista_doni.jsp").forward(request, response);
	}

}
