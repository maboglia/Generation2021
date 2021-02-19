package presentation;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dal.LibroDAO;
import entities.Libro;

/**
 * Servlet implementation class Libri
 */
@WebServlet("/libri")
public class Libri extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private LibroDAO ld;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Libri() {
		// inizializzo il librodao
		ld = new LibroDAO();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.getRequestDispatcher("header.jsp").include(request, response);

		if (request.getParameter("id") != null) {
			int id = Integer.parseInt(request.getParameter("id"));
			Libro libro = null;
			try {
				libro = ld.getLibro(id);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			request.setAttribute("libro", libro);
			request.getRequestDispatcher("updateLibro.jsp").include(request, response);

		} else {
			Map<Integer, Libro> libri = null;
			try {
				libri = ld.getLibri();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			request.setAttribute("libri", libri);
			request.getRequestDispatcher("libri.jsp").include(request, response);
			// response.getWriter().append(libri.toString());
		}

		request.getRequestDispatcher("footer.jsp").include(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		if (request.getParameter("update") != null) {

			String titolo = request.getParameter("titolo");
			int pagine = Integer.parseInt(request.getParameter("pagine"));
			double prezzo = Double.parseDouble(request.getParameter("prezzo"));
			double p_iva = Double.parseDouble(request.getParameter("p_iva"));
			int editore_id = Integer.parseInt(request.getParameter("editore_id"));
			int id = Integer.parseInt(request.getParameter("id"));
			
			Libro l = new Libro();

			l.setId(id);
			l.setTitolo(titolo);
			l.setPagine(pagine);
			l.setPrezzo(prezzo);
			l.setP_iva(p_iva);
			l.setEditore_id(editore_id);
			
			try {
				ld.updateLibro(l);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		} else	if (request.getParameter("titolo") != null) {
			String titolo = request.getParameter("titolo");
			int pagine = Integer.parseInt(request.getParameter("pagine"));
			double prezzo = Double.parseDouble(request.getParameter("prezzo"));
			double p_iva = Double.parseDouble(request.getParameter("p_iva"));
			int editore_id = Integer.parseInt(request.getParameter("editore_id"));

			Libro l = new Libro();

			l.setTitolo(titolo);
			l.setPagine(pagine);
			l.setPrezzo(prezzo);
			l.setP_iva(p_iva);
			l.setEditore_id(editore_id);
			try {
				ld.addLibro(l);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		doGet(request, response);
	}

}
