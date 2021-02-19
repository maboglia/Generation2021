package dal;

import java.sql.SQLException;
import java.util.List;

import entities.Catalogo;


public interface CatalogoIDAO {

	String GET_ALL = "select * from libro_v";
	
	String GET_ONELIBRO = "SELECT * FROM libro_v WHERE titolo = ?";
	
	String GET_ONEAUTORE = "SELECT * FROM libro_v WHERE autore = ?";
	
	Catalogo getAL(String titolo) throws SQLException;
	Catalogo getALi(String autore) throws SQLException;

	List<Catalogo> getAL() throws SQLException;

	
	
	
	
	
	
	/*
	String FIATLUX = "CREATE OR REPLACE VIEW libro_v AS\n"
			+ "SELECT l.titolo, e.nome AS Editore, CONCAT(a.cognome,' ',a.nome) AS Autore, ROUND(l.prezzo*1.22,2) AS Prezzo\n"
			+ "FROM libro l\n"
			+ "JOIN editore e ON l.editore_id = e.id\n"
			+ "JOIN autore_libro la ON l.id = la.libro_id \n"
			+ "JOIN autore a ON a.id = la.autore_id\n"
			+ "ORDER BY titolo;";
	*/
	
}
