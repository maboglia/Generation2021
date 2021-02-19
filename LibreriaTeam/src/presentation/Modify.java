package presentation;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class Modify
 */
@WebServlet("/modify")
public class Modify extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Modify() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fName = request.getParameter("NAME");
		String lName = request.getParameter("LASTNAME");
		String nMatricola = request.getParameter("NMATRICOLA");
		String payHour = request.getParameter("PAYHOUR");
		String position = request.getParameter("POSITION");
		String tableOld = request.getParameter("pImported");
		String tableOld2 = (String) request.getAttribute("pImported");
		System.out.println(tableOld + tableOld2);
		String table = position;
	
		
		request.setAttribute("a", fName);
		request.setAttribute("b", lName);
		request.setAttribute("c", nMatricola);
		request.setAttribute("d", payHour);
		request.setAttribute("j", position);
		
		request.getRequestDispatcher("test.jsp").forward(request, response);
		
		
		
		
		
		
	}

	/**
	 * @param position
	 * @param con
	 * @throws SQLException
	 */
	private void methUpdate(Connection con,String table,String att,String propri) throws SQLException {
		PreparedStatement prep = con.prepareStatement(
			      "UPDATE " + table + " SET " + att + " = ? WHERE " + propri + "= ?");
			    prep.setString(1, att);
			    prep.executeUpdate();
			    prep.close();
	}

}
