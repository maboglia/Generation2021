package presentation;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dal.EditoreDAO;
import entities.Editore;

/**
 * Servlet implementation class Libri
 */
@WebServlet("/editori")
public class Editori extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EditoreDAO ed;   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Editori() {
        //inizializzo il librodao
    	ed = new EditoreDAO();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("header.jsp").include(request, response);

		if(request.getParameter("id")!=null) {			
			int id = Integer.parseInt(request.getParameter("id"));
			Editore e;
			try {
				e = ed.getEditore(id);
				response.getWriter().append(e.toString());
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			} else {
			List<Editore> editori;
			try {
				editori = ed.getEditori();
				request.setAttribute("editori", editori);
				request.getRequestDispatcher("editori.jsp").include(request, response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//response.getWriter().append(libri.toString());
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
