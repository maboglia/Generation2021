package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Editore;
import model.Libro;

public class EditoreDAO implements EditoreIDAO {
	private Connection con = null;
	private Statement statement = null;
	private PreparedStatement ps=null;
	private ResultSet rs = null;

	private Connessione c = new Connessione();
	@Override
	public Editore getEditore(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Editore> getEditori() throws SQLException {
		
		List<Editore> editori = new ArrayList<>();
		
		con = c.connetti();
		ps = con.prepareStatement(GET_ALL);
		
		//ps = c.connetti().prepareStatement(GET_ALL);
		
		rs = ps.executeQuery();
		
		while(rs.next()) {
			Editore e = new Editore();
			e.setId(rs.getInt("id"));
			e.setNome(rs.getString("nome"));
			editori.add(e);
		}
		
		return editori;
	}

	@Override
	public void addEditore(Editore l) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteEditore(Editore l) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateEditore(Editore l) throws SQLException {
		// TODO Auto-generated method stub

	}

}
