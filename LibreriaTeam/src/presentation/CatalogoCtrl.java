package presentation;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dal.CatalogoDAO;
import entities.Catalogo;

/**
 * Servlet implementation class LAE
 */
@WebServlet("/catalogo")
public class CatalogoCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CatalogoDAO cd;  
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CatalogoCtrl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("header.jsp").include(request, response);
		ArrayList<Catalogo> catalogo = new ArrayList<>();
		try {
			
			CatalogoDAO ald = new CatalogoDAO();
			for (Catalogo al : ald.getAL()) {
				catalogo.add(al);
			}
			request.setAttribute("catalogo", catalogo);
			request.getRequestDispatcher("catalogo.jsp").include(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.getRequestDispatcher("footer.jsp").include(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
