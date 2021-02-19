package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import entities.Libro;

public class LibroDAO implements LibroIDAO {

	private Connessione connection;
	private PreparedStatement ps;
	private ResultSet rs;

	@Override
	public void addLibro(Libro l) throws SQLException {
		
		connection = new Connessione();
		ps = connection.connetti().prepareStatement(INSERT_COMPLETA);
		ps.setString(1, l.getTitolo());
		ps.setInt(2, l.getPagine());
		ps.setDouble(3, l.getPrezzo());
		ps.setDouble(4, l.getP_iva());
		ps.setInt(5, l.getEditore_id());
		
		ps.executeUpdate();
		
	}

	@Override
	public Libro getLibro(int id) throws SQLException {
		Libro l = null;

		connection = new Connessione();
		ps = connection.connetti().prepareStatement(FIND_ONE);
		ps.setInt(1, id);
		rs = ps.executeQuery();

		rs.next();

		l = new Libro();
		l.setId(rs.getInt("id"));
		l.setTitolo(rs.getString("titolo"));
		l.setPagine(rs.getInt("pagine"));
		l.setEditore_id(rs.getInt("editore_id"));
		l.setPrezzo(rs.getDouble("prezzo"));
		l.setP_iva(rs.getDouble("p_iva"));

		return l;
	}

	@Override
	public Map<Integer, Libro> getLibri() throws SQLException {

		Map<Integer, Libro> libri = new HashMap<Integer, Libro>();
		// ad ogni posizione ha un intero e un libro

		connection = new Connessione();
		ps = connection.connetti().prepareStatement(FIND_ALL);
		rs = ps.executeQuery();

		while (rs.next()) {

			Libro l = new Libro(); // oggetto Libro temporaneo
			l.setTitolo(rs.getString("titolo"));
			l.setPagine(rs.getInt("pagine"));
			l.setId(rs.getInt("id"));
			l.setEditore_id(rs.getInt("editore_id"));
			l.setPrezzo(rs.getDouble("prezzo"));
			l.setP_iva(rs.getDouble("p_iva"));
			libri.put(l.getId(), l);
		}

		return libri;
	}

	@Override
	public void deleteLibro(int id) throws SQLException {
		connection = new Connessione();
		ps = connection.connetti().prepareStatement(DELETE_ONE);
		ps.setInt(1, id);
		ps.executeQuery();
	}

	@Override
	public void updateLibro(Libro l) throws SQLException {
		connection = new Connessione();
		ps = connection.connetti().prepareStatement(UPDATE_ONE);
		
		ps.setString(1, l.getTitolo());
		ps.setInt(2, l.getPagine());
		ps.setDouble(3, l.getPrezzo());
		ps.setDouble(4, l.getP_iva());
		ps.setInt(5, l.getEditore_id());
		
		ps.executeUpdate();

	}

}
