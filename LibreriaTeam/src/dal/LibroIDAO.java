package dal;

import java.sql.SQLException;
import java.util.Map;

import entities.Libro;

public interface LibroIDAO {
	
	String INSERT_COMPLETA = "INSERT INTO libro(titolo, pagine, prezzo, p_iva, editore_id) values(?,?,?,?,?)";
	String FIND_ALL = "SELECT * FROM libro";
	String FIND_ONE = "SELECT * FROM libro WHERE id =?";
	String DELETE_ONE = "DELETE FROM libro WHERE id =?";
	String UPDATE_ONE = "UPDATE libro SET titolo =?, pagine=?, prezzo=?, p_iva=?, editore_id=? WHERE id =?";
	
	void addLibro(Libro l) throws SQLException;
	Libro getLibro(int id) throws SQLException;
	Map<Integer, Libro> getLibri() throws SQLException;
	void deleteLibro(int id) throws SQLException;
	void updateLibro(Libro l) throws SQLException;
	
	
	
	

}
