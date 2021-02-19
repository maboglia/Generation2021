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
@WebServlet("/dipendentiMVC")
public class DipendentiViewCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LibroMatricola lm = new LibroMatricola();
		
		for (Dipendente dipendente : Dipendenti.elenco) {
			lm.addDipendente(dipendente);
		}
		
		if (request.getParameter("id")!=null) {
			int i = 0;
			Dipendente dipendente = null;
			
			try {
				i = Integer.parseInt(request.getParameter("id"));
				dipendente = lm.getDipendenti().get(i);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
			
			if (dipendente != null) {
			
				//devo mostrare un solo dip
				request.setAttribute("dipendente", dipendente);
				request.getRequestDispatcher("scheda_dipendente.jsp").forward(request, response);
			} else {
				//devo mostrare nessun dip
				request.getRequestDispatcher("nessuno.jsp").forward(request, response);
			}
			
			
		} else {
			//devo mostrare tutti i dipp
			request.setAttribute("dipendenti", lm.getDipendenti());
			request.getRequestDispatcher("lista.jsp").forward(request, response);
		}
		
		
	}

}
