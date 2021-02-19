package view;

import java.sql.SQLException;

import db.LibroDAO;
import model.Libro;

public class LibroDAODemo {

	public static void main(String[] args) {
		LibroDAO ld = new LibroDAO();

		Libro l2 = ld.getLibro(3);
		l2.setTitolo("Dieci piccoli indiani");
		try {
			ld.updateLibro(l2);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (Libro l : ld.getLibri()) {
			System.out.println(l.getTitolo());

		}

	}

}
