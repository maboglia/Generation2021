package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.Dipendenti;
import model.Dipendente;

/**
 * Servlet implementation class DipendentiCtrl
 */
@WebServlet("/dipendenti")
public class DipendentiCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LibroMatricola lm = new LibroMatricola();
		
		for (Dipendente dipendente : Dipendenti.elenco) {
			lm.addDipendente(dipendente);
		}
		
		
		response.getWriter().append(lm.getDipendenti().get(0).toString());
	}

}
