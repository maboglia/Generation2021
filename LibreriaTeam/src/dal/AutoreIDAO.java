package dal;

import java.sql.SQLException;
import java.util.List;

import entities.Autore;


public interface AutoreIDAO {
	
	String GET_ALL = "select * from autore";
	List<Autore> getAutore() throws SQLException;
	
	String GET_ONE = "select * from autore where id = ?";
	Autore getAutore(int id) throws SQLException;
	
	String INSERT = "insert into autore (nome, cognome) values (?,?)";
	void addAutore(Autore a) throws SQLException;
	
	String UPDATE = "update autore set nome = ?, cognome = ? where id = ?";
	void updateAutore(Autore a) throws SQLException;
	
	String DELETE = "delete from autore where id = ?";
	void deleteAutore(Autore a) throws SQLException;
			
}
