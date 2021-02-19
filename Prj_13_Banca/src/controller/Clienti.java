package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Clienti
 */
@WebServlet("/Clienti")
public class Clienti extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private ClienteCtrl controller;   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Clienti() {
        super();
        this.controller = new ClienteCtrl();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		this.controller.addCliente("mauro");
		this.controller.addCliente("allen");
		this.controller.addCliente("giuliana");
		
		request.setAttribute("clienti", this.controller.getAnagraficaClienti());
		request.getRequestDispatcher("elenco_clienti.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
