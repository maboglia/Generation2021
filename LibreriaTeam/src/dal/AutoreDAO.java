package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entities.Autore;


public class AutoreDAO implements AutoreIDAO {
	
	private Connection con = null;
//	private Statement statement = null;
	private PreparedStatement ps=null;
	private ResultSet rs = null;

	private Connessione c = new Connessione();
	private Statement statement;
	
	

	@Override
	public List<Autore> getAutore() throws SQLException {
		List<Autore> autore = new ArrayList<>();
		this.con = c.connetti();
		try {
			this.statement = this.con.createStatement();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			this.rs = this.statement.executeQuery(GET_ALL);
			while(this.rs.next()) {
				Autore a = new Autore();
				a.setId(rs.getInt("id"));
				a.setNome(rs.getString("nome"));
				a.setCognome(rs.getString("cognome"));
				autore.add(a);
	
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return autore;
	}

	@Override
	public Autore getAutore(int id) throws SQLException {
		Autore a = null;
		this.con = c.connetti();
		try {
			
//			this.statement = this.con.createStatement();
//			this.rs = this.statement.executeQuery("select * from autore where id=" + id);
			
			this.ps= this.con.prepareStatement(GET_ONE);
			this.ps.setInt(1, id); 
			this.ps.execute();
			
            this.rs.next();
            a=new Autore();
            a.setId(rs.getInt("id"));
            a.setNome(rs.getString("nome"));
            a.setCognome(rs.getString("cognome"));
            
			      
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return a;
	}

	@Override
	public void addAutore(Autore a) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateAutore(Autore a) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAutore(Autore a) throws SQLException {
		// TODO Auto-generated method stub

	}

}
