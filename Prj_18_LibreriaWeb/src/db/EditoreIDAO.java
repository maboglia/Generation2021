package db;

import java.sql.SQLException;
import java.util.List;

import model.Editore;

public interface EditoreIDAO {

	String INSERT = "INSERT INTO editore (nome) values (?)";
	String GET_ALL = "SELECT * FROM editore";
	String GET_ONE = "SELECT * FROM editore WHERE id = ?";
	String UPDATE = "UPDATE editore SET nome = ? WHERE id = ?";
	String DELETE = "DELETE FROM editore WHERE id = ?";

	//metodi sono implicitamente public abstract
	Editore getEditore(int id) throws SQLException;

	List<Editore> getEditori() throws SQLException;

	void addEditore(Editore l) throws SQLException;

	void deleteEditore(Editore l) throws SQLException;

	void updateEditore(Editore l) throws SQLException;	
	
	
}
