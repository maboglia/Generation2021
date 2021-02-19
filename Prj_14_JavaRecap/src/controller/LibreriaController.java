package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Libro;
import model.Scaffale;

/**
 * Servlet implementation class LibreriaController
 */
@WebServlet("/librerie")
public class LibreriaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LibreriaController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Libro l2 = new Libro("CABONI CRISTINA", "IL GIARDINO DEI FIORI SEGRETI");
		Libro l3 = new Libro("HARRIS JOANNE", "CHOCOLAT");
		Libro l4 = new Libro("MCGUIRE JAMIE", "UN DISASTRO PERFETTO");
		Libro l5 = new Libro("DALAI LAMA", "RIBELLATEVI!");
		Libro l6 = new Libro("SCERBANENCO GIORGIO", "LA SABBIA NON RICORDA");
		Libro l7 = new Libro("BOSCO FEDERICA", "CI VEDIAMO UN GIORNO DI QUESTI");
		Libro l8 = new Libro("CABONI CRISTINA", "LA RILEGATRICE DI STORIE PERDUTE");
		Libro l9 = new Libro("SANCHEZ CLARA", "LA FORZA IMPREVEDIBILE DELLE PAROLE");
		Libro l10 = new Libro("LUCAS CHARLOTTE", "IL TUO ANNO PERFETTO INIZIA DA QUI");
		Libro l11 = new Libro("MECHELLI ARIANNA", "IL TUO PERICOLOSO SORRISO");

		Libro[] libriArray = {l2, l3, l5, l7, l9};
		ArrayList<Libro> libri = new ArrayList<>(Arrays.asList(libriArray));
		
		
		Scaffale scaf1 = new Scaffale("S1");
		Scaffale scaf2 = new Scaffale("S2", libri);
		
		ScaffaleCtrl controller1 = new ScaffaleCtrl(scaf1);
		ScaffaleCtrl controller2 = new ScaffaleCtrl(scaf2);
		
		controller1.addLibro(l4);
		controller1.addLibro(l6);
		controller1.addLibro(l8);
		controller1.addLibro(l10);		
		
		if (request.getParameter("scaffale")!=null) {
			
			String s = request.getParameter("scaffale");
			request.setAttribute("libreriaRichiesta", s);
			request.setAttribute("libri", controller1.getAll());
		} else {
			request.setAttribute("libri", controller2.getAll());
			
		}
		
		request.getRequestDispatcher("libreria.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
