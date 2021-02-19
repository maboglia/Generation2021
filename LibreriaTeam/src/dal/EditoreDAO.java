package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entities.Editore;

public class EditoreDAO implements EditoreIDAO {
	
	private Connection con = null;
	private Statement stat = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	
	Connessione c = new Connessione();
	
	@Override
	public Editore getEditore(int id) throws SQLException {
		
		Editore e = null;
		this.con = c.connetti();
		this.ps = this.con.prepareStatement(GET_ONE);
		this.ps.setInt(1, id);
		this.rs = this.ps.executeQuery();
		this.rs.next();
		e = new Editore();
		e.setNome(this.rs.getString("nome"));
		e.setId(this.rs.getInt("id"));
		
		
		return e;
	}

	@Override
	public List<Editore> getEditori() throws SQLException {
		
		List<Editore> editori = new ArrayList<>();
		
		this.con = c.connetti();
		this.ps = this.con.prepareStatement(GET_ALL);
		
		//ps = c.connetti().prepareStatement(GET_ALL);
		
		this.rs = this.ps.executeQuery();
		
		while(this.rs.next()) {
			Editore e = new Editore();
			e.setId(this.rs.getInt("id"));
			e.setNome(this.rs.getString("nome"));
			editori.add(e);
		}
		
		return editori;
	}

	@Override
	public void addEditore(Editore e) throws SQLException {
		
		this.con = c.connetti();
		this.ps = this.con.prepareStatement(INSERT);
		this.ps.setString(1, e.getNome());
		this.ps.executeUpdate();
		
	}

	@Override
	public void deleteEditore(Editore e) throws SQLException {
		
		this.con = c.connetti();
		this.ps = this.con.prepareStatement(DELETE);
		this.ps.setInt(1, e.getId());
		this.ps.executeUpdate();
	}

	@Override
	public void updateEditore(Editore e) throws SQLException {
		
		this.con = c.connetti();
		this.ps = this.con.prepareStatement(UPDATE);
		this.ps.setString(1, e.getNome());
		this.ps.setInt(2, e.getId());
		this.ps.executeUpdate();
	}

}
